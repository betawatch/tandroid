package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzis {
    private final WebView zza;
    private final ux2 zzb;

    public zzis(WebView webView, ux2 ux2Var) {
        this.zza = webView;
        this.zzb = ux2Var;
    }

    public final void zzb(String str, String... strArr) {
        fud.b(this.zzb, new zzir((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
