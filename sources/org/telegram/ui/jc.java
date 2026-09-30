package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class jc extends r61 {
    public final /* synthetic */ ad e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(ad adVar, ic icVar) {
        super(icVar);
        this.e = adVar;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
