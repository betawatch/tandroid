package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        } catch (ClassCastException e6) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e6);
        } catch (ClassNotFoundException e10) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final s a(String str) {
        try {
            return (s) c(this.a.w.b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e6) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (InstantiationException e10) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new a7.b(android.support.v4.media.a.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }
}
