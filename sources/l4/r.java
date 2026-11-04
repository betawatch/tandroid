package l4;

import e3.i0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r {
    public final i0 a;
    public long b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;

    public r(i0 i0Var) {
        this.a = i0Var;
    }

    public final void a(int i3) {
        long j10 = this.l;
        if (j10 != -9223372036854775807L) {
            long j11 = this.b;
            long j12 = this.k;
            if (j11 == j12) {
                return;
            }
            int i10 = (int) (j11 - j12);
            this.a.d(j10, this.m ? 1 : 0, i10, i3, null);
        }
    }
}
