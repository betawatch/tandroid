package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nz0 extends z21 {
    public final /* synthetic */ pz0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(pz0 pz0Var, mz0 mz0Var) {
        super(mz0Var);
        this.e = pz0Var;
    }

    @Override // org.telegram.ui.z21, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
