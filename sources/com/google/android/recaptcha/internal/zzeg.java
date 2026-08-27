package com.google.android.recaptcha.internal;

import ad.p;
import h7.k6;
import kotlin.jvm.internal.j;
import rc.c;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        return new zzeg(this.zza, this.zzb, cVar);
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeg) create((zzgr) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.a;
        k6.b(obj);
        zzeq zzeqVar = this.zza;
        if (j.a(zzeqVar.zzc(), this.zzb)) {
            return zzeqVar;
        }
        throw new zzcg(zzce.zzd, zzcd.zzam, null, null, 12, null);
    }
}
