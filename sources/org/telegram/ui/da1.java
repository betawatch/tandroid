package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class da1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ da1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.I && (editTextBoldCursor = twoStepVerificationActivity.s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.J3(twoStepVerificationActivity.s);
                    break;
                }
                break;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.b;
                da1 da1Var = twoStepVerificationActivity2.W;
                org.telegram.messenger.g0.r(da1Var);
                org.telegram.messenger.g0.i3(da1Var, 1500L);
                twoStepVerificationActivity2.V = true;
                break;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.b;
                twoStepVerificationActivity3.V = false;
                twoStepVerificationActivity3.w.a(0.0f);
                break;
            default:
                this.b.D0();
                break;
        }
    }
}
