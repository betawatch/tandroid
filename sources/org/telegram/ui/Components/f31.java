package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Utilities.Callback2 c;

    public /* synthetic */ f31(String str, String str2, Utilities.Callback2 callback2) {
        this.a = str;
        this.b = str2;
        this.c = callback2;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        u31.x(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        u31.x(this.a, "en", this.b, this.c);
    }
}
