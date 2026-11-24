package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzma extends ccb implements eq4 {
    final /* synthetic */ zzmb zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzma(zzmb zzmbVar, Context context, fw2 fw2Var) {
        super(2, fw2Var);
        this.zza = zzmbVar;
        this.zzb = context;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzma(this.zza, this.zzb, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzma) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        qse.b(obj);
        zzmb zzmbVar = this.zza;
        webView = zzmbVar.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        zzmbVar.zza = webView;
        return webView;
    }
}
