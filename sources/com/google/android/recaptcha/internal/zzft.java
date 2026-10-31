package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.l;
import td.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzft extends j implements l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzgb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(long j10, zzgb zzgbVar, c cVar) {
        super(1, cVar);
        this.zzb = j10;
        this.zzc = zzgbVar;
    }

    @Override // ed.a
    public final c create(c cVar) {
        return new zzft(this.zzb, this.zzc, cVar);
    }

    @Override // ld.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzft) create((c) obj)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
        if (i10 == 0) {
            long j10 = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            if (e0.x(j10, zzfsVar, this) == aVar) {
                return aVar;
            }
        }
        return ad.j.a;
    }
}
