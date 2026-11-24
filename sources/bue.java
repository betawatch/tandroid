// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class bue {
    public static SharedPreferences a;

    public static void a(int i) {
        SharedPreferences sharedPreferences = a;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : a.getAll().keySet()) {
                if (str.startsWith("confirm_shown_" + i + "_")) {
                    edit.remove(str);
                }
            }
            edit.apply();
        }
    }

    public static boolean b(int i, long j) {
        return a.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i), Long.valueOf(j)), false);
    }

    public static void c(int i, long j) {
        a.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i), Long.valueOf(j)), true).apply();
    }
}
