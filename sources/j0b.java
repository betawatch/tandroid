// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class j0b extends ax2 {
    public k0b a;
    public nm4 b;
    public l0b c;
    public ev5 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ k0b h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0b(k0b k0bVar, zw2 zw2Var) {
        super(zw2Var);
        this.h = k0bVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.k(null, this);
        return vx2.a;
    }
}
