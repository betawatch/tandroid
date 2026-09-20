package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class k31 extends a71 {
    public final /* synthetic */ m31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k31(m31 m31Var, j31 j31Var) {
        super(j31Var);
        this.e = m31Var;
    }

    @Override // org.telegram.ui.a71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
