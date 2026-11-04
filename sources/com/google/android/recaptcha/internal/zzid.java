package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzid(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzid) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        ib.b(obj);
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
