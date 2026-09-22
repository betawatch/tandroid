package com.google.android.recaptcha.internal;

import gd.f;
import jd.a;
import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
final class zzek extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzeq zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzek(zzeq zzeqVar, id.c cVar) {
        super(cVar);
        this.zzb = zzeqVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        Object zze;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zze = this.zzb.zze(null, 0L, this);
        return zze == a.a ? zze : new f(zze);
    }
}
