// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class adc {
    public float a;
    public float b;
    public float c;

    public adc(float f) {
        d(f);
    }

    public final boolean a(float f) {
        float f2 = this.b;
        float A = qd4.A(this.c, f2, f, f2);
        if (this.a == A) {
            return false;
        }
        this.a = A;
        return true;
    }

    public final boolean b(float f) {
        return this.c != f;
    }

    public final void c(boolean z) {
        if (!z) {
            this.b = this.a;
            return;
        }
        float f = this.c;
        this.a = f;
        this.b = f;
    }

    public final void d(float f) {
        this.b = f;
        this.c = f;
        this.a = f;
    }
}
