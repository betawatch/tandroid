package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import qc.f;
import uc.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzek extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzeq zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzek(zzeq zzeqVar, sc.c cVar) {
        super(cVar);
        this.zzb = zzeqVar;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        Object zze;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zze = this.zzb.zze(null, 0L, this);
        return zze == tc.a.a ? zze : new f(zze);
    }
}
