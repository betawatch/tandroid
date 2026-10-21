package e9;

import java.util.Iterator;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
