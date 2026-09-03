package a4;

import h5.d0;
import h5.w;
import j3.n0;
import j3.r1;
import java.util.Arrays;
import k7.x6;
import org.telegram.ui.Components.jb;
import r3.m;
import r3.s;
import r3.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e implements r3.k {
    public m a;
    public j b;
    public boolean c;

    public final boolean a(r3.l lVar) {
        boolean z4;
        g gVar = new g();
        if (gVar.a(lVar, true) && (gVar.a & 2) == 2) {
            int min = Math.min(gVar.e, 8);
            w wVar = new w(min);
            lVar.b(0, min, wVar.a);
            wVar.F(0);
            if (wVar.a() >= 5 && wVar.u() == 127 && wVar.v() == 1179402563) {
                this.b = new d();
                return true;
            }
            wVar.F(0);
            try {
                z4 = x6.c(1, wVar, true);
            } catch (r1 unused) {
                z4 = false;
            }
            if (z4) {
                this.b = new l();
            } else {
                wVar.F(0);
                if (i.e(wVar, i.o)) {
                    this.b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override // r3.k
    public final void d(long j10, long j11) {
        j jVar = this.b;
        if (jVar != null) {
            f fVar = jVar.a;
            g gVar = fVar.a;
            gVar.a = 0;
            gVar.b = 0L;
            gVar.c = 0;
            gVar.d = 0;
            gVar.e = 0;
            fVar.b.C(0);
            fVar.c = -1;
            fVar.e = false;
            if (j10 == 0) {
                jVar.d(!jVar.l);
                return;
            }
            if (jVar.h != 0) {
                long j12 = (jVar.i * j11) / 1000000;
                jVar.e = j12;
                h hVar = jVar.d;
                int i10 = d0.a;
                hVar.u(j12);
                jVar.h = 2;
            }
        }
    }

    @Override // r3.k
    public final void e(m mVar) {
        this.a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(r3.l lVar, jb jbVar) {
        w wVar;
        int i10;
        byte[] bArr;
        h5.a.j(this.a);
        if (this.b == null) {
            if (!a(lVar)) {
                throw r1.a("Failed to determine bitstream type", null);
            }
            ((r3.h) lVar).f = 0;
        }
        if (!this.c) {
            v i22 = this.a.i2(0, 1);
            this.a.i1();
            j jVar = this.b;
            jVar.c = this.a;
            jVar.b = i22;
            jVar.d(true);
            this.c = true;
        }
        j jVar2 = this.b;
        f fVar = jVar2.a;
        h5.a.j(jVar2.b);
        int i11 = d0.a;
        int i12 = jVar2.h;
        long j10 = -1;
        if (i12 != 0) {
            if (i12 == 1) {
                ((r3.h) lVar).s((int) jVar2.f);
                jVar2.h = 2;
                return 0;
            }
            if (i12 != 2) {
                if (i12 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long c3 = jVar2.d.c(lVar);
            if (c3 >= 0) {
                jbVar.a = c3;
                return 1;
            }
            if (c3 < -1) {
                jVar2.a(-(c3 + 2));
            }
            if (!jVar2.l) {
                s h = jVar2.d.h();
                h5.a.j(h);
                jVar2.c.m2(h);
                jVar2.l = true;
            }
            if (jVar2.k <= 0 && !fVar.b(lVar)) {
                jVar2.h = 3;
                return -1;
            }
            jVar2.k = 0L;
            w wVar2 = fVar.b;
            long b10 = jVar2.b(wVar2);
            if (b10 >= 0) {
                long j11 = jVar2.g;
                if (j11 + b10 >= jVar2.e) {
                    jVar2.b.d(wVar2.c, wVar2);
                    jVar2.b.c((j11 * 1000000) / jVar2.i, 1, wVar2.c, 0, null);
                    jVar2.e = -1L;
                }
            }
            jVar2.g += b10;
            return 0;
        }
        while (true) {
            boolean b11 = fVar.b(lVar);
            w wVar3 = fVar.b;
            if (!b11) {
                jVar2.h = 3;
                return -1;
            }
            long j12 = ((r3.h) lVar).d;
            long j13 = j10;
            long j14 = jVar2.f;
            jVar2.k = j12 - j14;
            if (jVar2.c(wVar3, j14, jVar2.j)) {
                jVar2.f = ((r3.h) lVar).d;
                j10 = j13;
            } else {
                n0 n0Var = (n0) jVar2.j.b;
                jVar2.i = n0Var.Q;
                if (!jVar2.m) {
                    jVar2.b.b(n0Var);
                    jVar2.m = true;
                }
                c cVar = (c) jVar2.j.c;
                if (cVar != null) {
                    jVar2.d = cVar;
                } else {
                    long j15 = ((r3.h) lVar).c;
                    if (j15 != j13) {
                        g gVar = fVar.a;
                        boolean z4 = (gVar.a & 4) != 0;
                        long j16 = jVar2.f;
                        long j17 = gVar.d + gVar.e;
                        long j18 = gVar.b;
                        wVar = wVar3;
                        i10 = 2;
                        jVar2.d = new b(jVar2, j16, j15, j17, j18, z4);
                        jVar2.h = i10;
                        bArr = wVar.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        wVar.D(wVar.c, Arrays.copyOf(bArr, Math.max(65025, wVar.c)));
                        return 0;
                    }
                    jVar2.d = new ab.a(1);
                }
                wVar = wVar3;
                i10 = 2;
                jVar2.h = i10;
                bArr = wVar.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // r3.k
    public final boolean i(r3.l lVar) {
        try {
            return a(lVar);
        } catch (r1 unused) {
            return false;
        }
    }

    @Override // r3.k
    public final void release() {
    }
}
