package org.telegram.messenger.voip;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class VoIPServerConfig {
    private static JSONObject config = new JSONObject();

    public static boolean getBoolean(String str, boolean z10) {
        return config.optBoolean(str, z10);
    }

    public static double getDouble(String str, double d) {
        return config.optDouble(str, d);
    }

    public static int getInt(String str, int i9) {
        return config.optInt(str, i9);
    }

    public static String getString(String str, String str2) {
        return config.optString(str, str2);
    }

    private static native void nativeSetConfig(String str);

    public static void setConfig(String str) {
        try {
            config = new JSONObject(str);
            nativeSetConfig(str);
        } catch (JSONException e10) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error parsing VoIP config", e10);
            }
        }
    }
}
