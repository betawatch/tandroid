package com.google.android.recaptcha.internal;

import g7.x5;
import g7.y5;
import hd.f0;
import oc.c;
import oc.g;
import org.telegram.tgnet.TLObject;
import rc.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzif {
    private final c zza;

    public zzif() {
        int i9 = zzby.zza;
        this.zza = x5.a(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) ((g) zzifVar.zza).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, qc.c cVar) {
        zzic zzicVar;
        int i9;
        if (cVar instanceof zzic) {
            zzicVar = (zzic) cVar;
            int i10 = zzicVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzicVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzicVar.zza;
                a aVar = a.a;
                i9 = zzicVar.zzc;
                if (i9 == 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                    return obj;
                }
                y5.b(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object f10 = f0.f(zzidVar, zzicVar);
                return f10 == aVar ? aVar : f10;
            }
        }
        zzicVar = new zzic(zzifVar, cVar);
        Object obj2 = zzicVar.zza;
        a aVar2 = a.a;
        i9 = zzicVar.zzc;
        if (i9 == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, qc.c cVar) {
        return zzc(this, zzcyVar, zzyeVar, cVar);
    }
}
