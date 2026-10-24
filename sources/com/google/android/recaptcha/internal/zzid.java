package com.google.android.recaptcha.internal;

import be.c0;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
final class zzid extends i implements p {
    final /* synthetic */ zzif zza;
    final /* synthetic */ zzcy zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzid(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, c cVar) {
        super(2, cVar);
        this.zza = zzifVar;
        this.zzb = zzcyVar;
        this.zzc = zzyeVar;
    }

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzid(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzid) create((c0) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        i8.b(obj);
        zzhl zzhlVar = null;
        try {
            try {
                zzhlVar = zzif.zza(this.zza).zza(this.zzb.zzd());
                zzhlVar.zzc();
                zzhlVar.zze(this.zzc.zzd());
                zzyg zzygVar = (zzyg) zzhlVar.zza(zzyg.zzi());
                zzhlVar.zzd();
                return zzygVar;
            } catch (zzcg e) {
                throw e;
            } catch (Exception e7) {
                throw new zzcg(zzce.zzc, zzcd.zzF, e7.getMessage(), null, 8, null);
            }
        } catch (Throwable th2) {
            if (zzhlVar != null) {
                zzhlVar.zzd();
            }
            throw th2;
        }
    }
}
