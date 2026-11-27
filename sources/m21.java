// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m21 extends q11 {
    public float a;
    public l21 b;
    public de0 c;
    public in d;
    public boolean e;

    @Override // z11
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f) {
        if (this.e != (f < 1.0f)) {
            this.e = f < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(k43.h).start();
        }
        this.a = f;
        this.b.invalidate();
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }
}
