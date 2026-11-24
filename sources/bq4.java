// default package

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bq4 {
    public static final cka b = new cka(0);
    public final /* synthetic */ hq4 a;

    public bq4(hq4 hq4Var) {
        this.a = hq4Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        cka ckaVar = b;
        cka ckaVar2 = (cka) ckaVar.get(classLoader);
        if (ckaVar2 == null) {
            ckaVar2 = new cka(0);
            ckaVar.put(classLoader, ckaVar2);
        }
        Class cls = (Class) ckaVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        ckaVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new rq2(kt6.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new rq2(kt6.o("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final dp4 a(String str) {
        try {
            return (dp4) c(this.a.w.b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new rq2(kt6.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new rq2(kt6.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new rq2(kt6.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new rq2(kt6.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
