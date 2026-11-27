package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzhj {
    public static final Object zza(zzhh zzhhVar, is4 is4Var, zw2 zw2Var) {
        return is4Var.invoke(new zzhk(zzhhVar), zw2Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(4:17|18|19|(1:21))|11|12))|23|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zzb(zzhk zzhkVar, zzhf zzhfVar, zw2 zw2Var) {
        zzhi zzhiVar;
        int i;
        if (zw2Var instanceof zzhi) {
            zzhiVar = (zzhi) zw2Var;
            int i2 = zzhiVar.zzb;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzhiVar.zzb = i2 - TLObject.FLAG_31;
                Object obj = zzhiVar.zza;
                i = zzhiVar.zzb;
                f9c f9cVar = f9c.a;
                if (i != 0) {
                    ixe.b(obj);
                    zzhiVar.zzb = 1;
                    Object zza = zzhfVar.zza(zzhkVar, zzhiVar);
                    Object obj2 = vx2.a;
                    if (zza == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixe.b(obj);
                }
                return f9cVar;
            }
        }
        zzhiVar = new zzhi(zw2Var);
        Object obj3 = zzhiVar.zza;
        i = zzhiVar.zzb;
        f9c f9cVar2 = f9c.a;
        if (i != 0) {
        }
        return f9cVar2;
    }

    public static final Object zzc(zzgr zzgrVar, zzhg zzhgVar, zw2 zw2Var) {
        Object zza = zzhgVar.zza(zzgrVar.zza(), zw2Var);
        return zza == vx2.a ? zza : f9c.a;
    }

    public static final Object zzd(int i, int i2, is4 is4Var, zw2 zw2Var) {
        return new zzhf(i, is4Var, new Integer(i2));
    }

    public static final Object zze(zzhk zzhkVar, int i, is4 is4Var, zw2 zw2Var) {
        return new zzhf(i, is4Var, null).zza(zzhkVar, zw2Var);
    }
}
