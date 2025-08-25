package j$.util.stream;

import java.security.AccessController;

/* loaded from: classes2.dex */
abstract class J3 {
    static final boolean a = ((Boolean) AccessController.doPrivileged(new I3())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
