package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
