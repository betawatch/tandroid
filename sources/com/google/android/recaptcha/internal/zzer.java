package com.google.android.recaptcha.internal;

import g7.y5;
import hd.c0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzer(this.zzb, this.zzc, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                y5.b(obj);
            } else {
                y5.b(obj);
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
        } catch (Exception e10) {
            throw zzfp.zzd(this.zzb, e10);
        }
    }
}
