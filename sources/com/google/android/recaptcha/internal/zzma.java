package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;
import zd.c0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
final class zzma extends j implements p {
    final /* synthetic */ zzmb zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzma(zzmb zzmbVar, Context context, c cVar) {
        super(2, cVar);
        this.zza = zzmbVar;
        this.zzb = context;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzma(this.zza, this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzma) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.a;
        u7.b(obj);
        zzmb zzmbVar = this.zza;
        webView = zzmbVar.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        zzmbVar.zza = webView;
        return webView;
    }
}
