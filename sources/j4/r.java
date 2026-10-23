package j4;

import c3.j0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class r {
    public final j0 a;
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

    public r(j0 j0Var) {
        this.a = j0Var;
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
