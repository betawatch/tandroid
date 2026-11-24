// default package

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cj2 implements aj2, zw5, xw5 {
    public static final Map b;
    public final Class a;

    static {
        int i = 0;
        List b2 = lm2.b(pr4.class, rr4.class, fs4.class, hs4.class, is4.class, js4.class, ks4.class, ls4.class, ms4.class, ns4.class, qr4.class, sr4.class, tr4.class, ur4.class, vr4.class, wr4.class, xr4.class, yr4.class, zr4.class, as4.class, cs4.class, ds4.class, es4.class);
        ArrayList arrayList = new ArrayList(mm2.c(b2, 10));
        for (Object obj : b2) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new lw7((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = sk6.e(arrayList);
    }

    public cj2(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // aj2
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
                String b3 = gtd.b(cls.getName());
                return b3 == null ? cls.getSimpleName() : b3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b2 = gtd.b(componentType.getName())) != null) {
                str = b2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return hbb.j(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int g = hbb.g(simpleName, '$', 0, 6);
            return g == -1 ? simpleName : simpleName.substring(g + 1, simpleName.length());
        }
        return hbb.j(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cj2) && sne.a(this).equals(sne.a((cj2) obj));
    }

    public final int hashCode() {
        return sne.a(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
