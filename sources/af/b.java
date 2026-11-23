package af;

import g9.t;
import g9.u;
import g9.v;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class b {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static t b(t tVar) {
        return !(tVar instanceof v) ? tVar instanceof u ? tVar : tVar instanceof Serializable ? new u(tVar) : new v(tVar) : tVar;
    }
}
