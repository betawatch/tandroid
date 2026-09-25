package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class j extends kd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ l b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, kd.c cVar) {
        super(cVar);
        this.b = lVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, null, this);
    }
}
