package kg;

import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ t(v vVar, int i10) {
        this.a = i10;
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
                int i10 = vVar.f;
                int i11 = vVar.h;
                tn tnVar = vVar.a;
                if (vVar.b == null) {
                    u uVar = new u((tnVar.getUserConfig().getClientUserId() > tnVar.a() ? 1 : (tnVar.getUserConfig().getClientUserId() == tnVar.a() ? 0 : -1)) == 0 ? 3 : 0, tnVar.getCurrentAccount(), vVar.getContext(), vVar.a, tnVar.getResourceProvider());
                    uVar.h1 = 1.0f;
                    uVar.setWillNotDraw(false);
                    vVar.b = uVar;
                    int dp = AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : i11);
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i11 = 0;
                    }
                    uVar.setPadding(dp, dp2, dp3 + i11, AndroidUtilities.dp(i10));
                    vVar.b.setDelegate(new ha.c(vVar, 22));
                    vVar.b.setClipChildren(false);
                    vVar.b.setClipToPadding(false);
                    vVar.addView(vVar.b, f6.e(-2, i10 + 70, 5));
                }
                vVar.c(false);
                if (!vVar.b.isEnabled()) {
                    vVar.x = false;
                    vVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    vVar.x = true;
                    vVar.b.p(vVar.e, tnVar.V7, true);
                    vVar.b.r(false);
                    break;
                }
        }
    }
}
