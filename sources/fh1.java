// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fh1 extends d1a {
    public final /* synthetic */ wh1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh1(wh1 wh1Var, eh1 eh1Var) {
        super(eh1Var);
        this.e = wh1Var;
    }

    @Override // d1a, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.R = null;
    }
}
