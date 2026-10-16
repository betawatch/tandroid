package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh0 b;

    public /* synthetic */ fh0(jh0 jh0Var, int i10) {
        this.a = i10;
        this.b = jh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph.b[] bVarArr;
        switch (this.a) {
            case 0:
                jh0.b0(this.b);
                break;
            case 1:
                jh0 jh0Var = this.b;
                jh0Var.getClass();
                n9.m0(jh0Var);
                break;
            case 2:
                jh0.c0(this.b);
                break;
            case 3:
                jh0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
            case 5:
                jh0 jh0Var2 = this.b;
                jh0Var2.getClass();
                new hk0(jh0Var2.getParentActivity(), jh0Var2).show();
                break;
            case 6:
                jh0 jh0Var3 = this.b;
                jh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                jh0Var3.presentFragment(new n9(bundle));
                break;
            default:
                jh0 jh0Var4 = this.b;
                if (jh0Var4.getParentActivity() != null && (bVarArr = jh0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (jh0Var4.b.getWidth() - ((bVarArr[4].getX() + jh0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    di.d4 d4Var = new di.d4(jh0Var4.getParentActivity(), 3);
                    jh0Var4.P = d4Var;
                    d4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-jh0Var4.L));
                    jh0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    jh0Var4.P.p(false);
                    jh0Var4.P.i();
                    jh0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    jh0Var4.P.l(1.0f, (-width) + 7.33f);
                    jh0Var4.b.addView(jh0Var4.P, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 72.0f, -1, 87));
                    di.d4 d4Var2 = jh0Var4.P;
                    d4Var2.l0 = new fh0(jh0Var4, 4);
                    d4Var2.d = 8000L;
                    d4Var2.u();
                    org.telegram.ui.Components.w40.r.b();
                    break;
                }
                break;
        }
    }
}
