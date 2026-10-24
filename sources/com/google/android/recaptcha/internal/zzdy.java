package com.google.android.recaptcha.internal;

import android.app.Application;
import be.c0;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
final class zzdy extends i implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(Application application, String str, c cVar) {
        super(2, cVar);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzdy(this.zzb, this.zzc, cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((c0) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        i8.b(obj);
        if (i10 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        this.zza = 1;
        Object zzd = zzdz.zzd(application, str, this);
        return zzd == aVar ? aVar : zzd;
    }
}
