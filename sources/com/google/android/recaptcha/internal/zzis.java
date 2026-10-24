package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import be.c0;
import be.f0;
import java.util.Arrays;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
