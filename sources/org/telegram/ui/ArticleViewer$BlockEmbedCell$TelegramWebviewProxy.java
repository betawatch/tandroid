package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final /* synthetic */ q1 a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(q1 q1Var) {
        this.a = q1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new o1(this, str, str2, 0));
    }
}
