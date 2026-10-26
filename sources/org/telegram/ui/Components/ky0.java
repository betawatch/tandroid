package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz0 b;

    public /* synthetic */ ky0(cz0 cz0Var, int i10) {
        this.a = i10;
        this.b = cz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.r5 r5Var;
        switch (this.a) {
            case 0:
                cz0 cz0Var = this.b;
                org.telegram.ui.ActionBar.r2 r2Var = cz0Var.L;
                if (r2Var != null) {
                    new tg.y0(r2Var, 11, false).show();
                    break;
                } else if (cz0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) cz0Var.getContext()).u0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                cz0.J(this.b);
                break;
            case 2:
                this.b.s0();
                break;
            case 3:
                cz0 cz0Var2 = this.b;
                if (cz0Var2.Y != null) {
                    cz0Var2.w0(cz0Var2.U);
                    cz0Var2.s0();
                    cz0Var2.U = null;
                    break;
                } else {
                    cz0Var2.b0.a(cz0Var2.T, null, cz0Var2.S, null, cz0Var2.i0, true, 0, 0);
                    cz0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                cz0 cz0Var3 = this.b;
                org.telegram.ui.a70 a70Var = cz0Var3.d0;
                org.telegram.ui.f70 f70Var = a70Var.c;
                s4.c0 c0Var = f70Var.h;
                boolean z10 = f70Var.N;
                int L0 = c0Var.L0();
                vl0 vl0Var = (vl0) f70Var.d.K(L0);
                int top = vl0Var != null ? vl0Var.a.getTop() : Integer.MAX_VALUE;
                int i10 = f70Var.n;
                if (a70Var.a) {
                    f70Var.r = null;
                    f70Var.s = true;
                } else {
                    f70Var.r = a70Var.b;
                    f70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.p00(a70Var, 9), 350L);
                }
                f70Var.i0();
                f70Var.g0(f70Var.r, true);
                if (i10 != -1) {
                    if (!f70Var.M) {
                        for (int i11 = 0; i11 < f70Var.d.getChildCount(); i11++) {
                            View childAt = f70Var.d.getChildAt(i11);
                            if (f70Var.d.T(childAt).b() == f70Var.E + i10) {
                                ((org.telegram.ui.Cells.p8) childAt).b(false, true);
                            }
                        }
                    }
                    f70Var.e.m(i10);
                }
                if (f70Var.n != -1) {
                    if (!f70Var.M) {
                        for (int i12 = 0; i12 < f70Var.d.getChildCount(); i12++) {
                            View childAt2 = f70Var.d.getChildAt(i12);
                            if (f70Var.d.T(childAt2).b() == f70Var.E + f70Var.n) {
                                ((org.telegram.ui.Cells.p8) childAt2).b(true, true);
                            }
                        }
                    }
                    f70Var.e.m(f70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    f70Var.h.h1(L0 + 1, top);
                }
                if (f70Var.M) {
                    f70Var.L.P("", false);
                    r5Var = ((org.telegram.ui.ActionBar.r2) f70Var).simpleActionBar;
                    r5Var.f(true);
                }
                cz0Var3.dismiss();
                break;
            case 6:
                cz0.s(this.b);
                break;
            case 7:
                cz0.n(this.b);
                break;
            case 8:
                cz0 cz0Var4 = this.b;
                cz0Var4.n.o();
                cz0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new my0(cz0Var4, 3), 200L);
                break;
            case 9:
                cz0.D(this.b);
                break;
            case 10:
                cz0 cz0Var5 = this.b;
                if (cz0Var5.R) {
                    cz0Var5.p0();
                    break;
                } else {
                    cz0Var5.r0();
                    break;
                }
            case 11:
                cz0.C(this.b);
                break;
            case 12:
                cz0.r(this.b);
                break;
            case 13:
                cz0.o(this.b);
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
