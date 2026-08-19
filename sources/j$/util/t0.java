package j$.util;

import java.security.AccessController;

/* loaded from: classes2.dex */
public abstract class t0 {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new s0(0))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
