package com.google.android.recaptcha.internal;

import g7.y5;
import kotlin.jvm.internal.i;
import org.telegram.tgnet.TLObject;
import pc.f;
import qc.c;
import qd.a;
import qd.d;
import qd.e;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzdj {
    private Object zza;
    private final a zzb = e.a();

    public zzdj(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [qd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, c cVar) {
        zzdg zzdgVar;
        int i9;
        d dVar;
        try {
            if (cVar instanceof zzdg) {
                zzdgVar = (zzdg) cVar;
                int i10 = zzdgVar.zzd;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    zzdgVar.zzd = i10 - TLObject.FLAG_31;
                    Object obj2 = zzdgVar.zzb;
                    rc.a aVar = rc.a.a;
                    i9 = zzdgVar.zzd;
                    if (i9 != 0) {
                        y5.b(obj2);
                        a aVar2 = this.zzb;
                        zzdgVar.zze = (zzmc) obj;
                        zzdgVar.zza = aVar2;
                        zzdgVar.zzd = 1;
                        dVar = (d) aVar2;
                        if (dVar.d(zzdgVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (a) zzdgVar.zza;
                        zzmc zzmcVar = zzdgVar.zze;
                        y5.b(obj2);
                        dVar = r52;
                        obj = zzmcVar;
                    }
                    return Boolean.valueOf(i.a(this.zza, obj));
                }
            }
            return Boolean.valueOf(i.a(this.zza, obj));
        } finally {
            dVar.e(null);
        }
        zzdgVar = new zzdg(this, cVar);
        Object obj22 = zzdgVar.zzb;
        rc.a aVar3 = rc.a.a;
        i9 = zzdgVar.zzd;
        if (i9 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [qd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, c cVar) {
        zzdh zzdhVar;
        int i9;
        d dVar;
        try {
            if (cVar instanceof zzdh) {
                zzdhVar = (zzdh) cVar;
                int i10 = zzdhVar.zzd;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    zzdhVar.zzd = i10 - TLObject.FLAG_31;
                    Object obj = zzdhVar.zzb;
                    rc.a aVar = rc.a.a;
                    i9 = zzdhVar.zzd;
                    if (i9 != 0) {
                        y5.b(obj);
                        a aVar2 = this.zzb;
                        zzdhVar.zze = (zzmc[]) objArr;
                        zzdhVar.zza = aVar2;
                        zzdhVar.zzd = 1;
                        dVar = (d) aVar2;
                        if (dVar.d(zzdhVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (a) zzdhVar.zza;
                        zzmc[] zzmcVarArr = zzdhVar.zze;
                        y5.b(obj);
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
        rc.a aVar3 = rc.a.a;
        i9 = zzdhVar.zzd;
        if (i9 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [qd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, c cVar) {
        zzdi zzdiVar;
        int i9;
        d dVar;
        try {
            if (cVar instanceof zzdi) {
                zzdiVar = (zzdi) cVar;
                int i10 = zzdiVar.zzd;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    zzdiVar.zzd = i10 - TLObject.FLAG_31;
                    Object obj2 = zzdiVar.zzb;
                    rc.a aVar = rc.a.a;
                    i9 = zzdiVar.zzd;
                    if (i9 != 0) {
                        y5.b(obj2);
                        a aVar2 = this.zzb;
                        zzdiVar.zze = (zzmc) obj;
                        zzdiVar.zza = aVar2;
                        zzdiVar.zzd = 1;
                        dVar = (d) aVar2;
                        if (dVar.d(zzdiVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (a) zzdiVar.zza;
                        zzmc zzmcVar = zzdiVar.zze;
                        y5.b(obj2);
                        dVar = r52;
                        obj = zzmcVar;
                    }
                    this.zza = obj;
                    dVar.e(null);
                    return oc.i.a;
                }
            }
            this.zza = obj;
            dVar.e(null);
            return oc.i.a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        zzdiVar = new zzdi(this, cVar);
        Object obj22 = zzdiVar.zzb;
        rc.a aVar3 = rc.a.a;
        i9 = zzdiVar.zzd;
        if (i9 != 0) {
        }
    }
}
