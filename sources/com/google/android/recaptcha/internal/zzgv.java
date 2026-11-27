package com.google.android.recaptcha.internal;

import java.util.Timer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzgv extends yfb implements is4 {
    final /* synthetic */ zzgz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgv(zzgz zzgzVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = zzgzVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzgv(this.zza, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgv) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        Timer timer;
        ixe.b(obj);
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
        return g9c.a;
    }
}
