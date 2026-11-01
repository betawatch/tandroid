package com.googlecode.mp4parser;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        ke.a aVar = new ke.a(stringBuffer);
        aVar.a = th2;
        throw aVar;
    }

    public static void b(ji.f fVar) {
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
