package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    public /* synthetic */ a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.h3 h3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ih ihVar) {
        this.c = frameLayout;
        this.e = g6Var;
        this.f = h3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = ihVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new qc(frameLayout, g6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ag.f(27))).j();
                    break;
                } else {
                    q70 F = q70.F(h3Var.container, g6Var, frameLayout2);
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
                yc0 yc0Var = (yc0) this.d;
                yc0 yc0Var2 = (yc0) this.e;
                yc0 yc0Var3 = (yc0) this.f;
                yc0 yc0Var4 = (yc0) this.h;
                mh.f0 f0Var = (mh.f0) this.n;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.r;
                zArr[0] = false;
                xt.j((xt) f0Var.c, f0Var.a, f0Var.b, (int) (z4.c(null, yc0Var, yc0Var2, yc0Var3, yc0Var4) / 1000), this.b[0]);
                c3Var.a.dismissRunnable.run();
                break;
        }
    }

    public /* synthetic */ a2(boolean[] zArr, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, yc0 yc0Var4, mh.f0 f0Var, int[] iArr, org.telegram.ui.ActionBar.c3 c3Var) {
        this.c = zArr;
        this.d = yc0Var;
        this.e = yc0Var2;
        this.f = yc0Var3;
        this.h = yc0Var4;
        this.n = f0Var;
        this.b = iArr;
        this.r = c3Var;
    }
}
