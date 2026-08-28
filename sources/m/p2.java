package m;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public final void a(int i9, int i10) {
        this.c = i9;
        this.d = i10;
        this.h = true;
        if (this.g) {
            if (i10 != Integer.MIN_VALUE) {
                this.a = i10;
            }
            if (i9 != Integer.MIN_VALUE) {
                this.b = i9;
                return;
            }
            return;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.a = i9;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.b = i10;
        }
    }
}
