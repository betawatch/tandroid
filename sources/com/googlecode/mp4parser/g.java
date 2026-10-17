package com.googlecode.mp4parser;

import com.google.firebase.messaging.r;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        se.a aVar = new se.a(stringBuffer);
        aVar.a = th2;
        throw aVar;
    }

    public static void b(r rVar) {
        Object obj = rVar.c;
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
