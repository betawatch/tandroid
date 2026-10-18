package hb;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class f1 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
