// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bmb implements imb {
    public boolean a;
    public final /* synthetic */ mu1 b;

    public bmb(mu1 mu1Var, boolean z) {
        this.b = mu1Var;
        this.a = z;
    }

    @Override // imb
    public final void E(boolean z) {
        boolean z2 = !this.a;
        this.a = z2;
        ku1 ku1Var = this.b.Ba;
        ku1Var.q(ku1Var.f, ku1Var.g, z, Boolean.valueOf(z2), false);
    }

    @Override // imb
    public final boolean a() {
        return this.a;
    }

    @Override // imb
    public final boolean w() {
        return true;
    }
}
