// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cbb {
    public static final cbb e;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        cbb cbbVar = new cbb();
        cbbVar.a = true;
        cbbVar.b = true;
        cbbVar.c = false;
        cbbVar.d = false;
        e = cbbVar;
        cbbVar.a = true;
        cbbVar.b = true;
        cbbVar.c = false;
        cbbVar.d = false;
    }

    public static String a(String str, Class cls, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        }
        if (!z) {
            return str.replace('$', '.');
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        return str.replace('$', '.');
    }
}
