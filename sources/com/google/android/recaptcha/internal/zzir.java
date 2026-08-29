package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import bd.p;
import i7.c7;
import java.util.ArrayList;
import jd.c0;
import rc.g;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzir(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzir) create((c0) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        tc.a aVar = tc.a.a;
        c7.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzis zzisVar = this.zzb;
        String str2 = this.zzc;
        webView = zzisVar.zza;
        webView.evaluateJavascript(str2 + "(" + g.h(arrayList, ",", null, null, null, 62) + ")", null);
        return qc.i.a;
    }
}
