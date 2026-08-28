package org.telegram.messenger;

import android.os.Build;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class OneUIUtilities {
    public static final int ONE_UI_4_0 = 40000;
    private static Boolean isOneUI;
    private static int oneUIEncodedVersion;
    private static int oneUIMajorVersion;
    private static float oneUIMinorVersion;

    public static int getOneUIEncodedVersion() {
        if (isOneUI()) {
            return oneUIEncodedVersion;
        }
        return 0;
    }

    public static int getOneUIMajorVersion() {
        if (isOneUI()) {
            return oneUIMajorVersion;
        }
        return 0;
    }

    public static float getOneUIMinorVersion() {
        if (isOneUI()) {
            return oneUIMinorVersion;
        }
        return 0.0f;
    }

    public static boolean hasBuiltInClipboardToasts() {
        return isOneUI() && getOneUIEncodedVersion() == 40000;
    }

    public static boolean isOneUI() {
        int intValue;
        Boolean bool = isOneUI;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
            declaredField.setAccessible(true);
            intValue = ((Integer) declaredField.get(null)).intValue();
        } catch (Exception unused) {
            isOneUI = Boolean.FALSE;
        }
        if (intValue < 100000) {
            return false;
        }
        int i9 = intValue - 90000;
        oneUIEncodedVersion = i9;
        oneUIMajorVersion = i9 / 10000;
        oneUIMinorVersion = (i9 % 10000) / 100.0f;
        isOneUI = Boolean.TRUE;
        return isOneUI.booleanValue();
    }
}
