package com.google.android.recaptcha.internal;

import android.app.Application;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzdy extends ccb implements eq4 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(Application application, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzdy(this.zzb, this.zzc, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        this.zza = 1;
        Object zzd = zzdz.zzd(application, str, this);
        bx2 bx2Var = bx2.a;
        return zzd == bx2Var ? bx2Var : zzd;
    }
}
