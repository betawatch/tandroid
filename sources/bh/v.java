package bh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ v(x xVar, int i10) {
        this.a = i10;
        this.b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                x xVar = this.b;
                xVar.e = xVar.b();
                int i10 = xVar.f;
                int i11 = xVar.h;
                un unVar = xVar.a;
                if (xVar.b == null) {
                    w wVar = new w((unVar.getUserConfig().getClientUserId() > unVar.a() ? 1 : (unVar.getUserConfig().getClientUserId() == unVar.a() ? 0 : -1)) == 0 ? 3 : 0, unVar.getCurrentAccount(), xVar.getContext(), xVar.a, unVar.getResourceProvider());
                    wVar.m1 = 1.0f;
                    wVar.setWillNotDraw(false);
                    xVar.b = wVar;
                    int dp = AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : i11);
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i11 = 0;
                    }
                    wVar.setPadding(dp, dp2, dp3 + i11, AndroidUtilities.dp(i10));
                    xVar.b.setDelegate(new rb.c(xVar, 9));
                    xVar.b.setClipChildren(false);
                    xVar.b.setClipToPadding(false);
                    xVar.addView(xVar.b, gb1.i(-2, i10 + 70, 5));
                }
                xVar.c(false);
                if (!xVar.b.isEnabled()) {
                    xVar.x = false;
                    xVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    xVar.x = true;
                    xVar.b.p(xVar.e, unVar.l8, true);
                    xVar.b.r(false);
                    break;
                }
        }
    }
}
