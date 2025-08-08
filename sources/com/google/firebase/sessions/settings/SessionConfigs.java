package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SessionConfigs {
    private final Integer cacheDuration;
    private final Long cacheUpdatedTime;
    private final Boolean sessionEnabled;
    private final Integer sessionRestartTimeout;
    private final Double sessionSamplingRate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        return Intrinsics.areEqual(this.sessionEnabled, sessionConfigs.sessionEnabled) && Intrinsics.areEqual(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && Intrinsics.areEqual(this.sessionRestartTimeout, sessionConfigs.sessionRestartTimeout) && Intrinsics.areEqual(this.cacheDuration, sessionConfigs.cacheDuration) && Intrinsics.areEqual(this.cacheUpdatedTime, sessionConfigs.cacheUpdatedTime);
    }

    public int hashCode() {
        Boolean bool = this.sessionEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.sessionSamplingRate;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.sessionRestartTimeout;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDuration;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.cacheUpdatedTime;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.sessionEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionRestartTimeout=" + this.sessionRestartTimeout + ", cacheDuration=" + this.cacheDuration + ", cacheUpdatedTime=" + this.cacheUpdatedTime + ')';
    }

    public SessionConfigs(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.sessionEnabled = bool;
        this.sessionSamplingRate = d;
        this.sessionRestartTimeout = num;
        this.cacheDuration = num2;
        this.cacheUpdatedTime = l;
    }

    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }
}
