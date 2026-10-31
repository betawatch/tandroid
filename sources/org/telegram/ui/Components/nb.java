package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nb extends ta {
    public float a;
    public mb b;
    public g9 c;
    public f6 d;
    public boolean e;

    @Override // org.telegram.ui.Components.bb
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f7) {
        if (this.e != (f7 < 1.0f)) {
            this.e = f7 < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        this.a = f7;
        this.b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
