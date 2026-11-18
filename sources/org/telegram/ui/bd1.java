package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bd1 {
    public final /* synthetic */ cd1 a;

    public bd1(cd1 cd1Var) {
        this.a = cd1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.c5(16, this, str));
    }
}
