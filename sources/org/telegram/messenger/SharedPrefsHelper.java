package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
