package com.google.android.gms.internal.vision;

import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class w extends f1 {
    private static final w zzg;
    private static volatile k2 zzh;
    private int zzc;
    private z zzd;
    private b0 zze;
    private o1 zzf = n2.d;

    static {
        w wVar = new w();
        zzg = wVar;
        f1.g(w.class, wVar);
    }

    public static void j(w wVar, z zVar) {
        wVar.getClass();
        wVar.zzd = zVar;
        wVar.zzc |= 1;
    }

    public static void k(w wVar, ArrayList arrayList) {
        o1 o1Var = wVar.zzf;
        if (!o1Var.zza()) {
            int size = o1Var.size();
            wVar.zzf = o1Var.zza(size == 0 ? 10 : size << 1);
        }
        l0.a(arrayList, wVar.zzf);
    }

    public static v l() {
        return (v) ((d1) zzg.e(5));
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.k2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        k2 k2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new w();
            case 2:
                return new v(zzg);
            case 3:
                return new m2(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", p.class});
            case 4:
                return zzg;
            case 5:
                k2 k2Var2 = zzh;
                if (k2Var2 != null) {
                    return k2Var2;
                }
                synchronized (w.class) {
                    try {
                        k2 k2Var3 = zzh;
                        k2Var = k2Var3;
                        if (k2Var3 == null) {
                            ?? c1Var = new c1();
                            zzh = c1Var;
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
