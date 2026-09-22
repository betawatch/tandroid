package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
final class zzer extends j implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzfp zzfpVar, zzye zzyeVar, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = zzyeVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzer(this.zzb, this.zzc, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                t7.b(obj);
            } else {
                t7.b(obj);
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
