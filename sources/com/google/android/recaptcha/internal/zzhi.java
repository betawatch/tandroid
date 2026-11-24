package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzhi extends gw2 {
    /* synthetic */ Object zza;
    int zzb;

    public zzhi(fw2 fw2Var) {
        super(fw2Var);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= TLObject.FLAG_31;
        return zzhj.zzb(null, null, this);
    }
}
