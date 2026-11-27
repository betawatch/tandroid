package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzab extends yfb implements is4 {
    final /* synthetic */ zzxp zza;
    final /* synthetic */ zzad zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzxp zzxpVar, zzad zzadVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = zzxpVar;
        this.zzb = zzadVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzab(this.zza, this.zzb, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzab) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        zzxp zzxpVar = this.zza;
        int length = zzxpVar.zzl().length();
        zzad zzadVar = this.zzb;
        if (length == 0) {
            zzadVar.zzj(false);
            throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
        }
        zzci zzb = zzad.zzb(zzadVar);
        Map singletonMap = Collections.singletonMap("_GRECAPTCHA_KC", zzxpVar.zzl());
        singletonMap.getClass();
        zzb.zzb(singletonMap);
        return f9c.a;
    }
}
