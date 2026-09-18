package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vm0 extends ll0 {
    public final /* synthetic */ wm0 c;

    public vm0(wm0 wm0Var) {
        this.c = wm0Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        wm0 wm0Var = this.c;
        int i11 = wm0Var.v;
        if (i10 >= i11 && i10 < wm0Var.w) {
            return (MessageObject) wm0Var.e.get(i10 - i11);
        }
        int i12 = wm0Var.y;
        if (i10 < i12 || i10 >= wm0Var.E) {
            return null;
        }
        return (MessageObject) wm0Var.f.get(i10 - i12);
    }

    @Override // s4.h0
    public final int h() {
        return this.c.r;
    }

    @Override // s4.h0
    public final int j(int i10) {
        wm0 wm0Var = this.c;
        if (i10 == wm0Var.s || i10 == wm0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        wm0 wm0Var = this.c;
        org.telegram.ui.r10 r10Var = wm0Var.J;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 != wm0Var.s) {
                if (i10 == wm0Var.x) {
                    u3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new x70(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!u3Var.getText().equals(string)) {
                u3Var.c(string, LocaleController.getString(wm0Var.H ? R.string.PauseAll : R.string.ResumeAll), new um0(this));
                return;
            }
            String string2 = LocaleController.getString(wm0Var.H ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = wm0Var.H;
            org.telegram.ui.Cells.t3 t3Var = u3Var.b;
            t3Var.c(string2, true, z11);
            t3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = wm0Var.I.g() && i10 >= wm0Var.v && i10 < wm0Var.w;
            if (i11 == 1) {
                sm0 sm0Var = (sm0) view;
                sm0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                org.telegram.ui.Cells.j7 j7Var = sm0Var.a;
                int id2 = j7Var.getMessage() == null ? 0 : j7Var.getMessage().getId();
                j7Var.c(E, true);
                int id3 = j7Var.getMessage().getId();
                r10Var.a = j7Var.getMessage().getDialogId();
                r10Var.b = id3;
                j7Var.b(wm0Var.I.c(r10Var), id2 == E.getId());
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
                r10Var.a = i7Var.getMessage().getDialogId();
                r10Var.b = id5;
                i7Var.e(wm0Var.I.c(r10Var), id4 == E.getId());
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
            sm0 sm0Var = new sm0(context);
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 2, null);
            sm0Var.a = j7Var;
            j7Var.r.setVisibility(8);
            sm0Var.addView(j7Var);
            frameLayout = sm0Var;
        } else {
            frameLayout = new tm0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new wk0(frameLayout);
    }
}
