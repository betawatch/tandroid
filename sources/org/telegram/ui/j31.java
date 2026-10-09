package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j31 extends b71 {
    public final /* synthetic */ l31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j31(l31 l31Var, i31 i31Var) {
        super(i31Var);
        this.e = l31Var;
    }

    @Override // org.telegram.ui.b71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
