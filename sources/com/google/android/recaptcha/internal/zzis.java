package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
