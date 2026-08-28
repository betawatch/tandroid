package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fm0 extends vk0 {
    public final /* synthetic */ gm0 c;

    public fm0(gm0 gm0Var) {
        this.c = gm0Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 1 || i9 == 2;
    }

    public final MessageObject E(int i9) {
        gm0 gm0Var = this.c;
        int i10 = gm0Var.v;
        if (i9 >= i10 && i9 < gm0Var.w) {
            return (MessageObject) gm0Var.e.get(i9 - i10);
        }
        int i11 = gm0Var.y;
        if (i9 < i11 || i9 >= gm0Var.A) {
            return null;
        }
        return (MessageObject) gm0Var.f.get(i9 - i11);
    }

    @Override // f2.r0
    public final int h() {
        return this.c.r;
    }

    @Override // f2.r0
    public final int j(int i9) {
        gm0 gm0Var = this.c;
        if (i9 == gm0Var.s || i9 == gm0Var.x) {
            return 0;
        }
        MessageObject E = E(i9);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        gm0 gm0Var = this.c;
        org.telegram.ui.x00 x00Var = gm0Var.F;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i9 != gm0Var.s) {
                if (i9 == gm0Var.x) {
                    v3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new h70(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!v3Var.getText().equals(string)) {
                v3Var.c(string, LocaleController.getString(gm0Var.D ? R.string.PauseAll : R.string.ResumeAll), new em0(this));
                return;
            }
            String string2 = LocaleController.getString(gm0Var.D ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = gm0Var.D;
            org.telegram.ui.Cells.u3 u3Var = v3Var.b;
            u3Var.c(string2, true, z11);
            u3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i9);
        if (E != null) {
            boolean z12 = gm0Var.E.f() && i9 >= gm0Var.v && i9 < gm0Var.w;
            if (i10 == 1) {
                cm0 cm0Var = (cm0) view;
                cm0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                org.telegram.ui.Cells.i7 i7Var = cm0Var.a;
                int id2 = i7Var.getMessage() == null ? 0 : i7Var.getMessage().getId();
                i7Var.c(E, true);
                int id3 = i7Var.getMessage().getId();
                x00Var.a = i7Var.getMessage().getDialogId();
                x00Var.b = id3;
                i7Var.b(gm0Var.E.b(x00Var), id2 == E.getId());
                z10 = id2 == E.getId();
                if (i7Var.K == z12) {
                    return;
                }
                i7Var.K = z12;
                if (!z10) {
                    i7Var.L = z12 ? 1.0f : 0.0f;
                }
                i7Var.invalidate();
                return;
            }
            if (i10 == 2) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                int id4 = h7Var.getMessage() == null ? 0 : h7Var.getMessage().getId();
                h7Var.f(E, true);
                int id5 = h7Var.getMessage().getId();
                x00Var.a = h7Var.getMessage().getDialogId();
                x00Var.b = id5;
                h7Var.e(gm0Var.E.b(x00Var), id4 == E.getId());
                z10 = id4 == E.getId();
                if (h7Var.W == z12) {
                    return;
                }
                h7Var.W = z12;
                if (!z10) {
                    h7Var.a0 = z12 ? 1.0f : 0.0f;
                }
                h7Var.invalidate();
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        if (i9 == 0) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i9 == 1) {
            Context context = viewGroup.getContext();
            cm0 cm0Var = new cm0(context);
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 2, null);
            cm0Var.a = i7Var;
            i7Var.r.setVisibility(8);
            cm0Var.addView(i7Var);
            frameLayout = cm0Var;
        } else {
            frameLayout = new dm0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new f2.a1(-1, -2));
        return new ik0(frameLayout);
    }
}
