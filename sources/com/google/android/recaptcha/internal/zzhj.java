package com.google.android.recaptcha.internal;

import b7.h;
import gd.k;
import id.c;
import jd.a;
import org.telegram.tgnet.TLObject;
import rd.p;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int i7;
        if (cVar instanceof zzhi) {
            zzhiVar = (zzhi) cVar;
            int i10 = zzhiVar.zzb;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzhiVar.zzb = i10 - TLObject.FLAG_31;
                Object obj = zzhiVar.zza;
                Object obj2 = a.a;
                i7 = zzhiVar.zzb;
                k kVar = k.a;
                if (i7 != 0) {
                    h.b(obj);
                    zzhiVar.zzb = 1;
                    if (zzhfVar.zza(zzhkVar, zzhiVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h.b(obj);
                }
                return kVar;
            }
        }
        zzhiVar = new zzhi(cVar);
        Object obj3 = zzhiVar.zza;
        Object obj22 = a.a;
        i7 = zzhiVar.zzb;
        k kVar2 = k.a;
        if (i7 != 0) {
        }
        return kVar2;
    }

    public static final Object zzc(zzgr zzgrVar, zzhg zzhgVar, c cVar) {
        Object zza = zzhgVar.zza(zzgrVar.zza(), cVar);
        return zza == a.a ? zza : k.a;
    }

    public static final Object zzd(int i7, int i10, p pVar, c cVar) {
        return new zzhf(i7, pVar, new Integer(i10));
    }

    public static final Object zze(zzhk zzhkVar, int i7, p pVar, c cVar) {
        return new zzhf(i7, pVar, null).zza(zzhkVar, cVar);
    }
}
