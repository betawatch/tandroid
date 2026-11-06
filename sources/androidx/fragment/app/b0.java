package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        } catch (ClassCastException e10) {
            throw new androidx.car.app.j(a8.p0.p("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new androidx.car.app.j(a8.p0.p("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public final r a(String str) {
        try {
            return (r) c(this.a.w.b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new androidx.car.app.j(a8.p0.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new androidx.car.app.j(a8.p0.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new androidx.car.app.j(a8.p0.p("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new androidx.car.app.j(a8.p0.p("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
