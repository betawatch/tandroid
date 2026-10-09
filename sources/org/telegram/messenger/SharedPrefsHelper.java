package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class SharedPrefsHelper {
    private static String WEB_VIEW_SHOWN_DIALOG_FORMAT = "confirm_shown_%d_%d";
    private static SharedPreferences webViewBotsPrefs;

    public static void cleanupAccount(int i10) {
        SharedPreferences sharedPreferences = webViewBotsPrefs;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : webViewBotsPrefs.getAll().keySet()) {
                if (str.startsWith("confirm_shown_" + i10 + "_")) {
                    edit.remove(str);
                }
            }
            edit.apply();
        }
    }

    public static SharedPreferences getWebViewBotsPrefs() {
        return webViewBotsPrefs;
    }

    public static void init(Context context) {
        webViewBotsPrefs = context.getSharedPreferences("webview_bots", 0);
    }

    public static boolean isWebViewConfirmShown(int i10, long j3) {
        return webViewBotsPrefs.getBoolean(String.format(WEB_VIEW_SHOWN_DIALOG_FORMAT, Integer.valueOf(i10), Long.valueOf(j3)), false);
    }

    public static void setWebViewConfirmShown(int i10, long j3, boolean z10) {
        webViewBotsPrefs.edit().putBoolean(String.format(WEB_VIEW_SHOWN_DIALOG_FORMAT, Integer.valueOf(i10), Long.valueOf(j3)), z10).apply();
    }
}
