package com.google.android.recaptcha.internal;

import af.b;
import gd.e;
import gd.k;
import hd.r;
import id.c;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzab extends j implements p {
    final /* synthetic */ zzxp zza;
    final /* synthetic */ zzad zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzxp zzxpVar, zzad zzadVar, c cVar) {
        super(2, cVar);
        this.zza = zzxpVar;
        this.zzb = zzadVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzab(this.zza, this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzab) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        b.c(obj);
        zzxp zzxpVar = this.zza;
        if (zzxpVar.zzl().length() != 0) {
            zzad.zzb(this.zzb).zzb(r.c(new e("_GRECAPTCHA_KC", zzxpVar.zzl())));
            return k.a;
        }
        this.zzb.zzj(false);
        throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
    }
}
