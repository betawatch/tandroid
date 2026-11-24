package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzis {
    private final WebView zza;
    private final ax2 zzb;

    public zzis(WebView webView, ax2 ax2Var) {
        this.zza = webView;
        this.zzb = ax2Var;
    }

    public final void zzb(String str, String... strArr) {
        ppd.b(this.zzb, new zzir((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
