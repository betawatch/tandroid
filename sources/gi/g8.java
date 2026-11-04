package gi;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g8 extends u4.t0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g8(int i3, FrameLayout frameLayout) {
        this.a = i3;
        this.c = frameLayout;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        bj0 bj0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                o8 o8Var = (o8) obj;
                tj0 tj0Var = o8Var.f;
                if (i3 == 1) {
                    t8 t8Var = o8Var.a0;
                    int i11 = t8.V1;
                    if (t8Var.d && o8Var.y != null) {
                        t8Var.M0();
                    }
                }
                if (i3 == 0) {
                    o8Var.T = !tj0Var.canScrollVertically(-1);
                    tj0Var.canScrollVertically(1);
                }
                o8Var.N = i3 != 0;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                il ilVar = chatAttachAlertPhotoLayout.F;
                bi biVar = chatAttachAlertPhotoLayout.b;
                if (i3 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = biVar.V2;
                    int L2 = L + (q0Var != null ? org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f) : 0);
                    int i12 = biVar.t0;
                    if (((biVar.W3[0] - i12) - L2) + i12 < (biVar.J2.getAlpha() * biVar.J2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var = (bj0) ilVar.K(0)) != null) {
                        View view = bj0Var.a;
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
                if (i3 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.s5) obj).f();
                    break;
                }
                break;
        }
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                o8 o8Var = (o8) obj;
                t8 t8Var = o8Var.a0;
                tj0 tj0Var = o8Var.f;
                boolean canScrollVertically = tj0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    o8Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                o8Var.e.invalidate();
                int i12 = t8.V1;
                t8Var.b.invalidate();
                if (o8Var.a == 6 && tj0Var.getChildCount() > 0 && RecyclerView.R(tj0Var.getChildAt(0)) >= hp.s1(t8Var.a).P1().L.size()) {
                    hp.s1(t8Var.a).P1().S();
                    break;
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                bi biVar = chatAttachAlertPhotoLayout.b;
                il ilVar = chatAttachAlertPhotoLayout.F;
                if (ilVar.getChildCount() > 0) {
                    biVar.M1(chatAttachAlertPhotoLayout, i10);
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.b;
                        boolean z11 = biVar.J1;
                        if (z10 != z11) {
                            this.b = z11;
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
                if (i3 != 0 || i10 != 0) {
                    this.b = true;
                    break;
                }
        }
    }

    public g8(org.telegram.ui.Wallet.s5 s5Var) {
        this.a = 2;
        this.c = s5Var;
        this.b = false;
    }
}
