package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hc extends x21 {
    public final /* synthetic */ zc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(zc zcVar, gc gcVar) {
        super(gcVar);
        this.e = zcVar;
    }

    @Override // org.telegram.ui.x21, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
