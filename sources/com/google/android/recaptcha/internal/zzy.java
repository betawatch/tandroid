package com.google.android.recaptcha.internal;

import android.os.Build;
import gd.i;
import hd.f;
import hd.h;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
final class zzy extends j implements p {
    final /* synthetic */ zzz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzz zzzVar, c cVar) {
        super(2, cVar);
        this.zza = zzzVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzy(this.zza, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzy) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        t7.b(obj);
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
        long j3 = Build.TIME;
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzv(j3);
        zzf.zze(h.c(zzb, zzb2, zzb3, zzb4, zzb5, zzb6, zzb7, zzb8, zzb9, (zzyw) zzf2.zzk(), zzz.zzb(zzzVar, Build.ID), zzz.zzb(zzzVar, Build.BOOTLOADER), zzz.zzb(zzzVar, Build.DISPLAY), zzz.zzb(zzzVar, Build.TYPE), zzz.zzb(zzzVar, Build.TAGS)));
        return zzas.zzb(zzzVar, (zzyx) zzf.zzk());
    }
}
