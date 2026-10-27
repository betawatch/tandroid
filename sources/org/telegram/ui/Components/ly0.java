package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dz0 b;

    public /* synthetic */ ly0(dz0 dz0Var, int i10) {
        this.a = i10;
        this.b = dz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.r5 r5Var;
        switch (this.a) {
            case 0:
                dz0 dz0Var = this.b;
                org.telegram.ui.ActionBar.r2 r2Var = dz0Var.L;
                if (r2Var != null) {
                    new tg.y0(r2Var, 11, false).show();
                    break;
                } else if (dz0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) dz0Var.getContext()).u0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                dz0.J(this.b);
                break;
            case 2:
                this.b.s0();
                break;
            case 3:
                dz0 dz0Var2 = this.b;
                if (dz0Var2.Y != null) {
                    dz0Var2.w0(dz0Var2.U);
                    dz0Var2.s0();
                    dz0Var2.U = null;
                    break;
                } else {
                    dz0Var2.b0.a(dz0Var2.T, null, dz0Var2.S, null, dz0Var2.i0, true, 0, 0);
                    dz0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                dz0 dz0Var3 = this.b;
                org.telegram.ui.c70 c70Var = dz0Var3.d0;
                org.telegram.ui.h70 h70Var = c70Var.c;
                s4.c0 c0Var = h70Var.h;
                boolean z10 = h70Var.N;
                int L0 = c0Var.L0();
                wl0 wl0Var = (wl0) h70Var.d.K(L0);
                int top = wl0Var != null ? wl0Var.a.getTop() : Integer.MAX_VALUE;
                int i10 = h70Var.n;
                if (c70Var.a) {
                    h70Var.r = null;
                    h70Var.s = true;
                } else {
                    h70Var.r = c70Var.b;
                    h70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.r00(c70Var, 9), 350L);
                }
                h70Var.i0();
                h70Var.g0(h70Var.r, true);
                if (i10 != -1) {
                    if (!h70Var.M) {
                        for (int i11 = 0; i11 < h70Var.d.getChildCount(); i11++) {
                            View childAt = h70Var.d.getChildAt(i11);
                            if (h70Var.d.T(childAt).b() == h70Var.E + i10) {
                                ((org.telegram.ui.Cells.p8) childAt).b(false, true);
                            }
                        }
                    }
                    h70Var.e.m(i10);
                }
                if (h70Var.n != -1) {
                    if (!h70Var.M) {
                        for (int i12 = 0; i12 < h70Var.d.getChildCount(); i12++) {
                            View childAt2 = h70Var.d.getChildAt(i12);
                            if (h70Var.d.T(childAt2).b() == h70Var.E + h70Var.n) {
                                ((org.telegram.ui.Cells.p8) childAt2).b(true, true);
                            }
                        }
                    }
                    h70Var.e.m(h70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    h70Var.h.h1(L0 + 1, top);
                }
                if (h70Var.M) {
                    h70Var.L.P("", false);
                    r5Var = ((org.telegram.ui.ActionBar.r2) h70Var).simpleActionBar;
                    r5Var.f(true);
                }
                dz0Var3.dismiss();
                break;
            case 6:
                dz0.s(this.b);
                break;
            case 7:
                dz0.n(this.b);
                break;
            case 8:
                dz0 dz0Var4 = this.b;
                dz0Var4.n.o();
                dz0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ny0(dz0Var4, 3), 200L);
                break;
            case 9:
                dz0.D(this.b);
                break;
            case 10:
                dz0 dz0Var5 = this.b;
                if (dz0Var5.R) {
                    dz0Var5.p0();
                    break;
                } else {
                    dz0Var5.r0();
                    break;
                }
            case 11:
                dz0.C(this.b);
                break;
            case 12:
                dz0.r(this.b);
                break;
            case 13:
                dz0.o(this.b);
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
