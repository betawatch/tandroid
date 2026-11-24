package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzma extends eeb implements fs4 {
    final /* synthetic */ zzmb zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzma(zzmb zzmbVar, Context context, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzmbVar;
        this.zzb = context;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzma(this.zza, this.zzb, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzma) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        tue.b(obj);
        zzmb zzmbVar = this.zza;
        webView = zzmbVar.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        zzmbVar.zza = webView;
        return webView;
    }
}
