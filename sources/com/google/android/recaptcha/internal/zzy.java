package com.google.android.recaptcha.internal;

import android.os.Build;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzy extends yfb implements is4 {
    final /* synthetic */ zzz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzz zzzVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = zzzVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzy(this.zza, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzy) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        zzyu zzf = zzyx.zzf();
        zzz zzzVar = this.zza;
        zzyw zzb = zzz.zzb(zzzVar, Build.MANUFACTURER);
        zzyw zzb2 = zzz.zzb(zzzVar, Build.MODEL);
        zzyw zzb3 = zzz.zzb(zzzVar, Build.DEVICE);
        zzyw zzb4 = zzz.zzb(zzzVar, Build.HARDWARE);
        zzyw zzb5 = zzz.zzb(zzzVar, Build.FINGERPRINT);
        zzyw zzb6 = zzz.zzb(zzzVar, Build.PRODUCT);
        zzyw zzb7 = zzz.zzb(zzzVar, Build.BOARD);
        zzyw zzb8 = zzz.zzb(zzzVar, Build.BRAND);
        zzyw zzb9 = zzz.zzb(zzzVar, ts.f(Build.SUPPORTED_ABIS));
        long j = Build.TIME;
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzv(j);
        zzf.zze(tl2.b(zzb, zzb2, zzb3, zzb4, zzb5, zzb6, zzb7, zzb8, zzb9, (zzyw) zzf2.zzk(), zzz.zzb(zzzVar, Build.ID), zzz.zzb(zzzVar, Build.BOOTLOADER), zzz.zzb(zzzVar, Build.DISPLAY), zzz.zzb(zzzVar, Build.TYPE), zzz.zzb(zzzVar, Build.TAGS)));
        return zzas.zzb(zzzVar, (zzyx) zzf.zzk());
    }
}
