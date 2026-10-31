package com.google.android.recaptcha.internal;

import ed.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
