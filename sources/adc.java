// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
