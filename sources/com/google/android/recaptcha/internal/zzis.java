package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import zd.b0;
import zd.z;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
