package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dc extends jb {
    public float a;
    public cc b;
    public t9 c;
    public o6 d;
    public boolean e;

    @Override // org.telegram.ui.Components.rb
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f9) {
        if (this.e != (f9 < 1.0f)) {
            this.e = f9 < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(jr.h).start();
        }
        this.a = f9;
        this.b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
