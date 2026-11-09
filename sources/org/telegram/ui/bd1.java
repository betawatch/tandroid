package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bd1 {
    public final /* synthetic */ cd1 a;

    public bd1(cd1 cd1Var) {
        this.a = cd1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new wb1(29, this, str));
    }
}
