package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzir extends ccb implements eq4 {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzis zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(String[] strArr, zzis zzisVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zza = strArr;
        this.zzb = zzisVar;
        this.zzc = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzir(this.zza, this.zzb, this.zzc, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzir) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        qse.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzis zzisVar = this.zzb;
        String str2 = this.zzc;
        webView = zzisVar.zza;
        webView.evaluateJavascript(str2 + "(" + yk2.f(arrayList, ",", null, null, null, 62) + ")", null);
        return g5c.a;
    }
}
