package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class um0 extends kl0 {
    public final /* synthetic */ vm0 c;

    public um0(vm0 vm0Var) {
        this.c = vm0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        vm0 vm0Var = this.c;
        int i11 = vm0Var.v;
        if (i10 >= i11 && i10 < vm0Var.w) {
            return (MessageObject) vm0Var.e.get(i10 - i11);
        }
        int i12 = vm0Var.y;
        if (i10 < i12 || i10 >= vm0Var.E) {
            return null;
        }
        return (MessageObject) vm0Var.f.get(i10 - i12);
    }

    @Override // s4.h0
    public final int h() {
        return this.c.r;
    }

    @Override // s4.h0
    public final int j(int i10) {
        vm0 vm0Var = this.c;
        if (i10 == vm0Var.s || i10 == vm0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        vm0 vm0Var = this.c;
        org.telegram.ui.p10 p10Var = vm0Var.J;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 != vm0Var.s) {
                if (i10 == vm0Var.x) {
                    u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new x70(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!u3Var.getText().equals(string)) {
                u3Var.c(string, LocaleController.getString(vm0Var.H ? R.string.PauseAll : R.string.ResumeAll), new tm0(this));
                return;
            }
            String string2 = LocaleController.getString(vm0Var.H ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = vm0Var.H;
            org.telegram.ui.Cells.t3 t3Var = u3Var.b;
            t3Var.c(string2, true, z11);
            t3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = vm0Var.I.g() && i10 >= vm0Var.v && i10 < vm0Var.w;
            if (i11 == 1) {
                rm0 rm0Var = (rm0) view;
                rm0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                org.telegram.ui.Cells.j7 j7Var = rm0Var.a;
                int id2 = j7Var.getMessage() == null ? 0 : j7Var.getMessage().getId();
                j7Var.c(E, true);
                int id3 = j7Var.getMessage().getId();
                p10Var.a = j7Var.getMessage().getDialogId();
                p10Var.b = id3;
                j7Var.b(vm0Var.I.b(p10Var), id2 == E.getId());
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
                p10Var.a = i7Var.getMessage().getDialogId();
                p10Var.b = id5;
                i7Var.e(vm0Var.I.b(p10Var), id4 == E.getId());
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

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            rm0 rm0Var = new rm0(context);
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 2, null);
            rm0Var.a = j7Var;
            j7Var.r.setVisibility(8);
            rm0Var.addView(j7Var);
            frameLayout = rm0Var;
        } else {
            frameLayout = new sm0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new vk0(frameLayout);
    }
}
