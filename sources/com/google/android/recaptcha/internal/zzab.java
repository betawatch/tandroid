package com.google.android.recaptcha.internal;

import b7.h;
import gd.e;
import gd.k;
import hd.r;
import id.c;
import jd.a;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        a aVar = a.a;
        h.b(obj);
        zzxp zzxpVar = this.zza;
        if (zzxpVar.zzl().length() != 0) {
            zzad.zzb(this.zzb).zzb(r.c(new e("_GRECAPTCHA_KC", zzxpVar.zzl())));
            return k.a;
        }
        this.zzb.zzj(false);
        throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
    }
}
