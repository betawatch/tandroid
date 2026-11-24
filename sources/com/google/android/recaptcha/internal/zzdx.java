package com.google.android.recaptcha.internal;

import android.app.Application;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzdx extends ccb implements eq4 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(Application application, String str, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzdx(this.zzb, this.zzc, this.zzd, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
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
        long j = this.zzd;
        this.zza = 1;
        Object zzb = zzdz.zzb(application, str, j, this);
        bx2 bx2Var = bx2.a;
        return zzb == bx2Var ? bx2Var : zzb;
    }
}
