package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ c2(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.gg ggVar) {
        this.c = frameLayout;
        this.e = c6Var;
        this.f = f3Var;
        this.d = frameLayout2;
        this.b = iArr;
        this.n = strArr;
        this.h = iArr2;
        this.r = ggVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new tc(frameLayout, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ag.o0(29))).j();
                    break;
                } else {
                    j70 F = j70.F(f3Var.container, c6Var, frameLayout2);
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
                qc0 qc0Var = (qc0) this.d;
                qc0 qc0Var2 = (qc0) this.e;
                qc0 qc0Var3 = (qc0) this.f;
                qc0 qc0Var4 = (qc0) this.h;
                jh.g0 g0Var = (jh.g0) this.n;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.r;
                zArr[0] = false;
                st.j((st) g0Var.c, g0Var.a, g0Var.b, (int) (c5.c(null, qc0Var, qc0Var2, qc0Var3, qc0Var4) / 1000), this.b[0]);
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    public /* synthetic */ c2(boolean[] zArr, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, qc0 qc0Var4, jh.g0 g0Var, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.c = zArr;
        this.d = qc0Var;
        this.e = qc0Var2;
        this.f = qc0Var3;
        this.h = qc0Var4;
        this.n = g0Var;
        this.b = iArr;
        this.r = a3Var;
    }
}
