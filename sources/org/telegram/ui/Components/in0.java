package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class in0 extends vl0 {
    public final /* synthetic */ jn0 c;

    public in0(jn0 jn0Var) {
        this.c = jn0Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        jn0 jn0Var = this.c;
        int i11 = jn0Var.v;
        if (i10 >= i11 && i10 < jn0Var.w) {
            return (MessageObject) jn0Var.e.get(i10 - i11);
        }
        int i12 = jn0Var.y;
        if (i10 < i12 || i10 >= jn0Var.E) {
            return null;
        }
        return (MessageObject) jn0Var.f.get(i10 - i12);
    }

    @Override // s4.h0
    public final int h() {
        return this.c.r;
    }

    @Override // s4.h0
    public final int j(int i10) {
        jn0 jn0Var = this.c;
        if (i10 == jn0Var.s || i10 == jn0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        jn0 jn0Var = this.c;
        org.telegram.ui.p10 p10Var = jn0Var.J;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 != jn0Var.s) {
                if (i10 == jn0Var.x) {
                    v3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new g80(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!v3Var.getText().equals(string)) {
                v3Var.c(string, LocaleController.getString(jn0Var.H ? R.string.PauseAll : R.string.ResumeAll), new hn0(this));
                return;
            }
            String string2 = LocaleController.getString(jn0Var.H ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = jn0Var.H;
            org.telegram.ui.Cells.u3 u3Var = v3Var.b;
            u3Var.c(string2, true, z11);
            u3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = jn0Var.I.g() && i10 >= jn0Var.v && i10 < jn0Var.w;
            if (i11 == 1) {
                fn0 fn0Var = (fn0) view;
                fn0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                org.telegram.ui.Cells.k7 k7Var = fn0Var.a;
                int id2 = k7Var.getMessage() == null ? 0 : k7Var.getMessage().getId();
                k7Var.c(E, true);
                int id3 = k7Var.getMessage().getId();
                p10Var.a = k7Var.getMessage().getDialogId();
                p10Var.b = id3;
                k7Var.b(jn0Var.I.c(p10Var), id2 == E.getId());
                z10 = id2 == E.getId();
                if (k7Var.O == z12) {
                    return;
                }
                k7Var.O = z12;
                if (!z10) {
                    k7Var.P = z12 ? 1.0f : 0.0f;
                }
                k7Var.invalidate();
                return;
            }
            if (i11 == 2) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                int id4 = j7Var.getMessage() == null ? 0 : j7Var.getMessage().getId();
                j7Var.f(E, true);
                int id5 = j7Var.getMessage().getId();
                p10Var.a = j7Var.getMessage().getDialogId();
                p10Var.b = id5;
                j7Var.e(jn0Var.I.c(p10Var), id4 == E.getId());
                z10 = id4 == E.getId();
                if (j7Var.d0 == z12) {
                    return;
                }
                j7Var.d0 = z12;
                if (!z10) {
                    j7Var.e0 = z12 ? 1.0f : 0.0f;
                }
                j7Var.invalidate();
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            fn0 fn0Var = new fn0(context);
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 2, null);
            fn0Var.a = k7Var;
            k7Var.r.setVisibility(8);
            fn0Var.addView(k7Var);
            frameLayout = fn0Var;
        } else {
            frameLayout = new gn0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new gl0(frameLayout);
    }
}
