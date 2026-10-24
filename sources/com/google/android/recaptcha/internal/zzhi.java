package com.google.android.recaptcha.internal;

import md.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
final class zzhi extends c {
    /* synthetic */ Object zza;
    int zzb;

    public zzhi(kd.c cVar) {
        super(cVar);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= TLObject.FLAG_31;
        return zzhj.zzb(null, null, this);
    }
}
