package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.r61 {
    public final /* synthetic */ y e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, w wVar) {
        super(wVar);
        this.e = yVar;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.i0 = null;
    }
}
