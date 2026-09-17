package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class h extends kd.c {
    public i a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, kd.c cVar) {
        super(cVar);
        this.c = iVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.b(this);
    }
}
