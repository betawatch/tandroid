package com.google.android.recaptcha.internal;

import android.app.Application;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzdx extends eeb implements fs4 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(Application application, String str, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzdx(this.zzb, this.zzc, this.zzd, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j = this.zzd;
        this.zza = 1;
        Object zzb = zzdz.zzb(application, str, j, this);
        ly2 ly2Var = ly2.a;
        return zzb == ly2Var ? ly2Var : zzb;
    }
}
