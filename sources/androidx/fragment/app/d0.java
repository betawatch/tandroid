package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class d0 {
    public static final a0.m b = new a0.m(0);
    public final /* synthetic */ k0 a;

    public d0(k0 k0Var) {
        this.a = k0Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        a0.m mVar = b;
        a0.m mVar2 = (a0.m) mVar.get(classLoader);
        if (mVar2 == null) {
            mVar2 = new a0.m(0);
            mVar.put(classLoader, mVar2);
        }
        Class cls = (Class) mVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        mVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new androidx.car.app.j(a4.a.q("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e7) {
            throw new androidx.car.app.j(a4.a.q("Unable to instantiate fragment ", str, ": make sure class name exists"), e7);
        }
    }

    public final s a(String str) {
        try {
            return (s) c(this.a.w.b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new androidx.car.app.j(a4.a.q("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e7) {
            throw new androidx.car.app.j(a4.a.q("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (NoSuchMethodException e10) {
            throw new androidx.car.app.j(a4.a.q("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e10);
        } catch (InvocationTargetException e11) {
            throw new androidx.car.app.j(a4.a.q("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e11);
        }
    }
}
