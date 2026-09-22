package com.google.android.recaptcha.internal;

import android.os.Build;
import gd.i;
import hd.h;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        return ((zzv) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        u7.b(obj);
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
        zzf.zze(h.b(zzf2.zzk()));
        return zzas.zzb(zzxVar, (zzyx) zzf.zzk());
    }
}
