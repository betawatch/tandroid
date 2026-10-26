package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bo0 extends lm0 {
    public final /* synthetic */ co0 c;

    public bo0(co0 co0Var) {
        this.c = co0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        co0 co0Var = this.c;
        int i11 = co0Var.v;
        if (i10 >= i11 && i10 < co0Var.w) {
            return (MessageObject) co0Var.e.get(i10 - i11);
        }
        int i12 = co0Var.y;
        if (i10 < i12 || i10 >= co0Var.E) {
            return null;
        }
        return (MessageObject) co0Var.f.get(i10 - i12);
    }

    @Override // s4.h0
    public final int h() {
        return this.c.r;
    }

    @Override // s4.h0
    public final int j(int i10) {
        co0 co0Var = this.c;
        if (i10 == co0Var.s || i10 == co0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        co0 co0Var = this.c;
        org.telegram.ui.z00 z00Var = co0Var.J;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 != co0Var.s) {
                if (i10 == co0Var.x) {
                    z3Var.b(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new w80(this, 9));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!z3Var.getText().equals(string)) {
                z3Var.b(string, LocaleController.getString(co0Var.H ? R.string.PauseAll : R.string.ResumeAll), new ao0(this));
                return;
            }
            String string2 = LocaleController.getString(co0Var.H ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = co0Var.H;
            org.telegram.ui.Cells.y3 y3Var = z3Var.b;
            y3Var.c(string2, true, z11);
            y3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = co0Var.I.g() && i10 >= co0Var.v && i10 < co0Var.w;
            if (i11 == 1) {
                yn0 yn0Var = (yn0) view;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, yn0Var, null);
                org.telegram.ui.Cells.o7 o7Var = yn0Var.a;
                int id2 = o7Var.getMessage() == null ? 0 : o7Var.getMessage().getId();
                o7Var.c(E, true);
                int id3 = o7Var.getMessage().getId();
                z00Var.a = o7Var.getMessage().getDialogId();
                z00Var.b = id3;
                o7Var.b(co0Var.I.c(z00Var), id2 == E.getId());
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
                z00Var.a = n7Var.getMessage().getDialogId();
                z00Var.b = id5;
                n7Var.e(co0Var.I.c(z00Var), id4 == E.getId());
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
            yn0 yn0Var = new yn0(context);
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 2, null);
            yn0Var.a = o7Var;
            o7Var.r.setVisibility(8);
            yn0Var.addView(o7Var);
            frameLayout = yn0Var;
        } else {
            frameLayout = new zn0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new vl0(frameLayout);
    }
}
