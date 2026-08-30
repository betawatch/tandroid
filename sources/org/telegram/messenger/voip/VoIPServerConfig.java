package org.telegram.messenger.voip;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class VoIPServerConfig {
    private static JSONObject config = new JSONObject();

    public static boolean getBoolean(String str, boolean z4) {
        return config.optBoolean(str, z4);
    }

    public static double getDouble(String str, double d) {
        return config.optDouble(str, d);
    }

    public static int getInt(String str, int i10) {
        return config.optInt(str, i10);
    }

    public static String getString(String str, String str2) {
        return config.optString(str, str2);
    }

    private static native void nativeSetConfig(String str);

    public static void setConfig(String str) {
        try {
            config = new JSONObject(str);
            nativeSetConfig(str);
        } catch (JSONException e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error parsing VoIP config", e);
            }
        }
    }
}
