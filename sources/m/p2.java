package m;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
