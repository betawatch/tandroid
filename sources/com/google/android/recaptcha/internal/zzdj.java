package com.google.android.recaptcha.internal;

import h7.k6;
import kotlin.jvm.internal.j;
import org.telegram.tgnet.TLObject;
import pc.i;
import qc.f;
import rc.c;
import rd.d;
import rd.e;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class zzdj {
    private Object zza;
    private final rd.a zzb = e.a();

    public zzdj(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [rd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, c cVar) {
        zzdg zzdgVar;
        int i10;
        d dVar;
        try {
            if (cVar instanceof zzdg) {
                zzdgVar = (zzdg) cVar;
                int i11 = zzdgVar.zzd;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    zzdgVar.zzd = i11 - TLObject.FLAG_31;
                    Object obj2 = zzdgVar.zzb;
                    sc.a aVar = sc.a.a;
                    i10 = zzdgVar.zzd;
                    if (i10 != 0) {
                        k6.b(obj2);
                        rd.a aVar2 = this.zzb;
                        zzdgVar.zze = (zzmc) obj;
                        zzdgVar.zza = aVar2;
                        zzdgVar.zzd = 1;
                        dVar = (d) aVar2;
                        if (dVar.d(zzdgVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (rd.a) zzdgVar.zza;
                        zzmc zzmcVar = zzdgVar.zze;
                        k6.b(obj2);
                        dVar = r52;
                        obj = zzmcVar;
                    }
                    return Boolean.valueOf(j.a(this.zza, obj));
                }
            }
            return Boolean.valueOf(j.a(this.zza, obj));
        } finally {
            dVar.e(null);
        }
        zzdgVar = new zzdg(this, cVar);
        Object obj22 = zzdgVar.zzb;
        sc.a aVar3 = sc.a.a;
        i10 = zzdgVar.zzd;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [rd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, c cVar) {
        zzdh zzdhVar;
        int i10;
        d dVar;
        try {
            if (cVar instanceof zzdh) {
                zzdhVar = (zzdh) cVar;
                int i11 = zzdhVar.zzd;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    zzdhVar.zzd = i11 - TLObject.FLAG_31;
                    Object obj = zzdhVar.zzb;
                    sc.a aVar = sc.a.a;
                    i10 = zzdhVar.zzd;
                    if (i10 != 0) {
                        k6.b(obj);
                        rd.a aVar2 = this.zzb;
                        zzdhVar.zze = (zzmc[]) objArr;
                        zzdhVar.zza = aVar2;
                        zzdhVar.zzd = 1;
                        dVar = (d) aVar2;
                        if (dVar.d(zzdhVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (rd.a) zzdhVar.zza;
                        zzmc[] zzmcVarArr = zzdhVar.zze;
                        k6.b(obj);
                        dVar = r52;
                        objArr = zzmcVarArr;
                    }
                    return Boolean.valueOf(f.a(objArr, this.zza));
                }
            }
            return Boolean.valueOf(f.a(objArr, this.zza));
        } finally {
            dVar.e(null);
        }
        zzdhVar = new zzdh(this, cVar);
        Object obj2 = zzdhVar.zzb;
        sc.a aVar3 = sc.a.a;
        i10 = zzdhVar.zzd;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [rd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, c cVar) {
        zzdi zzdiVar;
        int i10;
        d dVar;
        try {
            if (cVar instanceof zzdi) {
                zzdiVar = (zzdi) cVar;
                int i11 = zzdiVar.zzd;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    zzdiVar.zzd = i11 - TLObject.FLAG_31;
                    Object obj2 = zzdiVar.zzb;
                    sc.a aVar = sc.a.a;
                    i10 = zzdiVar.zzd;
                    if (i10 != 0) {
                        k6.b(obj2);
                        rd.a aVar2 = this.zzb;
                        zzdiVar.zze = (zzmc) obj;
                        zzdiVar.zza = aVar2;
                        zzdiVar.zzd = 1;
                        dVar = (d) aVar2;
                        if (dVar.d(zzdiVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (rd.a) zzdiVar.zza;
                        zzmc zzmcVar = zzdiVar.zze;
                        k6.b(obj2);
                        dVar = r52;
                        obj = zzmcVar;
                    }
                    this.zza = obj;
                    dVar.e(null);
                    return i.a;
                }
            }
            this.zza = obj;
            dVar.e(null);
            return i.a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        zzdiVar = new zzdi(this, cVar);
        Object obj22 = zzdiVar.zzb;
        sc.a aVar3 = sc.a.a;
        i10 = zzdiVar.zzd;
        if (i10 != 0) {
        }
    }
}
