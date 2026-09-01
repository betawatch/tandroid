package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw0 b;

    public /* synthetic */ hw0(kw0 kw0Var, int i10) {
        this.a = i10;
        this.b = kw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kw0 kw0Var = this.b;
                kw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new hw0(kw0Var, 1));
                break;
            default:
                kw0 kw0Var2 = this.b;
                jw0 jw0Var = kw0Var2.e;
                if (jw0Var != null) {
                    kw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.rx0) jw0Var).b;
                    org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.r;
                    l5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.W5));
                    l5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.X5));
                    break;
                }
                break;
        }
    }
}
