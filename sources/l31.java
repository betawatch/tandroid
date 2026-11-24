// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l31 extends p21 {
    public float a;
    public k31 b;
    public bf0 c;
    public io d;
    public boolean e;

    @Override // y21
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f) {
        if (this.e != (f < 1.0f)) {
            this.e = f < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(d53.h).start();
        }
        this.a = f;
        this.b.invalidate();
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }
}
