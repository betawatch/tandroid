package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzhj {
    public static final Object zza(zzhh zzhhVar, eq4 eq4Var, fw2 fw2Var) {
        return eq4Var.invoke(new zzhk(zzhhVar), fw2Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(4:17|18|19|(1:21))|11|12))|23|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zzb(zzhk zzhkVar, zzhf zzhfVar, fw2 fw2Var) {
        zzhi zzhiVar;
        int i;
        if (fw2Var instanceof zzhi) {
            zzhiVar = (zzhi) fw2Var;
            int i2 = zzhiVar.zzb;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzhiVar.zzb = i2 - TLObject.FLAG_31;
                Object obj = zzhiVar.zza;
                i = zzhiVar.zzb;
                g5c g5cVar = g5c.a;
                if (i != 0) {
                    qse.b(obj);
                    zzhiVar.zzb = 1;
                    Object zza = zzhfVar.zza(zzhkVar, zzhiVar);
                    Object obj2 = bx2.a;
                    if (zza == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qse.b(obj);
                }
                return g5cVar;
            }
        }
        zzhiVar = new zzhi(fw2Var);
        Object obj3 = zzhiVar.zza;
        i = zzhiVar.zzb;
        g5c g5cVar2 = g5c.a;
        if (i != 0) {
        }
        return g5cVar2;
    }

    public static final Object zzc(zzgr zzgrVar, zzhg zzhgVar, fw2 fw2Var) {
        Object zza = zzhgVar.zza(zzgrVar.zza(), fw2Var);
        return zza == bx2.a ? zza : g5c.a;
    }

    public static final Object zzd(int i, int i2, eq4 eq4Var, fw2 fw2Var) {
        return new zzhf(i, eq4Var, new Integer(i2));
    }

    public static final Object zze(zzhk zzhkVar, int i, eq4 eq4Var, fw2 fw2Var) {
        return new zzhf(i, eq4Var, null).zza(zzhkVar, fw2Var);
    }
}
