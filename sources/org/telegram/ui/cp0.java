package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
