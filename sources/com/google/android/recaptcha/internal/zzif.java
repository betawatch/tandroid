package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzif {
    private final d26 zza;

    public zzif() {
        int i = zzby.zza;
        this.zza = fpe.b(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) zzifVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, px2 px2Var) {
        zzic zzicVar;
        int i;
        if (px2Var instanceof zzic) {
            zzicVar = (zzic) px2Var;
            int i2 = zzicVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzicVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzicVar.zza;
                i = zzicVar.zzc;
                if (i == 0) {
                    if (i == 1) {
                        tue.b(obj);
                        return obj;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object b = ibe.b(zzidVar, zzicVar);
                ly2 ly2Var = ly2.a;
                return b == ly2Var ? ly2Var : b;
            }
        }
        zzicVar = new zzic(zzifVar, px2Var);
        Object obj2 = zzicVar.zza;
        i = zzicVar.zzc;
        if (i == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, px2 px2Var) {
        return zzc(this, zzcyVar, zzyeVar, px2Var);
    }
}
