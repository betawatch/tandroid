package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class bb {
    public static ab a;

    public static g9.t a(g9.t tVar) {
        return !(tVar instanceof g9.v) ? tVar instanceof g9.u ? tVar : tVar instanceof Serializable ? new g9.u(tVar) : new g9.v(tVar) : tVar;
    }

    public static synchronized ua b(na naVar) {
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

    public static synchronized ua c() {
        ua b10;
        synchronized (bb.class) {
            byte b11 = (byte) (((byte) 1) | 2);
            if (b11 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b11 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b11 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            b10 = b(new na());
        }
        return b10;
    }
}
