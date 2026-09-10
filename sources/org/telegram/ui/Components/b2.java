package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ b2(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.h3 h3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.da daVar) {
        this.c = frameLayout;
        this.e = f6Var;
        this.f = h3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = daVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new wc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new bi.f0(17))).j();
                    break;
                } else {
                    w70 F = w70.F(h3Var.container, f6Var, frameLayout2);
                    int i10 = 0;
                    while (true) {
                        int[] iArr2 = this.b;
                        if (i10 >= iArr2.length) {
                            F.i = 1;
                            F.Z();
                            break;
                        } else {
                            F.c(0, strArr[i10], new c3(iArr, runnable2, iArr2[i10]), false);
                            i10++;
                        }
                    }
                }
            default:
                boolean[] zArr = (boolean[]) this.c;
                dd0 dd0Var = (dd0) this.d;
                dd0 dd0Var2 = (dd0) this.e;
                dd0 dd0Var3 = (dd0) this.f;
                dd0 dd0Var4 = (dd0) this.h;
                au auVar = (au) this.n;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.r;
                zArr[0] = false;
                fu.j((fu) auVar.c, auVar.a, auVar.b, (int) (d5.c(null, dd0Var, dd0Var2, dd0Var3, dd0Var4) / 1000), this.b[0]);
                runnable = c3Var.a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    public /* synthetic */ b2(boolean[] zArr, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, dd0 dd0Var4, au auVar, int[] iArr, org.telegram.ui.ActionBar.c3 c3Var) {
        this.c = zArr;
        this.d = dd0Var;
        this.e = dd0Var2;
        this.f = dd0Var3;
        this.h = dd0Var4;
        this.n = auVar;
        this.b = iArr;
        this.r = c3Var;
    }
}
