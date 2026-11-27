package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzcx {
    public static final zzcx zza = new zzcx();

    private zzcx() {
    }

    public static final Object zzc(long j, int i, long j2, long j3, double d, ur4 ur4Var, zw2 zw2Var) {
        return e0f.a(j, new zzcw(20, 100L, 1000L, 2.0d, ur4Var, null), zw2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (aie.a(r3, r1) != r7) goto L18;
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
    public final Object zza(int i, long j, long j2, double d, ur4 ur4Var, zw2 zw2Var) {
        zzcu zzcuVar;
        int i2;
        o89 o89Var;
        zzcu zzcuVar2;
        int i3;
        int i4;
        long j3;
        double d2;
        ur4 ur4Var2;
        ur4 ur4Var3;
        o89 o89Var2;
        long j4;
        double d3;
        int i5;
        int i6;
        long j5;
        if (zw2Var instanceof zzcu) {
            zzcuVar = (zzcu) zw2Var;
            int i7 = zzcuVar.zzh;
            if ((i7 & TLObject.FLAG_31) != 0) {
                zzcuVar.zzh = i7 - TLObject.FLAG_31;
                Object obj = zzcuVar.zzf;
                i2 = zzcuVar.zzh;
                o89 o89Var3 = null;
                vx2 vx2Var = vx2.a;
                if (i2 != 0) {
                    ixe.b(obj);
                    o89 o89Var4 = new o89();
                    o89Var4.a = j;
                    o89Var = o89Var4;
                    zzcuVar2 = zzcuVar;
                    i3 = i - 1;
                    i4 = 0;
                    j3 = j2;
                    d2 = d;
                    ur4Var2 = ur4Var;
                    if (i4 >= i3) {
                    }
                    return vx2Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ixe.b(obj);
                            return obj;
                        }
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i6 = zzcuVar.zze;
                    i5 = zzcuVar.zzd;
                    d3 = zzcuVar.zzb;
                    j4 = zzcuVar.zza;
                    o89Var2 = zzcuVar.zzi;
                    ur4Var3 = (ur4) zzcuVar.zzc;
                    ixe.b(obj);
                    long j6 = j4;
                    zzcuVar2 = zzcuVar;
                    j3 = j6;
                    int i8 = i6;
                    i3 = i5;
                    d2 = d3;
                    o89Var = o89Var2;
                    ur4Var2 = ur4Var3;
                    i4 = i8 + 1;
                    o89Var3 = null;
                    if (i4 >= i3) {
                        try {
                        } catch (Exception unused) {
                            ur4Var3 = ur4Var2;
                            i6 = i4;
                            o89Var2 = o89Var;
                            d3 = d2;
                            i5 = i3;
                            zzcuVar = zzcuVar2;
                            j4 = j3;
                            j5 = (long) (o89Var2.a * d3);
                            if (j5 > j4) {
                            }
                            o89Var2.a = j5;
                            zzcuVar.zzc = ur4Var3;
                            zzcuVar.zzi = o89Var2;
                            zzcuVar.zza = j4;
                            zzcuVar.zzb = d3;
                            zzcuVar.zzd = i5;
                            zzcuVar.zze = i6;
                            zzcuVar.zzh = 2;
                        }
                        zzcuVar2.zzc = ur4Var2;
                        zzcuVar2.zzi = o89Var;
                        zzcuVar2.zza = j3;
                        zzcuVar2.zzb = d2;
                        zzcuVar2.zzd = i3;
                        zzcuVar2.zze = i4;
                        zzcuVar2.zzh = 1;
                        Object invoke = ur4Var2.invoke(zzcuVar2);
                        if (invoke != vx2Var) {
                            return invoke;
                        }
                    } else {
                        o89 o89Var5 = o89Var3;
                        zzcuVar2.zzc = o89Var5;
                        zzcuVar2.zzi = o89Var5;
                        zzcuVar2.zzh = 3;
                        Object invoke2 = ur4Var2.invoke(zzcuVar2);
                        if (invoke2 != vx2Var) {
                            return invoke2;
                        }
                    }
                    return vx2Var;
                }
                i6 = zzcuVar.zze;
                i5 = zzcuVar.zzd;
                d3 = zzcuVar.zzb;
                j4 = zzcuVar.zza;
                o89Var2 = zzcuVar.zzi;
                ur4Var3 = (ur4) zzcuVar.zzc;
                try {
                    ixe.b(obj);
                    return obj;
                } catch (Exception unused2) {
                    j5 = (long) (o89Var2.a * d3);
                    if (j5 > j4) {
                        j5 = j4;
                    }
                    o89Var2.a = j5;
                    zzcuVar.zzc = ur4Var3;
                    zzcuVar.zzi = o89Var2;
                    zzcuVar.zza = j4;
                    zzcuVar.zzb = d3;
                    zzcuVar.zzd = i5;
                    zzcuVar.zze = i6;
                    zzcuVar.zzh = 2;
                }
            }
        }
        zzcuVar = new zzcu(this, zw2Var);
        Object obj2 = zzcuVar.zzf;
        i2 = zzcuVar.zzh;
        o89 o89Var32 = null;
        vx2 vx2Var2 = vx2.a;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (aie.a(r6, r1) == r5) goto L34;
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
    public final Object zzb(ur4 ur4Var, long j, long j2, double d, ur4 ur4Var2, zw2 zw2Var) {
        zzcv zzcvVar;
        int i;
        long j3;
        long j4;
        double d2;
        ur4 ur4Var3;
        zzcv zzcvVar2;
        ur4 ur4Var4;
        ur4 ur4Var5;
        long j5;
        double d3;
        Exception e;
        if (zw2Var instanceof zzcv) {
            zzcvVar = (zzcv) zw2Var;
            int i2 = zzcvVar.zzh;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzcvVar.zzh = i2 - TLObject.FLAG_31;
                Object obj = zzcvVar.zzf;
                i = zzcvVar.zzh;
                vx2 vx2Var = vx2.a;
                if (i != 0) {
                    ixe.b(obj);
                    j3 = j;
                    j4 = j2;
                    d2 = d;
                    ur4Var3 = ur4Var2;
                    zzcvVar2 = zzcvVar;
                    ur4Var4 = ur4Var;
                    zzcvVar2.zza = ur4Var4;
                    zzcvVar2.zzb = ur4Var3;
                    zzcvVar2.zzc = j4;
                    zzcvVar2.zze = d2;
                    zzcvVar2.zzd = j3;
                    zzcvVar2.zzh = 1;
                    Object invoke = ur4Var3.invoke(zzcvVar2);
                    if (invoke == vx2Var) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = zzcvVar.zzd;
                        d3 = zzcvVar.zze;
                        j5 = zzcvVar.zzc;
                        ur4Var3 = (ur4) zzcvVar.zzb;
                        ur4Var5 = (ur4) zzcvVar.zza;
                        ixe.b(obj);
                        ur4 ur4Var6 = ur4Var5;
                        zzcvVar2 = zzcvVar;
                        ur4Var4 = ur4Var6;
                        long j6 = j5;
                        d2 = d3;
                        j4 = j6;
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            zzcv zzcvVar3 = zzcvVar2;
                            ur4Var5 = ur4Var4;
                            zzcvVar = zzcvVar3;
                            double d4 = d2;
                            j5 = j4;
                            d3 = d4;
                            if (((Boolean) ur4Var5.invoke(e)).booleanValue()) {
                                throw e;
                            }
                            j3 = (long) (j3 * d3);
                            if (j3 > j5) {
                                j3 = j5;
                            }
                            zzcvVar.zza = ur4Var5;
                            zzcvVar.zzb = ur4Var3;
                            zzcvVar.zzc = j5;
                            zzcvVar.zze = d3;
                            zzcvVar.zzd = j3;
                            zzcvVar.zzh = 2;
                        }
                        zzcvVar2.zza = ur4Var4;
                        zzcvVar2.zzb = ur4Var3;
                        zzcvVar2.zzc = j4;
                        zzcvVar2.zze = d2;
                        zzcvVar2.zzd = j3;
                        zzcvVar2.zzh = 1;
                        Object invoke2 = ur4Var3.invoke(zzcvVar2);
                        return invoke2 == vx2Var ? invoke2 : vx2Var;
                    }
                    j3 = zzcvVar.zzd;
                    d3 = zzcvVar.zze;
                    j5 = zzcvVar.zzc;
                    ur4Var3 = (ur4) zzcvVar.zzb;
                    ur4Var5 = (ur4) zzcvVar.zza;
                    try {
                        ixe.b(obj);
                        return obj;
                    } catch (Exception e3) {
                        e = e3;
                        if (((Boolean) ur4Var5.invoke(e)).booleanValue()) {
                        }
                    }
                }
            }
        }
        zzcvVar = new zzcv(this, zw2Var);
        Object obj2 = zzcvVar.zzf;
        i = zzcvVar.zzh;
        vx2 vx2Var2 = vx2.a;
        if (i != 0) {
        }
    }
}
