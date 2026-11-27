// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g2 extends ax2 {
    public gs9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k09 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(k09 k09Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = k09Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.k(null, this);
    }
}
