package fi;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h8 extends v4.s0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h8(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.c = frameLayout;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        xi0 xi0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                n8 n8Var = (n8) obj;
                pj0 pj0Var = n8Var.f;
                if (i7 == 1) {
                    s8 s8Var = n8Var.W;
                    int i11 = s8.X1;
                    if (s8Var.d && n8Var.y != null) {
                        s8Var.M0();
                    }
                }
                if (i7 == 0) {
                    n8Var.S = !pj0Var.canScrollVertically(-1);
                    pj0Var.canScrollVertically(1);
                }
                n8Var.M = i7 != 0;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                il ilVar = chatAttachAlertPhotoLayout.E;
                ci ciVar = chatAttachAlertPhotoLayout.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = ciVar.X2;
                    int L2 = L + (r0Var != null ? org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f) : 0);
                    int i12 = ciVar.s0;
                    if (((ciVar.Y3[0] - i12) - L2) + i12 < (ciVar.L2.getAlpha() * ciVar.L2.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var = (xi0) ilVar.K(0)) != null) {
                        View view = xi0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            ilVar.w0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i7 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.v5) obj).f();
                    break;
                }
                break;
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                n8 n8Var = (n8) obj;
                s8 s8Var = n8Var.W;
                pj0 pj0Var = n8Var.f;
                boolean canScrollVertically = pj0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    n8Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                n8Var.e.invalidate();
                int i12 = s8.X1;
                s8Var.b.invalidate();
                if (n8Var.a == 6 && pj0Var.getChildCount() > 0 && RecyclerView.R(pj0Var.getChildAt(0)) >= qp.s1(s8Var.a).P1().L.size()) {
                    qp.s1(s8Var.a).P1().S();
                    break;
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ci ciVar = chatAttachAlertPhotoLayout.b;
                il ilVar = chatAttachAlertPhotoLayout.E;
                if (ilVar.getChildCount() > 0) {
                    ciVar.M1(chatAttachAlertPhotoLayout, i10);
                    if (chatAttachAlertPhotoLayout.G.b() > 30) {
                        boolean z9 = this.b;
                        boolean z10 = ciVar.L1;
                        if (z9 != z10) {
                            this.b = z10;
                            org.telegram.messenger.camera.q.k(ilVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        ilVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i10 != 0) {
                        chatAttachAlertPhotoLayout.X();
                        break;
                    }
                }
                break;
            default:
                if (i7 != 0 || i10 != 0) {
                    this.b = true;
                    break;
                }
        }
    }

    public h8(org.telegram.ui.Wallet.v5 v5Var) {
        this.a = 2;
        this.c = v5Var;
        this.b = false;
    }
}
