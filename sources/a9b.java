// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class a9b {
    public static final a9b e;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        a9b a9bVar = new a9b();
        a9bVar.a = true;
        a9bVar.b = true;
        a9bVar.c = false;
        a9bVar.d = false;
        e = a9bVar;
        a9bVar.a = true;
        a9bVar.b = true;
        a9bVar.c = false;
        a9bVar.d = false;
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
