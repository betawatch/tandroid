package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzeg extends j implements p {
    final /* synthetic */ zzeq zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzeq zzeqVar, String str, c cVar) {
        super(2, cVar);
        this.zza = zzeqVar;
        this.zzb = str;
    }

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzeg(this.zza, this.zzb, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeg) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        ib.b(obj);
        zzeq zzeqVar = this.zza;
        if (kotlin.jvm.internal.j.a(zzeqVar.zzc(), this.zzb)) {
            return zzeqVar;
        }
        throw new zzcg(zzce.zzd, zzcd.zzam, null, null, 12, null);
    }
}
