package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                f0Var.r0 = str;
                f0Var.O0.N(true);
                break;
            default:
                f0 f0Var2 = this.b;
                f0Var2.r0 = str;
                f0Var2.O0.N(true);
                break;
        }
    }
}
