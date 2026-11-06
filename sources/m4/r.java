package m4;

import f3.j0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
