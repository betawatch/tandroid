package f4;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final int b;
    public float c;

    public d(float f7, int i10, int i11) {
        this.c = f7;
        this.a = i10;
        this.b = i11;
    }

    public float a(int i10) {
        int i11 = this.a;
        int i12 = this.b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.c;
        }
        if (i11 == i10) {
            return 1.0f - this.c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        return this.a == i10 || this.b == i10;
    }

    public boolean c(int i10) {
        return this.b == i10;
    }

    public boolean d(int i10) {
        return this.b == i10;
    }

    public d(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }
}
