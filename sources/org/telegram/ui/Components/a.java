package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
