package com.google.android.recaptcha.internal;

import b8.hb;
import b8.ib;
import dd.c;
import org.telegram.tgnet.TLObject;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzif {
    private final c zza;

    public zzif() {
        int i3 = zzby.zza;
        this.zza = hb.b(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) zzifVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, fd.c cVar) {
        zzic zzicVar;
        int i3;
        if (cVar instanceof zzic) {
            zzicVar = (zzic) cVar;
            int i10 = zzicVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzicVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzicVar.zza;
                gd.a aVar = gd.a.a;
                i3 = zzicVar.zzc;
                if (i3 == 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    return obj;
                }
                ib.b(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object e10 = b0.e(zzidVar, zzicVar);
                return e10 == aVar ? aVar : e10;
            }
        }
        zzicVar = new zzic(zzifVar, cVar);
        Object obj2 = zzicVar.zza;
        gd.a aVar2 = gd.a.a;
        i3 = zzicVar.zzc;
        if (i3 == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, fd.c cVar) {
        return zzc(this, zzcyVar, zzyeVar, cVar);
    }
}
