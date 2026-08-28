package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements LanguageDetector.StringCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ a(e0 e0Var, int i9) {
        this.a = i9;
        this.b = e0Var;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public final void run(String str) {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                e0Var.n0 = str;
                e0Var.K0.N(true);
                break;
            default:
                e0 e0Var2 = this.b;
                e0Var2.n0 = str;
                e0Var2.K0.N(true);
                break;
        }
    }
}
