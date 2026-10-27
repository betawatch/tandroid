package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class co0 extends mm0 {
    public final /* synthetic */ do0 c;

    public co0(do0 do0Var) {
        this.c = do0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        do0 do0Var = this.c;
        int i11 = do0Var.v;
        if (i10 >= i11 && i10 < do0Var.w) {
            return (MessageObject) do0Var.e.get(i10 - i11);
        }
        int i12 = do0Var.y;
        if (i10 < i12 || i10 >= do0Var.E) {
            return null;
        }
        return (MessageObject) do0Var.f.get(i10 - i12);
    }

    @Override // s4.h0
    public final int h() {
        return this.c.r;
    }

    @Override // s4.h0
    public final int j(int i10) {
        do0 do0Var = this.c;
        if (i10 == do0Var.s || i10 == do0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        do0 do0Var = this.c;
        org.telegram.ui.b10 b10Var = do0Var.J;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 != do0Var.s) {
                if (i10 == do0Var.x) {
                    z3Var.b(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new x80(this, 9));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!z3Var.getText().equals(string)) {
                z3Var.b(string, LocaleController.getString(do0Var.H ? R.string.PauseAll : R.string.ResumeAll), new bo0(this));
                return;
            }
            String string2 = LocaleController.getString(do0Var.H ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = do0Var.H;
            org.telegram.ui.Cells.y3 y3Var = z3Var.b;
            y3Var.c(string2, true, z11);
            y3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = do0Var.I.g() && i10 >= do0Var.v && i10 < do0Var.w;
            if (i11 == 1) {
                zn0 zn0Var = (zn0) view;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, zn0Var, null);
                org.telegram.ui.Cells.o7 o7Var = zn0Var.a;
                int id2 = o7Var.getMessage() == null ? 0 : o7Var.getMessage().getId();
                o7Var.c(E, true);
                int id3 = o7Var.getMessage().getId();
                b10Var.a = o7Var.getMessage().getDialogId();
                b10Var.b = id3;
                o7Var.b(do0Var.I.c(b10Var), id2 == E.getId());
                z10 = id2 == E.getId();
                if (o7Var.O == z12) {
                    return;
                }
                o7Var.O = z12;
                if (!z10) {
                    o7Var.P = z12 ? 1.0f : 0.0f;
                }
                o7Var.invalidate();
                return;
            }
            if (i11 == 2) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                int id4 = n7Var.getMessage() == null ? 0 : n7Var.getMessage().getId();
                n7Var.f(E, true);
                int id5 = n7Var.getMessage().getId();
                b10Var.a = n7Var.getMessage().getDialogId();
                b10Var.b = id5;
                n7Var.e(do0Var.I.c(b10Var), id4 == E.getId());
                z10 = id4 == E.getId();
                if (n7Var.d0 == z12) {
                    return;
                }
                n7Var.d0 = z12;
                if (!z10) {
                    n7Var.e0 = z12 ? 1.0f : 0.0f;
                }
                n7Var.invalidate();
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            zn0 zn0Var = new zn0(context);
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 2, null);
            zn0Var.a = o7Var;
            o7Var.r.setVisibility(8);
            zn0Var.addView(o7Var);
            frameLayout = zn0Var;
        } else {
            frameLayout = new ao0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new wl0(frameLayout);
    }
}
