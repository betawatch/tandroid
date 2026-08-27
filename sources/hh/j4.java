package hh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j4 {
    public float a;
    public final int b;
    public final int c;

    public j4(float f10, int i10, int i11) {
        this.a = f10;
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

    public j4(int i10, int i11) {
        this.b = i10;
        this.c = i11;
    }
}
