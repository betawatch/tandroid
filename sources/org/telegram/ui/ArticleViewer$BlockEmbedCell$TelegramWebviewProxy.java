package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final /* synthetic */ j a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(j jVar) {
        this.a = jVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        gl.d3(new h(this, str, str2, (byte) 0));
    }
}
