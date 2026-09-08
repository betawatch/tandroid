package com.google.android.recaptcha.internal;

import id.c;
import jd.a;
import org.telegram.tgnet.TLObject;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        zzcg e7;
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
                    t7.b(obj);
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
                        e7 = e10;
                        zzgrVar = zzgrVar2;
                        zzgrVar.zzc(e7);
                        throw e7;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        t7.b(obj);
                    } catch (zzcg e11) {
                        e7 = e11;
                        zzgrVar.zzc(e7);
                        throw e7;
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
