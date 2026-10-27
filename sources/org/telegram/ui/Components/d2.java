package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ d2(FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.k3 k3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, m4.v0 v0Var) {
        this.c = frameLayout;
        this.e = u6Var;
        this.f = k3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.e;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new wc(frameLayout, u6Var).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ag.c(29))).j();
                    break;
                } else {
                    l80 F = l80.F(k3Var.container, u6Var, frameLayout2);
                    int i10 = 0;
                    while (true) {
                        int[] iArr2 = this.b;
                        if (i10 >= iArr2.length) {
                            F.i = 1;
                            F.Z();
                            break;
                        } else {
                            F.c(0, strArr[i10], new f3(iArr, runnable2, iArr2[i10]), false);
                            i10++;
                        }
                    }
                }
            default:
                boolean[] zArr = (boolean[]) this.c;
                nd0 nd0Var = (nd0) this.d;
                nd0 nd0Var2 = (nd0) this.e;
                nd0 nd0Var3 = (nd0) this.f;
                nd0 nd0Var4 = (nd0) this.h;
                bi.r0 r0Var = (bi.r0) this.n;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.r;
                zArr[0] = false;
                ju.j((ju) r0Var.c, r0Var.a, r0Var.b, (int) (g5.c(null, nd0Var, nd0Var2, nd0Var3, nd0Var4) / 1000), this.b[0]);
                runnable = e3Var.a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    public /* synthetic */ d2(boolean[] zArr, nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3, nd0 nd0Var4, bi.r0 r0Var, int[] iArr, org.telegram.ui.ActionBar.e3 e3Var) {
        this.c = zArr;
        this.d = nd0Var;
        this.e = nd0Var2;
        this.f = nd0Var3;
        this.h = nd0Var4;
        this.n = r0Var;
        this.b = iArr;
        this.r = e3Var;
    }
}
