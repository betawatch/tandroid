package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class o extends kd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ gb.a1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(gb.a1 a1Var, id.c cVar) {
        super(cVar);
        this.c = a1Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.a(null, this);
    }
}
