// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
