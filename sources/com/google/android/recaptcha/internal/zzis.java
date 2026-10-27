package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import ce.c0;
import ce.f0;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class zzis {
    private final WebView zza;
    private final c0 zzb;

    public zzis(WebView webView, c0 c0Var) {
        this.zza = webView;
        this.zzb = c0Var;
    }

    public final void zzb(String str, String... strArr) {
        f0.q(this.zzb, new zzir((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
