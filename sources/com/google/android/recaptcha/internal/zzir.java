package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import bd.i;
import cd.c;
import dd.a;
import ed.j;
import java.util.ArrayList;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzir extends j implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzis zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(String[] strArr, zzis zzisVar, String str, c cVar) {
        super(2, cVar);
        this.zza = strArr;
        this.zzb = zzisVar;
        this.zzc = str;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzir(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzir) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.a;
        b.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzis zzisVar = this.zzb;
        String str2 = this.zzc;
        webView = zzisVar.zza;
        webView.evaluateJavascript(str2 + "(" + i.h(arrayList, ",", null, null, null, 62) + ")", null);
        return ad.j.a;
    }
}
