package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                g0Var.n0 = str;
                g0Var.K0.N(true);
                break;
            default:
                g0 g0Var2 = this.b;
                g0Var2.n0 = str;
                g0Var2.K0.N(true);
                break;
        }
    }
}
