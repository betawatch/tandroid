package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cd1 {
    public final /* synthetic */ dd1 a;

    public cd1(dd1 dd1Var) {
        this.a = dd1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new sb1(29, this, str));
    }
}
