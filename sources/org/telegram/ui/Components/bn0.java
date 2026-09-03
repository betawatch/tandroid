package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bn0 extends ql0 {
    public final /* synthetic */ cn0 c;

    public bn0(cn0 cn0Var) {
        this.c = cn0Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        cn0 cn0Var = this.c;
        int i11 = cn0Var.v;
        if (i10 >= i11 && i10 < cn0Var.w) {
            return (MessageObject) cn0Var.e.get(i10 - i11);
        }
        int i12 = cn0Var.y;
        if (i10 < i12 || i10 >= cn0Var.B) {
            return null;
        }
        return (MessageObject) cn0Var.f.get(i10 - i12);
    }

    @Override // f2.o0
    public final int h() {
        return this.c.r;
    }

    @Override // f2.o0
    public final int j(int i10) {
        cn0 cn0Var = this.c;
        if (i10 == cn0Var.s || i10 == cn0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        cn0 cn0Var = this.c;
        org.telegram.ui.m10 m10Var = cn0Var.G;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
            if (i10 != cn0Var.s) {
                if (i10 == cn0Var.x) {
                    t3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new a80(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!t3Var.getText().equals(string)) {
                t3Var.c(string, LocaleController.getString(cn0Var.E ? R.string.PauseAll : R.string.ResumeAll), new an0(this));
                return;
            }
            String string2 = LocaleController.getString(cn0Var.E ? R.string.PauseAll : R.string.ResumeAll);
            boolean z10 = cn0Var.E;
            org.telegram.ui.Cells.s3 s3Var = t3Var.b;
            s3Var.c(string2, true, z10);
            s3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z11 = cn0Var.F.f() && i10 >= cn0Var.v && i10 < cn0Var.w;
            if (i11 == 1) {
                ym0 ym0Var = (ym0) view;
                ym0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                org.telegram.ui.Cells.h7 h7Var = ym0Var.a;
                int id2 = h7Var.getMessage() == null ? 0 : h7Var.getMessage().getId();
                h7Var.c(E, true);
                int id3 = h7Var.getMessage().getId();
                m10Var.a = h7Var.getMessage().getDialogId();
                m10Var.b = id3;
                h7Var.b(cn0Var.F.b(m10Var), id2 == E.getId());
                z4 = id2 == E.getId();
                if (h7Var.L == z11) {
                    return;
                }
                h7Var.L = z11;
                if (!z4) {
                    h7Var.M = z11 ? 1.0f : 0.0f;
                }
                h7Var.invalidate();
                return;
            }
            if (i11 == 2) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                int id4 = g7Var.getMessage() == null ? 0 : g7Var.getMessage().getId();
                g7Var.f(E, true);
                int id5 = g7Var.getMessage().getId();
                m10Var.a = g7Var.getMessage().getDialogId();
                m10Var.b = id5;
                g7Var.e(cn0Var.F.b(m10Var), id4 == E.getId());
                z4 = id4 == E.getId();
                if (g7Var.a0 == z11) {
                    return;
                }
                g7Var.a0 = z11;
                if (!z4) {
                    g7Var.b0 = z11 ? 1.0f : 0.0f;
                }
                g7Var.invalidate();
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.t3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            ym0 ym0Var = new ym0(context);
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(context, 2, null);
            ym0Var.a = h7Var;
            h7Var.r.setVisibility(8);
            ym0Var.addView(h7Var);
            frameLayout = ym0Var;
        } else {
            frameLayout = new zm0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new dl0(frameLayout);
    }
}
