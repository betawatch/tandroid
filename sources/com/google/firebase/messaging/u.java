package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public final String a;
    public final String b;
    public final long c;

    public u(long j10, String str, String str2) {
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
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
            return null;
        }
    }

    public static u b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new u(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new u(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
            return null;
        }
    }
}
