// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fj3 extends mz9 {
    public final /* synthetic */ nk3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj3(nk3 nk3Var, ej3 ej3Var) {
        super(ej3Var);
        this.e = nk3Var;
    }

    @Override // mz9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.N0 = null;
    }
}
