package com.google.android.recaptcha.internal;

import ed.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
final class zzhi extends c {
    /* synthetic */ Object zza;
    int zzb;

    public zzhi(cd.c cVar) {
        super(cVar);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= TLObject.FLAG_31;
        return zzhj.zzb(null, null, this);
    }
}
