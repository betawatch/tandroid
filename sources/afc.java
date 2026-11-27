// default package

import android.os.SystemClock;
import android.os.Trace;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class afc {
    public final qx6 a;
    public final uec b;
    public final ry0 c = new ry0();
    public final jq d = new jq();
    public final jq e = new jq();
    public final vh6 f;
    public final vec g;
    public final zj4 h;
    public long i;
    public long j;
    public long k;
    public ggc l;
    public long m;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Serializable, long[]] */
    public afc(qx6 qx6Var, uec uecVar, vec vecVar, zj4 zj4Var) {
        this.a = qx6Var;
        this.b = uecVar;
        this.g = vecVar;
        this.h = zj4Var;
        vh6 vh6Var = new vh6();
        vh6Var.a = 0;
        vh6Var.b = -1;
        vh6Var.c = 0;
        vh6Var.e = new long[16];
        vh6Var.d = 15;
        this.f = vh6Var;
        this.i = -9223372036854775807L;
        this.l = ggc.d;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final qx6 qx6Var = this.a;
        pd3 pd3Var = (pd3) qx6Var.c;
        while (true) {
            vh6 vh6Var = this.f;
            int i = vh6Var.c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                lq5.n();
                return;
            }
            long j3 = ((long[]) vh6Var.e)[vh6Var.a];
            Long l = (Long) this.e.j(j3);
            uec uecVar = this.b;
            if (l != null && l.longValue() != this.m) {
                this.m = l.longValue();
                uecVar.e(2);
            }
            zj4 zj4Var = this.h;
            zj4Var.b(1000 * j3);
            long j4 = this.m;
            long a = zj4Var.a();
            long j5 = zj4Var.h;
            uec uecVar2 = this.b;
            ry0 ry0Var = this.c;
            int a2 = uecVar2.a(j3, j, j2, j4, false, false, a, j5, ry0Var);
            if (a2 != 5 && a2 != 4) {
                this.g.a(j3, ry0Var.a);
            }
            final byte b = 0;
            if (a2 == 0 || a2 == 1) {
                this.j = j3;
                boolean z = a2 == 0;
                long h = vh6Var.h();
                ggc ggcVar = (ggc) this.d.j(h);
                if (ggcVar != null && !ggcVar.equals(ggc.d) && !ggcVar.equals(this.l)) {
                    this.l = ggcVar;
                    jo4 jo4Var = new jo4();
                    jo4Var.z = ggcVar.a;
                    jo4Var.A = ggcVar.b;
                    jo4Var.s = eg7.n("video/raw");
                    qx6Var.b = new ko4(jo4Var);
                    pd3Var.j.execute(new bv2(qx6Var, ggcVar, (byte) 29));
                }
                long nanoTime = z ? System.nanoTime() : ry0Var.b;
                r14 = uecVar.e == 3 ? (byte) 0 : (byte) 1;
                uecVar.e = 3;
                uecVar.k.getClass();
                uecVar.g = gcc.T(SystemClock.elapsedRealtime());
                if (r14 != 0 && pd3Var.f != null) {
                    pd3Var.j.execute(new Runnable() { // from class: od3
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            qx6 qx6Var2 = qx6Var;
                            switch (b2) {
                                case 0:
                                    ((pd3) qx6Var2.c).i.onFirstFrameRendered();
                                    break;
                                default:
                                    ((pd3) qx6Var2.c).i.p();
                                    break;
                            }
                        }
                    });
                }
                ko4 ko4Var = (ko4) qx6Var.b;
                pd3Var.k.b(h, nanoTime, ko4Var == null ? new ko4(new jo4()) : ko4Var, null);
                ym6 ym6Var = (ym6) pd3Var.d.remove();
                ym6Var.c.S0(ym6Var.a, ym6Var.b, nanoTime);
            } else if (a2 == 2 || a2 == 3) {
                this.j = j3;
                vh6Var.h();
                pd3Var.j.execute(new Runnable() { // from class: od3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = r2;
                        qx6 qx6Var2 = qx6Var;
                        switch (b2) {
                            case 0:
                                ((pd3) qx6Var2.c).i.onFirstFrameRendered();
                                break;
                            default:
                                ((pd3) qx6Var2.c).i.p();
                                break;
                        }
                    }
                });
                ym6 ym6Var2 = (ym6) pd3Var.d.remove();
                bn6 bn6Var = ym6Var2.c;
                jm6 jm6Var = ym6Var2.a;
                int i2 = ym6Var2.b;
                Trace.beginSection("dropVideoBuffer");
                jm6Var.c(i2);
                Trace.endSection();
                bn6Var.Y0(0, 1);
            } else {
                if (a2 != 4) {
                    if (a2 == 5) {
                        return;
                    }
                    grb.i(String.valueOf(a2));
                    return;
                }
                this.j = j3;
            }
        }
    }
}
