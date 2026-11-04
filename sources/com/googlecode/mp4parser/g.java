package com.googlecode.mp4parser;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g {
    public static final /* synthetic */ Throwable a;
    public static final /* synthetic */ g b;

    static {
        try {
            b = new g();
        } catch (Throwable th2) {
            a = th2;
        }
    }

    public static g a() {
        String stringBuffer;
        g gVar = b;
        if (gVar != null) {
            return gVar;
        }
        Throwable th2 = a;
        if (th2 == null) {
            stringBuffer = "com.googlecode.mp4parser.RequiresParseDetailAspect";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer("Exception while initializing com.googlecode.mp4parser.RequiresParseDetailAspect: ");
            stringBuffer2.append(th2);
            stringBuffer = stringBuffer2.toString();
        }
        ve.a aVar = new ve.a(stringBuffer);
        aVar.a = th2;
        throw aVar;
    }

    public static void b(ui.f fVar) {
        Object obj = fVar.c;
        if (obj instanceof a) {
            if (((a) obj).isParsed()) {
                return;
            }
            ((a) obj).parseDetails();
        } else {
            throw new RuntimeException("Only methods in subclasses of " + a.class.getName() + " can  be annotated with ParseDetail");
        }
    }
}
