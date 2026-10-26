package ib;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class f1 extends fb.u {
    @Override // fb.u
    public final Object read(nb.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
