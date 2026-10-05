package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lc extends r61 {
    public final /* synthetic */ cd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(cd cdVar, kc kcVar) {
        super(kcVar);
        this.e = cdVar;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
