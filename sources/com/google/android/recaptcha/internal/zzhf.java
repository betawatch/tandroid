package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzhf {
    private final is4 zza;
    private final Integer zzb;
    private final int zzc;

    public zzhf(int i, is4 is4Var, Integer num) {
        this.zzc = i;
        this.zza = is4Var;
        this.zzb = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(zzhk zzhkVar, zw2 zw2Var) {
        zzhe zzheVar;
        int i;
        zzcg e;
        zzgr zzgrVar;
        if (zw2Var instanceof zzhe) {
            zzheVar = (zzhe) zw2Var;
            int i2 = zzheVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzheVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzheVar.zza;
                i = zzheVar.zzc;
                if (i != 0) {
                    ixe.b(obj);
                    zzgr zzgrVar2 = new zzgr(zzhkVar, this.zzc, this.zzb);
                    try {
                        is4 is4Var = this.zza;
                        zzheVar.zzd = zzgrVar2;
                        zzheVar.zzc = 1;
                        obj = is4Var.invoke(zzgrVar2, zzheVar);
                        vx2 vx2Var = vx2.a;
                        if (obj == vx2Var) {
                            return vx2Var;
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
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        ixe.b(obj);
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
        zzheVar = new zzhe(this, zw2Var);
        Object obj2 = zzheVar.zza;
        i = zzheVar.zzc;
        if (i != 0) {
        }
        zzgrVar.zzb();
        return obj2;
    }
}
