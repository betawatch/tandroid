package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c0 {
    public static final a0.k b = new a0.k(0);
    public final /* synthetic */ j0 a;

    public c0(j0 j0Var) {
        this.a = j0Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        a0.k kVar = b;
        a0.k kVar2 = (a0.k) kVar.get(classLoader);
        if (kVar2 == null) {
            kVar2 = new a0.k(0);
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e6) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": make sure class name exists"), e6);
        }
    }

    public final s a(String str) {
        try {
            return (s) c(this.a.w.b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e6) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (NoSuchMethodException e10) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e10);
        } catch (InvocationTargetException e11) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e11);
        }
    }
}
