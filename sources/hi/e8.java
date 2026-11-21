package hi;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.zl;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class e8 extends v4.u0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e8(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.c = frameLayout;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        mj0 mj0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                k8 k8Var = (k8) obj;
                ek0 ek0Var = k8Var.f;
                if (i7 == 1) {
                    p8 p8Var = k8Var.a0;
                    int i11 = p8.Y1;
                    if (p8Var.d && k8Var.y != null) {
                        p8Var.N0();
                    }
                }
                if (i7 == 0) {
                    k8Var.T = !ek0Var.canScrollVertically(-1);
                    ek0Var.canScrollVertically(1);
                }
                k8Var.N = i7 != 0;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                zl zlVar = chatAttachAlertPhotoLayout.F;
                ui uiVar = chatAttachAlertPhotoLayout.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = uiVar.Y2;
                    int L2 = L + (q0Var != null ? org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f) : 0);
                    int i12 = uiVar.t0;
                    if (((uiVar.Z3[0] - i12) - L2) + i12 < (uiVar.M2.getAlpha() * uiVar.M2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) zlVar.K(0)) != null) {
                        View view = mj0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            zlVar.w0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i7 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.j6) obj).f();
                    break;
                }
                break;
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                k8 k8Var = (k8) obj;
                p8 p8Var = k8Var.a0;
                ek0 ek0Var = k8Var.f;
                boolean canScrollVertically = ek0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    k8Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                k8Var.e.invalidate();
                int i12 = p8.Y1;
                p8Var.b.invalidate();
                if (k8Var.a == 6 && ek0Var.getChildCount() > 0 && RecyclerView.R(ek0Var.getChildAt(0)) >= mp.u1(p8Var.a).R1().L.size()) {
                    mp.u1(p8Var.a).R1().S();
                    break;
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ui uiVar = chatAttachAlertPhotoLayout.b;
                zl zlVar = chatAttachAlertPhotoLayout.F;
                if (zlVar.getChildCount() > 0) {
                    uiVar.N1(chatAttachAlertPhotoLayout, i10);
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.b;
                        boolean z11 = uiVar.M1;
                        if (z10 != z11) {
                            this.b = z11;
                            n10.n(zlVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        zlVar.getFastScroll().setAlpha(0.0f);
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

    public e8(org.telegram.ui.Wallet.j6 j6Var) {
        this.a = 2;
        this.c = j6Var;
        this.b = false;
    }
}
