package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ ig0(ng0 ng0Var, int i10) {
        this.a = i10;
        this.b = ng0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph.b[] bVarArr;
        switch (this.a) {
            case 0:
                ng0.b0(this.b);
                break;
            case 1:
                ng0 ng0Var = this.b;
                ng0Var.getClass();
                m9.m0(ng0Var);
                break;
            case 2:
                ng0.c0(this.b);
                break;
            case 3:
                ng0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
            case 5:
                ng0 ng0Var2 = this.b;
                ng0Var2.getClass();
                new mj0(ng0Var2.getParentActivity(), ng0Var2).show();
                break;
            case 6:
                ng0 ng0Var3 = this.b;
                ng0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                ng0Var3.presentFragment(new m9(bundle));
                break;
            default:
                ng0 ng0Var4 = this.b;
                if (ng0Var4.getParentActivity() != null && (bVarArr = ng0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (ng0Var4.b.getWidth() - ((bVarArr[4].getX() + ng0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    ei.x3 x3Var = new ei.x3(ng0Var4.getParentActivity(), 3);
                    ng0Var4.P = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-ng0Var4.L));
                    ng0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    ng0Var4.P.p(false);
                    ng0Var4.P.i(true);
                    ng0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    ng0Var4.P.l(1.0f, (-width) + 7.33f);
                    ng0Var4.b.addView(ng0Var4.P, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ei.x3 x3Var2 = ng0Var4.P;
                    x3Var2.l0 = new ig0(ng0Var4, 4);
                    x3Var2.d = 8000L;
                    x3Var2.u();
                    org.telegram.ui.Components.s40.r.b();
                    break;
                }
                break;
        }
    }
}
