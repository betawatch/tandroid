package e9;

import java.util.Iterator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b1 extends l2 {
    public final /* synthetic */ d9.k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Iterator it, d9.k kVar) {
        super(it);
        this.b = kVar;
    }

    @Override // e9.l2
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
