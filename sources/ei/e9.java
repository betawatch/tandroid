package ei;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.mk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class e9 extends s4.r0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // s4.r0
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        tl0 tl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.a) {
            case 0:
                k9 k9Var = (k9) this.c;
                jm0 jm0Var = k9Var.f;
                r9 r9Var = k9Var.W;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                    if (z10 && k9Var.x != null) {
                        r9Var.g1();
                    }
                }
                if (i10 == 0) {
                    k9Var.S = !jm0Var.canScrollVertically(-1);
                    jm0Var.canScrollVertically(1);
                }
                k9Var.M = i10 != 0;
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                em emVar = chatAttachAlertPhotoLayout.E;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = tiVar.d1;
                    int dp2 = dp + (u0Var != null ? AndroidUtilities.dp(u0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.e2[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (tiVar.R0.getAlpha() * tiVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (tl0Var = (tl0) emVar.K(0)) != null) {
                        View view = tl0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            emVar.v0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (i10 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.k5) this.c).f();
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
                k9 k9Var = (k9) this.c;
                r9 r9Var = k9Var.W;
                jm0 jm0Var = k9Var.f;
                boolean canScrollVertically = jm0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    k9Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                k9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) r9Var).containerView;
                viewGroup.invalidate();
                if (k9Var.a == 6 && jm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(jm0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.c7 c7Var = (org.telegram.ui.c7) this.c;
                if (c7Var.c.L0() <= 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) c7Var).actionBar;
                    if (!kVar.t()) {
                        z10 = false;
                        org.telegram.ui.c7.b0(c7Var, z10);
                        if (this.b == c7Var.V.Z()) {
                            this.b = c7Var.V.Z();
                            c7Var.V.invalidate();
                            break;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.c7.b0(c7Var, z10);
                if (this.b == c7Var.V.Z()) {
                }
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                em emVar = chatAttachAlertPhotoLayout.E;
                if (emVar.getChildCount() > 0) {
                    tiVar.b2(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.b;
                        boolean z12 = tiVar.R;
                        if (z11 != z12) {
                            this.b = z12;
                            mk.s(emVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        emVar.getFastScroll().setAlpha(0.0f);
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

    public e9(org.telegram.ui.Wallet.k5 k5Var) {
        this.a = 3;
        this.c = k5Var;
        this.b = false;
    }
}
