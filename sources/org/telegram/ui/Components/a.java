package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements LanguageDetector.StringCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ a(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public final void run(String str) {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                g0Var.r0 = str;
                g0Var.O0.N(true);
                break;
            default:
                g0 g0Var2 = this.b;
                g0Var2.r0 = str;
                g0Var2.O0.N(true);
                break;
        }
    }
}
