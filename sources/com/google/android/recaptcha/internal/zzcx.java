package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzcx {
    public static final zzcx zza = new zzcx();

    private zzcx() {
    }

    public static final Object zzc(long j, int i, long j2, long j3, double d, rr4 rr4Var, px2 px2Var) {
        return oxe.a(j, new zzcw(20, 100L, 1000L, 2.0d, rr4Var, null), px2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (kfe.a(r3, r1) != r7) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00bb -> B:17:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(int i, long j, long j2, double d, rr4 rr4Var, px2 px2Var) {
        zzcu zzcuVar;
        int i2;
        d79 d79Var;
        zzcu zzcuVar2;
        int i3;
        int i4;
        long j3;
        double d2;
        rr4 rr4Var2;
        rr4 rr4Var3;
        d79 d79Var2;
        long j4;
        double d3;
        int i5;
        int i6;
        long j5;
        if (px2Var instanceof zzcu) {
            zzcuVar = (zzcu) px2Var;
            int i7 = zzcuVar.zzh;
            if ((i7 & TLObject.FLAG_31) != 0) {
                zzcuVar.zzh = i7 - TLObject.FLAG_31;
                Object obj = zzcuVar.zzf;
                i2 = zzcuVar.zzh;
                d79 d79Var3 = null;
                ly2 ly2Var = ly2.a;
                if (i2 != 0) {
                    tue.b(obj);
                    d79 d79Var4 = new d79();
                    d79Var4.a = j;
                    d79Var = d79Var4;
                    zzcuVar2 = zzcuVar;
                    i3 = i - 1;
                    i4 = 0;
                    j3 = j2;
                    d2 = d;
                    rr4Var2 = rr4Var;
                    if (i4 >= i3) {
                    }
                    return ly2Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            tue.b(obj);
                            return obj;
                        }
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i6 = zzcuVar.zze;
                    i5 = zzcuVar.zzd;
                    d3 = zzcuVar.zzb;
                    j4 = zzcuVar.zza;
                    d79Var2 = zzcuVar.zzi;
                    rr4Var3 = (rr4) zzcuVar.zzc;
                    tue.b(obj);
                    long j6 = j4;
                    zzcuVar2 = zzcuVar;
                    j3 = j6;
                    int i8 = i6;
                    i3 = i5;
                    d2 = d3;
                    d79Var = d79Var2;
                    rr4Var2 = rr4Var3;
                    i4 = i8 + 1;
                    d79Var3 = null;
                    if (i4 >= i3) {
                        try {
                        } catch (Exception unused) {
                            rr4Var3 = rr4Var2;
                            i6 = i4;
                            d79Var2 = d79Var;
                            d3 = d2;
                            i5 = i3;
                            zzcuVar = zzcuVar2;
                            j4 = j3;
                            j5 = (long) (d79Var2.a * d3);
                            if (j5 > j4) {
                            }
                            d79Var2.a = j5;
                            zzcuVar.zzc = rr4Var3;
                            zzcuVar.zzi = d79Var2;
                            zzcuVar.zza = j4;
                            zzcuVar.zzb = d3;
                            zzcuVar.zzd = i5;
                            zzcuVar.zze = i6;
                            zzcuVar.zzh = 2;
                        }
                        zzcuVar2.zzc = rr4Var2;
                        zzcuVar2.zzi = d79Var;
                        zzcuVar2.zza = j3;
                        zzcuVar2.zzb = d2;
                        zzcuVar2.zzd = i3;
                        zzcuVar2.zze = i4;
                        zzcuVar2.zzh = 1;
                        Object invoke = rr4Var2.invoke(zzcuVar2);
                        if (invoke != ly2Var) {
                            return invoke;
                        }
                    } else {
                        d79 d79Var5 = d79Var3;
                        zzcuVar2.zzc = d79Var5;
                        zzcuVar2.zzi = d79Var5;
                        zzcuVar2.zzh = 3;
                        Object invoke2 = rr4Var2.invoke(zzcuVar2);
                        if (invoke2 != ly2Var) {
                            return invoke2;
                        }
                    }
                    return ly2Var;
                }
                i6 = zzcuVar.zze;
                i5 = zzcuVar.zzd;
                d3 = zzcuVar.zzb;
                j4 = zzcuVar.zza;
                d79Var2 = zzcuVar.zzi;
                rr4Var3 = (rr4) zzcuVar.zzc;
                try {
                    tue.b(obj);
                    return obj;
                } catch (Exception unused2) {
                    j5 = (long) (d79Var2.a * d3);
                    if (j5 > j4) {
                        j5 = j4;
                    }
                    d79Var2.a = j5;
                    zzcuVar.zzc = rr4Var3;
                    zzcuVar.zzi = d79Var2;
                    zzcuVar.zza = j4;
                    zzcuVar.zzb = d3;
                    zzcuVar.zzd = i5;
                    zzcuVar.zze = i6;
                    zzcuVar.zzh = 2;
                }
            }
        }
        zzcuVar = new zzcu(this, px2Var);
        Object obj2 = zzcuVar.zzf;
        i2 = zzcuVar.zzh;
        d79 d79Var32 = null;
        ly2 ly2Var2 = ly2.a;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (kfe.a(r6, r1) == r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a9 -> B:11:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(rr4 rr4Var, long j, long j2, double d, rr4 rr4Var2, px2 px2Var) {
        zzcv zzcvVar;
        int i;
        long j3;
        long j4;
        double d2;
        rr4 rr4Var3;
        zzcv zzcvVar2;
        rr4 rr4Var4;
        rr4 rr4Var5;
        long j5;
        double d3;
        Exception e;
        if (px2Var instanceof zzcv) {
            zzcvVar = (zzcv) px2Var;
            int i2 = zzcvVar.zzh;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzcvVar.zzh = i2 - TLObject.FLAG_31;
                Object obj = zzcvVar.zzf;
                i = zzcvVar.zzh;
                ly2 ly2Var = ly2.a;
                if (i != 0) {
                    tue.b(obj);
                    j3 = j;
                    j4 = j2;
                    d2 = d;
                    rr4Var3 = rr4Var2;
                    zzcvVar2 = zzcvVar;
                    rr4Var4 = rr4Var;
                    zzcvVar2.zza = rr4Var4;
                    zzcvVar2.zzb = rr4Var3;
                    zzcvVar2.zzc = j4;
                    zzcvVar2.zze = d2;
                    zzcvVar2.zzd = j3;
                    zzcvVar2.zzh = 1;
                    Object invoke = rr4Var3.invoke(zzcvVar2);
                    if (invoke == ly2Var) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = zzcvVar.zzd;
                        d3 = zzcvVar.zze;
                        j5 = zzcvVar.zzc;
                        rr4Var3 = (rr4) zzcvVar.zzb;
                        rr4Var5 = (rr4) zzcvVar.zza;
                        tue.b(obj);
                        rr4 rr4Var6 = rr4Var5;
                        zzcvVar2 = zzcvVar;
                        rr4Var4 = rr4Var6;
                        long j6 = j5;
                        d2 = d3;
                        j4 = j6;
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            zzcv zzcvVar3 = zzcvVar2;
                            rr4Var5 = rr4Var4;
                            zzcvVar = zzcvVar3;
                            double d4 = d2;
                            j5 = j4;
                            d3 = d4;
                            if (((Boolean) rr4Var5.invoke(e)).booleanValue()) {
                                throw e;
                            }
                            j3 = (long) (j3 * d3);
                            if (j3 > j5) {
                                j3 = j5;
                            }
                            zzcvVar.zza = rr4Var5;
                            zzcvVar.zzb = rr4Var3;
                            zzcvVar.zzc = j5;
                            zzcvVar.zze = d3;
                            zzcvVar.zzd = j3;
                            zzcvVar.zzh = 2;
                        }
                        zzcvVar2.zza = rr4Var4;
                        zzcvVar2.zzb = rr4Var3;
                        zzcvVar2.zzc = j4;
                        zzcvVar2.zze = d2;
                        zzcvVar2.zzd = j3;
                        zzcvVar2.zzh = 1;
                        Object invoke2 = rr4Var3.invoke(zzcvVar2);
                        return invoke2 == ly2Var ? invoke2 : ly2Var;
                    }
                    j3 = zzcvVar.zzd;
                    d3 = zzcvVar.zze;
                    j5 = zzcvVar.zzc;
                    rr4Var3 = (rr4) zzcvVar.zzb;
                    rr4Var5 = (rr4) zzcvVar.zza;
                    try {
                        tue.b(obj);
                        return obj;
                    } catch (Exception e3) {
                        e = e3;
                        if (((Boolean) rr4Var5.invoke(e)).booleanValue()) {
                        }
                    }
                }
            }
        }
        zzcvVar = new zzcv(this, px2Var);
        Object obj2 = zzcvVar.zzf;
        i = zzcvVar.zzh;
        ly2 ly2Var2 = ly2.a;
        if (i != 0) {
        }
    }
}
