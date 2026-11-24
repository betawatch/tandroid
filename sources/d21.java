// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d21 extends h11 {
    public float a;
    public c21 b;
    public be0 c;
    public hn d;
    public boolean e;

    @Override // q11
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f) {
        if (this.e != (f < 1.0f)) {
            this.e = f < 1.0f;
            this.c.animate().scaleX(this.e ? 0.78f : 1.0f).scaleY(this.e ? 0.78f : 1.0f).setDuration(320L).setInterpolator(s33.h).start();
        }
        this.a = f;
        this.b.invalidate();
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }
}
