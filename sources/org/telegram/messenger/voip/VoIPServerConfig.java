package org.telegram.messenger.voip;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        } catch (JSONException e6) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error parsing VoIP config", e6);
            }
        }
    }
}
