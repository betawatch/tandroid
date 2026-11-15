package a8;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class bb {
    public static ab a;

    public static gd.c a(rd.a aVar) {
        gd.d[] dVarArr = gd.d.a;
        gd.j jVar = gd.j.a;
        gd.h hVar = new gd.h();
        hVar.a = aVar;
        hVar.b = jVar;
        return hVar;
    }

    public static gd.i b(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        return new gd.i(initializer);
    }

    public static synchronized ua c(na naVar) {
        ua uaVar;
        synchronized (bb.class) {
            try {
                if (a == null) {
                    a = new ab(0);
                }
                uaVar = (ua) a.R0(naVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uaVar;
    }

    public static synchronized ua d() {
        ua c10;
        synchronized (bb.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            c10 = c(new na());
        }
        return c10;
    }
}
