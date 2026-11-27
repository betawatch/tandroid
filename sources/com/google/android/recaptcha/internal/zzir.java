package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzir extends yfb implements is4 {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzis zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(String[] strArr, zzis zzisVar, String str, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = strArr;
        this.zzb = zzisVar;
        this.zzc = str;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzir(this.zza, this.zzb, this.zzc, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzir) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        ixe.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzis zzisVar = this.zzb;
        String str2 = this.zzc;
        webView = zzisVar.zza;
        webView.evaluateJavascript(str2 + "(" + sl2.f(arrayList, ",", null, null, null, 62) + ")", null);
        return g9c.a;
    }
}
