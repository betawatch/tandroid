package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ z1(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g3 g3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.o5 o5Var) {
        this.c = frameLayout;
        this.e = f6Var;
        this.f = g3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = o5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new vc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    break;
                } else {
                    n70 F = n70.F(g3Var.container, f6Var, frameLayout2);
                    int i10 = 0;
                    while (true) {
                        int[] iArr2 = this.b;
                        if (i10 >= iArr2.length) {
                            F.i = 1;
                            F.Z();
                            break;
                        } else {
                            F.c(0, strArr[i10], new b3(iArr, runnable2, iArr2[i10]), false);
                            i10++;
                        }
                    }
                }
            default:
                boolean[] zArr = (boolean[]) this.c;
                uc0 uc0Var = (uc0) this.d;
                uc0 uc0Var2 = (uc0) this.e;
                uc0 uc0Var3 = (uc0) this.f;
                uc0 uc0Var4 = (uc0) this.h;
                wt wtVar = (wt) this.n;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.r;
                zArr[0] = false;
                bu.j((bu) wtVar.c, wtVar.a, wtVar.b, (int) (c5.c(null, uc0Var, uc0Var2, uc0Var3, uc0Var4) / 1000), this.b[0]);
                runnable = b3Var.a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    public /* synthetic */ z1(boolean[] zArr, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, uc0 uc0Var4, wt wtVar, int[] iArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.c = zArr;
        this.d = uc0Var;
        this.e = uc0Var2;
        this.f = uc0Var3;
        this.h = uc0Var4;
        this.n = wtVar;
        this.b = iArr;
        this.r = b3Var;
    }
}
