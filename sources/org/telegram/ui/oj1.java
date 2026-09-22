package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class oj1 {
    public final /* synthetic */ pj1 a;

    public oj1(pj1 pj1Var) {
        this.a = pj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new pb1(20, this, str));
    }
}
