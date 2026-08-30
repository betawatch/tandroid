package m;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
