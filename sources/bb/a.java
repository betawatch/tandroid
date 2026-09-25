package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class a extends kd.c {
    public Object a;
    public ie.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, kd.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.c(this);
    }
}
