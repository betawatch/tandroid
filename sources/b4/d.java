package b4;

import g4.i;
import h7.h5;
import j3.t0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    public final h5 a(t0 t0Var) {
        String str = t0Var.B;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new c4.b(0);
                case "application/x-icy":
                    return new f4.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new c4.b(1);
                case "application/x-scte35":
                    return new i4.c();
            }
        }
        throw new IllegalArgumentException(u3.c.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(t0 t0Var) {
        String str = t0Var.B;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
