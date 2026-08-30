package de;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b {
    public static final b e;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        b bVar = new b();
        bVar.a = true;
        bVar.b = true;
        bVar.c = false;
        bVar.d = false;
        e = bVar;
        bVar.a = true;
        bVar.b = true;
        bVar.c = false;
        bVar.d = false;
    }

    public static String a(String str, Class cls, boolean z4) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z4));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        }
        if (!z4) {
            return str.replace('$', '.');
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        return str.replace('$', '.');
    }
}
