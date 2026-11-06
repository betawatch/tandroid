package bi;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g6 {
    public float a;
    public final int b;
    public final int c;

    public g6(float f10, int i7, int i10) {
        this.a = f10;
        this.b = i7;
        this.c = i10;
    }

    public float a(int i7) {
        int i10 = this.b;
        int i11 = this.c;
        if (i11 == i7 && i10 == i7) {
            return 1.0f;
        }
        if (i11 == i7) {
            return this.a;
        }
        if (i10 == i7) {
            return 1.0f - this.a;
        }
        return 0.0f;
    }

    public boolean b(int i7) {
        return this.b == i7 || this.c == i7;
    }

    public boolean c(int i7) {
        return this.c == i7;
    }

    public boolean d(int i7) {
        return this.c == i7;
    }

    public g6(int i7, int i10) {
        this.b = i7;
        this.c = i10;
    }
}
