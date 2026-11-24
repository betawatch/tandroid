package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzif {
    private final d06 zza;

    public zzif() {
        int i = zzby.zza;
        this.zza = cne.b(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) zzifVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, fw2 fw2Var) {
        zzic zzicVar;
        int i;
        if (fw2Var instanceof zzic) {
            zzicVar = (zzic) fw2Var;
            int i2 = zzicVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzicVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzicVar.zza;
                i = zzicVar.zzc;
                if (i == 0) {
                    if (i == 1) {
                        qse.b(obj);
                        return obj;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object b = h9e.b(zzidVar, zzicVar);
                bx2 bx2Var = bx2.a;
                return b == bx2Var ? bx2Var : b;
            }
        }
        zzicVar = new zzic(zzifVar, fw2Var);
        Object obj2 = zzicVar.zza;
        i = zzicVar.zzc;
        if (i == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, fw2 fw2Var) {
        return zzc(this, zzcyVar, zzyeVar, fw2Var);
    }
}
