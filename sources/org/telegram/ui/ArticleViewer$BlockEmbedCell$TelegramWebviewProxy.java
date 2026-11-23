package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final /* synthetic */ q1 a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(q1 q1Var) {
        this.a = q1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new o1(this, str, str2, 0));
    }
}
