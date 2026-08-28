package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ gf1(TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.a = i9;
        this.b = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.D && (editTextBoldCursor = twoStepVerificationActivity.s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.s);
                    break;
                }
                break;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.b;
                twoStepVerificationActivity2.Q = false;
                twoStepVerificationActivity2.v.a(0.0f);
                break;
            case 2:
                this.b.x0();
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.b;
                gf1 gf1Var = twoStepVerificationActivity3.R;
                AndroidUtilities.cancelRunOnUIThread(gf1Var);
                AndroidUtilities.runOnUIThread(gf1Var, 1500L);
                twoStepVerificationActivity3.Q = true;
                break;
        }
    }
}
