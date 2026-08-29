package com.google.android.recaptcha.internal;

import bd.l;
import i7.c7;
import jd.e0;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // uc.a
    public final c create(c cVar) {
        return new zzft(this.zzb, this.zzc, cVar);
    }

    @Override // bd.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzft) create((c) obj)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        c7.b(obj);
        if (i10 == 0) {
            long j10 = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            if (e0.x(j10, zzfsVar, this) == aVar) {
                return aVar;
            }
        }
        return qc.i.a;
    }
}
