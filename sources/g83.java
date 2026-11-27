// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g83 extends ax2 {
    public o83 a;
    public i0b b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ o83 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g83(o83 o83Var, zw2 zw2Var) {
        super(zw2Var);
        this.e = o83Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.g(false, this);
    }
}
