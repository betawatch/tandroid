package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class kp0 extends r61 {
    public final /* synthetic */ np0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(np0 np0Var, jp0 jp0Var) {
        super(jp0Var);
        this.e = np0Var;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
