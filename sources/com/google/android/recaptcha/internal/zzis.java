package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import ld.c0;
import ld.e0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
