package com.google.firebase.analytics.connector;

/* loaded from: classes.dex */
public interface AnalyticsConnector {

    public interface AnalyticsConnectorHandle {
    }

    public interface AnalyticsConnectorListener {
    }

    AnalyticsConnectorHandle registerAnalyticsConnectorListener(String str, AnalyticsConnectorListener analyticsConnectorListener);
}
