package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzif {
    private final h26 zza;

    public zzif() {
        int i = zzby.zza;
        this.zza = ure.b(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) zzifVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, zw2 zw2Var) {
        zzic zzicVar;
        int i;
        if (zw2Var instanceof zzic) {
            zzicVar = (zzic) zw2Var;
            int i2 = zzicVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzicVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzicVar.zza;
                i = zzicVar.zzc;
                if (i == 0) {
                    if (i == 1) {
                        ixe.b(obj);
                        return obj;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object b = xde.b(zzidVar, zzicVar);
                vx2 vx2Var = vx2.a;
                return b == vx2Var ? vx2Var : b;
            }
        }
        zzicVar = new zzic(zzifVar, zw2Var);
        Object obj2 = zzicVar.zza;
        i = zzicVar.zzc;
        if (i == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, zw2 zw2Var) {
        return zzc(this, zzcyVar, zzyeVar, zw2Var);
    }
}
