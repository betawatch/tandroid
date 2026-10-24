package ai;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class h6 {
    public float a;
    public final int b;
    public final int c;

    public h6(float f7, int i10, int i11) {
        this.a = f7;
        this.b = i10;
        this.c = i11;
    }

    public float a(int i10) {
        int i11 = this.b;
        int i12 = this.c;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.a;
        }
        if (i11 == i10) {
            return 1.0f - this.a;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        return this.b == i10 || this.c == i10;
    }

    public boolean c(int i10) {
        return this.c == i10;
    }

    public boolean d(int i10) {
        return this.c == i10;
    }

    public h6(int i10, int i11) {
        this.b = i10;
        this.c = i11;
    }
}
