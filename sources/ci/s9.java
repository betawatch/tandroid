package ci;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class s9 extends s4.s0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ s9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        gl0 gl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.a) {
            case 0:
                y9 y9Var = (y9) this.c;
                wl0 wl0Var = y9Var.f;
                fa faVar = y9Var.W;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
                    if (z10 && y9Var.x != null) {
                        faVar.f1();
                    }
                }
                if (i10 == 0) {
                    y9Var.S = !wl0Var.canScrollVertically(-1);
                    wl0Var.canScrollVertically(1);
                }
                y9Var.M = i10 != 0;
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                ul ulVar = chatAttachAlertPhotoLayout.E;
                wi wiVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = wiVar.a1;
                    int dp2 = dp + (u0Var != null ? AndroidUtilities.dp(u0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
                    if (((wiVar.b2[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (wiVar.O0.getAlpha() * wiVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gl0Var = (gl0) ulVar.K(0)) != null) {
                        View view = gl0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            ulVar.v0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    @Override // s4.s0
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
                y9 y9Var = (y9) this.c;
                fa faVar = y9Var.W;
                wl0 wl0Var = y9Var.f;
                boolean canScrollVertically = wl0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    y9Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                y9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) faVar).containerView;
                viewGroup.invalidate();
                if (y9Var.a == 6 && wl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(wl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) this.c;
                if (z6Var.c.L0() <= 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) z6Var).actionBar;
                    if (!kVar.s()) {
                        z10 = false;
                        org.telegram.ui.z6.b0(z6Var, z10);
                        if (this.b == z6Var.V.Z()) {
                            this.b = z6Var.V.Z();
                            z6Var.V.invalidate();
                            break;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.z6.b0(z6Var, z10);
                if (this.b == z6Var.V.Z()) {
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                wi wiVar = chatAttachAlertPhotoLayout.b;
                ul ulVar = chatAttachAlertPhotoLayout.E;
                if (ulVar.getChildCount() > 0) {
                    wiVar.X1(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.b;
                        boolean z12 = wiVar.R;
                        if (z11 != z12) {
                            this.b = z12;
                            ok.r(ulVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        ulVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.V();
                        break;
                    }
                }
                break;
        }
    }
}
