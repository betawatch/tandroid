package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.b0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzax extends j implements p {
    int zza;
    final /* synthetic */ zzba zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzba zzbaVar, c cVar) {
        super(2, cVar);
        this.zzb = zzbaVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzax zzaxVar = new zzax(this.zzb, cVar);
        zzaxVar.zzc = obj;
        return zzaxVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 != 0) {
            return obj;
        }
        zzaw zzawVar = new zzaw((zzhk) this.zzc, this.zzb, null);
        this.zza = 1;
        Object e10 = b0.e(zzawVar, this);
        return e10 == aVar ? aVar : e10;
    }
}
