package com.google.android.recaptcha.internal;

import b5.a;
import b7.h;
import gd.c;
import org.telegram.tgnet.TLObject;
import zd.b0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class zzif {
    private final c zza;

    public zzif() {
        int i7 = zzby.zza;
        this.zza = a.c(zzie.zza);
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
                jd.a aVar = jd.a.a;
                i7 = zzicVar.zzc;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h.b(obj);
                    return obj;
                }
                h.b(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object e10 = b0.e(zzidVar, zzicVar);
                return e10 == aVar ? aVar : e10;
            }
        }
        zzicVar = new zzic(zzifVar, cVar);
        Object obj2 = zzicVar.zza;
        jd.a aVar2 = jd.a.a;
        i7 = zzicVar.zzc;
        if (i7 == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, id.c cVar) {
        return zzc(this, zzcyVar, zzyeVar, cVar);
    }
}
