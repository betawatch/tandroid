// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class l49 extends d1a {
    public final /* synthetic */ n49 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l49(n49 n49Var, k49 k49Var) {
        super(k49Var);
        this.e = n49Var;
    }

    @Override // d1a, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
