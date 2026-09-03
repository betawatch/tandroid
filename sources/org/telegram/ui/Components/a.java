package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements LanguageDetector.StringCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ a(f0 f0Var, int i10) {
        this.a = i10;
        this.b = f0Var;
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public final void run(String str) {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                f0Var.o0 = str;
                f0Var.L0.N(true);
                break;
            default:
                f0 f0Var2 = this.b;
                f0Var2.o0 = str;
                f0Var2.L0.N(true);
                break;
        }
    }
}
