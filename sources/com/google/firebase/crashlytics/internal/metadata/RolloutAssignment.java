package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class RolloutAssignment {
    public static final DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER = new JsonDataEncoderBuilder().configureWith(AutoRolloutAssignmentEncoder.CONFIG).build();

    static RolloutAssignment create(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return create(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static RolloutAssignment create(String str, String str2, String str3, String str4, long j) {
        return new AutoValue_RolloutAssignment(str, str2, validate(str3), str4, j);
    }

    private static String validate(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();

    public CrashlyticsReport.Session.Event.RolloutAssignment toReportProto() {
        return CrashlyticsReport.Session.Event.RolloutAssignment.builder().setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder().setVariantId(getVariantId()).setRolloutId(getRolloutId()).build()).setParameterKey(getParameterKey()).setParameterValue(getParameterValue()).setTemplateVersion(getTemplateVersion()).build();
    }
}
