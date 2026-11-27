// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ni3 extends d1a {
    public final /* synthetic */ uj3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni3(uj3 uj3Var, mi3 mi3Var) {
        super(mi3Var);
        this.e = uj3Var;
    }

    @Override // d1a, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.N0 = null;
    }
}
