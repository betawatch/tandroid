// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hr1 extends m8 {
    public final /* synthetic */ yv1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr1(yv1 yv1Var, fr1 fr1Var) {
        super(fr1Var, -2, -2);
        this.o = yv1Var;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        yv1 yv1Var = this.o;
        if (yv1Var.g9 == this) {
            yv1Var.g9 = null;
            yv1Var.l9 = null;
            yv1Var.k9 = null;
            yv1Var.C0.R = true;
            if (yv1Var.h9) {
                yv1Var.y6(false, true, 0.0f);
            } else {
                yv1Var.h9 = true;
            }
            ms1 ms1Var = yv1Var.a0;
            if (ms1Var == null || ms1Var.getEditField() == null) {
                return;
            }
            yv1Var.a0.getEditField().setAllowDrawCursor(true);
        }
    }
}
