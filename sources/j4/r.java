package j4;

import c3.i0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

    public final void a(int i10) {
        long j10 = this.l;
        if (j10 != -9223372036854775807L) {
            long j11 = this.b;
            long j12 = this.k;
            if (j11 == j12) {
                return;
            }
            int i11 = (int) (j11 - j12);
            this.a.c(j10, this.m ? 1 : 0, i11, i10, null);
        }
    }
}
