package j$.util;

import java.security.AccessController;

/* loaded from: classes2.dex */
abstract class w0 {
    static final boolean a = ((Boolean) AccessController.doPrivileged(new v0())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
