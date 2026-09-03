package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    public /* synthetic */ a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g3 g3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.kh khVar) {
        this.c = frameLayout;
        this.e = f6Var;
        this.f = g3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = khVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new qc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new cg.n0(25))).j();
                    break;
                } else {
                    p70 F = p70.F(g3Var.container, f6Var, frameLayout2);
                    int i10 = 0;
                    while (true) {
                        int[] iArr2 = this.b;
                        if (i10 >= iArr2.length) {
                            F.i = 1;
                            F.Z();
                            break;
                        } else {
                            F.c(0, strArr[i10], new z2(iArr, runnable, iArr2[i10]), false);
                            i10++;
                        }
                    }
                }
            default:
                boolean[] zArr = (boolean[]) this.c;
                xc0 xc0Var = (xc0) this.d;
                xc0 xc0Var2 = (xc0) this.e;
                xc0 xc0Var3 = (xc0) this.f;
                xc0 xc0Var4 = (xc0) this.h;
                lh.g0 g0Var = (lh.g0) this.n;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.r;
                zArr[0] = false;
                ut.j((ut) g0Var.c, g0Var.a, g0Var.b, (int) (z4.c(null, xc0Var, xc0Var2, xc0Var3, xc0Var4) / 1000), this.b[0]);
                b3Var.a.dismissRunnable.run();
                break;
        }
    }

    public /* synthetic */ a2(boolean[] zArr, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, xc0 xc0Var4, lh.g0 g0Var, int[] iArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.c = zArr;
        this.d = xc0Var;
        this.e = xc0Var2;
        this.f = xc0Var3;
        this.h = xc0Var4;
        this.n = g0Var;
        this.b = iArr;
        this.r = b3Var;
    }
}
