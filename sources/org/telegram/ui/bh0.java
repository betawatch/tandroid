package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fh0 b;

    public /* synthetic */ bh0(fh0 fh0Var, int i10) {
        this.a = i10;
        this.b = fh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oh.b[] bVarArr;
        switch (this.a) {
            case 0:
                fh0.a0(this.b);
                break;
            case 1:
                fh0 fh0Var = this.b;
                fh0Var.getClass();
                l9.m0(fh0Var);
                break;
            case 2:
                fh0.c0(this.b);
                break;
            case 3:
                fh0.Z(this.b);
                break;
            case 4:
                fh0 fh0Var2 = this.b;
                fh0Var2.getClass();
                new ek0(fh0Var2.getParentActivity(), fh0Var2).show();
                break;
            case 5:
                fh0 fh0Var3 = this.b;
                fh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                fh0Var3.presentFragment(new l9(bundle));
                break;
            case 6:
                fh0 fh0Var4 = this.b;
                if (fh0Var4.getParentActivity() != null && (bVarArr = fh0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (fh0Var4.b.getWidth() - ((bVarArr[4].getX() + fh0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    ci.f4 f4Var = new ci.f4(fh0Var4.getParentActivity(), 3);
                    fh0Var4.P = f4Var;
                    f4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-fh0Var4.L));
                    fh0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    fh0Var4.P.p(false);
                    fh0Var4.P.i();
                    fh0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    fh0Var4.P.l(1.0f, (-width) + 7.33f);
                    fh0Var4.b.addView(fh0Var4.P, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.f4 f4Var2 = fh0Var4.P;
                    f4Var2.l0 = new bh0(fh0Var4, 7);
                    f4Var2.d = 8000L;
                    f4Var2.u();
                    org.telegram.ui.Components.j40.r.b();
                    break;
                }
                break;
            default:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
        }
    }
}
