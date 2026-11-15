package hi;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ql;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f8 extends v4.t0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f8(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.c = frameLayout;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, int i7) {
        cj0 cj0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                l8 l8Var = (l8) obj;
                uj0 uj0Var = l8Var.f;
                if (i7 == 1) {
                    q8 q8Var = l8Var.a0;
                    int i11 = q8.Y1;
                    if (q8Var.d && l8Var.y != null) {
                        q8Var.M0();
                    }
                }
                if (i7 == 0) {
                    l8Var.T = !uj0Var.canScrollVertically(-1);
                    uj0Var.canScrollVertically(1);
                }
                l8Var.N = i7 != 0;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ql qlVar = chatAttachAlertPhotoLayout.F;
                ki kiVar = chatAttachAlertPhotoLayout.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = kiVar.Y2;
                    int L2 = L + (q0Var != null ? org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f) : 0);
                    int i12 = kiVar.t0;
                    if (((kiVar.Z3[0] - i12) - L2) + i12 < (kiVar.M2.getAlpha() * kiVar.M2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var = (cj0) qlVar.K(0)) != null) {
                        View view = cj0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            qlVar.w0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i7 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.u5) obj).f();
                    break;
                }
                break;
        }
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                l8 l8Var = (l8) obj;
                q8 q8Var = l8Var.a0;
                uj0 uj0Var = l8Var.f;
                boolean canScrollVertically = uj0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    l8Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                l8Var.e.invalidate();
                int i12 = q8.Y1;
                q8Var.b.invalidate();
                if (l8Var.a == 6 && uj0Var.getChildCount() > 0 && RecyclerView.R(uj0Var.getChildAt(0)) >= np.s1(q8Var.a).P1().L.size()) {
                    np.s1(q8Var.a).P1().S();
                    break;
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ki kiVar = chatAttachAlertPhotoLayout.b;
                ql qlVar = chatAttachAlertPhotoLayout.F;
                if (qlVar.getChildCount() > 0) {
                    kiVar.M1(chatAttachAlertPhotoLayout, i10);
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.b;
                        boolean z11 = kiVar.M1;
                        if (z10 != z11) {
                            this.b = z11;
                            i20.m(qlVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        qlVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i10 != 0) {
                        chatAttachAlertPhotoLayout.Y();
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

    public f8(org.telegram.ui.Wallet.u5 u5Var) {
        this.a = 2;
        this.c = u5Var;
        this.b = false;
    }
}
