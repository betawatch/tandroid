package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final /* synthetic */ r1 a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(r1 r1Var) {
        this.a = r1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.i0.g3(new p1(this, str, str2, 0));
    }
}
