package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import hd.t;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzle extends WebViewClient {
    final /* synthetic */ zzly zza;

    public zzle(zzly zzlyVar) {
        this.zza = zzlyVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzmf zzmfVar;
        zzmfVar = this.zza.zzg;
        long zza = zzmfVar.zza(TimeUnit.MICROSECONDS);
        int i9 = zzco.zza;
        zzco.zza(zzcp.zzb.zza(), zza);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i9, String str, String str2) {
        Map map;
        super.onReceivedError(webView, i9, str, str2);
        zzly zzlyVar = this.zza;
        zzce zzceVar = zzce.zzc;
        map = zzlyVar.zzc;
        zzcd zzcdVar = (zzcd) map.get(Integer.valueOf(i9));
        if (zzcdVar == null) {
            zzcdVar = zzcd.zzM;
        }
        zzcg zzcgVar = new zzcg(zzceVar, zzcdVar, null, null, 12, null);
        zzlyVar.zzz().hashCode();
        zzcgVar.getMessage();
        ((t) zzlyVar.zzz()).L(zzcgVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        zzly zzlyVar = this.zza;
        Uri parse = Uri.parse(str);
        zzly.zzq(zzlyVar);
        i.b(parse);
        if (!zzig.zzc(parse) || zzly.zzq(zzlyVar).zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzQ, null, null, 12, null);
        zzlyVar.zzz().hashCode();
        parse.toString();
        ((t) zzlyVar.zzz()).L(zzcgVar);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
