package com.google.android.recaptcha.internal;

import android.webkit.WebView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzli extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzli(zzly zzlyVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzlyVar;
        this.zzd = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzli(this.zzc, this.zzd, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzli) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        String zza;
        try {
            if (this.zzb != 0) {
                zza = (String) this.zza;
                tue.b(obj);
            } else {
                tue.b(obj);
                zzly zzlyVar = this.zzc;
                zza = zzly.zzm(zzlyVar).zza();
                this.zza = zza;
                this.zzb = 1;
                obj = zzlyVar.zzv(this);
                ly2 ly2Var = ly2.a;
                if (obj == ly2Var) {
                    return ly2Var;
                }
            }
            ((WebView) obj).loadDataWithBaseURL(zza, this.zzd, "text/html", "utf-8", null);
            return g7c.a;
        } catch (Exception e) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e.getMessage(), null, 8, null);
            ((nq2) this.zzc.zzz()).P(zzcgVar);
            throw zzcgVar;
        }
    }
}
