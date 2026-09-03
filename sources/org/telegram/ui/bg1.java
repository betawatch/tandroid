package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ bg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.E && (editTextBoldCursor = twoStepVerificationActivity.s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.s);
                    break;
                }
                break;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.b;
                twoStepVerificationActivity2.R = false;
                twoStepVerificationActivity2.v.a(0.0f);
                break;
            case 2:
                this.b.y0();
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.b;
                bg1 bg1Var = twoStepVerificationActivity3.S;
                AndroidUtilities.cancelRunOnUIThread(bg1Var);
                AndroidUtilities.runOnUIThread(bg1Var, 1500L);
                twoStepVerificationActivity3.R = true;
                break;
        }
    }
}
