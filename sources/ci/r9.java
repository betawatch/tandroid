package ci;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.wl;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class r9 extends s4.s0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ r9(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.c = frameLayout;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        il0 il0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.a) {
            case 0:
                x9 x9Var = (x9) this.c;
                zl0 zl0Var = x9Var.f;
                ea eaVar = x9Var.W;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                    if (z10 && x9Var.x != null) {
                        eaVar.f1();
                    }
                }
                if (i10 == 0) {
                    x9Var.S = !zl0Var.canScrollVertically(-1);
                    zl0Var.canScrollVertically(1);
                }
                x9Var.M = i10 != 0;
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                wl wlVar = chatAttachAlertPhotoLayout.E;
                xi xiVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = xiVar.a1;
                    int dp2 = dp + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = xiVar.getBackgroundPaddingTop();
                    if (((xiVar.b2[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (xiVar.O0.getAlpha() * xiVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var = (il0) wlVar.K(0)) != null) {
                        View view = il0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            wlVar.w0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                x9 x9Var = (x9) this.c;
                ea eaVar = x9Var.W;
                zl0 zl0Var = x9Var.f;
                boolean canScrollVertically = zl0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    x9Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                x9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) eaVar).containerView;
                viewGroup.invalidate();
                if (x9Var.a == 6 && zl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(zl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        break;
                    }
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                xi xiVar = chatAttachAlertPhotoLayout.b;
                wl wlVar = chatAttachAlertPhotoLayout.E;
                if (wlVar.getChildCount() > 0) {
                    xiVar.W1(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z10 = this.b;
                        boolean z11 = xiVar.R;
                        if (z10 != z11) {
                            this.b = z11;
                            bi.q(wlVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        wlVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.T();
                        break;
                    }
                }
                break;
        }
    }
}
