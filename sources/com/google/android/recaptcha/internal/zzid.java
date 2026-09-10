package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;
import zd.c0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
final class zzid extends j implements p {
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzid(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzid) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        u7.b(obj);
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
