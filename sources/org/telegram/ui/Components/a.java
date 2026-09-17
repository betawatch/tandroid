package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
