package e4;

import j3.n0;
import j4.i;
import j7.d7;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    public final d7 a(n0 n0Var) {
        String str = n0Var.C;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new f4.b(0);
                case "application/x-icy":
                    return new i4.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new f4.b(1);
                case "application/x-scte35":
                    return new l4.c();
            }
        }
        throw new IllegalArgumentException(yh.k("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(n0 n0Var) {
        String str = n0Var.C;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
