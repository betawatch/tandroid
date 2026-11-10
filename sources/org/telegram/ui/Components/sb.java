package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sb extends ya {
    public float a;
    public rb b;
    public k9 c;
    public i6 d;
    public boolean e;

    @Override // org.telegram.ui.Components.fb
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        if (this.e != (f10 < 1.0f)) {
            this.e = f10 < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(wq.h).start();
        }
        this.a = f10;
        this.b.invalidate();
    }

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }
}
