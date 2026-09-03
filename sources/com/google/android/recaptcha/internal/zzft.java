package com.google.android.recaptcha.internal;

import dd.l;
import k7.p7;
import ld.e0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzft extends i implements l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzgb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(long j10, zzgb zzgbVar, c cVar) {
        super(1, cVar);
        this.zzb = j10;
        this.zzc = zzgbVar;
    }

    @Override // wc.a
    public final c create(c cVar) {
        return new zzft(this.zzb, this.zzc, cVar);
    }

    @Override // dd.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzft) create((c) obj)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        p7.b(obj);
        if (i10 == 0) {
            long j10 = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            if (e0.x(j10, zzfsVar, this) == aVar) {
                return aVar;
            }
        }
        return sc.i.a;
    }
}
