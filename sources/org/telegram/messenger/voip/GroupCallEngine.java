package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        return !TextUtils.isEmpty(debugOverride) ? debugOverride : uc7.s1(i).l4.I.f;
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
