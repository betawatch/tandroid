package com.google.android.recaptcha.internal;

import af.b;
import id.c;
import kotlin.jvm.internal.q;
import org.telegram.tgnet.TLObject;
import rd.l;
import zd.b0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzcx {
    public static final zzcx zza = new zzcx();

    private zzcx() {
    }

    public static final Object zzc(long j3, int i7, long j10, long j11, double d, l lVar, c cVar) {
        return b0.z(j3, new zzcw(20, 100L, 1000L, 2.0d, lVar, null), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (zd.b0.f(r5, r1) != r3) goto L18;
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
    public final Object zza(int i7, long j3, long j10, double d, l lVar, c cVar) {
        zzcu zzcuVar;
        int i10;
        q qVar;
        zzcu zzcuVar2;
        int i11;
        int i12;
        long j11;
        double d2;
        l lVar2;
        l lVar3;
        q qVar2;
        long j12;
        double d10;
        int i13;
        int i14;
        long j13;
        char c10;
        if (cVar instanceof zzcu) {
            zzcuVar = (zzcu) cVar;
            int i15 = zzcuVar.zzh;
            if ((i15 & TLObject.FLAG_31) != 0) {
                zzcuVar.zzh = i15 - TLObject.FLAG_31;
                Object obj = zzcuVar.zzf;
                jd.a aVar = jd.a.a;
                i10 = zzcuVar.zzh;
                if (i10 != 0) {
                    b.c(obj);
                    q qVar3 = new q();
                    qVar3.a = j3;
                    qVar = qVar3;
                    zzcuVar2 = zzcuVar;
                    i11 = i7 - 1;
                    i12 = 0;
                    j11 = j10;
                    d2 = d;
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
                        b.c(obj);
                        return obj;
                    }
                    i14 = zzcuVar.zze;
                    i13 = zzcuVar.zzd;
                    d10 = zzcuVar.zzb;
                    j12 = zzcuVar.zza;
                    qVar2 = zzcuVar.zzi;
                    lVar3 = (l) zzcuVar.zzc;
                    b.c(obj);
                    c10 = 2;
                    zzcu zzcuVar3 = zzcuVar;
                    int i16 = i14;
                    int i17 = i13;
                    d2 = d10;
                    qVar = qVar2;
                    lVar2 = lVar3;
                    i12 = i16 + 1;
                    j11 = j12;
                    i11 = i17;
                    zzcuVar2 = zzcuVar3;
                    if (i12 >= i11) {
                        try {
                        } catch (Exception unused) {
                            lVar3 = lVar2;
                            i14 = i12;
                            qVar2 = qVar;
                            d10 = d2;
                            i13 = i11;
                            zzcuVar = zzcuVar2;
                            j12 = j11;
                            j13 = (long) (qVar2.a * d10);
                            if (j13 > j12) {
                                j13 = j12;
                            }
                            qVar2.a = j13;
                            zzcuVar.zzc = lVar3;
                            zzcuVar.zzi = qVar2;
                            zzcuVar.zza = j12;
                            zzcuVar.zzb = d10;
                            zzcuVar.zzd = i13;
                            zzcuVar.zze = i14;
                            c10 = 2;
                            zzcuVar.zzh = 2;
                        }
                        zzcuVar2.zzc = lVar2;
                        zzcuVar2.zzi = qVar;
                        zzcuVar2.zza = j11;
                        zzcuVar2.zzb = d2;
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
                j12 = zzcuVar.zza;
                qVar2 = zzcuVar.zzi;
                lVar3 = (l) zzcuVar.zzc;
                try {
                    b.c(obj);
                    return obj;
                } catch (Exception unused2) {
                    j13 = (long) (qVar2.a * d10);
                    if (j13 > j12) {
                    }
                    qVar2.a = j13;
                    zzcuVar.zzc = lVar3;
                    zzcuVar.zzi = qVar2;
                    zzcuVar.zza = j12;
                    zzcuVar.zzb = d10;
                    zzcuVar.zzd = i13;
                    zzcuVar.zze = i14;
                    c10 = 2;
                    zzcuVar.zzh = 2;
                }
            }
        }
        zzcuVar = new zzcu(this, cVar);
        Object obj2 = zzcuVar.zzf;
        jd.a aVar2 = jd.a.a;
        i10 = zzcuVar.zzh;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (zd.b0.f(r7, r1) != r3) goto L13;
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
    public final Object zzb(l lVar, long j3, long j10, double d, l lVar2, c cVar) {
        zzcv zzcvVar;
        int i7;
        long j11;
        long j12;
        double d2;
        l lVar3;
        zzcv zzcvVar2;
        l lVar4;
        l lVar5;
        long j13;
        double d10;
        Exception e10;
        if (cVar instanceof zzcv) {
            zzcvVar = (zzcv) cVar;
            int i10 = zzcvVar.zzh;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzcvVar.zzh = i10 - TLObject.FLAG_31;
                Object obj = zzcvVar.zzf;
                jd.a aVar = jd.a.a;
                i7 = zzcvVar.zzh;
                if (i7 != 0) {
                    b.c(obj);
                    j11 = j3;
                    j12 = j10;
                    d2 = d;
                    lVar3 = lVar2;
                    zzcvVar2 = zzcvVar;
                    lVar4 = lVar;
                    zzcvVar2.zza = lVar4;
                    zzcvVar2.zzb = lVar3;
                    zzcvVar2.zzc = j12;
                    zzcvVar2.zze = d2;
                    zzcvVar2.zzd = j11;
                    zzcvVar2.zzh = 1;
                    Object invoke = lVar3.invoke(zzcvVar2);
                    if (invoke != aVar) {
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j11 = zzcvVar.zzd;
                        d10 = zzcvVar.zze;
                        j13 = zzcvVar.zzc;
                        lVar3 = (l) zzcvVar.zzb;
                        lVar5 = (l) zzcvVar.zza;
                        b.c(obj);
                        l lVar6 = lVar5;
                        zzcvVar2 = zzcvVar;
                        lVar4 = lVar6;
                        long j14 = j13;
                        d2 = d10;
                        j12 = j14;
                        try {
                        } catch (Exception e11) {
                            e10 = e11;
                            zzcv zzcvVar3 = zzcvVar2;
                            lVar5 = lVar4;
                            zzcvVar = zzcvVar3;
                            double d11 = d2;
                            j13 = j12;
                            d10 = d11;
                            if (((Boolean) lVar5.invoke(e10)).booleanValue()) {
                            }
                        }
                        zzcvVar2.zza = lVar4;
                        zzcvVar2.zzb = lVar3;
                        zzcvVar2.zzc = j12;
                        zzcvVar2.zze = d2;
                        zzcvVar2.zzd = j11;
                        zzcvVar2.zzh = 1;
                        Object invoke2 = lVar3.invoke(zzcvVar2);
                        return invoke2 != aVar ? aVar : invoke2;
                    }
                    j11 = zzcvVar.zzd;
                    d10 = zzcvVar.zze;
                    j13 = zzcvVar.zzc;
                    lVar3 = (l) zzcvVar.zzb;
                    lVar5 = (l) zzcvVar.zza;
                    try {
                        b.c(obj);
                        return obj;
                    } catch (Exception e12) {
                        e10 = e12;
                        if (((Boolean) lVar5.invoke(e10)).booleanValue()) {
                            throw e10;
                        }
                        j11 = (long) (j11 * d10);
                        if (j11 > j13) {
                            j11 = j13;
                        }
                        zzcvVar.zza = lVar5;
                        zzcvVar.zzb = lVar3;
                        zzcvVar.zzc = j13;
                        zzcvVar.zze = d10;
                        zzcvVar.zzd = j11;
                        zzcvVar.zzh = 2;
                    }
                }
            }
        }
        zzcvVar = new zzcv(this, cVar);
        Object obj2 = zzcvVar.zzf;
        jd.a aVar2 = jd.a.a;
        i7 = zzcvVar.zzh;
        if (i7 != 0) {
        }
    }
}
