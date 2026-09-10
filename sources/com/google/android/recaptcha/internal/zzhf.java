package com.google.android.recaptcha.internal;

import id.c;
import jd.a;
import org.telegram.tgnet.TLObject;
import rd.p;
import v7.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        zzcg e;
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
                    u7.b(obj);
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
                    } catch (zzcg e7) {
                        e = e7;
                        zzgrVar = zzgrVar2;
                        zzgrVar.zzc(e);
                        throw e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        u7.b(obj);
                    } catch (zzcg e10) {
                        e = e10;
                        zzgrVar.zzc(e);
                        throw e;
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
