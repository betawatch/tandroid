package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gu {
    public final /* synthetic */ hu a;

    public gu(hu huVar) {
        this.a = huVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            org.telegram.messenger.i0.g3(new ho(this, 12));
        }
    }
}
