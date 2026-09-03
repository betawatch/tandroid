package com.google.android.recaptcha.internal;

import android.os.Build;
import dd.p;
import k7.q7;
import k7.t7;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzau extends i implements p {
    final /* synthetic */ zzav zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzau(zzav zzavVar, c cVar) {
        super(2, cVar);
        this.zza = zzavVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzau(this.zza, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzau) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        q7.b(obj);
        zzav zzavVar = this.zza;
        int i10 = Build.VERSION.SDK_INT;
        zzyu zzf = zzyx.zzf();
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzw(String.valueOf(i10));
        zzf.zze(t7.a(zzf2.zzk()));
        return zzas.zzb(zzavVar, (zzyx) zzf.zzk());
    }
}
