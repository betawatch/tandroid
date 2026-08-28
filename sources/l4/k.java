package l4;

import com.google.android.exoplayer2.upstream.q;
import h3.t0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k extends e {
    public final long s;

    public k(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i9, Object obj, long j10, long j11, long j12) {
        super(mVar, qVar, 1, t0Var, i9, obj, j10, j11);
        t0Var.getClass();
        this.s = j12;
    }

    public long b() {
        long j10 = this.s;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean c();
}
