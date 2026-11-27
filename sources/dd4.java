// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
