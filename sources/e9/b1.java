package e9;

import java.util.Iterator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
