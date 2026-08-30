package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cn0 extends rl0 {
    public final /* synthetic */ dn0 c;

    public cn0(dn0 dn0Var) {
        this.c = dn0Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        dn0 dn0Var = this.c;
        int i11 = dn0Var.v;
        if (i10 >= i11 && i10 < dn0Var.w) {
            return (MessageObject) dn0Var.e.get(i10 - i11);
        }
        int i12 = dn0Var.y;
        if (i10 < i12 || i10 >= dn0Var.B) {
            return null;
        }
        return (MessageObject) dn0Var.f.get(i10 - i12);
    }

    @Override // f2.o0
    public final int h() {
        return this.c.r;
    }

    @Override // f2.o0
    public final int j(int i10) {
        dn0 dn0Var = this.c;
        if (i10 == dn0Var.s || i10 == dn0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        dn0 dn0Var = this.c;
        org.telegram.ui.l10 l10Var = dn0Var.G;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 != dn0Var.s) {
                if (i10 == dn0Var.x) {
                    u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new z70(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!u3Var.getText().equals(string)) {
                u3Var.c(string, LocaleController.getString(dn0Var.E ? R.string.PauseAll : R.string.ResumeAll), new bn0(this));
                return;
            }
            String string2 = LocaleController.getString(dn0Var.E ? R.string.PauseAll : R.string.ResumeAll);
            boolean z10 = dn0Var.E;
            org.telegram.ui.Cells.t3 t3Var = u3Var.b;
            t3Var.c(string2, true, z10);
            t3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z11 = dn0Var.F.f() && i10 >= dn0Var.v && i10 < dn0Var.w;
            if (i11 == 1) {
                zm0 zm0Var = (zm0) view;
                zm0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                org.telegram.ui.Cells.i7 i7Var = zm0Var.a;
                int id2 = i7Var.getMessage() == null ? 0 : i7Var.getMessage().getId();
                i7Var.c(E, true);
                int id3 = i7Var.getMessage().getId();
                l10Var.a = i7Var.getMessage().getDialogId();
                l10Var.b = id3;
                i7Var.b(dn0Var.F.b(l10Var), id2 == E.getId());
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
                h7Var.e(dn0Var.F.b(l10Var), id4 == E.getId());
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

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            zm0 zm0Var = new zm0(context);
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 2, null);
            zm0Var.a = i7Var;
            i7Var.r.setVisibility(8);
            zm0Var.addView(i7Var);
            frameLayout = zm0Var;
        } else {
            frameLayout = new an0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new el0(frameLayout);
    }
}
