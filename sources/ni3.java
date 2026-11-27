// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
