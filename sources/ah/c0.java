package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.co;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ c0(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                g0 g0Var = this.b;
                g0Var.e = g0Var.b();
                int i10 = g0Var.f;
                int i11 = g0Var.h;
                co coVar = g0Var.a;
                if (g0Var.b == null) {
                    f0 f0Var = new f0((coVar.getUserConfig().getClientUserId() > coVar.a() ? 1 : (coVar.getUserConfig().getClientUserId() == coVar.a() ? 0 : -1)) == 0 ? 3 : 0, coVar.getCurrentAccount(), g0Var.getContext(), g0Var.a, coVar.getResourceProvider());
                    f0Var.l1 = 1.0f;
                    f0Var.setWillNotDraw(false);
                    g0Var.b = f0Var;
                    int dp = AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : i11);
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i11 = 0;
                    }
                    f0Var.setPadding(dp, dp2, dp3 + i11, AndroidUtilities.dp(i10));
                    g0Var.b.setDelegate(new a6.m(g0Var, 1));
                    g0Var.b.setClipChildren(false);
                    g0Var.b.setClipToPadding(false);
                    g0Var.addView(g0Var.b, x5.e(-2, i10 + 70, 5));
                }
                g0Var.c(false);
                if (!g0Var.b.isEnabled()) {
                    g0Var.x = false;
                    g0Var.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    g0Var.x = true;
                    g0Var.b.p(g0Var.e, coVar.Z7, true);
                    g0Var.b.r(false);
                    break;
                }
        }
    }
}
