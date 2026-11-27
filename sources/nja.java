// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class nja extends ax2 {
    public oja a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oja c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nja(oja ojaVar, ax2 ax2Var) {
        super(ax2Var);
        this.c = ojaVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.a(null, this);
    }
}
