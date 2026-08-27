package ig;

import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                rn rnVar = vVar.a;
                if (vVar.b == null) {
                    u uVar = new u((rnVar.getUserConfig().getClientUserId() > rnVar.a() ? 1 : (rnVar.getUserConfig().getClientUserId() == rnVar.a() ? 0 : -1)) == 0 ? 3 : 0, rnVar.getCurrentAccount(), vVar.getContext(), vVar.a, rnVar.getResourceProvider());
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
                    vVar.b.setDelegate(new ga.c(vVar, 18));
                    vVar.b.setClipChildren(false);
                    vVar.b.setClipToPadding(false);
                    vVar.addView(vVar.b, z5.e(-2, i10 + 70, 5));
                }
                vVar.c(false);
                if (!vVar.b.isEnabled()) {
                    vVar.x = false;
                    vVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    vVar.x = true;
                    vVar.b.p(vVar.e, rnVar.V7, true);
                    vVar.b.r(false);
                    break;
                }
        }
    }
}
