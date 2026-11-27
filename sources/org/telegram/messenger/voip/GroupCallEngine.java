package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class GroupCallEngine {
    public static final String DEBUG_OVERRIDE_KEY = "dbg_group_call_engine";
    public static final String NAME_CUSTOM = "custom";
    public static final String NAME_REFERENCE = "reference";

    private GroupCallEngine() {
    }

    public static String getDebugOverride() {
        return uc7.e1().getString(DEBUG_OVERRIDE_KEY, "");
    }

    public static String getName(int i) {
        String debugOverride = getDebugOverride();
        return !TextUtils.isEmpty(debugOverride) ? debugOverride : uc7.s1(i).k4.I.f;
    }

    public static boolean isReference(int i) {
        return !NAME_CUSTOM.equals(getName(i));
    }

    public static void setDebugOverride(String str) {
        SharedPreferences.Editor edit = uc7.e1().edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove(DEBUG_OVERRIDE_KEY);
        } else {
            edit.putString(DEBUG_OVERRIDE_KEY, str);
        }
        edit.apply();
    }
}
