package com.google.android.recaptcha.internal;

import ad.c;
import ad.h;
import ib.a;
import l9.b;
import org.telegram.tgnet.TLObject;
import td.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzif {
    private final c zza;

    public zzif() {
        int i10 = zzby.zza;
        this.zza = a.a(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) ((h) zzifVar.zza).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, cd.c cVar) {
        zzic zzicVar;
        int i10;
        if (cVar instanceof zzic) {
            zzicVar = (zzic) cVar;
            int i11 = zzicVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzicVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzicVar.zza;
                dd.a aVar = dd.a.a;
                i10 = zzicVar.zzc;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                    return obj;
                }
                b.b(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object f7 = e0.f(zzidVar, zzicVar);
                return f7 == aVar ? aVar : f7;
            }
        }
        zzicVar = new zzic(zzifVar, cVar);
        Object obj2 = zzicVar.zza;
        dd.a aVar2 = dd.a.a;
        i10 = zzicVar.zzc;
        if (i10 == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, cd.c cVar) {
        return zzc(this, zzcyVar, zzyeVar, cVar);
    }
}
