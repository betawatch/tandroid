package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import zd.b0;
import zd.z;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class zzis {
    private final WebView zza;
    private final z zzb;

    public zzis(WebView webView, z zVar) {
        this.zza = webView;
        this.zzb = zVar;
    }

    public final void zzb(String str, String... strArr) {
        b0.q(this.zzb, new zzir((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
