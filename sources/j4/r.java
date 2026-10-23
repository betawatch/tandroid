package j4;

import c3.l0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class r {
    public final l0 a;
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

    public r(l0 l0Var) {
        this.a = l0Var;
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
