package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class t {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public final String a;
    public final String b;
    public final long c;

    public t(long j10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j10;
    }

    public static String a(long j10, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j10);
            return jSONObject.toString();
        } catch (JSONException e6) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e6);
            return null;
        }
    }

    public static t b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new t(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new t(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e6) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e6);
            return null;
        }
    }
}
