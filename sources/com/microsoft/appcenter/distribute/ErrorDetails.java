package com.microsoft.appcenter.distribute;

import org.json.JSONObject;

/* loaded from: classes.dex */
class ErrorDetails {
    private String code;

    ErrorDetails() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ErrorDetails parse(String str) {
        JSONObject jSONObject = new JSONObject(str);
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.code = jSONObject.getString("code");
        return errorDetails;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getCode() {
        return this.code;
    }
}
