package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements LanguageDetector.StringCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ a(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public final void run(String str) {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                e0Var.r0 = str;
                e0Var.O0.N(true);
                break;
            default:
                e0 e0Var2 = this.b;
                e0Var2.r0 = str;
                e0Var2.O0.N(true);
                break;
        }
    }
}
