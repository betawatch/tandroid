package com.google.android.recaptcha.internal;

import be.f0;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
final class zzes extends i implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzfp zzfpVar, zzye zzyeVar, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = zzyeVar;
    }

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzes(this.zzb, this.zzc, cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) create((zzgr) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        i8.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzer zzerVar = new zzer(this.zzb, this.zzc, null);
        this.zza = 1;
        Object f7 = f0.f(zzerVar, this);
        return f7 == aVar ? aVar : f7;
    }
}
