package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
