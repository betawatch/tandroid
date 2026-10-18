package com.google.android.recaptcha.internal;

import be.f0;
import kd.c;
import kotlin.jvm.internal.o;
import ld.a;
import org.telegram.tgnet.TLObject;
import td.l;
import v7.i8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class zzcx {
    public static final zzcx zza = new zzcx();

    private zzcx() {
    }

    public static final Object zzc(long j10, int i10, long j11, long j12, double d, l lVar, c cVar) {
        return f0.x(j10, new zzcw(20, 100L, 1000L, 2.0d, lVar, null), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (be.f0.g(r5, r1) != r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c1 -> B:17:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(int i10, long j10, long j11, double d, l lVar, c cVar) {
        zzcu zzcuVar;
        int i11;
        o oVar;
        zzcu zzcuVar2;
        int i12;
        int i13;
        long j12;
        double d10;
        l lVar2;
        l lVar3;
        o oVar2;
        long j13;
        double d11;
        int i14;
        int i15;
        long j14;
        char c10;
        if (cVar instanceof zzcu) {
            zzcuVar = (zzcu) cVar;
            int i16 = zzcuVar.zzh;
            if ((i16 & TLObject.FLAG_31) != 0) {
                zzcuVar.zzh = i16 - TLObject.FLAG_31;
                Object obj = zzcuVar.zzf;
                a aVar = a.a;
                i11 = zzcuVar.zzh;
                if (i11 != 0) {
                    i8.b(obj);
                    o oVar3 = new o();
                    oVar3.a = j10;
                    oVar = oVar3;
                    zzcuVar2 = zzcuVar;
                    i12 = i10 - 1;
                    i13 = 0;
                    j12 = j11;
                    d10 = d;
                    lVar2 = lVar;
                    if (i13 >= i12) {
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i8.b(obj);
                        return obj;
                    }
                    i15 = zzcuVar.zze;
                    i14 = zzcuVar.zzd;
                    d11 = zzcuVar.zzb;
                    j13 = zzcuVar.zza;
                    oVar2 = zzcuVar.zzi;
                    lVar3 = (l) zzcuVar.zzc;
                    i8.b(obj);
                    c10 = 2;
                    zzcu zzcuVar3 = zzcuVar;
                    int i17 = i15;
                    int i18 = i14;
                    d10 = d11;
                    oVar = oVar2;
                    lVar2 = lVar3;
                    i13 = i17 + 1;
                    j12 = j13;
                    i12 = i18;
                    zzcuVar2 = zzcuVar3;
                    if (i13 >= i12) {
                        try {
                        } catch (Exception unused) {
                            lVar3 = lVar2;
                            i15 = i13;
                            oVar2 = oVar;
                            d11 = d10;
                            i14 = i12;
                            zzcuVar = zzcuVar2;
                            j13 = j12;
                            j14 = (long) (oVar2.a * d11);
                            if (j14 > j13) {
                                j14 = j13;
                            }
                            oVar2.a = j14;
                            zzcuVar.zzc = lVar3;
                            zzcuVar.zzi = oVar2;
                            zzcuVar.zza = j13;
                            zzcuVar.zzb = d11;
                            zzcuVar.zzd = i14;
                            zzcuVar.zze = i15;
                            c10 = 2;
                            zzcuVar.zzh = 2;
                        }
                        zzcuVar2.zzc = lVar2;
                        zzcuVar2.zzi = oVar;
                        zzcuVar2.zza = j12;
                        zzcuVar2.zzb = d10;
                        zzcuVar2.zzd = i12;
                        zzcuVar2.zze = i13;
                        zzcuVar2.zzh = 1;
                        Object invoke = lVar2.invoke(zzcuVar2);
                        if (invoke != aVar) {
                            return invoke;
                        }
                    } else {
                        zzcuVar2.zzc = null;
                        zzcuVar2.zzi = null;
                        zzcuVar2.zzh = 3;
                        Object invoke2 = lVar2.invoke(zzcuVar2);
                        if (invoke2 != aVar) {
                            return invoke2;
                        }
                    }
                    return aVar;
                }
                i15 = zzcuVar.zze;
                i14 = zzcuVar.zzd;
                d11 = zzcuVar.zzb;
                j13 = zzcuVar.zza;
                oVar2 = zzcuVar.zzi;
                lVar3 = (l) zzcuVar.zzc;
                try {
                    i8.b(obj);
                    return obj;
                } catch (Exception unused2) {
                    j14 = (long) (oVar2.a * d11);
                    if (j14 > j13) {
                    }
                    oVar2.a = j14;
                    zzcuVar.zzc = lVar3;
                    zzcuVar.zzi = oVar2;
                    zzcuVar.zza = j13;
                    zzcuVar.zzb = d11;
                    zzcuVar.zzd = i14;
                    zzcuVar.zze = i15;
                    c10 = 2;
                    zzcuVar.zzh = 2;
                }
            }
        }
        zzcuVar = new zzcu(this, cVar);
        Object obj2 = zzcuVar.zzf;
        a aVar2 = a.a;
        i11 = zzcuVar.zzh;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (be.f0.g(r7, r1) != r3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ad -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(l lVar, long j10, long j11, double d, l lVar2, c cVar) {
        zzcv zzcvVar;
        int i10;
        long j12;
        long j13;
        double d10;
        l lVar3;
        zzcv zzcvVar2;
        l lVar4;
        l lVar5;
        long j14;
        double d11;
        Exception e;
        if (cVar instanceof zzcv) {
            zzcvVar = (zzcv) cVar;
            int i11 = zzcvVar.zzh;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzcvVar.zzh = i11 - TLObject.FLAG_31;
                Object obj = zzcvVar.zzf;
                a aVar = a.a;
                i10 = zzcvVar.zzh;
                if (i10 != 0) {
                    i8.b(obj);
                    j12 = j10;
                    j13 = j11;
                    d10 = d;
                    lVar3 = lVar2;
                    zzcvVar2 = zzcvVar;
                    lVar4 = lVar;
                    zzcvVar2.zza = lVar4;
                    zzcvVar2.zzb = lVar3;
                    zzcvVar2.zzc = j13;
                    zzcvVar2.zze = d10;
                    zzcvVar2.zzd = j12;
                    zzcvVar2.zzh = 1;
                    Object invoke = lVar3.invoke(zzcvVar2);
                    if (invoke != aVar) {
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j12 = zzcvVar.zzd;
                        d11 = zzcvVar.zze;
                        j14 = zzcvVar.zzc;
                        lVar3 = (l) zzcvVar.zzb;
                        lVar5 = (l) zzcvVar.zza;
                        i8.b(obj);
                        l lVar6 = lVar5;
                        zzcvVar2 = zzcvVar;
                        lVar4 = lVar6;
                        long j15 = j14;
                        d10 = d11;
                        j13 = j15;
                        try {
                        } catch (Exception e7) {
                            e = e7;
                            zzcv zzcvVar3 = zzcvVar2;
                            lVar5 = lVar4;
                            zzcvVar = zzcvVar3;
                            double d12 = d10;
                            j14 = j13;
                            d11 = d12;
                            if (((Boolean) lVar5.invoke(e)).booleanValue()) {
                            }
                        }
                        zzcvVar2.zza = lVar4;
                        zzcvVar2.zzb = lVar3;
                        zzcvVar2.zzc = j13;
                        zzcvVar2.zze = d10;
                        zzcvVar2.zzd = j12;
                        zzcvVar2.zzh = 1;
                        Object invoke2 = lVar3.invoke(zzcvVar2);
                        return invoke2 != aVar ? aVar : invoke2;
                    }
                    j12 = zzcvVar.zzd;
                    d11 = zzcvVar.zze;
                    j14 = zzcvVar.zzc;
                    lVar3 = (l) zzcvVar.zzb;
                    lVar5 = (l) zzcvVar.zza;
                    try {
                        i8.b(obj);
                        return obj;
                    } catch (Exception e10) {
                        e = e10;
                        if (((Boolean) lVar5.invoke(e)).booleanValue()) {
                            throw e;
                        }
                        j12 = (long) (j12 * d11);
                        if (j12 > j14) {
                            j12 = j14;
                        }
                        zzcvVar.zza = lVar5;
                        zzcvVar.zzb = lVar3;
                        zzcvVar.zzc = j14;
                        zzcvVar.zze = d11;
                        zzcvVar.zzd = j12;
                        zzcvVar.zzh = 2;
                    }
                }
            }
        }
        zzcvVar = new zzcv(this, cVar);
        Object obj2 = zzcvVar.zzf;
        a aVar2 = a.a;
        i10 = zzcvVar.zzh;
        if (i10 != 0) {
        }
    }
}
