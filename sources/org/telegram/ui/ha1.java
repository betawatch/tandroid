package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ ha1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
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
                    org.telegram.messenger.g0.I3(twoStepVerificationActivity.s);
                    break;
                }
                break;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.b;
                ha1 ha1Var = twoStepVerificationActivity2.W;
                org.telegram.messenger.g0.r(ha1Var);
                org.telegram.messenger.g0.h3(ha1Var, 1500L);
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
