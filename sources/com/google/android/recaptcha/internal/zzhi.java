package com.google.android.recaptcha.internal;

import nd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzhi extends c {
    /* synthetic */ Object zza;
    int zzb;

    public zzhi(ld.c cVar) {
        super(cVar);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= TLObject.FLAG_31;
        return zzhj.zzb(null, null, this);
    }
}
