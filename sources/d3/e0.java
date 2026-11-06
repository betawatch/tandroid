package d3;

import android.os.SystemClock;
import android.os.Trace;
import bi.a4;
import e2.s0;
import e2.x1;
import h2.m0;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e0 {
    public final q4.q a;
    public final y b;
    public final x c = new x();
    public final h2.j0 d = new h2.j0();
    public final h2.j0 e = new h2.j0();
    public final h2.s f;
    public final z g;
    public long h;
    public long i;
    public long j;
    public x1 k;
    public long l;

    public e0(q4.q qVar, y yVar, z zVar) {
        this.a = qVar;
        this.b = yVar;
        this.g = zVar;
        h2.s sVar = new h2.s();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        sVar.a = 0;
        sVar.b = -1;
        sVar.c = 0;
        sVar.e = new long[highestOneBit];
        sVar.d = highestOneBit - 1;
        this.f = sVar;
        this.h = -9223372036854775807L;
        this.k = x1.d;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        final q4.q qVar = this.a;
        e eVar = (e) qVar.c;
        while (true) {
            h2.s sVar = this.f;
            int i7 = sVar.c;
            if (i7 == 0) {
                return;
            }
            if (i7 == 0) {
                throw new NoSuchElementException();
            }
            long j11 = ((long[]) sVar.e)[sVar.a];
            Long l10 = (Long) this.e.j(j11);
            y yVar = this.b;
            if (l10 != null && l10.longValue() != this.l) {
                this.l = l10.longValue();
                yVar.e(2);
            }
            long j12 = this.l;
            y yVar2 = this.b;
            x xVar = this.c;
            int a10 = yVar2.a(j11, j3, j10, j12, false, false, xVar);
            if (a10 != 5 && a10 != 4) {
                this.g.a(j11, xVar.a);
            }
            if (a10 == 0 || a10 == 1) {
                this.i = j11;
                boolean z9 = a10 == 0;
                long d = sVar.d();
                x1 x1Var = (x1) this.d.j(d);
                if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.k)) {
                    this.k = x1Var;
                    e2.t tVar = new e2.t();
                    tVar.y = x1Var.a;
                    tVar.z = x1Var.b;
                    tVar.r = s0.n("video/raw");
                    qVar.b = new e2.u(tVar);
                    eVar.i.execute(new a4(22, qVar, x1Var));
                }
                long nanoTime = z9 ? System.nanoTime() : xVar.b;
                boolean z10 = yVar.e != 3;
                yVar.e = 3;
                yVar.l.getClass();
                yVar.g = m0.S(SystemClock.elapsedRealtime());
                if (z10 && eVar.e != null) {
                    final int i10 = 0;
                    eVar.i.execute(new Runnable() { // from class: d3.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ((e) qVar.c).h.onFirstFrameRendered();
                                    break;
                                default:
                                    ((e) qVar.c).h.m();
                                    break;
                            }
                        }
                    });
                }
                e2.u uVar = (e2.u) qVar.b;
                eVar.j.b(d, nanoTime, uVar == null ? new e2.u(new e2.t()) : uVar, null);
                i iVar = (i) eVar.d.remove();
                iVar.c.M0(iVar.a, iVar.b, nanoTime);
            } else if (a10 == 2 || a10 == 3) {
                this.i = j11;
                sVar.d();
                final int i11 = 1;
                eVar.i.execute(new Runnable() { // from class: d3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ((e) qVar.c).h.onFirstFrameRendered();
                                break;
                            default:
                                ((e) qVar.c).h.m();
                                break;
                        }
                    }
                });
                i iVar2 = (i) eVar.d.remove();
                l lVar = iVar2.c;
                u2.l lVar2 = iVar2.a;
                int i12 = iVar2.b;
                Trace.beginSection("dropVideoBuffer");
                lVar2.c(i12);
                Trace.endSection();
                lVar.R0(0, 1);
            } else {
                if (a10 != 4) {
                    if (a10 != 5) {
                        throw new IllegalStateException(String.valueOf(a10));
                    }
                    return;
                }
                this.i = j11;
            }
        }
    }
}
