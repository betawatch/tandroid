// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bbc {
    public float a;
    public float b;
    public float c;

    public bbc(float f) {
        d(f);
    }

    public final boolean a(float f) {
        float f2 = this.b;
        float A = td4.A(this.c, f2, f, f2);
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
