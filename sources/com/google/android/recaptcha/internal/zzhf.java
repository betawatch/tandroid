package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzhf {
    private final fs4 zza;
    private final Integer zzb;
    private final int zzc;

    public zzhf(int i, fs4 fs4Var, Integer num) {
        this.zzc = i;
        this.zza = fs4Var;
        this.zzb = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(zzhk zzhkVar, px2 px2Var) {
        zzhe zzheVar;
        int i;
        zzcg e;
        zzgr zzgrVar;
        if (px2Var instanceof zzhe) {
            zzheVar = (zzhe) px2Var;
            int i2 = zzheVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzheVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzheVar.zza;
                i = zzheVar.zzc;
                if (i != 0) {
                    tue.b(obj);
                    zzgr zzgrVar2 = new zzgr(zzhkVar, this.zzc, this.zzb);
                    try {
                        fs4 fs4Var = this.zza;
                        zzheVar.zzd = zzgrVar2;
                        zzheVar.zzc = 1;
                        obj = fs4Var.invoke(zzgrVar2, zzheVar);
                        ly2 ly2Var = ly2.a;
                        if (obj == ly2Var) {
                            return ly2Var;
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
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        tue.b(obj);
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
        zzheVar = new zzhe(this, px2Var);
        Object obj2 = zzheVar.zza;
        i = zzheVar.zzc;
        if (i != 0) {
        }
        zzgrVar.zzb();
        return obj2;
    }
}
