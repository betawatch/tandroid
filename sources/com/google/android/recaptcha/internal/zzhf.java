package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzhf {
    private final eq4 zza;
    private final Integer zzb;
    private final int zzc;

    public zzhf(int i, eq4 eq4Var, Integer num) {
        this.zzc = i;
        this.zza = eq4Var;
        this.zzb = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(zzhk zzhkVar, fw2 fw2Var) {
        zzhe zzheVar;
        int i;
        zzcg e;
        zzgr zzgrVar;
        if (fw2Var instanceof zzhe) {
            zzheVar = (zzhe) fw2Var;
            int i2 = zzheVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzheVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzheVar.zza;
                i = zzheVar.zzc;
                if (i != 0) {
                    qse.b(obj);
                    zzgr zzgrVar2 = new zzgr(zzhkVar, this.zzc, this.zzb);
                    try {
                        eq4 eq4Var = this.zza;
                        zzheVar.zzd = zzgrVar2;
                        zzheVar.zzc = 1;
                        obj = eq4Var.invoke(zzgrVar2, zzheVar);
                        bx2 bx2Var = bx2.a;
                        if (obj == bx2Var) {
                            return bx2Var;
                        }
                        zzgrVar = zzgrVar2;
                    } catch (zzcg e2) {
                        e = e2;
                        zzgrVar = zzgrVar2;
                        zzgrVar.zzc(e);
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        qse.b(obj);
                    } catch (zzcg e3) {
                        e = e3;
                        zzgrVar.zzc(e);
                        throw e;
                    }
                }
                zzgrVar.zzb();
                return obj;
            }
        }
        zzheVar = new zzhe(this, fw2Var);
        Object obj2 = zzheVar.zza;
        i = zzheVar.zzc;
        if (i != 0) {
        }
        zzgrVar.zzb();
        return obj2;
    }
}
