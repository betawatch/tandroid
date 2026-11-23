package h9;

import java.util.Iterator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class w0 extends g2 {
    public final /* synthetic */ g9.k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Iterator it, g9.k kVar) {
        super(it);
        this.b = kVar;
    }

    @Override // h9.g2
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
