package com.google.android.recaptcha.internal;

import ae.d0;
import ae.g0;
import android.webkit.WebView;
import java.util.Arrays;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class zzis {
    private final WebView zza;
    private final d0 zzb;

    public zzis(WebView webView, d0 d0Var) {
        this.zza = webView;
        this.zzb = d0Var;
    }

    public final void zzb(String str, String... strArr) {
        g0.q(this.zzb, new zzir((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
