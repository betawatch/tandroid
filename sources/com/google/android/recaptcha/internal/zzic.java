package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
final class zzic extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzif zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzic(zzif zzifVar, id.c cVar) {
        super(cVar);
        this.zzb = zzifVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        return zzif.zzc(this.zzb, null, null, this);
    }
}
