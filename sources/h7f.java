// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class h7f extends ljf {
    private static final pjf zzb = new ahd();
    private static final h7f zzd;
    private int zze;
    private z7f zzf;
    private vcf zzg;
    private tjf zzh = hlf.d;
    private ojf zzi = mjf.d;

    static {
        h7f h7fVar = new h7f();
        zzd = h7fVar;
        ljf.e(h7f.class, h7fVar);
    }

    public static e7f l() {
        return (e7f) zzd.j();
    }

    public static /* synthetic */ void m(h7f h7fVar, z7f z7fVar) {
        h7fVar.zzf = z7fVar;
        h7fVar.zze |= 1;
    }

    public static void n(h7f h7fVar, ArrayList arrayList) {
        tjf tjfVar = h7fVar.zzi;
        if (!((bif) tjfVar).a) {
            int size = tjfVar.size();
            int i = size == 0 ? 10 : size << 1;
            mjf mjfVar = (mjf) tjfVar;
            if (i < mjfVar.c) {
                iy8.d();
                return;
            }
            h7fVar.zzi = new mjf(Arrays.copyOf(mjfVar.b, i), mjfVar.c, true);
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            ((mjf) h7fVar.zzi).zzh(((b6f) obj).a);
        }
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", pcf.class, "zzi", z3f.E});
        }
        if (i2 == 3) {
            return new h7f();
        }
        if (i2 == 4) {
            return new e7f(zzd);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
