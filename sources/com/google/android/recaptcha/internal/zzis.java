package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import zd.b0;
import zd.z;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
