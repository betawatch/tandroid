package com.google.android.recaptcha.internal;

import a8.jd;
import ce.c0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzid(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzid) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        jd.b(obj);
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
            } catch (Exception e10) {
                throw new zzcg(zzce.zzc, zzcd.zzF, e10.getMessage(), null, 8, null);
            }
        } catch (Throwable th2) {
            if (zzhlVar != null) {
                zzhlVar.zzd();
            }
            throw th2;
        }
    }
}
