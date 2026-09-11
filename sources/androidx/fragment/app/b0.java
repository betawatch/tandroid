package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b0 {
    public static final a0.l b = new a0.l(0);
    public final /* synthetic */ i0 a;

    public b0(i0 i0Var) {
        this.a = i0Var;
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
        } catch (ClassCastException e7) {
            throw new androidx.car.app.j(a4.a.p("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        } catch (ClassNotFoundException e10) {
            throw new androidx.car.app.j(a4.a.p("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final r a(String str) {
        try {
            return (r) c(this.a.w.b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e7) {
            throw new androidx.car.app.j(a4.a.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (InstantiationException e10) {
            throw new androidx.car.app.j(a4.a.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new androidx.car.app.j(a4.a.p("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new androidx.car.app.j(a4.a.p("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }
}
