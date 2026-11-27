package com.google.android.recaptcha.internal;

import android.app.Application;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzdy extends yfb implements is4 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(Application application, String str, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzdy(this.zzb, this.zzc, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
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
        this.zza = 1;
        Object zzd = zzdz.zzd(application, str, this);
        vx2 vx2Var = vx2.a;
        return zzd == vx2Var ? vx2Var : zzd;
    }
}
