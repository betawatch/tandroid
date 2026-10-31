package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ia1 extends org.telegram.ui.Components.uu0 {
    public boolean f0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        Q();
        if (getKeyboardHeight() != 0 || this.f0) {
            this.f0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i12 = org.telegram.messenger.vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
            this.f = i12;
            setPadding(0, 0, 0, i12);
        }
        super.onMeasure(i10, i11);
    }
}
