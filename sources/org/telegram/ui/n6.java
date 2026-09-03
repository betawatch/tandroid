package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n6 extends f2.z0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ n6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // f2.z0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Components.dl0 dl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        boolean z4;
        switch (this.a) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                org.telegram.ui.Components.ol olVar = chatAttachAlertPhotoLayout.B;
                org.telegram.ui.Components.li liVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = liVar.X0;
                    int dp2 = dp + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = liVar.getBackgroundPaddingTop();
                    if (((liVar.Y1[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (liVar.L0.getAlpha() * liVar.L0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (dl0Var = (org.telegram.ui.Components.dl0) olVar.K(0)) != null) {
                        View view = dl0Var.a;
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
            case 2:
                ph.y7 y7Var = (ph.y7) this.c;
                org.telegram.ui.Components.rl0 rl0Var = y7Var.f;
                ph.e8 e8Var = y7Var.T;
                if (i10 == 1) {
                    z4 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                    if (z4 && y7Var.x != null) {
                        e8Var.f1();
                    }
                }
                if (i10 == 0) {
                    y7Var.P = !rl0Var.canScrollVertically(-1);
                    rl0Var.canScrollVertically(1);
                }
                y7Var.J = i10 != 0;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    @Override // f2.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z4;
        org.telegram.ui.ActionBar.k kVar;
        ViewGroup viewGroup;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                d7 d7Var = (d7) this.c;
                if (d7Var.c.L0() <= 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) d7Var).actionBar;
                    if (!kVar.s()) {
                        z4 = false;
                        d7.b0(d7Var, z4);
                        if (this.b == d7Var.S.Z()) {
                            this.b = d7Var.S.Z();
                            d7Var.S.invalidate();
                            break;
                        }
                    }
                }
                z4 = true;
                d7.b0(d7Var, z4);
                if (this.b == d7Var.S.Z()) {
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                org.telegram.ui.Components.li liVar = chatAttachAlertPhotoLayout.b;
                org.telegram.ui.Components.ol olVar = chatAttachAlertPhotoLayout.B;
                if (olVar.getChildCount() > 0) {
                    liVar.X1(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.D.h() > 30) {
                        boolean z10 = this.b;
                        boolean z11 = liVar.O;
                        if (z10 != z11) {
                            this.b = z11;
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
            default:
                ph.y7 y7Var = (ph.y7) this.c;
                ph.e8 e8Var = y7Var.T;
                org.telegram.ui.Components.rl0 rl0Var = y7Var.f;
                boolean canScrollVertically = rl0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    y7Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                y7Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) e8Var).containerView;
                viewGroup.invalidate();
                if (y7Var.a == 6 && rl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(rl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
        }
    }
}
