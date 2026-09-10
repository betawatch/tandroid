package bi;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yl;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class eb extends s4.s0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ eb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        fl0 fl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.a) {
            case 0:
                kb kbVar = (kb) this.c;
                vl0 vl0Var = kbVar.f;
                rb rbVar = kbVar.W;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                    if (z10 && kbVar.x != null) {
                        rbVar.f1();
                    }
                }
                if (i10 == 0) {
                    kbVar.S = !vl0Var.canScrollVertically(-1);
                    vl0Var.canScrollVertically(1);
                }
                kbVar.M = i10 != 0;
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                yl ylVar = chatAttachAlertPhotoLayout.E;
                yi yiVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = yiVar.a1;
                    int dp2 = dp + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
                    if (((yiVar.b2[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (yiVar.O0.getAlpha() * yiVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var = (fl0) ylVar.K(0)) != null) {
                        View view = fl0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            ylVar.v0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // s4.s0
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
                kb kbVar = (kb) this.c;
                rb rbVar = kbVar.W;
                vl0 vl0Var = kbVar.f;
                boolean canScrollVertically = vl0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    kbVar.r.invalidate();
                    this.b = canScrollVertically;
                }
                kbVar.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) rbVar).containerView;
                viewGroup.invalidate();
                if (kbVar.a == 6 && vl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(vl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.y6 y6Var = (org.telegram.ui.y6) this.c;
                if (y6Var.c.L0() <= 0) {
                    lVar = ((org.telegram.ui.ActionBar.p2) y6Var).actionBar;
                    if (!lVar.s()) {
                        z10 = false;
                        org.telegram.ui.y6.b0(y6Var, z10);
                        if (this.b == y6Var.V.Z()) {
                            this.b = y6Var.V.Z();
                            y6Var.V.invalidate();
                            break;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.y6.b0(y6Var, z10);
                if (this.b == y6Var.V.Z()) {
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                yi yiVar = chatAttachAlertPhotoLayout.b;
                yl ylVar = chatAttachAlertPhotoLayout.E;
                if (ylVar.getChildCount() > 0) {
                    yiVar.X1(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.b;
                        boolean z12 = yiVar.R;
                        if (z11 != z12) {
                            this.b = z12;
                            ylVar.getFastScroll().animate().alpha(this.b ? 1.0f : 0.0f).setDuration(100L).start();
                        }
                    } else {
                        ylVar.getFastScroll().setAlpha(0.0f);
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
