package com.google.android.gms.internal.vision;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w extends f1 {
    private static final w zzg;
    private static volatile j2 zzh;
    private int zzc;
    private z zzd;
    private b0 zze;
    private o1 zzf = m2.d;

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

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.j2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i9) {
        j2 j2Var;
        switch (g0.a[i9 - 1]) {
            case 1:
                return new w();
            case 2:
                return new v(zzg);
            case 3:
                return new l2(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", p.class});
            case 4:
                return zzg;
            case 5:
                j2 j2Var2 = zzh;
                if (j2Var2 != null) {
                    return j2Var2;
                }
                synchronized (w.class) {
                    try {
                        j2 j2Var3 = zzh;
                        j2Var = j2Var3;
                        if (j2Var3 == null) {
                            ?? c1Var = new c1();
                            zzh = c1Var;
                            j2Var = c1Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return j2Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
