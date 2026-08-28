package kh;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g9 extends f2.d1 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ g9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.a = i9;
        this.c = notificationCenterDelegate;
    }

    @Override // f2.d1
    public void a(RecyclerView recyclerView, int i9) {
        boolean z10;
        ik0 ik0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.a) {
            case 0:
                n9 n9Var = (n9) this.c;
                wk0 wk0Var = n9Var.f;
                t9 t9Var = n9Var.S;
                if (i9 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                    if (z10 && n9Var.x != null) {
                        t9Var.f1();
                    }
                }
                if (i9 == 0) {
                    n9Var.O = !wk0Var.canScrollVertically(-1);
                    wk0Var.canScrollVertically(1);
                }
                n9Var.I = i9 != 0;
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                kl klVar = chatAttachAlertPhotoLayout.A;
                ki kiVar = chatAttachAlertPhotoLayout.b;
                if (i9 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = kiVar.W0;
                    int dp2 = dp + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = kiVar.getBackgroundPaddingTop();
                    if (((kiVar.X1[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (kiVar.K0.getAlpha() * kiVar.K0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var = (ik0) klVar.K(0)) != null) {
                        View view = ik0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            klVar.v0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // f2.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        int i11;
        int i12;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                n9 n9Var = (n9) this.c;
                t9 t9Var = n9Var.S;
                wk0 wk0Var = n9Var.f;
                boolean canScrollVertically = wk0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    n9Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                n9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) t9Var).containerView;
                viewGroup.invalidate();
                if (n9Var.a == 6 && wk0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(wk0Var.getChildAt(0));
                    i11 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i11).getStoriesController().L.size()) {
                        i12 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                        MessagesController.getInstance(i12).getStoriesController().P();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.y6 y6Var = (org.telegram.ui.y6) this.c;
                if (y6Var.c.L0() <= 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) y6Var).actionBar;
                    if (!kVar.s()) {
                        z10 = false;
                        org.telegram.ui.y6.a0(y6Var, z10);
                        if (this.b == y6Var.R.Z()) {
                            this.b = y6Var.R.Z();
                            y6Var.R.invalidate();
                            break;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.y6.a0(y6Var, z10);
                if (this.b == y6Var.R.Z()) {
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                ki kiVar = chatAttachAlertPhotoLayout.b;
                kl klVar = chatAttachAlertPhotoLayout.A;
                if (klVar.getChildCount() > 0) {
                    kiVar.X1(chatAttachAlertPhotoLayout, i10);
                    if (chatAttachAlertPhotoLayout.C.h() > 30) {
                        boolean z11 = this.b;
                        boolean z12 = kiVar.N;
                        if (z11 != z12) {
                            this.b = z12;
                            klVar.getFastScroll().animate().alpha(this.b ? 1.0f : 0.0f).setDuration(100L).start();
                        }
                    } else {
                        klVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i10 != 0) {
                        chatAttachAlertPhotoLayout.U();
                        break;
                    }
                }
                break;
        }
    }
}
