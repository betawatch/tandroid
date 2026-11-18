package m4;

import f3.i0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    public final void a(int i7) {
        long j3 = this.l;
        if (j3 != -9223372036854775807L) {
            long j10 = this.b;
            long j11 = this.k;
            if (j10 == j11) {
                return;
            }
            int i10 = (int) (j10 - j11);
            this.a.c(j3, this.m ? 1 : 0, i10, i7, null);
        }
    }
}
