package lh;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d9 extends f2.b1 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ d9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // f2.b1
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        lk0 lk0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.a) {
            case 0:
                k9 k9Var = (k9) this.c;
                zk0 zk0Var = k9Var.f;
                q9 q9Var = k9Var.S;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
                    if (z10 && k9Var.x != null) {
                        q9Var.f1();
                    }
                }
                if (i10 == 0) {
                    k9Var.O = !zk0Var.canScrollVertically(-1);
                    zk0Var.canScrollVertically(1);
                }
                k9Var.I = i10 != 0;
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                gl glVar = chatAttachAlertPhotoLayout.A;
                gi giVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = giVar.W0;
                    int dp2 = dp + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = giVar.getBackgroundPaddingTop();
                    if (((giVar.X1[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (giVar.K0.getAlpha() * giVar.K0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (lk0Var = (lk0) glVar.K(0)) != null) {
                        View view = lk0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            glVar.v0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // f2.b1
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
                k9 k9Var = (k9) this.c;
                q9 q9Var = k9Var.S;
                zk0 zk0Var = k9Var.f;
                boolean canScrollVertically = zk0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    k9Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                k9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) q9Var).containerView;
                viewGroup.invalidate();
                if (k9Var.a == 6 && zk0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(zk0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) this.c;
                if (z6Var.c.L0() <= 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) z6Var).actionBar;
                    if (!kVar.t()) {
                        z10 = false;
                        org.telegram.ui.z6.b0(z6Var, z10);
                        if (this.b == z6Var.R.Z()) {
                            this.b = z6Var.R.Z();
                            z6Var.R.invalidate();
                            break;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.z6.b0(z6Var, z10);
                if (this.b == z6Var.R.Z()) {
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                gi giVar = chatAttachAlertPhotoLayout.b;
                gl glVar = chatAttachAlertPhotoLayout.A;
                if (glVar.getChildCount() > 0) {
                    giVar.X1(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.C.h() > 30) {
                        boolean z11 = this.b;
                        boolean z12 = giVar.N;
                        if (z11 != z12) {
                            this.b = z12;
                            glVar.getFastScroll().animate().alpha(this.b ? 1.0f : 0.0f).setDuration(100L).start();
                        }
                    } else {
                        glVar.getFastScroll().setAlpha(0.0f);
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
