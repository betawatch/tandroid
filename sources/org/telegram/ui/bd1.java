package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
