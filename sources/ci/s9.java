package ci;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class s9 extends s4.t0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // s4.t0
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        am0 am0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.a) {
            case 0:
                y9 y9Var = (y9) this.c;
                qm0 qm0Var = y9Var.f;
                fa faVar = y9Var.W;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) faVar).keyboardVisible;
                    if (z10 && y9Var.x != null) {
                        faVar.g1();
                    }
                }
                if (i10 == 0) {
                    y9Var.S = !qm0Var.canScrollVertically(-1);
                    qm0Var.canScrollVertically(1);
                }
                y9Var.M = i10 != 0;
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                km kmVar = chatAttachAlertPhotoLayout.E;
                yi yiVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = yiVar.d1;
                    int dp2 = dp + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
                    if (((yiVar.e2[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (yiVar.R0.getAlpha() * yiVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (am0Var = (am0) kmVar.K(0)) != null) {
                        View view = am0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            kmVar.v0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (i10 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.v4) this.c).e();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    @Override // s4.t0
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
                qm0 qm0Var = y9Var.f;
                boolean canScrollVertically = qm0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    y9Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                y9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) faVar).containerView;
                viewGroup.invalidate();
                if (y9Var.a == 6 && qm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(qm0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) faVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) faVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.y6 y6Var = (org.telegram.ui.y6) this.c;
                if (y6Var.c.L0() <= 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) y6Var).actionBar;
                    if (!kVar.t()) {
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
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                yi yiVar = chatAttachAlertPhotoLayout.b;
                km kmVar = chatAttachAlertPhotoLayout.E;
                if (kmVar.getChildCount() > 0) {
                    yiVar.b2(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.b;
                        boolean z12 = yiVar.R;
                        if (z11 != z12) {
                            this.b = z12;
                            bi.s(kmVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        kmVar.getFastScroll().setAlpha(0.0f);
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

    public s9(org.telegram.ui.Wallet.v4 v4Var) {
        this.a = 3;
        this.c = v4Var;
        this.b = false;
    }
}
