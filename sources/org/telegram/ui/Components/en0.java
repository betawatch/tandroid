package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class en0 extends ul0 {
    public final /* synthetic */ fn0 c;

    public en0(fn0 fn0Var) {
        this.c = fn0Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        fn0 fn0Var = this.c;
        int i11 = fn0Var.v;
        if (i10 >= i11 && i10 < fn0Var.w) {
            return (MessageObject) fn0Var.e.get(i10 - i11);
        }
        int i12 = fn0Var.y;
        if (i10 < i12 || i10 >= fn0Var.E) {
            return null;
        }
        return (MessageObject) fn0Var.f.get(i10 - i12);
    }

    @Override // s4.h0
    public final int h() {
        return this.c.r;
    }

    @Override // s4.h0
    public final int j(int i10) {
        fn0 fn0Var = this.c;
        if (i10 == fn0Var.s || i10 == fn0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        fn0 fn0Var = this.c;
        org.telegram.ui.r10 r10Var = fn0Var.J;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 != fn0Var.s) {
                if (i10 == fn0Var.x) {
                    u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new g80(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!u3Var.getText().equals(string)) {
                u3Var.c(string, LocaleController.getString(fn0Var.H ? R.string.PauseAll : R.string.ResumeAll), new dn0(this));
                return;
            }
            String string2 = LocaleController.getString(fn0Var.H ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = fn0Var.H;
            org.telegram.ui.Cells.t3 t3Var = u3Var.b;
            t3Var.c(string2, true, z11);
            t3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = fn0Var.I.f() && i10 >= fn0Var.v && i10 < fn0Var.w;
            if (i11 == 1) {
                bn0 bn0Var = (bn0) view;
                bn0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                org.telegram.ui.Cells.l7 l7Var = bn0Var.a;
                int id2 = l7Var.getMessage() == null ? 0 : l7Var.getMessage().getId();
                l7Var.c(E, true);
                int id3 = l7Var.getMessage().getId();
                r10Var.a = l7Var.getMessage().getDialogId();
                r10Var.b = id3;
                l7Var.b(fn0Var.I.b(r10Var), id2 == E.getId());
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
                r10Var.a = k7Var.getMessage().getDialogId();
                r10Var.b = id5;
                k7Var.e(fn0Var.I.b(r10Var), id4 == E.getId());
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
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            bn0 bn0Var = new bn0(context);
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 2, null);
            bn0Var.a = l7Var;
            l7Var.r.setVisibility(8);
            bn0Var.addView(l7Var);
            frameLayout = bn0Var;
        } else {
            frameLayout = new cn0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new fl0(frameLayout);
    }
}
