package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.l;
import v7.u7;
import zd.e0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
final class zzft extends j implements l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzgb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(long j3, zzgb zzgbVar, c cVar) {
        super(1, cVar);
        this.zzb = j3;
        this.zzc = zzgbVar;
    }

    @Override // kd.a
    public final c create(c cVar) {
        return new zzft(this.zzb, this.zzc, cVar);
    }

    @Override // rd.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzft) create((c) obj)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        u7.b(obj);
        if (i10 == 0) {
            long j3 = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            if (e0.x(j3, zzfsVar, this) == aVar) {
                return aVar;
            }
        }
        return i.a;
    }
}
