package com.googlecode.mp4parser;

import com.google.firebase.messaging.s;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        qe.a aVar = new qe.a(stringBuffer);
        aVar.a = th2;
        throw aVar;
    }

    public static void b(s sVar) {
        Object obj = sVar.c;
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
