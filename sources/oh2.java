// default package

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oh2 implements mh2, zu5, xu5 {
    public static final Map b;
    public final Class a;

    static {
        int i = 0;
        List b2 = zk2.b(op4.class, qp4.class, eq4.class, gq4.class, hq4.class, iq4.class, jq4.class, kq4.class, lq4.class, mq4.class, pp4.class, rp4.class, sp4.class, tp4.class, up4.class, vp4.class, wp4.class, xp4.class, yp4.class, zp4.class, bq4.class, cq4.class, dq4.class);
        ArrayList arrayList = new ArrayList(al2.c(b2, 10));
        for (Object obj : b2) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new ku7((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = qi6.e(arrayList);
    }

    public oh2(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // mh2
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
                String b3 = drd.b(cls.getName());
                return b3 == null ? cls.getSimpleName() : b3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b2 = drd.b(componentType.getName())) != null) {
                str = b2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return f9b.j(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int g = f9b.g(simpleName, '$', 0, 6);
            return g == -1 ? simpleName : simpleName.substring(g + 1, simpleName.length());
        }
        return f9b.j(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oh2) && qle.a(this).equals(qle.a((oh2) obj));
    }

    public final int hashCode() {
        return qle.a(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
