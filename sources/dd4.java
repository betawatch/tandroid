// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dd4 extends ax2 {
    public ed4 a;
    public Object b;
    public Object c;
    public pd4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ed4 f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd4(ed4 ed4Var, ax2 ax2Var) {
        super(ax2Var);
        this.f = ed4Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.b(null, this);
    }
}
