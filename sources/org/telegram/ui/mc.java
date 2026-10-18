package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class mc extends q51 {
    public final /* synthetic */ dd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(dd ddVar, lc lcVar) {
        super(lcVar);
        this.e = ddVar;
    }

    @Override // org.telegram.ui.q51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
