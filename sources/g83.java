// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
