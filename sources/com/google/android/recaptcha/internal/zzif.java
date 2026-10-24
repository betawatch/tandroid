package com.google.android.recaptcha.internal;

import be.f0;
import id.c;
import id.g;
import ld.a;
import org.telegram.tgnet.TLObject;
import v7.h8;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class zzif {
    private final c zza;

    public zzif() {
        int i10 = zzby.zza;
        this.zza = h8.a(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) ((g) zzifVar.zza).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, kd.c cVar) {
        zzic zzicVar;
        int i10;
        if (cVar instanceof zzic) {
            zzicVar = (zzic) cVar;
            int i11 = zzicVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzicVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzicVar.zza;
                a aVar = a.a;
                i10 = zzicVar.zzc;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                    return obj;
                }
                i8.b(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object f7 = f0.f(zzidVar, zzicVar);
                return f7 == aVar ? aVar : f7;
            }
        }
        zzicVar = new zzic(zzifVar, cVar);
        Object obj2 = zzicVar.zza;
        a aVar2 = a.a;
        i10 = zzicVar.zzc;
        if (i10 == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, kd.c cVar) {
        return zzc(this, zzcyVar, zzyeVar, cVar);
    }
}
