package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzhy(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhy) create((zzgr) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        p7.b(obj);
        try {
            zzib.zza(this.zza).zzc(this.zzb, this.zzc);
            return sc.i.a;
        } catch (Exception e) {
            throw new zzcg(zzce.zzk, zzcd.zzT, e.getMessage(), null, 8, null);
        }
    }
}
