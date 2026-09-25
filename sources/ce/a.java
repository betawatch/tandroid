package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class a extends kd.c {
    public de.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xa.c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.c = cVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.l(null, this);
    }
}
