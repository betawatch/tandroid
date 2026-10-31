package com.google.android.recaptcha.internal;

import android.os.Build;
import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzau extends j implements p {
    final /* synthetic */ zzav zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzau(zzav zzavVar, c cVar) {
        super(2, cVar);
        this.zza = zzavVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzau(this.zza, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzau) create((zzhk) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        b.b(obj);
        zzav zzavVar = this.zza;
        int i10 = Build.VERSION.SDK_INT;
        zzyu zzf = zzyx.zzf();
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzw(String.valueOf(i10));
        zzf.zze(bd.j.b(zzf2.zzk()));
        return zzas.zzb(zzavVar, (zzyx) zzf.zzk());
    }
}
