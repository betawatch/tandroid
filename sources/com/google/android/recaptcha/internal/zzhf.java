package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import org.telegram.tgnet.TLObject;
import uc.c;
import vc.a;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class zzhf {
    private final p zza;
    private final Integer zzb;
    private final int zzc;

    public zzhf(int i10, p pVar, Integer num) {
        this.zzc = i10;
        this.zza = pVar;
        this.zzb = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(zzhk zzhkVar, c cVar) {
        zzhe zzheVar;
        int i10;
        zzcg e6;
        zzgr zzgrVar;
        if (cVar instanceof zzhe) {
            zzheVar = (zzhe) cVar;
            int i11 = zzheVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzheVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzheVar.zza;
                a aVar = a.a;
                i10 = zzheVar.zzc;
                if (i10 != 0) {
                    q7.b(obj);
                    zzgr zzgrVar2 = new zzgr(zzhkVar, this.zzc, this.zzb);
                    try {
                        p pVar = this.zza;
                        zzheVar.zzd = zzgrVar2;
                        zzheVar.zzc = 1;
                        obj = pVar.invoke(zzgrVar2, zzheVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        zzgrVar = zzgrVar2;
                    } catch (zzcg e10) {
                        e6 = e10;
                        zzgrVar = zzgrVar2;
                        zzgrVar.zzc(e6);
                        throw e6;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        q7.b(obj);
                    } catch (zzcg e11) {
                        e6 = e11;
                        zzgrVar.zzc(e6);
                        throw e6;
                    }
                }
                zzgrVar.zzb();
                return obj;
            }
        }
        zzheVar = new zzhe(this, cVar);
        Object obj2 = zzheVar.zza;
        a aVar2 = a.a;
        i10 = zzheVar.zzc;
        if (i10 != 0) {
        }
        zzgrVar.zzb();
        return obj2;
    }
}
