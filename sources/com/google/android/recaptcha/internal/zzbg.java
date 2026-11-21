package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
final class zzbg extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzbo zzb;
    int zzc;
    String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbg(zzbo zzboVar, id.c cVar) {
        super(cVar);
        this.zzb = zzboVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        Object zzm;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zzm = this.zzb.zzm(null, this);
        return zzm;
    }
}
