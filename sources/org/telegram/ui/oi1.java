package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class oi1 {
    public final /* synthetic */ pi1 a;

    public oi1(pi1 pi1Var) {
        this.a = pi1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.a6(11, this, str));
    }
}
