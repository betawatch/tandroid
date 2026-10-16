package di;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.sk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class r9 extends s4.r0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // s4.r0
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        wl0 wl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.a) {
            case 0:
                x9 x9Var = (x9) this.c;
                mm0 mm0Var = x9Var.f;
                ea eaVar = x9Var.W;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.e3) eaVar).keyboardVisible;
                    if (z10 && x9Var.x != null) {
                        eaVar.g1();
                    }
                }
                if (i10 == 0) {
                    x9Var.S = !mm0Var.canScrollVertically(-1);
                    mm0Var.canScrollVertically(1);
                }
                x9Var.M = i10 != 0;
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                gm gmVar = chatAttachAlertPhotoLayout.E;
                vi viVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = viVar.d1;
                    int dp2 = dp + (u0Var != null ? AndroidUtilities.dp(u0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.e2[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (viVar.R0.getAlpha() * viVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var = (wl0) gmVar.K(0)) != null) {
                        View view = wl0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            gmVar.v0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (i10 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.w4) this.c).e();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    @Override // s4.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        int i12;
        int i13;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                x9 x9Var = (x9) this.c;
                ea eaVar = x9Var.W;
                mm0 mm0Var = x9Var.f;
                boolean canScrollVertically = mm0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    x9Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                x9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) eaVar).containerView;
                viewGroup.invalidate();
                if (x9Var.a == 6 && mm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(mm0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.d7 d7Var = (org.telegram.ui.d7) this.c;
                if (d7Var.c.L0() <= 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) d7Var).actionBar;
                    if (!kVar.t()) {
                        z10 = false;
                        org.telegram.ui.d7.b0(d7Var, z10);
                        if (this.b == d7Var.V.Z()) {
                            this.b = d7Var.V.Z();
                            d7Var.V.invalidate();
                            break;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.d7.b0(d7Var, z10);
                if (this.b == d7Var.V.Z()) {
                }
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                vi viVar = chatAttachAlertPhotoLayout.b;
                gm gmVar = chatAttachAlertPhotoLayout.E;
                if (gmVar.getChildCount() > 0) {
                    viVar.b2(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.b;
                        boolean z12 = viVar.R;
                        if (z11 != z12) {
                            this.b = z12;
                            sk.s(gmVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        gmVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.V();
                        break;
                    }
                }
                break;
            default:
                if (i10 != 0 || i11 != 0) {
                    this.b = true;
                    break;
                }
        }
    }

    public r9(org.telegram.ui.Wallet.w4 w4Var) {
        this.a = 3;
        this.c = w4Var;
        this.b = false;
    }
}
