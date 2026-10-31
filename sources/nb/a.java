package nb;

import v7.b9;
import v7.u8;
import v7.x8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public final x8 a;
    public final e b;
    public final jb.d c;

    public a(e eVar, jb.d dVar) {
        x8 b10;
        this.b = eVar;
        this.c = dVar;
        String str = true != eVar.g ? "play-services-mlkit-language-id" : "language-id";
        synchronized (b9.class) {
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
            b10 = b9.b(new u8(str));
        }
        this.a = b10;
    }
}
