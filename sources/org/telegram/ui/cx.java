package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cx extends u51 {
    public final /* synthetic */ fy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(fy fyVar, bx bxVar) {
        super(bxVar);
        this.e = fyVar;
    }

    @Override // org.telegram.ui.u51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.I0 = null;
    }
}
