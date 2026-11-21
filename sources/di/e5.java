package di;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class e5 {
    public float a;
    public final int b;
    public final int c;

    public e5(float f10, int i7, int i10) {
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

    public e5(int i7, int i10) {
        this.b = i7;
        this.c = i10;
    }
}
