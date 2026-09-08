package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hc extends nb {
    public float a;
    public gc b;
    public x9 c;
    public q6 d;
    public boolean e;

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f7) {
        if (this.e != (f7 < 1.0f)) {
            this.e = f7 < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
        this.a = f7;
        this.b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
