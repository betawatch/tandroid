package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import java.util.Timer;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;
import zd.c0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        return ((zzgv) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        Timer timer;
        a aVar = a.a;
        u7.b(obj);
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
        return i.a;
    }
}
