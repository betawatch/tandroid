package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eh0 b;

    public /* synthetic */ ah0(eh0 eh0Var, int i10) {
        this.a = i10;
        this.b = eh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph.b[] bVarArr;
        switch (this.a) {
            case 0:
                eh0.b0(this.b);
                break;
            case 1:
                eh0 eh0Var = this.b;
                eh0Var.getClass();
                k9.m0(eh0Var);
                break;
            case 2:
                eh0.c0(this.b);
                break;
            case 3:
                eh0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.Q);
                break;
            case 5:
                eh0 eh0Var2 = this.b;
                eh0Var2.getClass();
                new ek0(eh0Var2.getParentActivity(), eh0Var2).show();
                break;
            case 6:
                eh0 eh0Var3 = this.b;
                eh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                eh0Var3.presentFragment(new k9(bundle));
                break;
            default:
                eh0 eh0Var4 = this.b;
                if (eh0Var4.getParentActivity() != null && (bVarArr = eh0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (eh0Var4.b.getWidth() - ((bVarArr[4].getX() + eh0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    di.f4 f4Var = new di.f4(eh0Var4.getParentActivity(), 3);
                    eh0Var4.Q = f4Var;
                    f4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-eh0Var4.L));
                    eh0Var4.Q.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    eh0Var4.Q.p(false);
                    eh0Var4.Q.i();
                    eh0Var4.Q.s(LocaleController.getString(R.string.SwitchAccountHint));
                    eh0Var4.Q.l(1.0f, (-width) + 7.33f);
                    eh0Var4.b.addView(eh0Var4.Q, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    di.f4 f4Var2 = eh0Var4.Q;
                    f4Var2.l0 = new ah0(eh0Var4, 4);
                    f4Var2.d = 8000L;
                    f4Var2.u();
                    org.telegram.ui.Components.j40.r.b();
                    break;
                }
                break;
        }
    }
}
