package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ y1(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.yf yfVar) {
        this.c = frameLayout;
        this.e = c6Var;
        this.f = e3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = yfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new mc(frameLayout, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ag.l3(26))).j();
                    break;
                } else {
                    b70 F = b70.F(e3Var.container, c6Var, frameLayout2);
                    int i10 = 0;
                    while (true) {
                        int[] iArr2 = this.b;
                        if (i10 >= iArr2.length) {
                            F.i = 1;
                            F.Z();
                            break;
                        } else {
                            F.c(0, strArr[i10], new y2(iArr, runnable2, iArr2[i10]), false);
                            i10++;
                        }
                    }
                }
            default:
                boolean[] zArr = (boolean[]) this.c;
                fc0 fc0Var = (fc0) this.d;
                fc0 fc0Var2 = (fc0) this.e;
                fc0 fc0Var3 = (fc0) this.f;
                fc0 fc0Var4 = (fc0) this.h;
                hh.h0 h0Var = (hh.h0) this.n;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.r;
                zArr[0] = false;
                lt.j((lt) h0Var.c, h0Var.a, h0Var.b, (int) (y4.c(null, fc0Var, fc0Var2, fc0Var3, fc0Var4) / 1000), this.b[0]);
                runnable = z2Var.a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    public /* synthetic */ y1(boolean[] zArr, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, fc0 fc0Var4, hh.h0 h0Var, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.c = zArr;
        this.d = fc0Var;
        this.e = fc0Var2;
        this.f = fc0Var3;
        this.h = fc0Var4;
        this.n = h0Var;
        this.b = iArr;
        this.r = z2Var;
    }
}
