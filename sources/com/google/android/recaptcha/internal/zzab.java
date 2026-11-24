package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzab extends ccb implements eq4 {
    final /* synthetic */ zzxp zza;
    final /* synthetic */ zzad zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzxp zzxpVar, zzad zzadVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zza = zzxpVar;
        this.zzb = zzadVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzab(this.zza, this.zzb, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzab) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        qse.b(obj);
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
        return g5c.a;
    }
}
