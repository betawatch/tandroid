// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class g2 extends ax2 {
    public gs9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l09 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(l09 l09Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = l09Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.k(null, this);
    }
}
