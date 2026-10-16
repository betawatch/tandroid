package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wn0 extends lm0 {
    public final /* synthetic */ xn0 c;

    public wn0(xn0 xn0Var) {
        this.c = xn0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        xn0 xn0Var = this.c;
        int i11 = xn0Var.v;
        if (i10 >= i11 && i10 < xn0Var.w) {
            return (MessageObject) xn0Var.e.get(i10 - i11);
        }
        int i12 = xn0Var.y;
        if (i10 < i12 || i10 >= xn0Var.E) {
            return null;
        }
        return (MessageObject) xn0Var.f.get(i10 - i12);
    }

    @Override // s4.g0
    public final int h() {
        return this.c.r;
    }

    @Override // s4.g0
    public final int j(int i10) {
        xn0 xn0Var = this.c;
        if (i10 == xn0Var.s || i10 == xn0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        xn0 xn0Var = this.c;
        org.telegram.ui.t10 t10Var = xn0Var.J;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 != xn0Var.s) {
                if (i10 == xn0Var.x) {
                    v3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new y80(this, 10));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!v3Var.getText().equals(string)) {
                v3Var.c(string, LocaleController.getString(xn0Var.H ? R.string.PauseAll : R.string.ResumeAll), new vn0(this));
                return;
            }
            String string2 = LocaleController.getString(xn0Var.H ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = xn0Var.H;
            org.telegram.ui.Cells.u3 u3Var = v3Var.b;
            u3Var.c(string2, true, z11);
            u3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = xn0Var.I.g() && i10 >= xn0Var.v && i10 < xn0Var.w;
            if (i11 == 1) {
                tn0 tn0Var = (tn0) view;
                tn0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                org.telegram.ui.Cells.j7 j7Var = tn0Var.a;
                int id2 = j7Var.getMessage() == null ? 0 : j7Var.getMessage().getId();
                j7Var.c(E, true);
                int id3 = j7Var.getMessage().getId();
                t10Var.a = j7Var.getMessage().getDialogId();
                t10Var.b = id3;
                j7Var.b(xn0Var.I.b(t10Var), id2 == E.getId());
                z10 = id2 == E.getId();
                if (j7Var.O == z12) {
                    return;
                }
                j7Var.O = z12;
                if (!z10) {
                    j7Var.P = z12 ? 1.0f : 0.0f;
                }
                j7Var.invalidate();
                return;
            }
            if (i11 == 2) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                int id4 = i7Var.getMessage() == null ? 0 : i7Var.getMessage().getId();
                i7Var.f(E, true);
                int id5 = i7Var.getMessage().getId();
                t10Var.a = i7Var.getMessage().getDialogId();
                t10Var.b = id5;
                i7Var.e(xn0Var.I.b(t10Var), id4 == E.getId());
                z10 = id4 == E.getId();
                if (i7Var.d0 == z12) {
                    return;
                }
                i7Var.d0 = z12;
                if (!z10) {
                    i7Var.e0 = z12 ? 1.0f : 0.0f;
                }
                i7Var.invalidate();
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            tn0 tn0Var = new tn0(context);
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 2, null);
            tn0Var.a = j7Var;
            j7Var.r.setVisibility(8);
            tn0Var.addView(j7Var);
            frameLayout = tn0Var;
        } else {
            frameLayout = new un0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new wl0(frameLayout);
    }
}
