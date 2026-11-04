package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rb extends ya {
    public float a;
    public qb b;
    public k9 c;
    public h6 d;
    public boolean e;

    @Override // org.telegram.ui.Components.fb
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        if (this.e != (f10 < 1.0f)) {
            this.e = f10 < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
        this.a = f10;
        this.b.invalidate();
    }

    public void setTextColor(int i3) {
        this.d.setTextColor(i3);
    }
}
