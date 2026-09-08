package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final /* synthetic */ t1 a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(t1 t1Var) {
        this.a = t1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new r1(this, str, str2, 0));
    }
}
