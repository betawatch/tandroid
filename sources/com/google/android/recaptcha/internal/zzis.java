package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzis {
    private final WebView zza;
    private final ky2 zzb;

    public zzis(WebView webView, ky2 ky2Var) {
        this.zza = webView;
        this.zzb = ky2Var;
    }

    public final void zzb(String str, String... strArr) {
        srd.b(this.zzb, new zzir((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
