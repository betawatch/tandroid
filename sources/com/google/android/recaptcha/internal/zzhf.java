package com.google.android.recaptcha.internal;

import b8.ib;
import fd.c;
import od.p;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzhf {
    private final p zza;
    private final Integer zzb;
    private final int zzc;

    public zzhf(int i3, p pVar, Integer num) {
        this.zzc = i3;
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
        int i3;
        zzcg e10;
        zzgr zzgrVar;
        if (cVar instanceof zzhe) {
            zzheVar = (zzhe) cVar;
            int i10 = zzheVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzheVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzheVar.zza;
                gd.a aVar = gd.a.a;
                i3 = zzheVar.zzc;
                if (i3 != 0) {
                    ib.b(obj);
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
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        ib.b(obj);
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
        gd.a aVar2 = gd.a.a;
        i3 = zzheVar.zzc;
        if (i3 != 0) {
        }
        zzgrVar.zzb();
        return obj2;
    }
}
