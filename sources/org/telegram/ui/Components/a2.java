package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.m5 m5Var) {
        this.c = frameLayout;
        this.e = d6Var;
        this.f = f3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = m5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    break;
                } else {
                    o70 F = o70.F(f3Var.container, d6Var, frameLayout2);
                    int i10 = 0;
                    while (true) {
                        int[] iArr2 = this.b;
                        if (i10 >= iArr2.length) {
                            F.i = 1;
                            F.Z();
                            break;
                        } else {
                            F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                            i10++;
                        }
                    }
                }
            default:
                boolean[] zArr = (boolean[]) this.c;
                tc0 tc0Var = (tc0) this.d;
                tc0 tc0Var2 = (tc0) this.e;
                tc0 tc0Var3 = (tc0) this.f;
                tc0 tc0Var4 = (tc0) this.h;
                xt xtVar = (xt) this.n;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.r;
                zArr[0] = false;
                cu.j((cu) xtVar.c, xtVar.a, xtVar.b, (int) (e5.c(null, tc0Var, tc0Var2, tc0Var3, tc0Var4) / 1000), this.b[0]);
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    public /* synthetic */ a2(boolean[] zArr, tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3, tc0 tc0Var4, xt xtVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.c = zArr;
        this.d = tc0Var;
        this.e = tc0Var2;
        this.f = tc0Var3;
        this.h = tc0Var4;
        this.n = xtVar;
        this.b = iArr;
        this.r = a3Var;
    }
}
