package com.google.android.recaptcha.internal;

import g7.y5;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzeg extends i implements p {
    final /* synthetic */ zzeq zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzeq zzeqVar, String str, c cVar) {
        super(2, cVar);
        this.zza = zzeqVar;
        this.zzb = str;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzeg(this.zza, this.zzb, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeg) create((zzgr) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        y5.b(obj);
        zzeq zzeqVar = this.zza;
        if (kotlin.jvm.internal.i.a(zzeqVar.zzc(), this.zzb)) {
            return zzeqVar;
        }
        throw new zzcg(zzce.zzd, zzcd.zzam, null, null, 12, null);
    }
}
