package com.googlecode.mp4parser;

import ab.c0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        ye.a aVar = new ye.a(stringBuffer);
        aVar.a = th2;
        throw aVar;
    }

    public static void b(c0 c0Var) {
        Object obj = c0Var.c;
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
