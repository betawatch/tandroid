package com.google.android.recaptcha.internal;

import a8.id;
import a8.jd;
import ce.f0;
import jd.c;
import jd.g;
import md.a;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class zzif {
    private final c zza;

    public zzif() {
        int i10 = zzby.zza;
        this.zza = id.a(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) ((g) zzifVar.zza).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, ld.c cVar) {
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
                    jd.b(obj);
                    return obj;
                }
                jd.b(obj);
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

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, ld.c cVar) {
        return zzc(this, zzcyVar, zzyeVar, cVar);
    }
}
