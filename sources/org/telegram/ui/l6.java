package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l6 extends f2.a1 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ l6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // f2.a1
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Components.el0 el0Var;
        int topScrollOffset;
        int topScrollOffset2;
        boolean z4;
        switch (this.a) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                org.telegram.ui.Components.ql qlVar = chatAttachAlertPhotoLayout.B;
                org.telegram.ui.Components.mi miVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = miVar.X0;
                    int dp2 = dp + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = miVar.getBackgroundPaddingTop();
                    if (((miVar.Y1[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (miVar.L0.getAlpha() * miVar.L0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var = (org.telegram.ui.Components.el0) qlVar.K(0)) != null) {
                        View view = el0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            qlVar.v0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            case 2:
                qh.w7 w7Var = (qh.w7) this.c;
                org.telegram.ui.Components.sl0 sl0Var = w7Var.f;
                qh.c8 c8Var = w7Var.T;
                if (i10 == 1) {
                    z4 = ((org.telegram.ui.ActionBar.h3) c8Var).keyboardVisible;
                    if (z4 && w7Var.x != null) {
                        c8Var.f1();
                    }
                }
                if (i10 == 0) {
                    w7Var.P = !sl0Var.canScrollVertically(-1);
                    sl0Var.canScrollVertically(1);
                }
                w7Var.J = i10 != 0;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    @Override // f2.a1
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
                b7 b7Var = (b7) this.c;
                if (b7Var.c.L0() <= 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) b7Var).actionBar;
                    if (!kVar.s()) {
                        z4 = false;
                        b7.b0(b7Var, z4);
                        if (this.b == b7Var.S.Z()) {
                            this.b = b7Var.S.Z();
                            b7Var.S.invalidate();
                            break;
                        }
                    }
                }
                z4 = true;
                b7.b0(b7Var, z4);
                if (this.b == b7Var.S.Z()) {
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                org.telegram.ui.Components.mi miVar = chatAttachAlertPhotoLayout.b;
                org.telegram.ui.Components.ql qlVar = chatAttachAlertPhotoLayout.B;
                if (qlVar.getChildCount() > 0) {
                    miVar.X1(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.D.h() > 30) {
                        boolean z10 = this.b;
                        boolean z11 = miVar.O;
                        if (z10 != z11) {
                            this.b = z11;
                            qlVar.getFastScroll().animate().alpha(this.b ? 1.0f : 0.0f).setDuration(100L).start();
                        }
                    } else {
                        qlVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.V();
                        break;
                    }
                }
                break;
            default:
                qh.w7 w7Var = (qh.w7) this.c;
                qh.c8 c8Var = w7Var.T;
                org.telegram.ui.Components.sl0 sl0Var = w7Var.f;
                boolean canScrollVertically = sl0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    w7Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                w7Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) c8Var).containerView;
                viewGroup.invalidate();
                if (w7Var.a == 6 && sl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(sl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
        }
    }
}
