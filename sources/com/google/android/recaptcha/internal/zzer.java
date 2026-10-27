package com.google.android.recaptcha.internal;

import a8.jd;
import ce.c0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzer extends i implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzfp zzfpVar, zzye zzyeVar, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = zzyeVar;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzer(this.zzb, this.zzc, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                jd.b(obj);
            } else {
                jd.b(obj);
                zzfp zzfpVar = this.zzb;
                zzif zzj = zzfp.zzj(zzfpVar);
                zzcy zzg = zzfp.zzg(zzfpVar);
                zzye zzyeVar = this.zzc;
                this.zza = 1;
                obj = zzj.zzb(zzg, zzyeVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzyg) obj;
        } catch (Exception e) {
            throw zzfp.zzd(this.zzb, e);
        }
    }
}
