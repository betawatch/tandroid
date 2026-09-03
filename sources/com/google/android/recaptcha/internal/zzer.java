package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import ld.c0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzer(this.zzb, this.zzc, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                q7.b(obj);
            } else {
                q7.b(obj);
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
        } catch (Exception e6) {
            throw zzfp.zzd(this.zzb, e6);
        }
    }
}
