package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final /* synthetic */ j a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(j jVar) {
        this.a = jVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        gm.c3(new h(this, str, str2, (byte) 0));
    }
}
