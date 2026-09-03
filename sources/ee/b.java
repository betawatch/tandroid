package ee;

import androidx.biometric.v;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class b {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public void c() {
    }

    public void d(v vVar) {
    }

    public void b(int i10, CharSequence charSequence) {
    }
}
