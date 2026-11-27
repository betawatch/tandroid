// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class k6d implements pd0 {
    public final /* synthetic */ n05 a;

    public k6d(n05 n05Var) {
        this.a = n05Var;
    }

    @Override // pd0
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        b99 b99Var = this.a.y;
        b99Var.sendMessage(b99Var.obtainMessage(1, valueOf));
    }
}
