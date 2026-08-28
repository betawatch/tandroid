package org.telegram.messenger.voip;

import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
class VLog {
    public static native void d(String str);

    public static native void e(String str);

    public static void e(Throwable th) {
        e(null, th);
    }

    public static native void i(String str);

    public static native void v(String str);

    public static native void w(String str);

    public static void e(String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        if (!TextUtils.isEmpty(str)) {
            stringWriter.append((CharSequence) str);
            stringWriter.append((CharSequence) ": ");
        }
        th.printStackTrace(new PrintWriter(stringWriter));
        String[] split = stringWriter.toString().split("\n");
        for (String str2 : split) {
            e(str2);
        }
    }
}
