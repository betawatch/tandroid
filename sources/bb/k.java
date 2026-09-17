package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class k extends kd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ m b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, kd.c cVar) {
        super(cVar);
        this.b = mVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, null, this);
    }
}
