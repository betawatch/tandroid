package f9;

import java.util.Iterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class w0 extends f2 {
    public final /* synthetic */ e9.k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Iterator it, e9.k kVar) {
        super(it);
        this.b = kVar;
    }

    @Override // f9.f2
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
