package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k31 extends y61 {
    public final /* synthetic */ m31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k31(m31 m31Var, j31 j31Var) {
        super(j31Var);
        this.e = m31Var;
    }

    @Override // org.telegram.ui.y61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
