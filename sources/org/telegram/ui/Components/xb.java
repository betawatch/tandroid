package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xb extends eb {
    public float a;
    public wb b;
    public o9 c;
    public j6 d;
    public boolean e;

    @Override // org.telegram.ui.Components.lb
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        if (this.e != (f10 < 1.0f)) {
            this.e = f10 < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        this.a = f10;
        this.b.invalidate();
    }

    public void setTextColor(int i9) {
        this.d.setTextColor(i9);
    }
}
