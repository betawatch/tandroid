package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import ld.c0;
import ld.e0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
