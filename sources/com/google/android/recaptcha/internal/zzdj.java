package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzdj {
    private Object zza;
    private final lh7 zzb = new nh7();

    public zzdj(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v3, types: [lh7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, fw2 fw2Var) {
        zzdg zzdgVar;
        int i;
        nh7 nh7Var;
        try {
            if (fw2Var instanceof zzdg) {
                zzdgVar = (zzdg) fw2Var;
                int i2 = zzdgVar.zzd;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzdgVar.zzd = i2 - TLObject.FLAG_31;
                    Object obj2 = zzdgVar.zzb;
                    i = zzdgVar.zzd;
                    if (i != 0) {
                        qse.b(obj2);
                        lh7 lh7Var = this.zzb;
                        zzdgVar.zze = (zzmc) obj;
                        zzdgVar.zza = lh7Var;
                        zzdgVar.zzd = 1;
                        nh7Var = (nh7) lh7Var;
                        Object d = nh7Var.d(zzdgVar);
                        bx2 bx2Var = bx2.a;
                        if (d == bx2Var) {
                            return bx2Var;
                        }
                    } else {
                        if (i != 1) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (lh7) zzdgVar.zza;
                        zzmc zzmcVar = zzdgVar.zze;
                        qse.b(obj2);
                        nh7Var = r5;
                        obj = zzmcVar;
                    }
                    return Boolean.valueOf(rp5.a(this.zza, obj));
                }
            }
            return Boolean.valueOf(rp5.a(this.zza, obj));
        } finally {
            nh7Var.f(null);
        }
        zzdgVar = new zzdg(this, fw2Var);
        Object obj22 = zzdgVar.zzb;
        i = zzdgVar.zzd;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v3, types: [lh7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, fw2 fw2Var) {
        zzdh zzdhVar;
        int i;
        nh7 nh7Var;
        try {
            if (fw2Var instanceof zzdh) {
                zzdhVar = (zzdh) fw2Var;
                int i2 = zzdhVar.zzd;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzdhVar.zzd = i2 - TLObject.FLAG_31;
                    Object obj = zzdhVar.zzb;
                    i = zzdhVar.zzd;
                    if (i != 0) {
                        qse.b(obj);
                        lh7 lh7Var = this.zzb;
                        zzdhVar.zze = (zzmc[]) objArr;
                        zzdhVar.zza = lh7Var;
                        zzdhVar.zzd = 1;
                        nh7Var = (nh7) lh7Var;
                        Object d = nh7Var.d(zzdhVar);
                        bx2 bx2Var = bx2.a;
                        if (d == bx2Var) {
                            return bx2Var;
                        }
                    } else {
                        if (i != 1) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (lh7) zzdhVar.zza;
                        zzmc[] zzmcVarArr = zzdhVar.zze;
                        qse.b(obj);
                        nh7Var = r5;
                        objArr = zzmcVarArr;
                    }
                    return Boolean.valueOf(ss.a(objArr, this.zza));
                }
            }
            return Boolean.valueOf(ss.a(objArr, this.zza));
        } finally {
            nh7Var.f(null);
        }
        zzdhVar = new zzdh(this, fw2Var);
        Object obj2 = zzdhVar.zzb;
        i = zzdhVar.zzd;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v3, types: [lh7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, fw2 fw2Var) {
        zzdi zzdiVar;
        int i;
        nh7 nh7Var;
        try {
            if (fw2Var instanceof zzdi) {
                zzdiVar = (zzdi) fw2Var;
                int i2 = zzdiVar.zzd;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzdiVar.zzd = i2 - TLObject.FLAG_31;
                    Object obj2 = zzdiVar.zzb;
                    i = zzdiVar.zzd;
                    if (i != 0) {
                        qse.b(obj2);
                        lh7 lh7Var = this.zzb;
                        zzdiVar.zze = (zzmc) obj;
                        zzdiVar.zza = lh7Var;
                        zzdiVar.zzd = 1;
                        nh7Var = (nh7) lh7Var;
                        Object d = nh7Var.d(zzdiVar);
                        bx2 bx2Var = bx2.a;
                        if (d == bx2Var) {
                            return bx2Var;
                        }
                    } else {
                        if (i != 1) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (lh7) zzdiVar.zza;
                        zzmc zzmcVar = zzdiVar.zze;
                        qse.b(obj2);
                        nh7Var = r5;
                        obj = zzmcVar;
                    }
                    this.zza = obj;
                    nh7Var.f(null);
                    return g5c.a;
                }
            }
            this.zza = obj;
            nh7Var.f(null);
            return g5c.a;
        } catch (Throwable th) {
            nh7Var.f(null);
            throw th;
        }
        zzdiVar = new zzdi(this, fw2Var);
        Object obj22 = zzdiVar.zzb;
        i = zzdiVar.zzd;
        if (i != 0) {
        }
    }
}
