package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DataCollectionStatus {
    private final DataCollectionState crashlytics;
    private final DataCollectionState performance;
    private final double sessionSamplingRate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCollectionStatus)) {
            return false;
        }
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
        return this.performance == dataCollectionStatus.performance && this.crashlytics == dataCollectionStatus.crashlytics && Intrinsics.areEqual(Double.valueOf(this.sessionSamplingRate), Double.valueOf(dataCollectionStatus.sessionSamplingRate));
    }

    public int hashCode() {
        return (((this.performance.hashCode() * 31) + this.crashlytics.hashCode()) * 31) + DataCollectionStatus$$ExternalSyntheticBackport0.m(this.sessionSamplingRate);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.performance + ", crashlytics=" + this.crashlytics + ", sessionSamplingRate=" + this.sessionSamplingRate + ')';
    }

    public DataCollectionStatus(DataCollectionState performance, DataCollectionState crashlytics, double d) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.performance = performance;
        this.crashlytics = crashlytics;
        this.sessionSamplingRate = d;
    }

    public final DataCollectionState getPerformance() {
        return this.performance;
    }

    public final DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }
}
