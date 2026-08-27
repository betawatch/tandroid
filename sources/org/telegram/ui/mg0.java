package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ mg0(qg0 qg0Var, int i10) {
        this.a = i10;
        this.b = qg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg.b[] bVarArr;
        switch (this.a) {
            case 0:
                qg0.b0(this.b);
                break;
            case 1:
                qg0 qg0Var = this.b;
                qg0Var.getClass();
                j9.m0(qg0Var);
                break;
            case 2:
                qg0.c0(this.b);
                break;
            case 3:
                qg0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.M);
                break;
            case 5:
                qg0 qg0Var2 = this.b;
                qg0Var2.getClass();
                new oj0(qg0Var2.getParentActivity(), qg0Var2).show();
                break;
            case 6:
                qg0 qg0Var3 = this.b;
                qg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                qg0Var3.presentFragment(new j9(bundle));
                break;
            default:
                qg0 qg0Var4 = this.b;
                if (qg0Var4.getParentActivity() != null && (bVarArr = qg0Var4.G) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (qg0Var4.b.getWidth() - ((bVarArr[4].getX() + qg0Var4.B.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    lh.w3 w3Var = new lh.w3(qg0Var4.getParentActivity(), 3);
                    qg0Var4.M = w3Var;
                    w3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-qg0Var4.H));
                    qg0Var4.M.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    qg0Var4.M.q(false);
                    qg0Var4.M.i();
                    qg0Var4.M.t(LocaleController.getString(R.string.SwitchAccountHint));
                    qg0Var4.M.m(1.0f, (-width) + 7.33f);
                    qg0Var4.b.addView(qg0Var4.M, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    lh.w3 w3Var2 = qg0Var4.M;
                    w3Var2.h0 = new mg0(qg0Var4, 4);
                    w3Var2.d = 8000L;
                    w3Var2.v();
                    org.telegram.ui.Components.y30.r.b();
                    break;
                }
                break;
        }
    }
}
