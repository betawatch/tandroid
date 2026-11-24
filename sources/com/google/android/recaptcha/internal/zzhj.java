package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzhj {
    public static final Object zza(zzhh zzhhVar, fs4 fs4Var, px2 px2Var) {
        return fs4Var.invoke(new zzhk(zzhhVar), px2Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(4:17|18|19|(1:21))|11|12))|23|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zzb(zzhk zzhkVar, zzhf zzhfVar, px2 px2Var) {
        zzhi zzhiVar;
        int i;
        if (px2Var instanceof zzhi) {
            zzhiVar = (zzhi) px2Var;
            int i2 = zzhiVar.zzb;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzhiVar.zzb = i2 - TLObject.FLAG_31;
                Object obj = zzhiVar.zza;
                i = zzhiVar.zzb;
                g7c g7cVar = g7c.a;
                if (i != 0) {
                    tue.b(obj);
                    zzhiVar.zzb = 1;
                    Object zza = zzhfVar.zza(zzhkVar, zzhiVar);
                    Object obj2 = ly2.a;
                    if (zza == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                return g7cVar;
            }
        }
        zzhiVar = new zzhi(px2Var);
        Object obj3 = zzhiVar.zza;
        i = zzhiVar.zzb;
        g7c g7cVar2 = g7c.a;
        if (i != 0) {
        }
        return g7cVar2;
    }

    public static final Object zzc(zzgr zzgrVar, zzhg zzhgVar, px2 px2Var) {
        Object zza = zzhgVar.zza(zzgrVar.zza(), px2Var);
        return zza == ly2.a ? zza : g7c.a;
    }

    public static final Object zzd(int i, int i2, fs4 fs4Var, px2 px2Var) {
        return new zzhf(i, fs4Var, new Integer(i2));
    }

    public static final Object zze(zzhk zzhkVar, int i, fs4 fs4Var, px2 px2Var) {
        return new zzhf(i, fs4Var, null).zza(zzhkVar, px2Var);
    }
}
