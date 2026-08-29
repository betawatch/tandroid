package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import org.telegram.tgnet.TLObject;
import sc.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        zzcg e10;
        zzgr zzgrVar;
        if (cVar instanceof zzhe) {
            zzheVar = (zzhe) cVar;
            int i11 = zzheVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzheVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzheVar.zza;
                tc.a aVar = tc.a.a;
                i10 = zzheVar.zzc;
                if (i10 != 0) {
                    c7.b(obj);
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
                    } catch (zzcg e11) {
                        e10 = e11;
                        zzgrVar = zzgrVar2;
                        zzgrVar.zzc(e10);
                        throw e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        c7.b(obj);
                    } catch (zzcg e12) {
                        e10 = e12;
                        zzgrVar.zzc(e10);
                        throw e10;
                    }
                }
                zzgrVar.zzb();
                return obj;
            }
        }
        zzheVar = new zzhe(this, cVar);
        Object obj2 = zzheVar.zza;
        tc.a aVar2 = tc.a.a;
        i10 = zzheVar.zzc;
        if (i10 != 0) {
        }
        zzgrVar.zzb();
        return obj2;
    }
}
