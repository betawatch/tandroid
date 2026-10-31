package com.google.android.recaptcha.internal;

import ad.j;
import cd.c;
import dd.a;
import l9.b;
import ld.p;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzhj {
    public static final Object zza(zzhh zzhhVar, p pVar, c cVar) {
        return pVar.invoke(new zzhk(zzhhVar), cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(3:17|18|(1:20))|11|12))|22|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zzb(zzhk zzhkVar, zzhf zzhfVar, c cVar) {
        zzhi zzhiVar;
        int i10;
        if (cVar instanceof zzhi) {
            zzhiVar = (zzhi) cVar;
            int i11 = zzhiVar.zzb;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzhiVar.zzb = i11 - TLObject.FLAG_31;
                Object obj = zzhiVar.zza;
                Object obj2 = a.a;
                i10 = zzhiVar.zzb;
                j jVar = j.a;
                if (i10 != 0) {
                    b.b(obj);
                    zzhiVar.zzb = 1;
                    if (zzhfVar.zza(zzhkVar, zzhiVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                }
                return jVar;
            }
        }
        zzhiVar = new zzhi(cVar);
        Object obj3 = zzhiVar.zza;
        Object obj22 = a.a;
        i10 = zzhiVar.zzb;
        j jVar2 = j.a;
        if (i10 != 0) {
        }
        return jVar2;
    }

    public static final Object zzc(zzgr zzgrVar, zzhg zzhgVar, c cVar) {
        Object zza = zzhgVar.zza(zzgrVar.zza(), cVar);
        return zza == a.a ? zza : j.a;
    }

    public static final Object zzd(int i10, int i11, p pVar, c cVar) {
        return new zzhf(i10, pVar, new Integer(i11));
    }

    public static final Object zze(zzhk zzhkVar, int i10, p pVar, c cVar) {
        return new zzhf(i10, pVar, null).zza(zzhkVar, cVar);
    }
}
