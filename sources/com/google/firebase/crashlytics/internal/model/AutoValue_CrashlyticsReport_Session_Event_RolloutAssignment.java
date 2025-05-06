package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
    private final long templateVersion;

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {
        private String parameterKey;
        private String parameterValue;
        private CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
        private Long templateVersion;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment build() {
            String str = "";
            if (this.rolloutVariant == null) {
                str = " rolloutVariant";
            }
            if (this.parameterKey == null) {
                str = str + " parameterKey";
            }
            if (this.parameterValue == null) {
                str = str + " parameterValue";
            }
            if (this.templateVersion == null) {
                str = str + " templateVersion";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(this.rolloutVariant, this.parameterKey, this.parameterValue, this.templateVersion.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.parameterKey = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.parameterValue = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.rolloutVariant = rolloutVariant;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long j) {
            this.templateVersion = Long.valueOf(j);
            return this;
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j) {
        this.rolloutVariant = rolloutVariant;
        this.parameterKey = str;
        this.parameterValue = str2;
        this.templateVersion = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        return this.rolloutVariant.equals(rolloutAssignment.getRolloutVariant()) && this.parameterKey.equals(rolloutAssignment.getParameterKey()) && this.parameterValue.equals(rolloutAssignment.getParameterValue()) && this.templateVersion == rolloutAssignment.getTemplateVersion();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public String getParameterKey() {
        return this.parameterKey;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public String getParameterValue() {
        return this.parameterValue;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant() {
        return this.rolloutVariant;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public long getTemplateVersion() {
        return this.templateVersion;
    }

    public int hashCode() {
        int hashCode = (((((this.rolloutVariant.hashCode() ^ 1000003) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003;
        long j = this.templateVersion;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.rolloutVariant + ", parameterKey=" + this.parameterKey + ", parameterValue=" + this.parameterValue + ", templateVersion=" + this.templateVersion + "}";
    }
}
