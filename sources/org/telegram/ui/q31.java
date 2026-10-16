package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class q31 extends i71 {
    public final /* synthetic */ s31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q31(s31 s31Var, p31 p31Var) {
        super(p31Var);
        this.e = s31Var;
    }

    @Override // org.telegram.ui.i71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
