package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ga1 extends org.telegram.ui.Components.vu0 {
    public boolean f0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        Q();
        if (getKeyboardHeight() != 0 || this.f0) {
            this.f0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i12 = org.telegram.messenger.wp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
            this.f = i12;
            setPadding(0, 0, 0, i12);
        }
        super.onMeasure(i10, i11);
    }
}
