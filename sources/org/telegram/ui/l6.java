package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        org.telegram.ui.Components.fl0 fl0Var;
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
                    if (((miVar.Y1[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (miVar.L0.getAlpha() * miVar.L0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (fl0Var = (org.telegram.ui.Components.fl0) qlVar.K(0)) != null) {
                        View view = fl0Var.a;
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
                qh.x7 x7Var = (qh.x7) this.c;
                org.telegram.ui.Components.tl0 tl0Var = x7Var.f;
                qh.d8 d8Var = x7Var.T;
                if (i10 == 1) {
                    z4 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
                    if (z4 && x7Var.x != null) {
                        d8Var.f1();
                    }
                }
                if (i10 == 0) {
                    x7Var.P = !tl0Var.canScrollVertically(-1);
                    tl0Var.canScrollVertically(1);
                }
                x7Var.J = i10 != 0;
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
                qh.x7 x7Var = (qh.x7) this.c;
                qh.d8 d8Var = x7Var.T;
                org.telegram.ui.Components.tl0 tl0Var = x7Var.f;
                boolean canScrollVertically = tl0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    x7Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                x7Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) d8Var).containerView;
                viewGroup.invalidate();
                if (x7Var.a == 6 && tl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(tl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
        }
    }
}
