package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;

    public /* synthetic */ kg0(pg0 pg0Var, int i10) {
        this.a = i10;
        this.b = pg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph.b[] bVarArr;
        switch (this.a) {
            case 0:
                pg0.b0(this.b);
                break;
            case 1:
                pg0 pg0Var = this.b;
                pg0Var.getClass();
                m9.m0(pg0Var);
                break;
            case 2:
                pg0.c0(this.b);
                break;
            case 3:
                pg0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
            case 5:
                pg0 pg0Var2 = this.b;
                pg0Var2.getClass();
                new oj0(pg0Var2.getParentActivity(), pg0Var2).show();
                break;
            case 6:
                pg0 pg0Var3 = this.b;
                pg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                pg0Var3.presentFragment(new m9(bundle));
                break;
            default:
                pg0 pg0Var4 = this.b;
                if (pg0Var4.getParentActivity() != null && (bVarArr = pg0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (pg0Var4.b.getWidth() - ((bVarArr[4].getX() + pg0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    ei.x3 x3Var = new ei.x3(pg0Var4.getParentActivity(), 3);
                    pg0Var4.P = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-pg0Var4.L));
                    pg0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    pg0Var4.P.p(false);
                    pg0Var4.P.i(true);
                    pg0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    pg0Var4.P.l(1.0f, (-width) + 7.33f);
                    pg0Var4.b.addView(pg0Var4.P, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 72.0f, -1, 87));
                    ei.x3 x3Var2 = pg0Var4.P;
                    x3Var2.l0 = new kg0(pg0Var4, 4);
                    x3Var2.d = 8000L;
                    x3Var2.u();
                    org.telegram.ui.Components.s40.r.b();
                    break;
                }
                break;
        }
    }
}
