package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
