package ci;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k5 {
    public float a;
    public final int b;
    public final int c;

    public k5(float f10, int i3, int i10) {
        this.a = f10;
        this.b = i3;
        this.c = i10;
    }

    public float a(int i3) {
        int i10 = this.b;
        int i11 = this.c;
        if (i11 == i3 && i10 == i3) {
            return 1.0f;
        }
        if (i11 == i3) {
            return this.a;
        }
        if (i10 == i3) {
            return 1.0f - this.a;
        }
        return 0.0f;
    }

    public boolean b(int i3) {
        return this.b == i3 || this.c == i3;
    }

    public boolean c(int i3) {
        return this.c == i3;
    }

    public boolean d(int i3) {
        return this.c == i3;
    }

    public k5(int i3, int i10) {
        this.b = i3;
        this.c = i10;
    }
}
