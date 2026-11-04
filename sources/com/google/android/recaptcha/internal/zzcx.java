package com.google.android.recaptcha.internal;

import b8.ib;
import fd.c;
import kotlin.jvm.internal.q;
import od.l;
import org.telegram.tgnet.TLObject;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzcx {
    public static final zzcx zza = new zzcx();

    private zzcx() {
    }

    public static final Object zzc(long j10, int i3, long j11, long j12, double d, l lVar, c cVar) {
        return b0.z(j10, new zzcw(20, 100L, 1000L, 2.0d, lVar, null), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (wd.b0.f(r5, r1) != r3) goto L18;
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
    public final Object zza(int i3, long j10, long j11, double d, l lVar, c cVar) {
        zzcu zzcuVar;
        int i10;
        q qVar;
        zzcu zzcuVar2;
        int i11;
        int i12;
        long j12;
        double d10;
        l lVar2;
        l lVar3;
        q qVar2;
        long j13;
        double d11;
        int i13;
        int i14;
        long j14;
        char c2;
        if (cVar instanceof zzcu) {
            zzcuVar = (zzcu) cVar;
            int i15 = zzcuVar.zzh;
            if ((i15 & TLObject.FLAG_31) != 0) {
                zzcuVar.zzh = i15 - TLObject.FLAG_31;
                Object obj = zzcuVar.zzf;
                gd.a aVar = gd.a.a;
                i10 = zzcuVar.zzh;
                if (i10 != 0) {
                    ib.b(obj);
                    q qVar3 = new q();
                    qVar3.a = j10;
                    qVar = qVar3;
                    zzcuVar2 = zzcuVar;
                    i11 = i3 - 1;
                    i12 = 0;
                    j12 = j11;
                    d10 = d;
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
                        ib.b(obj);
                        return obj;
                    }
                    i14 = zzcuVar.zze;
                    i13 = zzcuVar.zzd;
                    d11 = zzcuVar.zzb;
                    j13 = zzcuVar.zza;
                    qVar2 = zzcuVar.zzi;
                    lVar3 = (l) zzcuVar.zzc;
                    ib.b(obj);
                    c2 = 2;
                    zzcu zzcuVar3 = zzcuVar;
                    int i16 = i14;
                    int i17 = i13;
                    d10 = d11;
                    qVar = qVar2;
                    lVar2 = lVar3;
                    i12 = i16 + 1;
                    j12 = j13;
                    i11 = i17;
                    zzcuVar2 = zzcuVar3;
                    if (i12 >= i11) {
                        try {
                        } catch (Exception unused) {
                            lVar3 = lVar2;
                            i14 = i12;
                            qVar2 = qVar;
                            d11 = d10;
                            i13 = i11;
                            zzcuVar = zzcuVar2;
                            j13 = j12;
                            j14 = (long) (qVar2.a * d11);
                            if (j14 > j13) {
                                j14 = j13;
                            }
                            qVar2.a = j14;
                            zzcuVar.zzc = lVar3;
                            zzcuVar.zzi = qVar2;
                            zzcuVar.zza = j13;
                            zzcuVar.zzb = d11;
                            zzcuVar.zzd = i13;
                            zzcuVar.zze = i14;
                            c2 = 2;
                            zzcuVar.zzh = 2;
                        }
                        zzcuVar2.zzc = lVar2;
                        zzcuVar2.zzi = qVar;
                        zzcuVar2.zza = j12;
                        zzcuVar2.zzb = d10;
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
                d11 = zzcuVar.zzb;
                j13 = zzcuVar.zza;
                qVar2 = zzcuVar.zzi;
                lVar3 = (l) zzcuVar.zzc;
                try {
                    ib.b(obj);
                    return obj;
                } catch (Exception unused2) {
                    j14 = (long) (qVar2.a * d11);
                    if (j14 > j13) {
                    }
                    qVar2.a = j14;
                    zzcuVar.zzc = lVar3;
                    zzcuVar.zzi = qVar2;
                    zzcuVar.zza = j13;
                    zzcuVar.zzb = d11;
                    zzcuVar.zzd = i13;
                    zzcuVar.zze = i14;
                    c2 = 2;
                    zzcuVar.zzh = 2;
                }
            }
        }
        zzcuVar = new zzcu(this, cVar);
        Object obj2 = zzcuVar.zzf;
        gd.a aVar2 = gd.a.a;
        i10 = zzcuVar.zzh;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (wd.b0.f(r7, r1) != r3) goto L13;
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
        int i3;
        long j12;
        long j13;
        double d10;
        l lVar3;
        zzcv zzcvVar2;
        l lVar4;
        l lVar5;
        long j14;
        double d11;
        Exception e10;
        if (cVar instanceof zzcv) {
            zzcvVar = (zzcv) cVar;
            int i10 = zzcvVar.zzh;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzcvVar.zzh = i10 - TLObject.FLAG_31;
                Object obj = zzcvVar.zzf;
                gd.a aVar = gd.a.a;
                i3 = zzcvVar.zzh;
                if (i3 != 0) {
                    ib.b(obj);
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
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j12 = zzcvVar.zzd;
                        d11 = zzcvVar.zze;
                        j14 = zzcvVar.zzc;
                        lVar3 = (l) zzcvVar.zzb;
                        lVar5 = (l) zzcvVar.zza;
                        ib.b(obj);
                        l lVar6 = lVar5;
                        zzcvVar2 = zzcvVar;
                        lVar4 = lVar6;
                        long j15 = j14;
                        d10 = d11;
                        j13 = j15;
                        try {
                        } catch (Exception e11) {
                            e10 = e11;
                            zzcv zzcvVar3 = zzcvVar2;
                            lVar5 = lVar4;
                            zzcvVar = zzcvVar3;
                            double d12 = d10;
                            j14 = j13;
                            d11 = d12;
                            if (((Boolean) lVar5.invoke(e10)).booleanValue()) {
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
                        ib.b(obj);
                        return obj;
                    } catch (Exception e12) {
                        e10 = e12;
                        if (((Boolean) lVar5.invoke(e10)).booleanValue()) {
                            throw e10;
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
        gd.a aVar2 = gd.a.a;
        i3 = zzcvVar.zzh;
        if (i3 != 0) {
        }
    }
}
