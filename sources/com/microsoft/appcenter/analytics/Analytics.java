package com.microsoft.appcenter.analytics;

import android.app.Activity;
import android.content.Context;
import com.microsoft.appcenter.AbstractAppCenterService;
import com.microsoft.appcenter.analytics.channel.AnalyticsListener;
import com.microsoft.appcenter.analytics.channel.AnalyticsValidator;
import com.microsoft.appcenter.analytics.channel.SessionTracker;
import com.microsoft.appcenter.analytics.ingestion.models.PageLog;
import com.microsoft.appcenter.analytics.ingestion.models.json.EventLogFactory;
import com.microsoft.appcenter.analytics.ingestion.models.json.PageLogFactory;
import com.microsoft.appcenter.analytics.ingestion.models.json.StartSessionLogFactory;
import com.microsoft.appcenter.analytics.ingestion.models.one.json.CommonSchemaEventLogFactory;
import com.microsoft.appcenter.channel.Channel;
import com.microsoft.appcenter.ingestion.models.Log;
import com.microsoft.appcenter.utils.AppCenterLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class Analytics extends AbstractAppCenterService {
    private static Analytics sInstance;
    private Channel.Listener mAnalyticsTransmissionTargetListener;
    private AnalyticsValidator mAnalyticsValidator;
    private boolean mAutoPageTrackingEnabled = false;
    private Context mContext;
    private WeakReference mCurrentActivity;
    AnalyticsTransmissionTarget mDefaultTransmissionTarget;
    private final Map mFactories;
    private SessionTracker mSessionTracker;
    private boolean mStartedFromApp;
    private long mTransmissionInterval;
    private final Map mTransmissionTargets;

    @Override // com.microsoft.appcenter.AbstractAppCenterService, com.microsoft.appcenter.AppCenterService
    public boolean isAppSecretRequired() {
        return false;
    }

    static /* synthetic */ AnalyticsListener access$500(Analytics analytics) {
        analytics.getClass();
        return null;
    }

    private Analytics() {
        HashMap hashMap = new HashMap();
        this.mFactories = hashMap;
        hashMap.put("startSession", new StartSessionLogFactory());
        hashMap.put("page", new PageLogFactory());
        hashMap.put("event", new EventLogFactory());
        hashMap.put("commonSchemaEvent", new CommonSchemaEventLogFactory());
        this.mTransmissionTargets = new HashMap();
        this.mTransmissionInterval = TimeUnit.SECONDS.toMillis(3L);
    }

    public static synchronized Analytics getInstance() {
        Analytics analytics;
        synchronized (Analytics.class) {
            try {
                if (sInstance == null) {
                    sInstance = new Analytics();
                }
                analytics = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return analytics;
    }

    private static String generatePageName(Class cls) {
        String simpleName = cls.getSimpleName();
        return (!simpleName.endsWith("Activity") || simpleName.length() <= 8) ? simpleName : simpleName.substring(0, simpleName.length() - 8);
    }

    private AnalyticsTransmissionTarget createAnalyticsTransmissionTarget(String str) {
        final AnalyticsTransmissionTarget analyticsTransmissionTarget = new AnalyticsTransmissionTarget(str, null);
        AppCenterLog.debug("AppCenterAnalytics", "Created transmission target with token " + str);
        postCommandEvenIfDisabled(new Runnable() { // from class: com.microsoft.appcenter.analytics.Analytics.1
            @Override // java.lang.Runnable
            public void run() {
                analyticsTransmissionTarget.initInBackground(Analytics.this.mContext, ((AbstractAppCenterService) Analytics.this).mChannel);
            }
        });
        return analyticsTransmissionTarget;
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected String getGroupName() {
        return "group_analytics";
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public String getServiceName() {
        return "Analytics";
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected String getLoggerTag() {
        return "AppCenterAnalytics";
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public Map getLogFactories() {
        return this.mFactories;
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService, android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(final Activity activity) {
        final Runnable runnable = new Runnable() { // from class: com.microsoft.appcenter.analytics.Analytics.2
            @Override // java.lang.Runnable
            public void run() {
                Analytics.this.mCurrentActivity = new WeakReference(activity);
            }
        };
        post(new Runnable() { // from class: com.microsoft.appcenter.analytics.Analytics.3
            @Override // java.lang.Runnable
            public void run() {
                runnable.run();
                Analytics.this.processOnResume(activity);
            }
        }, runnable, runnable);
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected long getTriggerInterval() {
        return this.mTransmissionInterval;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processOnResume(Activity activity) {
        SessionTracker sessionTracker = this.mSessionTracker;
        if (sessionTracker != null) {
            sessionTracker.onActivityResumed();
            if (this.mAutoPageTrackingEnabled) {
                queuePage(generatePageName(activity.getClass()), null);
            }
        }
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService, android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        final Runnable runnable = new Runnable() { // from class: com.microsoft.appcenter.analytics.Analytics.4
            @Override // java.lang.Runnable
            public void run() {
                Analytics.this.mCurrentActivity = null;
            }
        };
        post(new Runnable() { // from class: com.microsoft.appcenter.analytics.Analytics.5
            @Override // java.lang.Runnable
            public void run() {
                runnable.run();
                if (Analytics.this.mSessionTracker != null) {
                    Analytics.this.mSessionTracker.onActivityPaused();
                }
            }
        }, runnable, runnable);
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected Channel.GroupListener getChannelListener() {
        return new Channel.GroupListener() { // from class: com.microsoft.appcenter.analytics.Analytics.6
            @Override // com.microsoft.appcenter.channel.Channel.GroupListener
            public void onBeforeSending(Log log) {
                Analytics.access$500(Analytics.this);
            }

            @Override // com.microsoft.appcenter.channel.Channel.GroupListener
            public void onSuccess(Log log) {
                Analytics.access$500(Analytics.this);
            }

            @Override // com.microsoft.appcenter.channel.Channel.GroupListener
            public void onFailure(Log log, Exception exc) {
                Analytics.access$500(Analytics.this);
            }
        };
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    protected synchronized void applyEnabledState(boolean z) {
        try {
            if (z) {
                this.mChannel.addGroup("group_analytics_critical", getTriggerCount(), 3000L, getTriggerMaxParallelRequests(), null, getChannelListener());
                startAppLevelFeatures();
            } else {
                this.mChannel.removeGroup("group_analytics_critical");
                AnalyticsValidator analyticsValidator = this.mAnalyticsValidator;
                if (analyticsValidator != null) {
                    this.mChannel.removeListener(analyticsValidator);
                    this.mAnalyticsValidator = null;
                }
                SessionTracker sessionTracker = this.mSessionTracker;
                if (sessionTracker != null) {
                    this.mChannel.removeListener(sessionTracker);
                    this.mSessionTracker.clearSessions();
                    this.mSessionTracker = null;
                }
                Channel.Listener listener = this.mAnalyticsTransmissionTargetListener;
                if (listener != null) {
                    this.mChannel.removeListener(listener);
                    this.mAnalyticsTransmissionTargetListener = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void startAppLevelFeatures() {
        Activity activity;
        if (this.mStartedFromApp) {
            AnalyticsValidator analyticsValidator = new AnalyticsValidator();
            this.mAnalyticsValidator = analyticsValidator;
            this.mChannel.addListener(analyticsValidator);
            SessionTracker sessionTracker = new SessionTracker(this.mChannel, "group_analytics");
            this.mSessionTracker = sessionTracker;
            this.mChannel.addListener(sessionTracker);
            WeakReference weakReference = this.mCurrentActivity;
            if (weakReference != null && (activity = (Activity) weakReference.get()) != null) {
                processOnResume(activity);
            }
            Channel.Listener channelListener = AnalyticsTransmissionTarget.getChannelListener();
            this.mAnalyticsTransmissionTargetListener = channelListener;
            this.mChannel.addListener(channelListener);
        }
    }

    private void queuePage(String str, Map map) {
        PageLog pageLog = new PageLog();
        pageLog.setName(str);
        pageLog.setProperties(map);
        this.mChannel.enqueue(pageLog, "group_analytics", 1);
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService, com.microsoft.appcenter.AppCenterService
    public synchronized void onStarted(Context context, Channel channel, String str, String str2, boolean z) {
        try {
            try {
                this.mContext = context;
                this.mStartedFromApp = z;
                super.onStarted(context, channel, str, str2, z);
                setDefaultTransmissionTarget(str2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService, com.microsoft.appcenter.AppCenterService
    public void onConfigurationUpdated(String str, String str2) {
        this.mStartedFromApp = true;
        startAppLevelFeatures();
        setDefaultTransmissionTarget(str2);
    }

    private void setDefaultTransmissionTarget(String str) {
        if (str != null) {
            this.mDefaultTransmissionTarget = createAnalyticsTransmissionTarget(str);
        }
    }

    void postCommandEvenIfDisabled(Runnable runnable) {
        post(runnable, runnable, runnable);
    }

    String getEnabledPreferenceKeyPrefix() {
        return getEnabledPreferenceKey() + "/";
    }
}
