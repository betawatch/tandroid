package com.google.android.recaptcha.internal;

import android.os.Build;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzau extends ccb implements eq4 {
    final /* synthetic */ zzav zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzau(zzav zzavVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zza = zzavVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzau(this.zza, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzau) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        qse.b(obj);
        zzav zzavVar = this.zza;
        int i = Build.VERSION.SDK_INT;
        zzyu zzf = zzyx.zzf();
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzw(String.valueOf(i));
        zzf.zze(zk2.a(zzf2.zzk()));
        return zzas.zzb(zzavVar, (zzyx) zzf.zzk());
    }
}
