package com.google.android.recaptcha.internal;

import a8.jd;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzhy extends i implements p {
    final /* synthetic */ zzib zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhy(zzib zzibVar, String str, String str2, c cVar) {
        super(2, cVar);
        this.zza = zzibVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzhy(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhy) create((zzgr) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        jd.b(obj);
        try {
            zzib.zza(this.zza).zzc(this.zzb, this.zzc);
            return jd.i.a;
        } catch (Exception e) {
            throw new zzcg(zzce.zzk, zzcd.zzT, e.getMessage(), null, 8, null);
        }
    }
}
