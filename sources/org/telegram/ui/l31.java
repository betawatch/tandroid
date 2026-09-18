package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l31 extends z61 {
    public final /* synthetic */ n31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l31(n31 n31Var, k31 k31Var) {
        super(k31Var);
        this.e = n31Var;
    }

    @Override // org.telegram.ui.z61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
