// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class iq1 extends n8 {
    public final /* synthetic */ zu1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq1(zu1 zu1Var, gq1 gq1Var) {
        super(gq1Var, -2, -2);
        this.o = zu1Var;
    }

    @Override // n8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        zu1 zu1Var = this.o;
        if (zu1Var.g9 == this) {
            zu1Var.g9 = null;
            zu1Var.l9 = null;
            zu1Var.k9 = null;
            zu1Var.C0.R = true;
            if (zu1Var.h9) {
                zu1Var.y6(false, true, 0.0f);
            } else {
                zu1Var.h9 = true;
            }
            nr1 nr1Var = zu1Var.a0;
            if (nr1Var == null || nr1Var.getEditField() == null) {
                return;
            }
            zu1Var.a0.getEditField().setAllowDrawCursor(true);
        }
    }
}
