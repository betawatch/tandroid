package com.google.android.recaptcha.internal;

import java.util.Timer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzgv extends eeb implements fs4 {
    final /* synthetic */ zzgz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgv(zzgz zzgzVar, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzgzVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzgv(this.zza, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgv) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        Timer timer;
        tue.b(obj);
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
        return g7c.a;
    }
}
