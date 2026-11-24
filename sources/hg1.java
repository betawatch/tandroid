// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hg1 extends m8 {
    public final /* synthetic */ vg1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg1(vg1 vg1Var, gg1 gg1Var) {
        super(gg1Var, -2, -2);
        this.o = vg1Var;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        vg1 vg1Var = this.o;
        if (vg1Var.G0 != this) {
            return;
        }
        u31.e();
        vg1Var.G0 = null;
    }
}
