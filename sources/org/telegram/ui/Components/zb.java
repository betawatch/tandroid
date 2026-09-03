package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zb extends eb {
    public float a;
    public yb b;
    public p9 c;
    public k6 d;
    public boolean e;

    @Override // org.telegram.ui.Components.nb
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f10) {
        if (this.e != (f10 < 1.0f)) {
            this.e = f10 < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(mr.h).start();
        }
        this.a = f10;
        this.b.invalidate();
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }
}
