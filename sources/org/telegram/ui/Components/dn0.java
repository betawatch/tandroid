package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class dn0 extends sl0 {
    public final /* synthetic */ en0 c;

    public dn0(en0 en0Var) {
        this.c = en0Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        en0 en0Var = this.c;
        int i11 = en0Var.v;
        if (i10 >= i11 && i10 < en0Var.w) {
            return (MessageObject) en0Var.e.get(i10 - i11);
        }
        int i12 = en0Var.y;
        if (i10 < i12 || i10 >= en0Var.B) {
            return null;
        }
        return (MessageObject) en0Var.f.get(i10 - i12);
    }

    @Override // f2.p0
    public final int h() {
        return this.c.r;
    }

    @Override // f2.p0
    public final int j(int i10) {
        en0 en0Var = this.c;
        if (i10 == en0Var.s || i10 == en0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        en0 en0Var = this.c;
        org.telegram.ui.l10 l10Var = en0Var.G;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 != en0Var.s) {
                if (i10 == en0Var.x) {
                    u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new b80(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!u3Var.getText().equals(string)) {
                u3Var.c(string, LocaleController.getString(en0Var.E ? R.string.PauseAll : R.string.ResumeAll), new cn0(this));
                return;
            }
            String string2 = LocaleController.getString(en0Var.E ? R.string.PauseAll : R.string.ResumeAll);
            boolean z10 = en0Var.E;
            org.telegram.ui.Cells.t3 t3Var = u3Var.b;
            t3Var.c(string2, true, z10);
            t3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z11 = en0Var.F.f() && i10 >= en0Var.v && i10 < en0Var.w;
            if (i11 == 1) {
                an0 an0Var = (an0) view;
                an0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                org.telegram.ui.Cells.i7 i7Var = an0Var.a;
                int id2 = i7Var.getMessage() == null ? 0 : i7Var.getMessage().getId();
                i7Var.c(E, true);
                int id3 = i7Var.getMessage().getId();
                l10Var.a = i7Var.getMessage().getDialogId();
                l10Var.b = id3;
                i7Var.b(en0Var.F.b(l10Var), id2 == E.getId());
                z4 = id2 == E.getId();
                if (i7Var.L == z11) {
                    return;
                }
                i7Var.L = z11;
                if (!z4) {
                    i7Var.M = z11 ? 1.0f : 0.0f;
                }
                i7Var.invalidate();
                return;
            }
            if (i11 == 2) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                int id4 = h7Var.getMessage() == null ? 0 : h7Var.getMessage().getId();
                h7Var.f(E, true);
                int id5 = h7Var.getMessage().getId();
                l10Var.a = h7Var.getMessage().getDialogId();
                l10Var.b = id5;
                h7Var.e(en0Var.F.b(l10Var), id4 == E.getId());
                z4 = id4 == E.getId();
                if (h7Var.a0 == z11) {
                    return;
                }
                h7Var.a0 = z11;
                if (!z4) {
                    h7Var.b0 = z11 ? 1.0f : 0.0f;
                }
                h7Var.invalidate();
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            an0 an0Var = new an0(context);
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 2, null);
            an0Var.a = i7Var;
            i7Var.r.setVisibility(8);
            an0Var.addView(i7Var);
            frameLayout = an0Var;
        } else {
            frameLayout = new bn0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new fl0(frameLayout);
    }
}
