package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class q81 extends org.telegram.ui.Components.rt0 {
    public boolean f0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        Q();
        if (getKeyboardHeight() != 0 || this.f0) {
            this.f0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i11 = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            this.f = i11;
            setPadding(0, 0, 0, i11);
        }
        super.onMeasure(i7, i10);
    }
}
