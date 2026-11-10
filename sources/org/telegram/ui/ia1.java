package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ ia1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(twoStepVerificationActivity.s);
                    break;
                }
                break;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.b;
                ia1 ia1Var = twoStepVerificationActivity2.V;
                org.telegram.messenger.g0.r(ia1Var);
                org.telegram.messenger.g0.i3(ia1Var, 1500L);
                twoStepVerificationActivity2.U = true;
                break;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.b;
                twoStepVerificationActivity3.U = false;
                twoStepVerificationActivity3.w.a(0.0f);
                break;
            default:
                this.b.D0();
                break;
        }
    }
}
