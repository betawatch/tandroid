package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzdj {
    private Object zza;
    private final vj7 zzb = new xj7();

    public zzdj(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v3, types: [vj7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, zw2 zw2Var) {
        zzdg zzdgVar;
        int i;
        xj7 xj7Var;
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
                        vj7 vj7Var = this.zzb;
                        zzdgVar.zze = (zzmc) obj;
                        zzdgVar.zza = vj7Var;
                        zzdgVar.zzd = 1;
                        xj7Var = (xj7) vj7Var;
                        Object d = xj7Var.d(zzdgVar);
                        vx2 vx2Var = vx2.a;
                        if (d == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (vj7) zzdgVar.zza;
                        zzmc zzmcVar = zzdgVar.zze;
                        ixe.b(obj2);
                        xj7Var = r5;
                        obj = zzmcVar;
                    }
                    return Boolean.valueOf(ur5.a(this.zza, obj));
                }
            }
            return Boolean.valueOf(ur5.a(this.zza, obj));
        } finally {
            xj7Var.f(null);
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
    /* JADX WARN: Type inference failed for: r5v3, types: [vj7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, zw2 zw2Var) {
        zzdh zzdhVar;
        int i;
        xj7 xj7Var;
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
                        vj7 vj7Var = this.zzb;
                        zzdhVar.zze = (zzmc[]) objArr;
                        zzdhVar.zza = vj7Var;
                        zzdhVar.zzd = 1;
                        xj7Var = (xj7) vj7Var;
                        Object d = xj7Var.d(zzdhVar);
                        vx2 vx2Var = vx2.a;
                        if (d == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (vj7) zzdhVar.zza;
                        zzmc[] zzmcVarArr = zzdhVar.zze;
                        ixe.b(obj);
                        xj7Var = r5;
                        objArr = zzmcVarArr;
                    }
                    return Boolean.valueOf(ts.a(objArr, this.zza));
                }
            }
            return Boolean.valueOf(ts.a(objArr, this.zza));
        } finally {
            xj7Var.f(null);
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
    /* JADX WARN: Type inference failed for: r5v3, types: [vj7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, zw2 zw2Var) {
        zzdi zzdiVar;
        int i;
        xj7 xj7Var;
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
                        vj7 vj7Var = this.zzb;
                        zzdiVar.zze = (zzmc) obj;
                        zzdiVar.zza = vj7Var;
                        zzdiVar.zzd = 1;
                        xj7Var = (xj7) vj7Var;
                        Object d = xj7Var.d(zzdiVar);
                        vx2 vx2Var = vx2.a;
                        if (d == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (vj7) zzdiVar.zza;
                        zzmc zzmcVar = zzdiVar.zze;
                        ixe.b(obj2);
                        xj7Var = r5;
                        obj = zzmcVar;
                    }
                    this.zza = obj;
                    xj7Var.f(null);
                    return g9c.a;
                }
            }
            this.zza = obj;
            xj7Var.f(null);
            return g9c.a;
        } catch (Throwable th) {
            xj7Var.f(null);
            throw th;
        }
        zzdiVar = new zzdi(this, zw2Var);
        Object obj22 = zzdiVar.zzb;
        i = zzdiVar.zzd;
        if (i != 0) {
        }
    }
}
