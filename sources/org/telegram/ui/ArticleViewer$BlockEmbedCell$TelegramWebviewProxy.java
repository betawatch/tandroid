package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final /* synthetic */ j a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(j jVar) {
        this.a = jVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        hl.c3(new h(this, str, str2, (byte) 0));
    }
}
