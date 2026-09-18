package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
final class zzhi extends c {
    /* synthetic */ Object zza;
    int zzb;

    public zzhi(id.c cVar) {
        super(cVar);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= TLObject.FLAG_31;
        return zzhj.zzb(null, null, this);
    }
}
