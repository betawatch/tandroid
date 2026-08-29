package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.c0;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzid(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzid) create((c0) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        c7.b(obj);
        zzhl zzhlVar = null;
        try {
            try {
                zzhlVar = zzif.zza(this.zza).zza(this.zzb.zzd());
                zzhlVar.zzc();
                zzhlVar.zze(this.zzc.zzd());
                zzyg zzygVar = (zzyg) zzhlVar.zza(zzyg.zzi());
                zzhlVar.zzd();
                return zzygVar;
            } catch (zzcg e10) {
                throw e10;
            } catch (Exception e11) {
                throw new zzcg(zzce.zzc, zzcd.zzF, e11.getMessage(), null, 8, null);
            }
        } catch (Throwable th2) {
            if (zzhlVar != null) {
                zzhlVar.zzd();
            }
            throw th2;
        }
    }
}
