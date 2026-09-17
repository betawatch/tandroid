package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import zd.c0;
import zd.e0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class zzis {
    private final WebView zza;
    private final c0 zzb;

    public zzis(WebView webView, c0 c0Var) {
        this.zza = webView;
        this.zzb = c0Var;
    }

    public final void zzb(String str, String... strArr) {
        e0.q(this.zzb, new zzir((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
