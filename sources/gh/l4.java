package gh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l4 {
    public float a;
    public final int b;
    public final int c;

    public l4(float f10, int i9, int i10) {
        this.a = f10;
        this.b = i9;
        this.c = i10;
    }

    public float a(int i9) {
        int i10 = this.b;
        int i11 = this.c;
        if (i11 == i9 && i10 == i9) {
            return 1.0f;
        }
        if (i11 == i9) {
            return this.a;
        }
        if (i10 == i9) {
            return 1.0f - this.a;
        }
        return 0.0f;
    }

    public boolean b(int i9) {
        return this.b == i9 || this.c == i9;
    }

    public boolean c(int i9) {
        return this.c == i9;
    }

    public boolean d(int i9) {
        return this.c == i9;
    }

    public l4(int i9, int i10) {
        this.b = i9;
        this.c = i10;
    }
}
