package hg;

import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ t(v vVar, int i9) {
        this.a = i9;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                v vVar = this.b;
                vVar.e = vVar.b();
                int i9 = vVar.f;
                int i10 = vVar.h;
                qn qnVar = vVar.a;
                if (vVar.b == null) {
                    u uVar = new u((qnVar.getUserConfig().getClientUserId() > qnVar.a() ? 1 : (qnVar.getUserConfig().getClientUserId() == qnVar.a() ? 0 : -1)) == 0 ? 3 : 0, qnVar.getCurrentAccount(), vVar.getContext(), vVar.a, qnVar.getResourceProvider());
                    uVar.h1 = 1.0f;
                    uVar.setWillNotDraw(false);
                    vVar.b = uVar;
                    int dp = AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : i10);
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i10 = 0;
                    }
                    uVar.setPadding(dp, dp2, dp3 + i10, AndroidUtilities.dp(i9));
                    vVar.b.setDelegate(new xa.c(vVar, 18));
                    vVar.b.setClipChildren(false);
                    vVar.b.setClipToPadding(false);
                    vVar.addView(vVar.b, e6.e(-2, i9 + 70, 5));
                }
                vVar.c(false);
                if (!vVar.b.isEnabled()) {
                    vVar.x = false;
                    vVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    vVar.x = true;
                    vVar.b.p(vVar.e, qnVar.V7, true);
                    vVar.b.r(false);
                    break;
                }
        }
    }
}
