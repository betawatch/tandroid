package m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public final void a(int i3, int i10) {
        this.c = i3;
        this.d = i10;
        this.h = true;
        if (this.g) {
            if (i10 != Integer.MIN_VALUE) {
                this.a = i10;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.a = i3;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.b = i10;
        }
    }
}
