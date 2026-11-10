package com.google.android.recaptcha.internal;

import af.b;
import id.c;
import org.telegram.tgnet.TLObject;
import rd.p;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class zzhf {
    private final p zza;
    private final Integer zzb;
    private final int zzc;

    public zzhf(int i7, p pVar, Integer num) {
        this.zzc = i7;
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
        int i7;
        zzcg e10;
        zzgr zzgrVar;
        if (cVar instanceof zzhe) {
            zzheVar = (zzhe) cVar;
            int i10 = zzheVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzheVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzheVar.zza;
                jd.a aVar = jd.a.a;
                i7 = zzheVar.zzc;
                if (i7 != 0) {
                    b.c(obj);
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
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        b.c(obj);
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
        jd.a aVar2 = jd.a.a;
        i7 = zzheVar.zzc;
        if (i7 != 0) {
        }
        zzgrVar.zzb();
        return obj2;
    }
}
