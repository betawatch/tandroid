package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c0 {
    public static final a0.l b = new a0.l(0);
    public final /* synthetic */ j0 a;

    public c0(j0 j0Var) {
        this.a = j0Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        a0.l lVar = b;
        a0.l lVar2 = (a0.l) lVar.get(classLoader);
        if (lVar2 == null) {
            lVar2 = new a0.l(0);
            lVar.put(classLoader, lVar2);
        }
        Class cls = (Class) lVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        lVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new ad.d(a1.g.n("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e7) {
            throw new ad.d(a1.g.n("Unable to instantiate fragment ", str, ": make sure class name exists"), e7);
        }
    }

    public final s a(String str) {
        try {
            return (s) c(this.a.w.b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new ad.d(a1.g.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e7) {
            throw new ad.d(a1.g.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (NoSuchMethodException e10) {
            throw new ad.d(a1.g.n("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e10);
        } catch (InvocationTargetException e11) {
            throw new ad.d(a1.g.n("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e11);
        }
    }
}
