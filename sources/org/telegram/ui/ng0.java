package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        qh.b[] bVarArr;
        switch (this.a) {
            case 0:
                rg0 rg0Var = this.b;
                rg0Var.getClass();
                new qj0(rg0Var.getParentActivity(), rg0Var).show();
                break;
            case 1:
                rg0 rg0Var2 = this.b;
                rg0Var2.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                rg0Var2.presentFragment(new o9(bundle));
                break;
            case 2:
                rg0 rg0Var3 = this.b;
                if (rg0Var3.getParentActivity() != null && (bVarArr = rg0Var3.J) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (rg0Var3.b.getWidth() - ((bVarArr[3].getX() + rg0Var3.E.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    fi.v3 v3Var = new fi.v3(rg0Var3.getParentActivity(), 3);
                    rg0Var3.O = v3Var;
                    v3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-rg0Var3.K));
                    rg0Var3.O.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    rg0Var3.O.p(false);
                    rg0Var3.O.i(true);
                    rg0Var3.O.s(LocaleController.getString(R.string.SwitchAccountHint));
                    rg0Var3.O.l(1.0f, (-width) + 7.33f);
                    rg0Var3.b.addView(rg0Var3.O, org.telegram.ui.Components.kb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    fi.v3 v3Var2 = rg0Var3.O;
                    v3Var2.l0 = new ng0(rg0Var3, 3);
                    v3Var2.d = 8000L;
                    v3Var2.u();
                    org.telegram.ui.Components.u40.r.b();
                    break;
                }
                break;
            case 3:
                AndroidUtilities.removeFromParent(this.b.O);
                break;
            default:
                rg0.Z(this.b);
                break;
        }
    }
}
