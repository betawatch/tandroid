// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hma extends ax2 {
    public Object a;
    public wj7 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kma d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hma(kma kmaVar, zw2 zw2Var) {
        super(zw2Var);
        this.d = kmaVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.c(null, this);
    }
}
