package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
