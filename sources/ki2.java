// default package

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ki2 implements ii2, ex5, cx5 {
    public static final Map b;
    public final Class a;

    static {
        int i = 0;
        List b2 = tl2.b(sr4.class, ur4.class, is4.class, ks4.class, ls4.class, ms4.class, ns4.class, os4.class, ps4.class, qs4.class, tr4.class, vr4.class, wr4.class, xr4.class, yr4.class, zr4.class, as4.class, bs4.class, cs4.class, ds4.class, fs4.class, gs4.class, hs4.class);
        ArrayList arrayList = new ArrayList(ul2.c(b2, 10));
        for (Object obj : b2) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new rx7((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = uk6.e(arrayList);
    }

    public ki2(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // ii2
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String b2;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String b3 = tvd.b(cls.getName());
                return b3 == null ? cls.getSimpleName() : b3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b2 = tvd.b(componentType.getName())) != null) {
                str = b2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ddb.j(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int g = ddb.g(simpleName, '$', 0, 6);
            return g == -1 ? simpleName : simpleName.substring(g + 1, simpleName.length());
        }
        return ddb.j(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ki2) && iqe.a(this).equals(iqe.a((ki2) obj));
    }

    public final int hashCode() {
        return iqe.a(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
