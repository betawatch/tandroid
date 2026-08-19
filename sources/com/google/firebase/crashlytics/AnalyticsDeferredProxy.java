package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AnalyticsDeferredProxy {
    private final Deferred analyticsConnectorDeferred;
    private volatile AnalyticsEventLogger analyticsEventLogger;
    private final List breadcrumbHandlerList;
    private volatile BreadcrumbSource breadcrumbSource;

    public AnalyticsDeferredProxy(Deferred deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    public AnalyticsDeferredProxy(Deferred deferred, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger) {
        this.analyticsConnectorDeferred = deferred;
        this.breadcrumbSource = breadcrumbSource;
        this.breadcrumbHandlerList = new ArrayList();
        this.analyticsEventLogger = analyticsEventLogger;
        init();
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new BreadcrumbSource() { // from class: com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda0
            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
                AnalyticsDeferredProxy.$r8$lambda$jxPNZIoMD5TUXCrnSLExogZZxg0(AnalyticsDeferredProxy.this, breadcrumbHandler);
            }
        };
    }

    public static /* synthetic */ void $r8$lambda$jxPNZIoMD5TUXCrnSLExogZZxg0(AnalyticsDeferredProxy analyticsDeferredProxy, BreadcrumbHandler breadcrumbHandler) {
        synchronized (analyticsDeferredProxy) {
            try {
                if (analyticsDeferredProxy.breadcrumbSource instanceof DisabledBreadcrumbSource) {
                    analyticsDeferredProxy.breadcrumbHandlerList.add(breadcrumbHandler);
                }
                analyticsDeferredProxy.breadcrumbSource.registerBreadcrumbHandler(breadcrumbHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new AnalyticsEventLogger() { // from class: com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda1
            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void logEvent(String str, Bundle bundle) {
                AnalyticsDeferredProxy.this.analyticsEventLogger.logEvent(str, bundle);
            }
        };
    }

    private void init() {
        this.analyticsConnectorDeferred.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda2
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                AnalyticsDeferredProxy.$r8$lambda$9OFGxA2N0nOG8dDPC_xdm7JYRUo(AnalyticsDeferredProxy.this, provider);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$9OFGxA2N0nOG8dDPC_xdm7JYRUo(AnalyticsDeferredProxy analyticsDeferredProxy, Provider provider) {
        analyticsDeferredProxy.getClass();
        Logger.getLogger().d("AnalyticsConnector now available.");
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(provider.get());
        new CrashlyticsOriginAnalyticsEventLogger(null);
        subscribeToAnalyticsEvents(null, new CrashlyticsAnalyticsListener());
        Logger.getLogger().w("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static AnalyticsConnector.AnalyticsConnectorHandle subscribeToAnalyticsEvents(AnalyticsConnector analyticsConnector, CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
        analyticsConnector.registerAnalyticsConnectorListener("clx", crashlyticsAnalyticsListener);
        Logger.getLogger().d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        analyticsConnector.registerAnalyticsConnectorListener("crash", crashlyticsAnalyticsListener);
        return null;
    }
}
