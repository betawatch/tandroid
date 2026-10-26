package f9;

import java.util.Iterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
