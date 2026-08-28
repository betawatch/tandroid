package o3;

import d5.f0;
import m3.s;
import m3.u;
import m3.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public final w a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public e(int i9, int i10, long j10, int i11, w wVar) {
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        d5.a.f(z10);
        this.d = j10;
        this.e = i11;
        this.a = wVar;
        int i12 = (((i9 % 10) + 48) << 8) | ((i9 / 10) + 48);
        this.b = (i10 == 2 ? 1667497984 : 1651965952) | i12;
        this.c = i10 == 2 ? i12 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final u a(int i9) {
        return new u(((this.d * 1) / this.e) * this.l[i9], this.k[i9]);
    }

    public final s b(long j10) {
        int i9 = (int) (j10 / ((this.d * 1) / this.e));
        int d = f0.d(this.l, i9, true, true);
        if (this.l[d] == i9) {
            u a2 = a(d);
            return new s(a2, a2);
        }
        u a3 = a(d);
        int i10 = d + 1;
        return i10 < this.k.length ? new s(a3, a(i10)) : new s(a3, a3);
    }
}
