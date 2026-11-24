package com.google.android.recaptcha.internal;

import java.util.Timer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzgv extends ccb implements eq4 {
    final /* synthetic */ zzgz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgv(zzgz zzgzVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zza = zzgzVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzgv(this.zza, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgv) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        Timer timer;
        qse.b(obj);
        zzgz zzgzVar = this.zza;
        synchronized (zzgs.class) {
            zzgoVar = zzgzVar.zzc;
            if (zzgoVar != null && zzgoVar.zzb() == 0) {
                timer = zzgz.zza;
                if (timer != null) {
                    timer.cancel();
                }
                zzgz.zza = null;
            }
            zzgzVar.zzf();
        }
        return g5c.a;
    }
}
