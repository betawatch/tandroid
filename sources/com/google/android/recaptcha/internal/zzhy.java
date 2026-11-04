package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzhy extends j implements p {
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzhy(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhy) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        ib.b(obj);
        try {
            zzib.zza(this.zza).zzc(this.zzb, this.zzc);
            return k.a;
        } catch (Exception e10) {
            throw new zzcg(zzce.zzk, zzcd.zzT, e10.getMessage(), null, 8, null);
        }
    }
}
