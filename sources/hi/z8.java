package hi;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xl;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class z8 extends v4.u0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z8(int i7, FrameLayout frameLayout) {
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
                f9 f9Var = (f9) obj;
                ek0 ek0Var = f9Var.f;
                if (i7 == 1) {
                    k9 k9Var = f9Var.a0;
                    int i11 = k9.Y1;
                    if (k9Var.d && f9Var.y != null) {
                        k9Var.N0();
                    }
                }
                if (i7 == 0) {
                    f9Var.T = !ek0Var.canScrollVertically(-1);
                    ek0Var.canScrollVertically(1);
                }
                f9Var.N = i7 != 0;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                xl xlVar = chatAttachAlertPhotoLayout.F;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = tiVar.Y2;
                    int L2 = L + (q0Var != null ? org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f) : 0);
                    int i12 = tiVar.t0;
                    if (((tiVar.Z3[0] - i12) - L2) + i12 < (tiVar.M2.getAlpha() * tiVar.M2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) xlVar.K(0)) != null) {
                        View view = mj0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            xlVar.w0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i7 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.k6) obj).f();
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
                f9 f9Var = (f9) obj;
                k9 k9Var = f9Var.a0;
                ek0 ek0Var = f9Var.f;
                boolean canScrollVertically = ek0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    f9Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                f9Var.e.invalidate();
                int i12 = k9.Y1;
                k9Var.b.invalidate();
                if (f9Var.a == 6 && ek0Var.getChildCount() > 0 && RecyclerView.R(ek0Var.getChildAt(0)) >= mp.u1(k9Var.a).R1().L.size()) {
                    mp.u1(k9Var.a).R1().S();
                    break;
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                xl xlVar = chatAttachAlertPhotoLayout.F;
                if (xlVar.getChildCount() > 0) {
                    tiVar.N1(chatAttachAlertPhotoLayout, i10);
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.b;
                        boolean z11 = tiVar.M1;
                        if (z10 != z11) {
                            this.b = z11;
                            m10.n(xlVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        xlVar.getFastScroll().setAlpha(0.0f);
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

    public z8(org.telegram.ui.Wallet.k6 k6Var) {
        this.a = 2;
        this.c = k6Var;
        this.b = false;
    }
}
