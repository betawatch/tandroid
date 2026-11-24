package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzir extends eeb implements fs4 {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzis zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(String[] strArr, zzis zzisVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zza = strArr;
        this.zzb = zzisVar;
        this.zzc = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzir(this.zza, this.zzb, this.zzc, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzir) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        tue.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzis zzisVar = this.zzb;
        String str2 = this.zzc;
        webView = zzisVar.zza;
        webView.evaluateJavascript(str2 + "(" + km2.f(arrayList, ",", null, null, null, 62) + ")", null);
        return g7c.a;
    }
}
