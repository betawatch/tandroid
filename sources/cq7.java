// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cq7 extends sy9 {
    public final /* synthetic */ hq7 d;

    public cq7(hq7 hq7Var) {
        this.d = hq7Var;
    }

    @Override // sy9
    public final void c(boolean z) {
        this.d.a(!z);
    }

    @Override // sy9
    public final CharSequence d() {
        hq7 hq7Var = this.d;
        qcc qccVar = hq7Var.v0;
        int i = hq7Var.I;
        return qccVar != null ? (CharSequence) qccVar.a(Integer.valueOf(i)) : hq7Var.d(i);
    }
}
