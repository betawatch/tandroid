package ci;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class v9 extends s4.s0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
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
                ba baVar = (ba) this.c;
                vl0 vl0Var = baVar.f;
                ia iaVar = baVar.W;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                    if (z10 && baVar.x != null) {
                        iaVar.f1();
                    }
                }
                if (i10 == 0) {
                    baVar.S = !vl0Var.canScrollVertically(-1);
                    vl0Var.canScrollVertically(1);
                }
                baVar.M = i10 != 0;
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                tl tlVar = chatAttachAlertPhotoLayout.E;
                vi viVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.a1;
                    int dp2 = dp + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.b2[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (viVar.O0.getAlpha() * viVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (fl0Var = (fl0) tlVar.L(0)) != null) {
                        View view = fl0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            tlVar.w0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    @Override // s4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        int i12;
        int i13;
        boolean z10;
        le.b bVar;
        boolean z11;
        org.telegram.ui.h6 h6Var;
        org.telegram.ui.w6 w6Var;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                ba baVar = (ba) this.c;
                ia iaVar = baVar.W;
                vl0 vl0Var = baVar.f;
                boolean canScrollVertically = vl0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    baVar.r.invalidate();
                    this.b = canScrollVertically;
                }
                baVar.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) iaVar).containerView;
                viewGroup.invalidate();
                if (baVar.a == 6 && vl0Var.getChildCount() > 0) {
                    int S = RecyclerView.S(vl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    if (S >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) this.c;
                boolean z12 = false;
                if (!z6Var.b.canScrollVertically(-1)) {
                    kVar = ((org.telegram.ui.ActionBar.n2) z6Var).actionBar;
                    if (!kVar.s()) {
                        z10 = false;
                        bVar = z6Var.Q;
                        if (bVar != null) {
                            bVar.a(z10, true);
                        }
                        z6Var.z0();
                        z11 = this.b;
                        h6Var = z6Var.Z;
                        w6Var = h6Var.z0;
                        if (z11 == (w6Var == null && w6Var.isAttachedToWindow() && h6Var.z0.getTop() <= h6Var.E0)) {
                            org.telegram.ui.h6 h6Var2 = z6Var.Z;
                            org.telegram.ui.w6 w6Var2 = h6Var2.z0;
                            if (w6Var2 != null && w6Var2.isAttachedToWindow() && h6Var2.z0.getTop() <= h6Var2.E0) {
                                z12 = true;
                            }
                            this.b = z12;
                            z6Var.Z.invalidate();
                            break;
                        }
                    }
                }
                z10 = true;
                bVar = z6Var.Q;
                if (bVar != null) {
                }
                z6Var.z0();
                z11 = this.b;
                h6Var = z6Var.Z;
                w6Var = h6Var.z0;
                if (z11 == (w6Var == null && w6Var.isAttachedToWindow() && h6Var.z0.getTop() <= h6Var.E0)) {
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                vi viVar = chatAttachAlertPhotoLayout.b;
                tl tlVar = chatAttachAlertPhotoLayout.E;
                if (tlVar.getChildCount() > 0) {
                    viVar.X1(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z13 = this.b;
                        boolean z14 = viVar.R;
                        if (z13 != z14) {
                            this.b = z14;
                            rk.r(tlVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        tlVar.getFastScroll().setAlpha(0.0f);
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
