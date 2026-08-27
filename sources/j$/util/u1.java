package j$.util;

import java.security.AccessController;

/* loaded from: classes2.dex */
public abstract class u1 {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new t1(0))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
