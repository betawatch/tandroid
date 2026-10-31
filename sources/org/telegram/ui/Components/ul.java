package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ul extends s4.s0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ul(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.c = frameLayout;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        ck0 ck0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                pl plVar = chatAttachAlertPhotoLayout.E;
                bi biVar = chatAttachAlertPhotoLayout.b;
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(13.0f);
                    org.telegram.ui.ActionBar.t0 t0Var = biVar.U2;
                    int L2 = L + (t0Var != null ? org.telegram.messenger.i0.L(t0Var.getAlpha() * 26.0f) : 0);
                    int i12 = biVar.s0;
                    if (((biVar.V3[0] - i12) - L2) + i12 < (biVar.I2.getAlpha() * biVar.I2.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (ck0Var = (ck0) plVar.K(0)) != null) {
                        View view = ck0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            plVar.w0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (i10 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.x5) obj).f();
                    break;
                }
                break;
            default:
                vh.r6 r6Var = (vh.r6) obj;
                tk0 tk0Var = r6Var.f;
                if (i10 == 1) {
                    vh.w6 w6Var = r6Var.W;
                    int i13 = vh.w6.U1;
                    if (w6Var.d && r6Var.y != null) {
                        w6Var.M0();
                    }
                }
                if (i10 == 0) {
                    r6Var.S = !tk0Var.canScrollVertically(-1);
                    tk0Var.canScrollVertically(1);
                }
                r6Var.M = i10 != 0;
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                bi biVar = chatAttachAlertPhotoLayout.b;
                pl plVar = chatAttachAlertPhotoLayout.E;
                if (plVar.getChildCount() > 0) {
                    biVar.L1(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.G.b() > 30) {
                        boolean z10 = this.b;
                        boolean z11 = biVar.I1;
                        if (z10 != z11) {
                            this.b = z11;
                            org.telegram.messenger.z20.l(plVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        plVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.W();
                        break;
                    }
                }
                break;
            case 1:
                if (i10 != 0 || i11 != 0) {
                    this.b = true;
                    break;
                }
            default:
                vh.r6 r6Var = (vh.r6) obj;
                vh.w6 w6Var = r6Var.W;
                tk0 tk0Var = r6Var.f;
                boolean canScrollVertically = tk0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    r6Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                r6Var.e.invalidate();
                int i13 = vh.w6.U1;
                w6Var.b.invalidate();
                if (r6Var.a == 6 && tk0Var.getChildCount() > 0 && RecyclerView.R(tk0Var.getChildAt(0)) >= org.telegram.messenger.vp.r1(w6Var.a).O1().L.size()) {
                    org.telegram.messenger.vp.r1(w6Var.a).O1().S();
                    break;
                }
                break;
        }
    }

    public ul(org.telegram.ui.Wallet.x5 x5Var) {
        this.a = 1;
        this.c = x5Var;
        this.b = false;
    }
}
