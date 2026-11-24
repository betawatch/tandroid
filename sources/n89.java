// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n89 {
    public static final /* synthetic */ Throwable a;
    public static final /* synthetic */ n89 b;

    static {
        try {
            b = new n89();
        } catch (Throwable th) {
            a = th;
        }
    }

    public static n89 a() {
        String stringBuffer;
        n89 n89Var = b;
        if (n89Var != null) {
            return n89Var;
        }
        Throwable th = a;
        if (th == null) {
            stringBuffer = "com.googlecode.mp4parser.RequiresParseDetailAspect";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer("Exception while initializing com.googlecode.mp4parser.RequiresParseDetailAspect: ");
            stringBuffer2.append(th);
            stringBuffer = stringBuffer2.toString();
        }
        nj7 nj7Var = new nj7(stringBuffer);
        nj7Var.a = th;
        throw nj7Var;
    }

    public static void b(c5a c5aVar) {
        Object obj = c5aVar.c;
        if (obj instanceof y1) {
            if (((y1) obj).isParsed()) {
                return;
            }
            ((y1) obj).parseDetails();
        } else {
            throw new RuntimeException("Only methods in subclasses of " + y1.class.getName() + " can  be annotated with ParseDetail");
        }
    }
}
