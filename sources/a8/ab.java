package a8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class ab {
    public static za a;

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

    public static synchronized ta c(ma maVar) {
        ta taVar;
        synchronized (ab.class) {
            try {
                if (a == null) {
                    a = new za(0);
                }
                taVar = (ta) a.R0(maVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return taVar;
    }

    public static synchronized ta d() {
        ta c10;
        synchronized (ab.class) {
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
            c10 = c(new ma());
        }
        return c10;
    }
}
