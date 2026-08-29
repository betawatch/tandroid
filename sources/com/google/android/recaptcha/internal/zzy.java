package com.google.android.recaptcha.internal;

import android.os.Build;
import bd.p;
import i7.c7;
import rc.f;
import rc.h;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzy extends i implements p {
    final /* synthetic */ zzz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzz zzzVar, c cVar) {
        super(2, cVar);
        this.zza = zzzVar;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzy(this.zza, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzy) create((zzhk) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        c7.b(obj);
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
        zzyw zzb9 = zzz.zzb(zzzVar, f.f(Build.SUPPORTED_ABIS));
        long j10 = Build.TIME;
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzv(j10);
        zzf.zze(h.c(zzb, zzb2, zzb3, zzb4, zzb5, zzb6, zzb7, zzb8, zzb9, (zzyw) zzf2.zzk(), zzz.zzb(zzzVar, Build.ID), zzz.zzb(zzzVar, Build.BOOTLOADER), zzz.zzb(zzzVar, Build.DISPLAY), zzz.zzb(zzzVar, Build.TYPE), zzz.zzb(zzzVar, Build.TAGS)));
        return zzas.zzb(zzzVar, (zzyx) zzf.zzk());
    }
}
