package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class hc extends nb {
    public float a;
    public gc b;
    public w9 c;
    public p6 d;
    public boolean e;

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f7) {
        if (this.e != (f7 < 1.0f)) {
            this.e = f7 < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(sr.h).start();
        }
        this.a = f7;
        this.b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
