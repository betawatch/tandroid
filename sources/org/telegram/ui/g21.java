package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g21 extends u51 {
    public final /* synthetic */ i21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g21(i21 i21Var, f21 f21Var) {
        super(f21Var);
        this.e = i21Var;
    }

    @Override // org.telegram.ui.u51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
