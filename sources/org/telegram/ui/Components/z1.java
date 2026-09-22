package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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

    public /* synthetic */ z1(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.n5 n5Var) {
        this.c = frameLayout;
        this.e = f6Var;
        this.f = f3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = n5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    break;
                } else {
                    y70 F = y70.F(f3Var.container, f6Var, frameLayout2);
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
                fd0 fd0Var = (fd0) this.d;
                fd0 fd0Var2 = (fd0) this.e;
                fd0 fd0Var3 = (fd0) this.f;
                fd0 fd0Var4 = (fd0) this.h;
                wt wtVar = (wt) this.n;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.r;
                zArr[0] = false;
                bu.j((bu) wtVar.c, wtVar.a, wtVar.b, (int) (d5.c(null, fd0Var, fd0Var2, fd0Var3, fd0Var4) / 1000), this.b[0]);
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    public /* synthetic */ z1(boolean[] zArr, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3, fd0 fd0Var4, wt wtVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.c = zArr;
        this.d = fd0Var;
        this.e = fd0Var2;
        this.f = fd0Var3;
        this.h = fd0Var4;
        this.n = wtVar;
        this.b = iArr;
        this.r = a3Var;
    }
}
