package le;

import java.util.Hashtable;
import java.util.StringTokenizer;
import ji.f;
import kg.s0;
import za.c;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public static final Hashtable b;
    public static final Object[] c;
    public static /* synthetic */ Class d;
    public final ClassLoader a;

    static {
        Hashtable hashtable = new Hashtable();
        b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        c = new Object[0];
    }

    public a(Class cls, String str) {
        this.a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class<?> cls2 = d;
            if (cls2 == null) {
                try {
                    cls2 = Class.forName("java.lang.ClassNotFoundException");
                    d = cls2;
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
            return cls2;
        }
    }

    public static f b(c cVar, Object obj, Object obj2) {
        boolean z10 = false;
        return new f(cVar, obj, obj2, c, z10, 6);
    }

    public static f c(c cVar, Object obj, Object obj2, Object obj3) {
        return new f(cVar, obj, obj2, new Object[]{obj3}, false, 6);
    }

    public final s0 d(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.a;
        Class a2 = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i10 = 0; i10 < countTokens; i10++) {
            clsArr[i10] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i11 = 0; i11 < countTokens2; i11++) {
            strArr[i11] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i12 = 0; i12 < countTokens3; i12++) {
            clsArr2[i12] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class a10 = a(classLoader, str5);
        s0 s0Var = new s0(1);
        s0Var.b = parseInt;
        s0Var.c = str;
        s0Var.e = a2;
        s0Var.g = clsArr;
        s0Var.h = a10;
        return s0Var;
    }

    public final c e(s0 s0Var) {
        c cVar = new c(28, false);
        cVar.b = s0Var;
        return cVar;
    }
}
