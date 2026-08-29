package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ jg0(ng0 ng0Var, int i10) {
        this.a = i10;
        this.b = ng0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zg.b[] bVarArr;
        switch (this.a) {
            case 0:
                ng0.b0(this.b);
                break;
            case 1:
                ng0 ng0Var = this.b;
                ng0Var.getClass();
                h9.m0(ng0Var);
                break;
            case 2:
                ng0.c0(this.b);
                break;
            case 3:
                ng0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.M);
                break;
            case 5:
                ng0 ng0Var2 = this.b;
                ng0Var2.getClass();
                new kj0(ng0Var2.getParentActivity(), ng0Var2).show();
                break;
            case 6:
                ng0 ng0Var3 = this.b;
                ng0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                ng0Var3.presentFragment(new h9(bundle));
                break;
            default:
                ng0 ng0Var4 = this.b;
                if (ng0Var4.getParentActivity() != null && (bVarArr = ng0Var4.G) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (ng0Var4.b.getWidth() - ((bVarArr[4].getX() + ng0Var4.B.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    nh.t3 t3Var = new nh.t3(ng0Var4.getParentActivity(), 3);
                    ng0Var4.M = t3Var;
                    t3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-ng0Var4.H));
                    ng0Var4.M.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    ng0Var4.M.q(false);
                    ng0Var4.M.i();
                    ng0Var4.M.t(LocaleController.getString(R.string.SwitchAccountHint));
                    ng0Var4.M.m(1.0f, (-width) + 7.33f);
                    ng0Var4.b.addView(ng0Var4.M, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    nh.t3 t3Var2 = ng0Var4.M;
                    t3Var2.h0 = new jg0(ng0Var4, 4);
                    t3Var2.d = 8000L;
                    t3Var2.v();
                    org.telegram.ui.Components.h40.r.b();
                    break;
                }
                break;
        }
    }
}
