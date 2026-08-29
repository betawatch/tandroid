package n4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import h7.m5;
import j3.t0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends e {
    public final d s;
    public g9.l v;
    public long w;
    public volatile boolean x;

    public j(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i10, Object obj, d dVar) {
        super(mVar, qVar, 2, t0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = dVar;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        if (this.w == 0) {
            this.s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            q a2 = this.b.a(this.w);
            x0 x0Var = this.r;
            o3.h hVar = new o3.h(x0Var, a2.e, x0Var.open(a2));
            while (!this.x) {
                try {
                    int d = this.s.a.d(hVar, d.s);
                    boolean z10 = false;
                    f5.a.i(d != 1);
                    if (d == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.w = hVar.d - this.b.e;
                }
            }
        } finally {
            m5.a(this.r);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void q() {
        this.x = true;
    }
}
