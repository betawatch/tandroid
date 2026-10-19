package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class sn0 extends hm0 {
    public final /* synthetic */ tn0 c;

    public sn0(tn0 tn0Var) {
        this.c = tn0Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        tn0 tn0Var = this.c;
        int i11 = tn0Var.v;
        if (i10 >= i11 && i10 < tn0Var.w) {
            return (MessageObject) tn0Var.e.get(i10 - i11);
        }
        int i12 = tn0Var.y;
        if (i10 < i12 || i10 >= tn0Var.E) {
            return null;
        }
        return (MessageObject) tn0Var.f.get(i10 - i12);
    }

    @Override // s4.g0
    public final int h() {
        return this.c.r;
    }

    @Override // s4.g0
    public final int j(int i10) {
        tn0 tn0Var = this.c;
        if (i10 == tn0Var.s || i10 == tn0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        tn0 tn0Var = this.c;
        org.telegram.ui.w00 w00Var = tn0Var.J;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 != tn0Var.s) {
                if (i10 == tn0Var.x) {
                    u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new u80(this, 10));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!u3Var.getText().equals(string)) {
                u3Var.c(string, LocaleController.getString(tn0Var.H ? R.string.PauseAll : R.string.ResumeAll), new rn0(this));
                return;
            }
            String string2 = LocaleController.getString(tn0Var.H ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = tn0Var.H;
            org.telegram.ui.Cells.t3 t3Var = u3Var.b;
            t3Var.c(string2, true, z11);
            t3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = tn0Var.I.g() && i10 >= tn0Var.v && i10 < tn0Var.w;
            if (i11 == 1) {
                pn0 pn0Var = (pn0) view;
                pn0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                org.telegram.ui.Cells.i7 i7Var = pn0Var.a;
                int id2 = i7Var.getMessage() == null ? 0 : i7Var.getMessage().getId();
                i7Var.c(E, true);
                int id3 = i7Var.getMessage().getId();
                w00Var.a = i7Var.getMessage().getDialogId();
                w00Var.b = id3;
                i7Var.b(tn0Var.I.b(w00Var), id2 == E.getId());
                z10 = id2 == E.getId();
                if (i7Var.O == z12) {
                    return;
                }
                i7Var.O = z12;
                if (!z10) {
                    i7Var.P = z12 ? 1.0f : 0.0f;
                }
                i7Var.invalidate();
                return;
            }
            if (i11 == 2) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                int id4 = h7Var.getMessage() == null ? 0 : h7Var.getMessage().getId();
                h7Var.f(E, true);
                int id5 = h7Var.getMessage().getId();
                w00Var.a = h7Var.getMessage().getDialogId();
                w00Var.b = id5;
                h7Var.e(tn0Var.I.b(w00Var), id4 == E.getId());
                z10 = id4 == E.getId();
                if (h7Var.d0 == z12) {
                    return;
                }
                h7Var.d0 = z12;
                if (!z10) {
                    h7Var.e0 = z12 ? 1.0f : 0.0f;
                }
                h7Var.invalidate();
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            pn0 pn0Var = new pn0(context);
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 2, null);
            pn0Var.a = i7Var;
            i7Var.r.setVisibility(8);
            pn0Var.addView(i7Var);
            frameLayout = pn0Var;
        } else {
            frameLayout = new qn0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new sl0(frameLayout);
    }
}
