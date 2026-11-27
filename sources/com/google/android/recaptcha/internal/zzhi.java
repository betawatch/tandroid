package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzhi extends ax2 {
    /* synthetic */ Object zza;
    int zzb;

    public zzhi(zw2 zw2Var) {
        super(zw2Var);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= TLObject.FLAG_31;
        return zzhj.zzb(null, null, this);
    }
}
