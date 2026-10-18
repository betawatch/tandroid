package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ jg0(og0 og0Var, int i10) {
        this.a = i10;
        this.b = og0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph.b[] bVarArr;
        switch (this.a) {
            case 0:
                og0.b0(this.b);
                break;
            case 1:
                og0 og0Var = this.b;
                og0Var.getClass();
                m9.m0(og0Var);
                break;
            case 2:
                og0.c0(this.b);
                break;
            case 3:
                og0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
            case 5:
                og0 og0Var2 = this.b;
                og0Var2.getClass();
                new oj0(og0Var2.getParentActivity(), og0Var2).show();
                break;
            case 6:
                og0 og0Var3 = this.b;
                og0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                og0Var3.presentFragment(new m9(bundle));
                break;
            default:
                og0 og0Var4 = this.b;
                if (og0Var4.getParentActivity() != null && (bVarArr = og0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (og0Var4.b.getWidth() - ((bVarArr[4].getX() + og0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    ei.x3 x3Var = new ei.x3(og0Var4.getParentActivity(), 3);
                    og0Var4.P = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-og0Var4.L));
                    og0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    og0Var4.P.p(false);
                    og0Var4.P.i(true);
                    og0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    og0Var4.P.l(1.0f, (-width) + 7.33f);
                    og0Var4.b.addView(og0Var4.P, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ei.x3 x3Var2 = og0Var4.P;
                    x3Var2.l0 = new jg0(og0Var4, 4);
                    x3Var2.d = 8000L;
                    x3Var2.u();
                    org.telegram.ui.Components.s40.r.b();
                    break;
                }
                break;
        }
    }
}
