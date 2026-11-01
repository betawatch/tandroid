package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import java.util.Timer;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
final class zzgv extends j implements p {
    final /* synthetic */ zzgz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgv(zzgz zzgzVar, c cVar) {
        super(2, cVar);
        this.zza = zzgzVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzgv(this.zza, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgv) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        Timer timer;
        a aVar = a.a;
        b.b(obj);
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
        return ad.j.a;
    }
}
