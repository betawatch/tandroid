// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
