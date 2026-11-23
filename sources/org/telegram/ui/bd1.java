package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class bd1 {
    public final /* synthetic */ cd1 a;

    public bd1(cd1 cd1Var) {
        this.a = cd1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.u4(18, this, str));
    }
}
