package c3;

import android.os.SystemClock;
import android.os.Trace;
import d2.a2;
import d2.u0;
import g2.n0;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e0 {
    public final p4.q a;
    public final y b;
    public final x c = new x();
    public final g2.k0 d = new g2.k0();
    public final g2.k0 e = new g2.k0();
    public final g2.t f;
    public final z g;
    public long h;
    public long i;
    public long j;
    public a2 k;
    public long l;

    public e0(p4.q qVar, y yVar, z zVar) {
        this.a = qVar;
        this.b = yVar;
        this.g = zVar;
        g2.t tVar = new g2.t();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        tVar.a = 0;
        tVar.b = -1;
        tVar.c = 0;
        tVar.e = new long[highestOneBit];
        tVar.d = highestOneBit - 1;
        this.f = tVar;
        this.h = -9223372036854775807L;
        this.k = a2.d;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a(long j10, long j11) {
        final p4.q qVar = this.a;
        e eVar = (e) qVar.b;
        while (true) {
            g2.t tVar = this.f;
            int i3 = tVar.c;
            if (i3 == 0) {
                return;
            }
            if (i3 == 0) {
                throw new NoSuchElementException();
            }
            long j12 = ((long[]) tVar.e)[tVar.a];
            Long l10 = (Long) this.e.j(j12);
            y yVar = this.b;
            if (l10 != null && l10.longValue() != this.l) {
                this.l = l10.longValue();
                yVar.e(2);
            }
            long j13 = this.l;
            y yVar2 = this.b;
            x xVar = this.c;
            int a10 = yVar2.a(j12, j10, j11, j13, false, false, xVar);
            if (a10 != 5 && a10 != 4) {
                this.g.a(j12, xVar.a);
            }
            if (a10 == 0 || a10 == 1) {
                this.i = j12;
                boolean z10 = a10 == 0;
                long d = tVar.d();
                a2 a2Var = (a2) this.d.j(d);
                if (a2Var != null && !a2Var.equals(a2.d) && !a2Var.equals(this.k)) {
                    this.k = a2Var;
                    d2.u uVar = new d2.u();
                    uVar.y = a2Var.a;
                    uVar.z = a2Var.b;
                    uVar.r = u0.n("video/raw");
                    qVar.a = new d2.v(uVar);
                    eVar.i.execute(new a1.f(25, qVar, a2Var));
                }
                long nanoTime = z10 ? System.nanoTime() : xVar.b;
                boolean z11 = yVar.e != 3;
                yVar.e = 3;
                yVar.l.getClass();
                yVar.g = n0.S(SystemClock.elapsedRealtime());
                if (z11 && eVar.e != null) {
                    final int i10 = 0;
                    eVar.i.execute(new Runnable() { // from class: c3.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ((e) qVar.b).h.onFirstFrameRendered();
                                    break;
                                default:
                                    ((e) qVar.b).h.a0();
                                    break;
                            }
                        }
                    });
                }
                d2.v vVar = (d2.v) qVar.a;
                eVar.j.a(d, nanoTime, vVar == null ? new d2.v(new d2.u()) : vVar, null);
                i iVar = (i) eVar.d.remove();
                iVar.c.M0(iVar.a, iVar.b, nanoTime);
            } else if (a10 == 2 || a10 == 3) {
                this.i = j12;
                tVar.d();
                final int i11 = 1;
                eVar.i.execute(new Runnable() { // from class: c3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ((e) qVar.b).h.onFirstFrameRendered();
                                break;
                            default:
                                ((e) qVar.b).h.a0();
                                break;
                        }
                    }
                });
                i iVar2 = (i) eVar.d.remove();
                l lVar = iVar2.c;
                t2.l lVar2 = iVar2.a;
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
                this.i = j12;
            }
        }
    }
}
