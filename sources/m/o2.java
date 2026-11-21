package m;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class o2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.c = i7;
        this.d = i10;
        this.h = true;
        if (this.g) {
            if (i10 != Integer.MIN_VALUE) {
                this.a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.b = i10;
        }
    }
}
