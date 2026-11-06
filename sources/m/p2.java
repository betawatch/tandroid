package m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
