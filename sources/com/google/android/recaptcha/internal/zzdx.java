package com.google.android.recaptcha.internal;

import android.app.Application;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzdx extends yfb implements is4 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(Application application, String str, long j, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzdx(this.zzb, this.zzc, this.zzd, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j = this.zzd;
        this.zza = 1;
        Object zzb = zzdz.zzb(application, str, j, this);
        vx2 vx2Var = vx2.a;
        return zzb == vx2Var ? vx2Var : zzb;
    }
}
