package gb;

import j7.c9;
import j7.g9;
import j7.z8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a {
    public final c9 a;
    public final e b;
    public final cb.d c;

    public a(e eVar, cb.d dVar) {
        c9 a2;
        this.b = eVar;
        this.c = dVar;
        String str = true != eVar.g ? "play-services-mlkit-language-id" : "language-id";
        synchronized (g9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            a2 = g9.a(new z8(str));
        }
        this.a = a2;
    }
}
