package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
