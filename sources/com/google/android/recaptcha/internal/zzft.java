package com.google.android.recaptcha.internal;

import be.f0;
import kd.c;
import ld.a;
import md.i;
import td.l;
import v7.i8;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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

    @Override // md.a
    public final c create(c cVar) {
        return new zzft(this.zzb, this.zzc, cVar);
    }

    @Override // td.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzft) create((c) obj)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        i8.b(obj);
        if (i10 == 0) {
            long j10 = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            if (f0.x(j10, zzfsVar, this) == aVar) {
                return aVar;
            }
        }
        return id.i.a;
    }
}
