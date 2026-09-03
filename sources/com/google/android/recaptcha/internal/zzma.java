package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import dd.p;
import k7.p7;
import ld.c0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzma extends i implements p {
    final /* synthetic */ zzmb zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzma(zzmb zzmbVar, Context context, c cVar) {
        super(2, cVar);
        this.zza = zzmbVar;
        this.zzb = context;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzma(this.zza, this.zzb, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzma) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.a;
        p7.b(obj);
        zzmb zzmbVar = this.zza;
        webView = zzmbVar.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        zzmbVar.zza = webView;
        return webView;
    }
}
