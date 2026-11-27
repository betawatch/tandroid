// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class f83 extends ax2 {
    public o83 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o83 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f83(o83 o83Var, ax2 ax2Var) {
        super(ax2Var);
        this.d = o83Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.f(this);
    }
}
