// default package

import android.os.SystemClock;
import android.os.Trace;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ddc {
    public final hi2 a;
    public final xcc b;
    public final qz0 c = new qz0();
    public final ir d = new ir();
    public final ir e = new ir();
    public final rh6 f;
    public final ycc g;
    public final zj4 h;
    public long i;
    public long j;
    public long k;
    public jec l;
    public long m;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Serializable, long[]] */
    public ddc(hi2 hi2Var, xcc xccVar, ycc yccVar, zj4 zj4Var) {
        this.a = hi2Var;
        this.b = xccVar;
        this.g = yccVar;
        this.h = zj4Var;
        rh6 rh6Var = new rh6();
        rh6Var.a = 0;
        rh6Var.b = -1;
        rh6Var.c = 0;
        rh6Var.e = new long[16];
        rh6Var.d = 15;
        this.f = rh6Var;
        this.i = -9223372036854775807L;
        this.l = jec.d;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final hi2 hi2Var = this.a;
        je3 je3Var = (je3) hi2Var.c;
        while (true) {
            rh6 rh6Var = this.f;
            int i = rh6Var.c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                u36.g();
                return;
            }
            long j3 = ((long[]) rh6Var.e)[rh6Var.a];
            Long l = (Long) this.e.j(j3);
            xcc xccVar = this.b;
            if (l != null && l.longValue() != this.m) {
                this.m = l.longValue();
                xccVar.e(2);
            }
            zj4 zj4Var = this.h;
            zj4Var.b(1000 * j3);
            long j4 = this.m;
            long a = zj4Var.a();
            long j5 = zj4Var.h;
            xcc xccVar2 = this.b;
            qz0 qz0Var = this.c;
            int a2 = xccVar2.a(j3, j, j2, j4, false, false, a, j5, qz0Var);
            if (a2 != 5 && a2 != 4) {
                this.g.a(j3, qz0Var.a);
            }
            final byte b = 0;
            if (a2 == 0 || a2 == 1) {
                this.j = j3;
                boolean z = a2 == 0;
                long h = rh6Var.h();
                jec jecVar = (jec) this.d.j(h);
                if (jecVar != null && !jecVar.equals(jec.d) && !jecVar.equals(this.l)) {
                    this.l = jecVar;
                    fo4 fo4Var = new fo4();
                    fo4Var.z = jecVar.a;
                    fo4Var.A = jecVar.b;
                    fo4Var.s = wf7.n("video/raw");
                    hi2Var.b = new go4(fo4Var);
                    je3Var.j.execute(new rd3(hi2Var, jecVar, r14));
                }
                long nanoTime = z ? System.nanoTime() : qz0Var.b;
                r14 = xccVar.e == 3 ? (byte) 0 : (byte) 1;
                xccVar.e = 3;
                xccVar.k.getClass();
                xccVar.g = hac.T(SystemClock.elapsedRealtime());
                if (r14 != 0 && je3Var.f != null) {
                    je3Var.j.execute(new Runnable() { // from class: ie3
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            hi2 hi2Var2 = hi2Var;
                            switch (b2) {
                                case 0:
                                    ((je3) hi2Var2.c).i.onFirstFrameRendered();
                                    break;
                                default:
                                    ((je3) hi2Var2.c).i.w();
                                    break;
                            }
                        }
                    });
                }
                go4 go4Var = (go4) hi2Var.b;
                je3Var.k.c(h, nanoTime, go4Var == null ? new go4(new fo4()) : go4Var, null);
                vm6 vm6Var = (vm6) je3Var.d.remove();
                vm6Var.c.S0(vm6Var.a, vm6Var.b, nanoTime);
            } else if (a2 == 2 || a2 == 3) {
                this.j = j3;
                rh6Var.h();
                je3Var.j.execute(new Runnable() { // from class: ie3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = r2;
                        hi2 hi2Var2 = hi2Var;
                        switch (b2) {
                            case 0:
                                ((je3) hi2Var2.c).i.onFirstFrameRendered();
                                break;
                            default:
                                ((je3) hi2Var2.c).i.w();
                                break;
                        }
                    }
                });
                vm6 vm6Var2 = (vm6) je3Var.d.remove();
                ym6 ym6Var = vm6Var2.c;
                hm6 hm6Var = vm6Var2.a;
                int i2 = vm6Var2.b;
                Trace.beginSection("dropVideoBuffer");
                hm6Var.c(i2);
                Trace.endSection();
                ym6Var.Y0(0, 1);
            } else {
                if (a2 != 4) {
                    if (a2 == 5) {
                        return;
                    }
                    dq9.m(String.valueOf(a2));
                    return;
                }
                this.j = j3;
            }
        }
    }
}
