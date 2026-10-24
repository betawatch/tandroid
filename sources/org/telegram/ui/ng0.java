package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg0 b;

    public /* synthetic */ ng0(rg0 rg0Var, int i10) {
        this.a = i10;
        this.b = rg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph.b[] bVarArr;
        switch (this.a) {
            case 0:
                rg0 rg0Var = this.b;
                rg0Var.getClass();
                m9.l0(rg0Var);
                break;
            case 1:
                rg0.c0(this.b);
                break;
            case 2:
                rg0.a0(this.b);
                break;
            case 3:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
            case 4:
                rg0 rg0Var2 = this.b;
                rg0Var2.getClass();
                new rj0(rg0Var2.getParentActivity(), rg0Var2).show();
                break;
            case 5:
                rg0 rg0Var3 = this.b;
                rg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                rg0Var3.presentFragment(new m9(bundle));
                break;
            case 6:
                rg0 rg0Var4 = this.b;
                if (rg0Var4.getParentActivity() != null && (bVarArr = rg0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (rg0Var4.b.getWidth() - ((bVarArr[4].getX() + rg0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    ei.x3 x3Var = new ei.x3(rg0Var4.getParentActivity(), 3);
                    rg0Var4.P = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-rg0Var4.L));
                    rg0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    rg0Var4.P.p(false);
                    rg0Var4.P.i(true);
                    rg0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    rg0Var4.P.l(1.0f, (-width) + 7.33f);
                    rg0Var4.b.addView(rg0Var4.P, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ei.x3 x3Var2 = rg0Var4.P;
                    x3Var2.l0 = new ng0(rg0Var4, 3);
                    x3Var2.d = 8000L;
                    x3Var2.u();
                    org.telegram.ui.Components.s40.r.b();
                    break;
                }
                break;
            default:
                rg0.b0(this.b);
                break;
        }
    }
}
