package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kh0 b;

    public /* synthetic */ gh0(kh0 kh0Var, int i10) {
        this.a = i10;
        this.b = kh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph.b[] bVarArr;
        switch (this.a) {
            case 0:
                kh0.b0(this.b);
                break;
            case 1:
                kh0 kh0Var = this.b;
                kh0Var.getClass();
                n9.m0(kh0Var);
                break;
            case 2:
                kh0.c0(this.b);
                break;
            case 3:
                kh0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
            case 5:
                kh0 kh0Var2 = this.b;
                kh0Var2.getClass();
                new ik0(kh0Var2.getParentActivity(), kh0Var2).show();
                break;
            case 6:
                kh0 kh0Var3 = this.b;
                kh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                kh0Var3.presentFragment(new n9(bundle));
                break;
            default:
                kh0 kh0Var4 = this.b;
                if (kh0Var4.getParentActivity() != null && (bVarArr = kh0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (kh0Var4.b.getWidth() - ((bVarArr[4].getX() + kh0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    di.d4 d4Var = new di.d4(kh0Var4.getParentActivity(), 3);
                    kh0Var4.P = d4Var;
                    d4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-kh0Var4.L));
                    kh0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    kh0Var4.P.p(false);
                    kh0Var4.P.i();
                    kh0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    kh0Var4.P.l(1.0f, (-width) + 7.33f);
                    kh0Var4.b.addView(kh0Var4.P, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 72.0f, -1, 87));
                    di.d4 d4Var2 = kh0Var4.P;
                    d4Var2.l0 = new gh0(kh0Var4, 4);
                    d4Var2.d = 8000L;
                    d4Var2.u();
                    org.telegram.ui.Components.w40.r.b();
                    break;
                }
                break;
        }
    }
}
