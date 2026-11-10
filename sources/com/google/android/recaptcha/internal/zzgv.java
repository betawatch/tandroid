package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import java.util.Timer;
import kd.j;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class zzgv extends j implements p {
    final /* synthetic */ zzgz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgv(zzgz zzgzVar, c cVar) {
        super(2, cVar);
        this.zza = zzgzVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzgv(this.zza, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgv) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        Timer timer;
        jd.a aVar = jd.a.a;
        b.c(obj);
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
        return k.a;
    }
}
