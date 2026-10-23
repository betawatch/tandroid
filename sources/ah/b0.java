package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.sn;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ b0(f0 f0Var, int i10) {
        this.a = i10;
        this.b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                f0 f0Var = this.b;
                f0Var.e = f0Var.b();
                int i10 = f0Var.f;
                int i11 = f0Var.h;
                sn snVar = f0Var.a;
                if (f0Var.b == null) {
                    e0 e0Var = new e0((snVar.getUserConfig().getClientUserId() > snVar.a() ? 1 : (snVar.getUserConfig().getClientUserId() == snVar.a() ? 0 : -1)) == 0 ? 3 : 0, snVar.getCurrentAccount(), f0Var.getContext(), f0Var.a, snVar.getResourceProvider());
                    e0Var.m1 = 1.0f;
                    e0Var.setWillNotDraw(false);
                    f0Var.b = e0Var;
                    int dp = AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : i11);
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i11 = 0;
                    }
                    e0Var.setPadding(dp, dp2, dp3 + i11, AndroidUtilities.dp(i10));
                    f0Var.b.setDelegate(new qb.c(f0Var, 3));
                    f0Var.b.setClipChildren(false);
                    f0Var.b.setClipToPadding(false);
                    f0Var.addView(f0Var.b, z5.e(-2, i10 + 70, 5));
                }
                f0Var.c(false);
                if (!f0Var.b.isEnabled()) {
                    f0Var.x = false;
                    f0Var.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    f0Var.x = true;
                    f0Var.b.p(f0Var.e, snVar.l8, true);
                    f0Var.b.r(false);
                    break;
                }
        }
    }
}
