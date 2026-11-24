package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzcx {
    public static final zzcx zza = new zzcx();

    private zzcx() {
    }

    public static final Object zzc(long j, int i, long j2, long j3, double d, qp4 qp4Var, fw2 fw2Var) {
        return mve.a(j, new zzcw(20, 100L, 1000L, 2.0d, qp4Var, null), fw2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (jde.a(r3, r1) != r7) goto L18;
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
    public final Object zza(int i, long j, long j2, double d, qp4 qp4Var, fw2 fw2Var) {
        zzcu zzcuVar;
        int i2;
        b59 b59Var;
        zzcu zzcuVar2;
        int i3;
        int i4;
        long j3;
        double d2;
        qp4 qp4Var2;
        qp4 qp4Var3;
        b59 b59Var2;
        long j4;
        double d3;
        int i5;
        int i6;
        long j5;
        if (fw2Var instanceof zzcu) {
            zzcuVar = (zzcu) fw2Var;
            int i7 = zzcuVar.zzh;
            if ((i7 & TLObject.FLAG_31) != 0) {
                zzcuVar.zzh = i7 - TLObject.FLAG_31;
                Object obj = zzcuVar.zzf;
                i2 = zzcuVar.zzh;
                b59 b59Var3 = null;
                bx2 bx2Var = bx2.a;
                if (i2 != 0) {
                    qse.b(obj);
                    b59 b59Var4 = new b59();
                    b59Var4.a = j;
                    b59Var = b59Var4;
                    zzcuVar2 = zzcuVar;
                    i3 = i - 1;
                    i4 = 0;
                    j3 = j2;
                    d2 = d;
                    qp4Var2 = qp4Var;
                    if (i4 >= i3) {
                    }
                    return bx2Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            qse.b(obj);
                            return obj;
                        }
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i6 = zzcuVar.zze;
                    i5 = zzcuVar.zzd;
                    d3 = zzcuVar.zzb;
                    j4 = zzcuVar.zza;
                    b59Var2 = zzcuVar.zzi;
                    qp4Var3 = (qp4) zzcuVar.zzc;
                    qse.b(obj);
                    long j6 = j4;
                    zzcuVar2 = zzcuVar;
                    j3 = j6;
                    int i8 = i6;
                    i3 = i5;
                    d2 = d3;
                    b59Var = b59Var2;
                    qp4Var2 = qp4Var3;
                    i4 = i8 + 1;
                    b59Var3 = null;
                    if (i4 >= i3) {
                        try {
                        } catch (Exception unused) {
                            qp4Var3 = qp4Var2;
                            i6 = i4;
                            b59Var2 = b59Var;
                            d3 = d2;
                            i5 = i3;
                            zzcuVar = zzcuVar2;
                            j4 = j3;
                            j5 = (long) (b59Var2.a * d3);
                            if (j5 > j4) {
                            }
                            b59Var2.a = j5;
                            zzcuVar.zzc = qp4Var3;
                            zzcuVar.zzi = b59Var2;
                            zzcuVar.zza = j4;
                            zzcuVar.zzb = d3;
                            zzcuVar.zzd = i5;
                            zzcuVar.zze = i6;
                            zzcuVar.zzh = 2;
                        }
                        zzcuVar2.zzc = qp4Var2;
                        zzcuVar2.zzi = b59Var;
                        zzcuVar2.zza = j3;
                        zzcuVar2.zzb = d2;
                        zzcuVar2.zzd = i3;
                        zzcuVar2.zze = i4;
                        zzcuVar2.zzh = 1;
                        Object invoke = qp4Var2.invoke(zzcuVar2);
                        if (invoke != bx2Var) {
                            return invoke;
                        }
                    } else {
                        b59 b59Var5 = b59Var3;
                        zzcuVar2.zzc = b59Var5;
                        zzcuVar2.zzi = b59Var5;
                        zzcuVar2.zzh = 3;
                        Object invoke2 = qp4Var2.invoke(zzcuVar2);
                        if (invoke2 != bx2Var) {
                            return invoke2;
                        }
                    }
                    return bx2Var;
                }
                i6 = zzcuVar.zze;
                i5 = zzcuVar.zzd;
                d3 = zzcuVar.zzb;
                j4 = zzcuVar.zza;
                b59Var2 = zzcuVar.zzi;
                qp4Var3 = (qp4) zzcuVar.zzc;
                try {
                    qse.b(obj);
                    return obj;
                } catch (Exception unused2) {
                    j5 = (long) (b59Var2.a * d3);
                    if (j5 > j4) {
                        j5 = j4;
                    }
                    b59Var2.a = j5;
                    zzcuVar.zzc = qp4Var3;
                    zzcuVar.zzi = b59Var2;
                    zzcuVar.zza = j4;
                    zzcuVar.zzb = d3;
                    zzcuVar.zzd = i5;
                    zzcuVar.zze = i6;
                    zzcuVar.zzh = 2;
                }
            }
        }
        zzcuVar = new zzcu(this, fw2Var);
        Object obj2 = zzcuVar.zzf;
        i2 = zzcuVar.zzh;
        b59 b59Var32 = null;
        bx2 bx2Var2 = bx2.a;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (jde.a(r6, r1) == r5) goto L34;
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
    public final Object zzb(qp4 qp4Var, long j, long j2, double d, qp4 qp4Var2, fw2 fw2Var) {
        zzcv zzcvVar;
        int i;
        long j3;
        long j4;
        double d2;
        qp4 qp4Var3;
        zzcv zzcvVar2;
        qp4 qp4Var4;
        qp4 qp4Var5;
        long j5;
        double d3;
        Exception e;
        if (fw2Var instanceof zzcv) {
            zzcvVar = (zzcv) fw2Var;
            int i2 = zzcvVar.zzh;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzcvVar.zzh = i2 - TLObject.FLAG_31;
                Object obj = zzcvVar.zzf;
                i = zzcvVar.zzh;
                bx2 bx2Var = bx2.a;
                if (i != 0) {
                    qse.b(obj);
                    j3 = j;
                    j4 = j2;
                    d2 = d;
                    qp4Var3 = qp4Var2;
                    zzcvVar2 = zzcvVar;
                    qp4Var4 = qp4Var;
                    zzcvVar2.zza = qp4Var4;
                    zzcvVar2.zzb = qp4Var3;
                    zzcvVar2.zzc = j4;
                    zzcvVar2.zze = d2;
                    zzcvVar2.zzd = j3;
                    zzcvVar2.zzh = 1;
                    Object invoke = qp4Var3.invoke(zzcvVar2);
                    if (invoke == bx2Var) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = zzcvVar.zzd;
                        d3 = zzcvVar.zze;
                        j5 = zzcvVar.zzc;
                        qp4Var3 = (qp4) zzcvVar.zzb;
                        qp4Var5 = (qp4) zzcvVar.zza;
                        qse.b(obj);
                        qp4 qp4Var6 = qp4Var5;
                        zzcvVar2 = zzcvVar;
                        qp4Var4 = qp4Var6;
                        long j6 = j5;
                        d2 = d3;
                        j4 = j6;
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            zzcv zzcvVar3 = zzcvVar2;
                            qp4Var5 = qp4Var4;
                            zzcvVar = zzcvVar3;
                            double d4 = d2;
                            j5 = j4;
                            d3 = d4;
                            if (((Boolean) qp4Var5.invoke(e)).booleanValue()) {
                                throw e;
                            }
                            j3 = (long) (j3 * d3);
                            if (j3 > j5) {
                                j3 = j5;
                            }
                            zzcvVar.zza = qp4Var5;
                            zzcvVar.zzb = qp4Var3;
                            zzcvVar.zzc = j5;
                            zzcvVar.zze = d3;
                            zzcvVar.zzd = j3;
                            zzcvVar.zzh = 2;
                        }
                        zzcvVar2.zza = qp4Var4;
                        zzcvVar2.zzb = qp4Var3;
                        zzcvVar2.zzc = j4;
                        zzcvVar2.zze = d2;
                        zzcvVar2.zzd = j3;
                        zzcvVar2.zzh = 1;
                        Object invoke2 = qp4Var3.invoke(zzcvVar2);
                        return invoke2 == bx2Var ? invoke2 : bx2Var;
                    }
                    j3 = zzcvVar.zzd;
                    d3 = zzcvVar.zze;
                    j5 = zzcvVar.zzc;
                    qp4Var3 = (qp4) zzcvVar.zzb;
                    qp4Var5 = (qp4) zzcvVar.zza;
                    try {
                        qse.b(obj);
                        return obj;
                    } catch (Exception e3) {
                        e = e3;
                        if (((Boolean) qp4Var5.invoke(e)).booleanValue()) {
                        }
                    }
                }
            }
        }
        zzcvVar = new zzcv(this, fw2Var);
        Object obj2 = zzcvVar.zzf;
        i = zzcvVar.zzh;
        bx2 bx2Var2 = bx2.a;
        if (i != 0) {
        }
    }
}
