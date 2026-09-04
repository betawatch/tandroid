package com.google.android.gms.internal.vision;

import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class p extends f1 {
    private static final p zzl;
    private static volatile k2 zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private o1 zzf;
    private int zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private o1 zzk;

    static {
        p pVar = new p();
        zzl = pVar;
        f1.g(p.class, pVar);
    }

    public p() {
        n2 n2Var = n2.d;
        this.zzf = n2Var;
        this.zzh = "";
        this.zzk = n2Var;
    }

    public static void j(p pVar, long j3) {
        pVar.zzc |= 16;
        pVar.zzi = j3;
    }

    public static void k(p pVar, String str) {
        pVar.getClass();
        str.getClass();
        pVar.zzc |= 1;
        pVar.zzd = str;
    }

    public static void l(p pVar, List list) {
        o1 o1Var = pVar.zzk;
        if (!o1Var.zza()) {
            int size = o1Var.size();
            pVar.zzk = o1Var.zza(size == 0 ? 10 : size << 1);
        }
        l0.a(list, pVar.zzk);
    }

    public static o m() {
        return (o) ((d1) zzl.e(5));
    }

    public static void n(p pVar, long j3) {
        pVar.zzc |= 32;
        pVar.zzj = j3;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.k2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        k2 k2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new p();
            case 2:
                return new o(zzl);
            case 3:
                return new m2(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", i0.c, "zzh", "zzi", "zzj", "zzk", d0.class});
            case 4:
                return zzl;
            case 5:
                k2 k2Var2 = zzm;
                if (k2Var2 != null) {
                    return k2Var2;
                }
                synchronized (p.class) {
                    try {
                        k2 k2Var3 = zzm;
                        k2Var = k2Var3;
                        if (k2Var3 == null) {
                            ?? c1Var = new c1();
                            zzm = c1Var;
                            k2Var = c1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return k2Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
