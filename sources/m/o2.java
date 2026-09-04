package m;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

    public final void a(int i10, int i11) {
        this.c = i10;
        this.d = i11;
        this.h = true;
        if (this.g) {
            if (i11 != Integer.MIN_VALUE) {
                this.a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.b = i11;
        }
    }
}
