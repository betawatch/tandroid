package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lx extends g61 {
    public final /* synthetic */ oy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(oy oyVar, kx kxVar) {
        super(kxVar);
        this.e = oyVar;
    }

    @Override // org.telegram.ui.g61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.J0 = null;
    }
}
