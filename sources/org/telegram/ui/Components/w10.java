package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class w10 implements Application.ActivityLifecycleCallbacks {
    private static w10 Instance;
    private int refs;
    private boolean wasInBackground = true;
    private long enterBackgroundTime = 0;
    private CopyOnWriteArrayList<v10> listeners = new CopyOnWriteArrayList<>();
    private final ArrayList<WeakReference<Activity>> resumedActivities = new ArrayList<>();

    public w10(Application application) {
        Instance = this;
        application.registerActivityLifecycleCallbacks(this);
    }

    public static w10 getInstance() {
        return Instance;
    }

    public final void a(Activity activity) {
        for (int size = this.resumedActivities.size() - 1; size >= 0; size--) {
            Activity activity2 = this.resumedActivities.get(size).get();
            if (activity2 == null || activity2 == activity) {
                this.resumedActivities.remove(size);
            }
        }
    }

    public void addListener(v10 v10Var) {
        this.listeners.add(v10Var);
    }

    public Activity getForegroundActivity() {
        Activity activity = null;
        for (int size = this.resumedActivities.size() - 1; size >= 0; size--) {
            Activity activity2 = this.resumedActivities.get(size).get();
            if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
                this.resumedActivities.remove(size);
            } else {
                if (activity2.hasWindowFocus()) {
                    return activity2;
                }
                if (activity == null) {
                    activity = activity2;
                }
            }
        }
        return activity;
    }

    public boolean isBackground() {
        return this.refs == 0;
    }

    public boolean isForeground() {
        return this.refs > 0;
    }

    public boolean isWasInBackground(boolean z10) {
        if (z10 && SystemClock.elapsedRealtime() - this.enterBackgroundTime < 200) {
            this.wasInBackground = false;
        }
        return this.wasInBackground;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        a(activity);
        this.resumedActivities.add(new WeakReference<>(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int i10 = this.refs + 1;
        this.refs = i10;
        if (i10 == 1) {
            if (SystemClock.elapsedRealtime() - this.enterBackgroundTime < 200) {
                this.wasInBackground = false;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("switch to foreground");
            }
            Iterator<v10> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameForeground();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i10 = this.refs - 1;
        this.refs = i10;
        if (i10 == 0) {
            this.enterBackgroundTime = SystemClock.elapsedRealtime();
            this.wasInBackground = true;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("switch to background");
            }
            Iterator<v10> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameBackground();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public void removeListener(v10 v10Var) {
        this.listeners.remove(v10Var);
    }

    public void resetBackgroundVar() {
        this.wasInBackground = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
