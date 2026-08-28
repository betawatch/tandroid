package com.google.android.recaptcha.internal;

import g7.y5;
import hd.f0;
import kotlin.jvm.internal.o;
import org.telegram.tgnet.TLObject;
import qc.c;
import rc.a;
import zc.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzcx {
    public static final zzcx zza = new zzcx();

    private zzcx() {
    }

    public static final Object zzc(long j10, int i9, long j11, long j12, double d, l lVar, c cVar) {
        return f0.x(j10, new zzcw(20, 100L, 1000L, 2.0d, lVar, null), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        if (hd.f0.g(r5, r1) != r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c5 -> B:17:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(int i9, long j10, long j11, double d, l lVar, c cVar) {
        zzcu zzcuVar;
        int i10;
        double d9;
        o oVar;
        zzcu zzcuVar2;
        int i11;
        int i12;
        long j12;
        l lVar2;
        l lVar3;
        o oVar2;
        long j13;
        double d10;
        int i13;
        int i14;
        long j14;
        if (cVar instanceof zzcu) {
            zzcuVar = (zzcu) cVar;
            int i15 = zzcuVar.zzh;
            if ((i15 & TLObject.FLAG_31) != 0) {
                zzcuVar.zzh = i15 - TLObject.FLAG_31;
                Object obj = zzcuVar.zzf;
                a aVar = a.a;
                i10 = zzcuVar.zzh;
                if (i10 != 0) {
                    y5.b(obj);
                    o oVar3 = new o();
                    oVar3.a = j10;
                    d9 = d;
                    oVar = oVar3;
                    zzcuVar2 = zzcuVar;
                    i11 = i9 - 1;
                    i12 = 0;
                    j12 = j11;
                    lVar2 = lVar;
                    if (i12 >= i11) {
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.b(obj);
                        return obj;
                    }
                    i14 = zzcuVar.zze;
                    i13 = zzcuVar.zzd;
                    d10 = zzcuVar.zzb;
                    j13 = zzcuVar.zza;
                    oVar2 = zzcuVar.zzi;
                    lVar3 = (l) zzcuVar.zzc;
                    y5.b(obj);
                    zzcu zzcuVar3 = zzcuVar;
                    int i16 = i14;
                    int i17 = i13;
                    d9 = d10;
                    oVar = oVar2;
                    lVar2 = lVar3;
                    i12 = i16 + 1;
                    j12 = j13;
                    zzcuVar2 = zzcuVar3;
                    i11 = i17;
                    if (i12 >= i11) {
                        try {
                        } catch (Exception unused) {
                            lVar3 = lVar2;
                            i14 = i12;
                            oVar2 = oVar;
                            d10 = d9;
                            i13 = i11;
                            zzcuVar = zzcuVar2;
                            j13 = j12;
                            j14 = (long) (oVar2.a * d10);
                            if (j14 > j13) {
                                j14 = j13;
                            }
                            oVar2.a = j14;
                            zzcuVar.zzc = lVar3;
                            zzcuVar.zzi = oVar2;
                            zzcuVar.zza = j13;
                            zzcuVar.zzb = d10;
                            zzcuVar.zzd = i13;
                            zzcuVar.zze = i14;
                            zzcuVar.zzh = 2;
                        }
                        zzcuVar2.zzc = lVar2;
                        zzcuVar2.zzi = oVar;
                        zzcuVar2.zza = j12;
                        zzcuVar2.zzb = d9;
                        zzcuVar2.zzd = i11;
                        zzcuVar2.zze = i12;
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
                i14 = zzcuVar.zze;
                i13 = zzcuVar.zzd;
                d10 = zzcuVar.zzb;
                j13 = zzcuVar.zza;
                oVar2 = zzcuVar.zzi;
                lVar3 = (l) zzcuVar.zzc;
                try {
                    y5.b(obj);
                    return obj;
                } catch (Exception unused2) {
                    j14 = (long) (oVar2.a * d10);
                    if (j14 > j13) {
                    }
                    oVar2.a = j14;
                    zzcuVar.zzc = lVar3;
                    zzcuVar.zzi = oVar2;
                    zzcuVar.zza = j13;
                    zzcuVar.zzb = d10;
                    zzcuVar.zzd = i13;
                    zzcuVar.zze = i14;
                    zzcuVar.zzh = 2;
                }
            }
        }
        zzcuVar = new zzcu(this, cVar);
        Object obj2 = zzcuVar.zzf;
        a aVar2 = a.a;
        i10 = zzcuVar.zzh;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (hd.f0.g(r7, r1) != r3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ae -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(l lVar, long j10, long j11, double d, l lVar2, c cVar) {
        zzcv zzcvVar;
        int i9;
        long j12;
        long j13;
        double d9;
        l lVar3;
        zzcv zzcvVar2;
        l lVar4;
        l lVar5;
        long j14;
        double d10;
        Exception e10;
        if (cVar instanceof zzcv) {
            zzcvVar = (zzcv) cVar;
            int i10 = zzcvVar.zzh;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzcvVar.zzh = i10 - TLObject.FLAG_31;
                Object obj = zzcvVar.zzf;
                a aVar = a.a;
                i9 = zzcvVar.zzh;
                if (i9 != 0) {
                    y5.b(obj);
                    j12 = j10;
                    j13 = j11;
                    d9 = d;
                    lVar3 = lVar2;
                    zzcvVar2 = zzcvVar;
                    lVar4 = lVar;
                    zzcvVar2.zza = lVar4;
                    zzcvVar2.zzb = lVar3;
                    zzcvVar2.zzc = j13;
                    zzcvVar2.zze = d9;
                    zzcvVar2.zzd = j12;
                    zzcvVar2.zzh = 1;
                    Object invoke = lVar3.invoke(zzcvVar2);
                    if (invoke != aVar) {
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j12 = zzcvVar.zzd;
                        d10 = zzcvVar.zze;
                        j14 = zzcvVar.zzc;
                        lVar3 = (l) zzcvVar.zzb;
                        lVar5 = (l) zzcvVar.zza;
                        y5.b(obj);
                        l lVar6 = lVar5;
                        zzcvVar2 = zzcvVar;
                        lVar4 = lVar6;
                        long j15 = j14;
                        d9 = d10;
                        j13 = j15;
                        try {
                        } catch (Exception e11) {
                            e10 = e11;
                            zzcv zzcvVar3 = zzcvVar2;
                            lVar5 = lVar4;
                            zzcvVar = zzcvVar3;
                            double d11 = d9;
                            j14 = j13;
                            d10 = d11;
                            if (((Boolean) lVar5.invoke(e10)).booleanValue()) {
                            }
                        }
                        zzcvVar2.zza = lVar4;
                        zzcvVar2.zzb = lVar3;
                        zzcvVar2.zzc = j13;
                        zzcvVar2.zze = d9;
                        zzcvVar2.zzd = j12;
                        zzcvVar2.zzh = 1;
                        Object invoke2 = lVar3.invoke(zzcvVar2);
                        return invoke2 != aVar ? aVar : invoke2;
                    }
                    j12 = zzcvVar.zzd;
                    d10 = zzcvVar.zze;
                    j14 = zzcvVar.zzc;
                    lVar3 = (l) zzcvVar.zzb;
                    lVar5 = (l) zzcvVar.zza;
                    try {
                        y5.b(obj);
                        return obj;
                    } catch (Exception e12) {
                        e10 = e12;
                        if (((Boolean) lVar5.invoke(e10)).booleanValue()) {
                            throw e10;
                        }
                        j12 = (long) (j12 * d10);
                        if (j12 > j14) {
                            j12 = j14;
                        }
                        zzcvVar.zza = lVar5;
                        zzcvVar.zzb = lVar3;
                        zzcvVar.zzc = j14;
                        zzcvVar.zze = d10;
                        zzcvVar.zzd = j12;
                        zzcvVar.zzh = 2;
                    }
                }
            }
        }
        zzcvVar = new zzcv(this, cVar);
        Object obj2 = zzcvVar.zzf;
        a aVar2 = a.a;
        i9 = zzcvVar.zzh;
        if (i9 != 0) {
        }
    }
}
