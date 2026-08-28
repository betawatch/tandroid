package com.google.android.recaptcha.internal;

import g7.y5;
import oc.i;
import org.telegram.tgnet.TLObject;
import qc.c;
import rc.a;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        int i9;
        if (cVar instanceof zzhi) {
            zzhiVar = (zzhi) cVar;
            int i10 = zzhiVar.zzb;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzhiVar.zzb = i10 - TLObject.FLAG_31;
                Object obj = zzhiVar.zza;
                Object obj2 = a.a;
                i9 = zzhiVar.zzb;
                i iVar = i.a;
                if (i9 != 0) {
                    y5.b(obj);
                    zzhiVar.zzb = 1;
                    if (zzhfVar.zza(zzhkVar, zzhiVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                }
                return iVar;
            }
        }
        zzhiVar = new zzhi(cVar);
        Object obj3 = zzhiVar.zza;
        Object obj22 = a.a;
        i9 = zzhiVar.zzb;
        i iVar2 = i.a;
        if (i9 != 0) {
        }
        return iVar2;
    }

    public static final Object zzc(zzgr zzgrVar, zzhg zzhgVar, c cVar) {
        Object zza = zzhgVar.zza(zzgrVar.zza(), cVar);
        return zza == a.a ? zza : i.a;
    }

    public static final Object zzd(int i9, int i10, p pVar, c cVar) {
        return new zzhf(i9, pVar, new Integer(i10));
    }

    public static final Object zze(zzhk zzhkVar, int i9, p pVar, c cVar) {
        return new zzhf(i9, pVar, null).zza(zzhkVar, cVar);
    }
}
