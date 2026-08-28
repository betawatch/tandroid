package com.google.android.recaptcha.internal;

import g7.y5;
import org.telegram.tgnet.TLObject;
import qc.c;
import rc.a;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzhf {
    private final p zza;
    private final Integer zzb;
    private final int zzc;

    public zzhf(int i9, p pVar, Integer num) {
        this.zzc = i9;
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
        int i9;
        zzcg e10;
        zzgr zzgrVar;
        if (cVar instanceof zzhe) {
            zzheVar = (zzhe) cVar;
            int i10 = zzheVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzheVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzheVar.zza;
                a aVar = a.a;
                i9 = zzheVar.zzc;
                if (i9 != 0) {
                    y5.b(obj);
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
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        y5.b(obj);
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
        a aVar2 = a.a;
        i9 = zzheVar.zzc;
        if (i9 != 0) {
        }
        zzgrVar.zzb();
        return obj2;
    }
}
