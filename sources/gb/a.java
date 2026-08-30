package gb;

import j7.c9;
import j7.g9;
import j7.z8;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a {
    public final c9 a;
    public final e b;
    public final cb.d c;

    public a(e eVar, cb.d dVar) {
        c9 b10;
        this.b = eVar;
        this.c = dVar;
        String str = true != eVar.g ? "play-services-mlkit-language-id" : "language-id";
        synchronized (g9.class) {
            byte b11 = (byte) (((byte) 1) | 2);
            if (b11 != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b11 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b11 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            b10 = g9.b(new z8(str));
        }
        this.a = b10;
    }
}
