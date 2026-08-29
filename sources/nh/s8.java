package nh;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class s8 extends f2.a1 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ s8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // f2.a1
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        vk0 vk0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.a) {
            case 0:
                y8 y8Var = (y8) this.c;
                jl0 jl0Var = y8Var.f;
                e9 e9Var = y8Var.S;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                    if (z10 && y8Var.x != null) {
                        e9Var.f1();
                    }
                }
                if (i10 == 0) {
                    y8Var.O = !jl0Var.canScrollVertically(-1);
                    jl0Var.canScrollVertically(1);
                }
                y8Var.I = i10 != 0;
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                ol olVar = chatAttachAlertPhotoLayout.A;
                ni niVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = niVar.W0;
                    int dp2 = dp + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = niVar.getBackgroundPaddingTop();
                    if (((niVar.X1[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (niVar.K0.getAlpha() * niVar.K0.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var = (vk0) olVar.K(0)) != null) {
                        View view = vk0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            olVar.v0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // f2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        int i12;
        int i13;
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        switch (this.a) {
            case 0:
                y8 y8Var = (y8) this.c;
                e9 e9Var = y8Var.S;
                jl0 jl0Var = y8Var.f;
                boolean canScrollVertically = jl0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    y8Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                y8Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) e9Var).containerView;
                viewGroup.invalidate();
                if (y8Var.a == 6 && jl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(jl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.x6 x6Var = (org.telegram.ui.x6) this.c;
                if (x6Var.c.L0() <= 0) {
                    lVar = ((org.telegram.ui.ActionBar.o2) x6Var).actionBar;
                    if (!lVar.s()) {
                        z10 = false;
                        org.telegram.ui.x6.b0(x6Var, z10);
                        if (this.b == x6Var.R.Z()) {
                            this.b = x6Var.R.Z();
                            x6Var.R.invalidate();
                            break;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.x6.b0(x6Var, z10);
                if (this.b == x6Var.R.Z()) {
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                ni niVar = chatAttachAlertPhotoLayout.b;
                ol olVar = chatAttachAlertPhotoLayout.A;
                if (olVar.getChildCount() > 0) {
                    niVar.X1(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.C.h() > 30) {
                        boolean z11 = this.b;
                        boolean z12 = niVar.N;
                        if (z11 != z12) {
                            this.b = z12;
                            olVar.getFastScroll().animate().alpha(this.b ? 1.0f : 0.0f).setDuration(100L).start();
                        }
                    } else {
                        olVar.getFastScroll().setAlpha(0.0f);
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
