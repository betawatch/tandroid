package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h81 extends org.telegram.ui.Components.qt0 {
    public boolean g0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        Q();
        if (getKeyboardHeight() != 0 || this.g0) {
            this.g0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i11 = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            this.f = i11;
            setPadding(0, 0, 0, i11);
        }
        super.onMeasure(i3, i10);
    }
}
