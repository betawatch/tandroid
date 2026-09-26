package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Utilities.Callback2 c;

    public /* synthetic */ t31(String str, String str2, Utilities.Callback2 callback2) {
        this.a = str;
        this.b = str2;
        this.c = callback2;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        i41.x(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        i41.x(this.a, "en", this.b, this.c);
    }
}
