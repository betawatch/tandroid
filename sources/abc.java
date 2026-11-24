// default package

import android.os.SystemClock;
import android.os.Trace;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class abc {
    public final lv6 a;
    public final uac b;
    public final jy0 c = new jy0();
    public final iq d = new iq();
    public final iq e = new iq();
    public final rf6 f;
    public final vac g;
    public final vh4 h;
    public long i;
    public long j;
    public long k;
    public icc l;
    public long m;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Serializable, long[]] */
    public abc(lv6 lv6Var, uac uacVar, vac vacVar, vh4 vh4Var) {
        this.a = lv6Var;
        this.b = uacVar;
        this.g = vacVar;
        this.h = vh4Var;
        rf6 rf6Var = new rf6();
        rf6Var.a = 0;
        rf6Var.b = -1;
        rf6Var.c = 0;
        rf6Var.e = new long[16];
        rf6Var.d = 15;
        this.f = rf6Var;
        this.i = -9223372036854775807L;
        this.l = icc.d;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final lv6 lv6Var = this.a;
        xc3 xc3Var = (xc3) lv6Var.c;
        while (true) {
            rf6 rf6Var = this.f;
            int i = rf6Var.c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                w26.g();
                return;
            }
            long j3 = ((long[]) rf6Var.e)[rf6Var.a];
            Long l = (Long) this.e.j(j3);
            uac uacVar = this.b;
            if (l != null && l.longValue() != this.m) {
                this.m = l.longValue();
                uacVar.e(2);
            }
            vh4 vh4Var = this.h;
            vh4Var.b(1000 * j3);
            long j4 = this.m;
            long a = vh4Var.a();
            long j5 = vh4Var.h;
            uac uacVar2 = this.b;
            jy0 jy0Var = this.c;
            int a2 = uacVar2.a(j3, j, j2, j4, false, false, a, j5, jy0Var);
            if (a2 != 5 && a2 != 4) {
                this.g.a(j3, jy0Var.a);
            }
            final byte b = 0;
            if (a2 == 0 || a2 == 1) {
                this.j = j3;
                boolean z = a2 == 0;
                long h = rf6Var.h();
                icc iccVar = (icc) this.d.j(h);
                if (iccVar != null && !iccVar.equals(icc.d) && !iccVar.equals(this.l)) {
                    this.l = iccVar;
                    em4 em4Var = new em4();
                    em4Var.z = iccVar.a;
                    em4Var.A = iccVar.b;
                    em4Var.s = ud7.n("video/raw");
                    lv6Var.b = new fm4(em4Var);
                    xc3Var.j.execute(new wc3(lv6Var, iccVar, b));
                }
                long nanoTime = z ? System.nanoTime() : jy0Var.b;
                r14 = uacVar.e == 3 ? (byte) 0 : (byte) 1;
                uacVar.e = 3;
                uacVar.k.getClass();
                uacVar.g = g8c.T(SystemClock.elapsedRealtime());
                if (r14 != 0 && xc3Var.f != null) {
                    xc3Var.j.execute(new Runnable() { // from class: vc3
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            lv6 lv6Var2 = lv6Var;
                            switch (b2) {
                                case 0:
                                    ((xc3) lv6Var2.c).i.onFirstFrameRendered();
                                    break;
                                default:
                                    ((xc3) lv6Var2.c).i.q();
                                    break;
                            }
                        }
                    });
                }
                fm4 fm4Var = (fm4) lv6Var.b;
                xc3Var.k.c(h, nanoTime, fm4Var == null ? new fm4(new em4()) : fm4Var, null);
                sk6 sk6Var = (sk6) xc3Var.d.remove();
                sk6Var.c.S0(sk6Var.a, sk6Var.b, nanoTime);
            } else if (a2 == 2 || a2 == 3) {
                this.j = j3;
                rf6Var.h();
                xc3Var.j.execute(new Runnable() { // from class: vc3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = r2;
                        lv6 lv6Var2 = lv6Var;
                        switch (b2) {
                            case 0:
                                ((xc3) lv6Var2.c).i.onFirstFrameRendered();
                                break;
                            default:
                                ((xc3) lv6Var2.c).i.q();
                                break;
                        }
                    }
                });
                sk6 sk6Var2 = (sk6) xc3Var.d.remove();
                vk6 vk6Var = sk6Var2.c;
                ek6 ek6Var = sk6Var2.a;
                int i2 = sk6Var2.b;
                Trace.beginSection("dropVideoBuffer");
                ek6Var.c(i2);
                Trace.endSection();
                vk6Var.Y0(0, 1);
            } else {
                if (a2 != 4) {
                    if (a2 == 5) {
                        return;
                    }
                    sc8.j(String.valueOf(a2));
                    return;
                }
                this.j = j3;
            }
        }
    }
}
