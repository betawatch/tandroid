package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import zd.b0;
import zd.z;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
