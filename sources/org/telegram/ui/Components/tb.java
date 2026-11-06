package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class tb extends za {
    public float a;
    public sb b;
    public l9 c;
    public j6 d;
    public boolean e;

    @Override // org.telegram.ui.Components.gb
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

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }
}
