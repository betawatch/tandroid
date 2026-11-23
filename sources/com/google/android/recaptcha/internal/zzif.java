package com.google.android.recaptcha.internal;

import b7.h;
import c8.z;
import gd.c;
import jd.a;
import org.telegram.tgnet.TLObject;
import zd.b0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class zzif {
    private final c zza;

    public zzif() {
        int i7 = zzby.zza;
        this.zza = h.b(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) zzifVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, id.c cVar) {
        zzic zzicVar;
        int i7;
        if (cVar instanceof zzic) {
            zzicVar = (zzic) cVar;
            int i10 = zzicVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzicVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzicVar.zza;
                a aVar = a.a;
                i7 = zzicVar.zzc;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z.b(obj);
                    return obj;
                }
                z.b(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object e10 = b0.e(zzidVar, zzicVar);
                return e10 == aVar ? aVar : e10;
            }
        }
        zzicVar = new zzic(zzifVar, cVar);
        Object obj2 = zzicVar.zza;
        a aVar2 = a.a;
        i7 = zzicVar.zzc;
        if (i7 == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, id.c cVar) {
        return zzc(this, zzcyVar, zzyeVar, cVar);
    }
}
