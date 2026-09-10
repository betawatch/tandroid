package f4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
