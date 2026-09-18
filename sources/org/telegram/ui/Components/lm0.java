package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nm0 b;

    public /* synthetic */ lm0(nm0 nm0Var, int i10) {
        this.a = i10;
        this.b = nm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nm0 nm0Var = this.b;
                nm0Var.getClass();
                AndroidUtilities.runOnUIThread(new lm0(nm0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new lm0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
