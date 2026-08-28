package com.google.android.recaptcha.internal;

import g7.y5;
import hd.f0;
import qc.c;
import rc.a;
import sc.i;
import zc.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(c cVar) {
        return new zzft(this.zzb, this.zzc, cVar);
    }

    @Override // zc.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzft) create((c) obj)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i9 = this.zza;
        y5.b(obj);
        if (i9 == 0) {
            long j10 = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            if (f0.x(j10, zzfsVar, this) == aVar) {
                return aVar;
            }
        }
        return oc.i.a;
    }
}
