// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class amb extends qmb {
    public final /* synthetic */ mu1 m2;
    public final /* synthetic */ boolean n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amb(Object obj, mu1 mu1Var, boolean z) {
        super(obj, null, true);
        this.m2 = mu1Var;
        this.n2 = z;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ku1 ku1Var = this.m2.Ba;
        ku1Var.q(ku1Var.f, ku1Var.g, false, Boolean.valueOf(this.n2), false);
    }
}
