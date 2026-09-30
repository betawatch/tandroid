package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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

    public /* synthetic */ a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.l5 l5Var) {
        this.c = frameLayout;
        this.e = d6Var;
        this.f = e3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = l5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new yc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    break;
                } else {
                    a80 F = a80.F(e3Var.container, d6Var, frameLayout2);
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
                gd0 gd0Var = (gd0) this.d;
                gd0 gd0Var2 = (gd0) this.e;
                gd0 gd0Var3 = (gd0) this.f;
                gd0 gd0Var4 = (gd0) this.h;
                yt ytVar = (yt) this.n;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.r;
                zArr[0] = false;
                du.j((du) ytVar.c, ytVar.a, ytVar.b, (int) (e5.c(null, gd0Var, gd0Var2, gd0Var3, gd0Var4) / 1000), this.b[0]);
                runnable = z2Var.a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    public /* synthetic */ a2(boolean[] zArr, gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, gd0 gd0Var4, yt ytVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.c = zArr;
        this.d = gd0Var;
        this.e = gd0Var2;
        this.f = gd0Var3;
        this.h = gd0Var4;
        this.n = ytVar;
        this.b = iArr;
        this.r = z2Var;
    }
}
