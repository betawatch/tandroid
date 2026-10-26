package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;

    public /* synthetic */ lg0(pg0 pg0Var, int i10) {
        this.a = i10;
        this.b = pg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qh.b[] bVarArr;
        switch (this.a) {
            case 0:
                pg0 pg0Var = this.b;
                pg0Var.getClass();
                new oj0(pg0Var.getParentActivity(), pg0Var).show();
                break;
            case 1:
                pg0 pg0Var2 = this.b;
                pg0Var2.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                pg0Var2.presentFragment(new o9(bundle));
                break;
            case 2:
                pg0 pg0Var3 = this.b;
                if (pg0Var3.getParentActivity() != null && (bVarArr = pg0Var3.J) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (pg0Var3.b.getWidth() - ((bVarArr[3].getX() + pg0Var3.E.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    fi.v3 v3Var = new fi.v3(pg0Var3.getParentActivity(), 3);
                    pg0Var3.O = v3Var;
                    v3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-pg0Var3.K));
                    pg0Var3.O.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    pg0Var3.O.p(false);
                    pg0Var3.O.i(true);
                    pg0Var3.O.s(LocaleController.getString(R.string.SwitchAccountHint));
                    pg0Var3.O.l(1.0f, (-width) + 7.33f);
                    pg0Var3.b.addView(pg0Var3.O, org.telegram.ui.Components.gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    fi.v3 v3Var2 = pg0Var3.O;
                    v3Var2.l0 = new lg0(pg0Var3, 3);
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
                pg0.Z(this.b);
                break;
        }
    }
}
