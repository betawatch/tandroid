package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class cp0 extends s51 {
    public final /* synthetic */ fp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(fp0 fp0Var, bp0 bp0Var) {
        super(bp0Var);
        this.e = fp0Var;
    }

    @Override // org.telegram.ui.s51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
