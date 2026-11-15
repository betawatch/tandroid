package org.telegram.ui.Components;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class au {
    public final /* synthetic */ bu a;

    public au(bu buVar) {
        this.a = buVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            org.telegram.messenger.g0.h3(new fo(this, 12));
        }
    }
}
