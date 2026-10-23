package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty0 b;

    public /* synthetic */ cy0(ty0 ty0Var, int i10) {
        this.a = i10;
        this.b = ty0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                ty0 ty0Var = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = ty0Var.L;
                if (o2Var != null) {
                    new sg.y0(o2Var, 11, false).show();
                    break;
                } else if (ty0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) ty0Var.getContext()).u0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                ty0.J(this.b);
                break;
            case 2:
                this.b.s0();
                break;
            case 3:
                ty0 ty0Var2 = this.b;
                if (ty0Var2.Y != null) {
                    ty0Var2.w0(ty0Var2.U);
                    ty0Var2.s0();
                    ty0Var2.U = null;
                    break;
                } else {
                    ty0Var2.b0.a(ty0Var2.T, null, ty0Var2.S, null, ty0Var2.i0, true, 0, 0);
                    ty0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                ty0 ty0Var3 = this.b;
                org.telegram.ui.z60 z60Var = ty0Var3.d0;
                org.telegram.ui.e70 e70Var = z60Var.c;
                s4.b0 b0Var = e70Var.h;
                boolean z10 = e70Var.N;
                int L0 = b0Var.L0();
                wl0 wl0Var = (wl0) e70Var.d.K(L0);
                int top = wl0Var != null ? wl0Var.a.getTop() : Integer.MAX_VALUE;
                int i10 = e70Var.n;
                if (z60Var.a) {
                    e70Var.r = null;
                    e70Var.s = true;
                } else {
                    e70Var.r = z60Var.b;
                    e70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.fz(z60Var, 10), 350L);
                }
                e70Var.h0();
                e70Var.f0(e70Var.r, true);
                if (i10 != -1) {
                    if (!e70Var.M) {
                        for (int i11 = 0; i11 < e70Var.d.getChildCount(); i11++) {
                            View childAt = e70Var.d.getChildAt(i11);
                            if (e70Var.d.T(childAt).b() == e70Var.E + i10) {
                                ((org.telegram.ui.Cells.l8) childAt).b(false, true);
                            }
                        }
                    }
                    e70Var.e.m(i10);
                }
                if (e70Var.n != -1) {
                    if (!e70Var.M) {
                        for (int i12 = 0; i12 < e70Var.d.getChildCount(); i12++) {
                            View childAt2 = e70Var.d.getChildAt(i12);
                            if (e70Var.d.T(childAt2).b() == e70Var.E + e70Var.n) {
                                ((org.telegram.ui.Cells.l8) childAt2).b(true, true);
                            }
                        }
                    }
                    e70Var.e.m(e70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    e70Var.h.h1(L0 + 1, top);
                }
                if (e70Var.M) {
                    e70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.o2) e70Var).actionBar;
                    kVar.g(true);
                }
                ty0Var3.dismiss();
                break;
            case 6:
                ty0.t(this.b);
                break;
            case 7:
                ty0.n(this.b);
                break;
            case 8:
                ty0 ty0Var4 = this.b;
                ty0Var4.n.n();
                ty0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ey0(ty0Var4, 3), 200L);
                break;
            case 9:
                ty0.D(this.b);
                break;
            case 10:
                ty0 ty0Var5 = this.b;
                if (ty0Var5.R) {
                    ty0Var5.p0();
                    break;
                } else {
                    ty0Var5.r0();
                    break;
                }
            case 11:
                ty0.C(this.b);
                break;
            case 12:
                ty0.s(this.b);
                break;
            case 13:
                ty0.p(this.b);
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
