package la;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g0 extends wc.c {
    public h0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, wc.c cVar) {
        super(cVar);
        this.c = h0Var;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return h0.b(this.c, this);
    }
}
