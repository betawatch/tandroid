// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
