package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzdj {
    private Object zza;
    private final uj7 zzb = new wj7();

    public zzdj(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v3, types: [uj7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, zw2 zw2Var) {
        zzdg zzdgVar;
        int i;
        wj7 wj7Var;
        try {
            if (zw2Var instanceof zzdg) {
                zzdgVar = (zzdg) zw2Var;
                int i2 = zzdgVar.zzd;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzdgVar.zzd = i2 - TLObject.FLAG_31;
                    Object obj2 = zzdgVar.zzb;
                    i = zzdgVar.zzd;
                    if (i != 0) {
                        ixe.b(obj2);
                        uj7 uj7Var = this.zzb;
                        zzdgVar.zze = (zzmc) obj;
                        zzdgVar.zza = uj7Var;
                        zzdgVar.zzd = 1;
                        wj7Var = (wj7) uj7Var;
                        Object d = wj7Var.d(zzdgVar);
                        vx2 vx2Var = vx2.a;
                        if (d == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (uj7) zzdgVar.zza;
                        zzmc zzmcVar = zzdgVar.zze;
                        ixe.b(obj2);
                        wj7Var = r5;
                        obj = zzmcVar;
                    }
                    return Boolean.valueOf(ur5.a(this.zza, obj));
                }
            }
            return Boolean.valueOf(ur5.a(this.zza, obj));
        } finally {
            wj7Var.f(null);
        }
        zzdgVar = new zzdg(this, zw2Var);
        Object obj22 = zzdgVar.zzb;
        i = zzdgVar.zzd;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v3, types: [uj7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, zw2 zw2Var) {
        zzdh zzdhVar;
        int i;
        wj7 wj7Var;
        try {
            if (zw2Var instanceof zzdh) {
                zzdhVar = (zzdh) zw2Var;
                int i2 = zzdhVar.zzd;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzdhVar.zzd = i2 - TLObject.FLAG_31;
                    Object obj = zzdhVar.zzb;
                    i = zzdhVar.zzd;
                    if (i != 0) {
                        ixe.b(obj);
                        uj7 uj7Var = this.zzb;
                        zzdhVar.zze = (zzmc[]) objArr;
                        zzdhVar.zza = uj7Var;
                        zzdhVar.zzd = 1;
                        wj7Var = (wj7) uj7Var;
                        Object d = wj7Var.d(zzdhVar);
                        vx2 vx2Var = vx2.a;
                        if (d == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (uj7) zzdhVar.zza;
                        zzmc[] zzmcVarArr = zzdhVar.zze;
                        ixe.b(obj);
                        wj7Var = r5;
                        objArr = zzmcVarArr;
                    }
                    return Boolean.valueOf(ts.a(objArr, this.zza));
                }
            }
            return Boolean.valueOf(ts.a(objArr, this.zza));
        } finally {
            wj7Var.f(null);
        }
        zzdhVar = new zzdh(this, zw2Var);
        Object obj2 = zzdhVar.zzb;
        i = zzdhVar.zzd;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v3, types: [uj7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, zw2 zw2Var) {
        zzdi zzdiVar;
        int i;
        wj7 wj7Var;
        try {
            if (zw2Var instanceof zzdi) {
                zzdiVar = (zzdi) zw2Var;
                int i2 = zzdiVar.zzd;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzdiVar.zzd = i2 - TLObject.FLAG_31;
                    Object obj2 = zzdiVar.zzb;
                    i = zzdiVar.zzd;
                    if (i != 0) {
                        ixe.b(obj2);
                        uj7 uj7Var = this.zzb;
                        zzdiVar.zze = (zzmc) obj;
                        zzdiVar.zza = uj7Var;
                        zzdiVar.zzd = 1;
                        wj7Var = (wj7) uj7Var;
                        Object d = wj7Var.d(zzdiVar);
                        vx2 vx2Var = vx2.a;
                        if (d == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (uj7) zzdiVar.zza;
                        zzmc zzmcVar = zzdiVar.zze;
                        ixe.b(obj2);
                        wj7Var = r5;
                        obj = zzmcVar;
                    }
                    this.zza = obj;
                    wj7Var.f(null);
                    return f9c.a;
                }
            }
            this.zza = obj;
            wj7Var.f(null);
            return f9c.a;
        } catch (Throwable th) {
            wj7Var.f(null);
            throw th;
        }
        zzdiVar = new zzdi(this, zw2Var);
        Object obj22 = zzdiVar.zzb;
        i = zzdiVar.zzd;
        if (i != 0) {
        }
    }
}
