package com.google.android.recaptcha.internal;

import af.b;
import android.os.Build;
import c8.d0;
import gd.k;
import id.c;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzv extends j implements p {
    final /* synthetic */ zzx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(zzx zzxVar, c cVar) {
        super(2, cVar);
        this.zza = zzxVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzv(this.zza, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzv) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        b.c(obj);
        zzx zzxVar = this.zza;
        String zza = zzbs.zza(zzx.zzb(zzxVar));
        if (zza.length() == 0) {
            if (Build.VERSION.SDK_INT > 34) {
                throw new zzcg(zzce.zzb, zzcd.zzaE, null, null, 12, null);
            }
            throw new zzcg(zzce.zzb, zzcd.zzaF, null, null, 12, null);
        }
        zzyu zzf = zzyx.zzf();
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzw(zza);
        zzf.zze(d0.a(zzf2.zzk()));
        return zzas.zzb(zzxVar, (zzyx) zzf.zzk());
    }
}
