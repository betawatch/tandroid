package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import dd.p;
import java.util.ArrayList;
import k7.p7;
import ld.c0;
import tc.g;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzir extends i implements p {
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzir(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzir) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.a;
        p7.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzis zzisVar = this.zzb;
        String str2 = this.zzc;
        webView = zzisVar.zza;
        webView.evaluateJavascript(str2 + "(" + g.h(arrayList, ",", null, null, null, 62) + ")", null);
        return sc.i.a;
    }
}
