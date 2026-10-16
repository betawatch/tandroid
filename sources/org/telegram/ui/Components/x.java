package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.i71 {
    public final /* synthetic */ y e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, w wVar) {
        super(wVar);
        this.e = yVar;
    }

    @Override // org.telegram.ui.i71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.i0 = null;
    }
}
