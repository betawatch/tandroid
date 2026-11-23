package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class o extends kd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ gb.y0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(gb.y0 y0Var, id.c cVar) {
        super(cVar);
        this.c = y0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.a(null, this);
    }
}
