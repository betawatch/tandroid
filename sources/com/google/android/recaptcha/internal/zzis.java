package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
