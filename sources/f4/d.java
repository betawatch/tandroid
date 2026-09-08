package f4;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
