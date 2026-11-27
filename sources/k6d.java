// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
