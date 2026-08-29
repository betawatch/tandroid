package com.google.android.recaptcha.internal;

import i7.c7;
import kotlin.jvm.internal.j;
import org.telegram.tgnet.TLObject;
import qc.i;
import rc.f;
import sc.c;
import sd.d;
import sd.e;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class zzdj {
    private Object zza;
    private final sd.a zzb = e.a();

    public zzdj(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [sd.a] */
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
                    tc.a aVar = tc.a.a;
                    i10 = zzdgVar.zzd;
                    if (i10 != 0) {
                        c7.b(obj2);
                        sd.a aVar2 = this.zzb;
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
                        ?? r52 = (sd.a) zzdgVar.zza;
                        zzmc zzmcVar = zzdgVar.zze;
                        c7.b(obj2);
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
        tc.a aVar3 = tc.a.a;
        i10 = zzdgVar.zzd;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [sd.a] */
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
                    tc.a aVar = tc.a.a;
                    i10 = zzdhVar.zzd;
                    if (i10 != 0) {
                        c7.b(obj);
                        sd.a aVar2 = this.zzb;
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
                        ?? r52 = (sd.a) zzdhVar.zza;
                        zzmc[] zzmcVarArr = zzdhVar.zze;
                        c7.b(obj);
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
        tc.a aVar3 = tc.a.a;
        i10 = zzdhVar.zzd;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [sd.a] */
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
                    tc.a aVar = tc.a.a;
                    i10 = zzdiVar.zzd;
                    if (i10 != 0) {
                        c7.b(obj2);
                        sd.a aVar2 = this.zzb;
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
                        ?? r52 = (sd.a) zzdiVar.zza;
                        zzmc zzmcVar = zzdiVar.zze;
                        c7.b(obj2);
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
        } catch (Throwable th2) {
            dVar.e(null);
            throw th2;
        }
        zzdiVar = new zzdi(this, cVar);
        Object obj22 = zzdiVar.zzb;
        tc.a aVar3 = tc.a.a;
        i10 = zzdiVar.zzd;
        if (i10 != 0) {
        }
    }
}
