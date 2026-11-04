package g9;

import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w0 extends f2 {
    public final /* synthetic */ f9.k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Iterator it, f9.k kVar) {
        super(it);
        this.b = kVar;
    }

    @Override // g9.f2
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
