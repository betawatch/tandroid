package gb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class d1 extends kd.c {
    public String a;
    public b1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, id.c cVar) {
        super(cVar);
        this.d = e1Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return e1.a(this.d, null, null, this);
    }
}
