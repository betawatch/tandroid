// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
