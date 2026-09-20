package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class hn0 extends ul0 {
    public final /* synthetic */ in0 c;

    public hn0(in0 in0Var) {
        this.c = in0Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        in0 in0Var = this.c;
        int i11 = in0Var.v;
        if (i10 >= i11 && i10 < in0Var.w) {
            return (MessageObject) in0Var.e.get(i10 - i11);
        }
        int i12 = in0Var.y;
        if (i10 < i12 || i10 >= in0Var.E) {
            return null;
        }
        return (MessageObject) in0Var.f.get(i10 - i12);
    }

    @Override // s4.h0
    public final int h() {
        return this.c.r;
    }

    @Override // s4.h0
    public final int j(int i10) {
        in0 in0Var = this.c;
        if (i10 == in0Var.s || i10 == in0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        in0 in0Var = this.c;
        org.telegram.ui.p10 p10Var = in0Var.J;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            if (i10 != in0Var.s) {
                if (i10 == in0Var.x) {
                    w3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new f80(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!w3Var.getText().equals(string)) {
                w3Var.c(string, LocaleController.getString(in0Var.H ? R.string.PauseAll : R.string.ResumeAll), new gn0(this));
                return;
            }
            String string2 = LocaleController.getString(in0Var.H ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = in0Var.H;
            org.telegram.ui.Cells.v3 v3Var = w3Var.b;
            v3Var.c(string2, true, z11);
            v3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = in0Var.I.g() && i10 >= in0Var.v && i10 < in0Var.w;
            if (i11 == 1) {
                en0 en0Var = (en0) view;
                en0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                org.telegram.ui.Cells.l7 l7Var = en0Var.a;
                int id2 = l7Var.getMessage() == null ? 0 : l7Var.getMessage().getId();
                l7Var.c(E, true);
                int id3 = l7Var.getMessage().getId();
                p10Var.a = l7Var.getMessage().getDialogId();
                p10Var.b = id3;
                l7Var.b(in0Var.I.c(p10Var), id2 == E.getId());
                z10 = id2 == E.getId();
                if (l7Var.O == z12) {
                    return;
                }
                l7Var.O = z12;
                if (!z10) {
                    l7Var.P = z12 ? 1.0f : 0.0f;
                }
                l7Var.invalidate();
                return;
            }
            if (i11 == 2) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                int id4 = k7Var.getMessage() == null ? 0 : k7Var.getMessage().getId();
                k7Var.f(E, true);
                int id5 = k7Var.getMessage().getId();
                p10Var.a = k7Var.getMessage().getDialogId();
                p10Var.b = id5;
                k7Var.e(in0Var.I.c(p10Var), id4 == E.getId());
                z10 = id4 == E.getId();
                if (k7Var.d0 == z12) {
                    return;
                }
                k7Var.d0 = z12;
                if (!z10) {
                    k7Var.e0 = z12 ? 1.0f : 0.0f;
                }
                k7Var.invalidate();
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.w3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            en0 en0Var = new en0(context);
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 2, null);
            en0Var.a = l7Var;
            l7Var.r.setVisibility(8);
            en0Var.addView(l7Var);
            frameLayout = en0Var;
        } else {
            frameLayout = new fn0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new fl0(frameLayout);
    }
}
