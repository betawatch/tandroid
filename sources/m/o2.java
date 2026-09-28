package m;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
