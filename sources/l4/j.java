package l4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import f7.f5;
import h3.t0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends e {
    public final d s;
    public g5.b v;
    public long w;
    public volatile boolean x;

    public j(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i9, Object obj, d dVar) {
        super(mVar, qVar, 2, t0Var, i9, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = dVar;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void K() {
        this.x = true;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        if (this.w == 0) {
            this.s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            q a2 = this.b.a(this.w);
            x0 x0Var = this.r;
            m3.h hVar = new m3.h(x0Var, a2.e, x0Var.open(a2));
            while (!this.x) {
                try {
                    int b10 = this.s.a.b(hVar, d.s);
                    boolean z10 = false;
                    d5.a.i(b10 != 1);
                    if (b10 == 0) {
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
            f5.a(this.r);
        }
    }
}
