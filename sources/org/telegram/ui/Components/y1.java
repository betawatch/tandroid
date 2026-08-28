package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public /* synthetic */ y1(FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.k6 k6Var) {
        this.c = frameLayout;
        this.e = b6Var;
        this.f = f3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = k6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new oc(frameLayout, b6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new bg.d2(27))).j();
                    break;
                } else {
                    x60 F = x60.F(f3Var.container, b6Var, frameLayout2);
                    int i9 = 0;
                    while (true) {
                        int[] iArr2 = this.b;
                        if (i9 >= iArr2.length) {
                            F.i = 1;
                            F.Z();
                            break;
                        } else {
                            F.c(0, strArr[i9], new y2(iArr, runnable, iArr2[i9]), false);
                            i9++;
                        }
                    }
                }
            default:
                boolean[] zArr = (boolean[]) this.c;
                bc0 bc0Var = (bc0) this.d;
                bc0 bc0Var2 = (bc0) this.e;
                bc0 bc0Var3 = (bc0) this.f;
                bc0 bc0Var4 = (bc0) this.h;
                gh.h0 h0Var = (gh.h0) this.n;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.r;
                zArr[0] = false;
                mt.j((mt) h0Var.c, h0Var.a, h0Var.b, (int) (y4.c(null, bc0Var, bc0Var2, bc0Var3, bc0Var4) / 1000), this.b[0]);
                a3Var.a.dismissRunnable.run();
                break;
        }
    }

    public /* synthetic */ y1(boolean[] zArr, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, bc0 bc0Var4, gh.h0 h0Var, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.c = zArr;
        this.d = bc0Var;
        this.e = bc0Var2;
        this.f = bc0Var3;
        this.h = bc0Var4;
        this.n = h0Var;
        this.b = iArr;
        this.r = a3Var;
    }
}
