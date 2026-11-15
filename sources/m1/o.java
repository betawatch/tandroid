package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
