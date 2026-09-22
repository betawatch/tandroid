package com.google.android.recaptcha.internal;

import android.os.Build;
import gd.i;
import hd.h;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
final class zzau extends j implements p {
    final /* synthetic */ zzav zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzau(zzav zzavVar, c cVar) {
        super(2, cVar);
        this.zza = zzavVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzau(this.zza, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzau) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        t7.b(obj);
        zzav zzavVar = this.zza;
        int i10 = Build.VERSION.SDK_INT;
        zzyu zzf = zzyx.zzf();
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzw(String.valueOf(i10));
        zzf.zze(h.b(zzf2.zzk()));
        return zzas.zzb(zzavVar, (zzyx) zzf.zzk());
    }
}
