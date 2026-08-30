package com.google.android.recaptcha.internal;

import dd.p;
import java.util.Timer;
import k7.p7;
import ld.c0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class zzgv extends i implements p {
    final /* synthetic */ zzgz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgv(zzgz zzgzVar, c cVar) {
        super(2, cVar);
        this.zza = zzgzVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzgv(this.zza, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgv) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        Timer timer;
        a aVar = a.a;
        p7.b(obj);
        zzgz zzgzVar = this.zza;
        synchronized (zzgs.class) {
            try {
                zzgoVar = zzgzVar.zzc;
                if (zzgoVar != null && zzgoVar.zzb() == 0) {
                    timer = zzgz.zza;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzgz.zza = null;
                }
                zzgzVar.zzf();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sc.i.a;
    }
}
