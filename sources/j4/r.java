package j4;

import c3.h0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class r {
    public final h0 a;
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

    public r(h0 h0Var) {
        this.a = h0Var;
    }

    public final void a(int i10) {
        long j3 = this.l;
        if (j3 != -9223372036854775807L) {
            long j10 = this.b;
            long j11 = this.k;
            if (j10 == j11) {
                return;
            }
            int i11 = (int) (j10 - j11);
            this.a.c(j3, this.m ? 1 : 0, i11, i10, null);
        }
    }
}
