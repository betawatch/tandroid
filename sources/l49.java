// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
