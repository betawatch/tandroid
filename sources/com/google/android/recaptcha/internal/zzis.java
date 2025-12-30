package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class zzis {
    private final WebView zza;
    private final CoroutineScope zzb;

    public zzis(WebView webView, CoroutineScope coroutineScope) {
        this.zza = webView;
        this.zzb = coroutineScope;
    }

    public final void zzb(String str, String... strArr) {
        BuildersKt__Builders_commonKt.launch$default(this.zzb, null, null, new zzir((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }
}
