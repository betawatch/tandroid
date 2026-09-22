package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh0 b;

    public /* synthetic */ ch0(gh0 gh0Var, int i10) {
        this.a = i10;
        this.b = gh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oh.b[] bVarArr;
        switch (this.a) {
            case 0:
                gh0.b0(this.b);
                break;
            case 1:
                gh0 gh0Var = this.b;
                gh0Var.getClass();
                l9.m0(gh0Var);
                break;
            case 2:
                gh0.c0(this.b);
                break;
            case 3:
                gh0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
            case 5:
                gh0 gh0Var2 = this.b;
                gh0Var2.getClass();
                new fk0(gh0Var2.getParentActivity(), gh0Var2).show();
                break;
            case 6:
                gh0 gh0Var3 = this.b;
                gh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                gh0Var3.presentFragment(new l9(bundle));
                break;
            default:
                gh0 gh0Var4 = this.b;
                if (gh0Var4.getParentActivity() != null && (bVarArr = gh0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (gh0Var4.b.getWidth() - ((bVarArr[4].getX() + gh0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    ci.f4 f4Var = new ci.f4(gh0Var4.getParentActivity(), 3);
                    gh0Var4.P = f4Var;
                    f4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-gh0Var4.L));
                    gh0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    gh0Var4.P.p(false);
                    gh0Var4.P.i();
                    gh0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    gh0Var4.P.l(1.0f, (-width) + 7.33f);
                    gh0Var4.b.addView(gh0Var4.P, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.f4 f4Var2 = gh0Var4.P;
                    f4Var2.l0 = new ch0(gh0Var4, 4);
                    f4Var2.d = 8000L;
                    f4Var2.u();
                    org.telegram.ui.Components.j40.r.b();
                    break;
                }
                break;
        }
    }
}
