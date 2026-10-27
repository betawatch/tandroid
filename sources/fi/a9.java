package fi;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a9 extends s4.u0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a9(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.c = frameLayout;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        wl0 wl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.a) {
            case 0:
                g9 g9Var = (g9) this.c;
                nm0 nm0Var = g9Var.f;
                n9 n9Var = g9Var.W;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                    if (z10 && g9Var.x != null) {
                        n9Var.g1();
                    }
                }
                if (i10 == 0) {
                    g9Var.S = !nm0Var.canScrollVertically(-1);
                    nm0Var.canScrollVertically(1);
                }
                g9Var.M = i10 != 0;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                fm fmVar = chatAttachAlertPhotoLayout.E;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = tiVar.d1;
                    int dp2 = dp + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.e2[0] - backgroundPaddingTop) - dp2) + backgroundPaddingTop < (tiVar.R0.getAlpha() * tiVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var = (wl0) fmVar.K(0)) != null) {
                        View view = wl0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            fmVar.w0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i10 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.i5) this.c).f();
                    break;
                }
                break;
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                g9 g9Var = (g9) this.c;
                n9 n9Var = g9Var.W;
                nm0 nm0Var = g9Var.f;
                boolean canScrollVertically = nm0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    g9Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                g9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.k3) n9Var).containerView;
                viewGroup.invalidate();
                if (g9Var.a == 6 && nm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(nm0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().S();
                        break;
                    }
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                fm fmVar = chatAttachAlertPhotoLayout.E;
                if (fmVar.getChildCount() > 0) {
                    tiVar.f2(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z10 = this.b;
                        boolean z11 = tiVar.R;
                        if (z10 != z11) {
                            this.b = z11;
                            wh.p(fmVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        fmVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.W();
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

    public a9(org.telegram.ui.Wallet.i5 i5Var) {
        this.a = 2;
        this.c = i5Var;
        this.b = false;
    }
}
