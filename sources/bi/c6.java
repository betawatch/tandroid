package bi;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c6 {
    public float a;
    public final int b;
    public final int c;

    public c6(float f7, int i10, int i11) {
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

    public c6(int i10, int i11) {
        this.b = i10;
        this.c = i11;
    }
}
