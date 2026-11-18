package com.google.android.recaptcha.internal;

import b7.h;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.l;
import zd.b0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        return ((zzft) create((c) obj)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i7 = this.zza;
        h.b(obj);
        if (i7 == 0) {
            long j3 = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            if (b0.z(j3, zzfsVar, this) == aVar) {
                return aVar;
            }
        }
        return k.a;
    }
}
