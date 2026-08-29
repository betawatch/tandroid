package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sm0 extends il0 {
    public final /* synthetic */ tm0 c;

    public sm0(tm0 tm0Var) {
        this.c = tm0Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        tm0 tm0Var = this.c;
        int i11 = tm0Var.v;
        if (i10 >= i11 && i10 < tm0Var.w) {
            return (MessageObject) tm0Var.e.get(i10 - i11);
        }
        int i12 = tm0Var.y;
        if (i10 < i12 || i10 >= tm0Var.A) {
            return null;
        }
        return (MessageObject) tm0Var.f.get(i10 - i12);
    }

    @Override // f2.p0
    public final int h() {
        return this.c.r;
    }

    @Override // f2.p0
    public final int j(int i10) {
        tm0 tm0Var = this.c;
        if (i10 == tm0Var.s || i10 == tm0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        tm0 tm0Var = this.c;
        org.telegram.ui.z00 z00Var = tm0Var.F;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 != tm0Var.s) {
                if (i10 == tm0Var.x) {
                    s3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new u70(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!s3Var.getText().equals(string)) {
                s3Var.c(string, LocaleController.getString(tm0Var.D ? R.string.PauseAll : R.string.ResumeAll), new rm0(this));
                return;
            }
            String string2 = LocaleController.getString(tm0Var.D ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = tm0Var.D;
            org.telegram.ui.Cells.r3 r3Var = s3Var.b;
            r3Var.c(string2, true, z11);
            r3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = tm0Var.E.f() && i10 >= tm0Var.v && i10 < tm0Var.w;
            if (i11 == 1) {
                pm0 pm0Var = (pm0) view;
                pm0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                org.telegram.ui.Cells.g7 g7Var = pm0Var.a;
                int id2 = g7Var.getMessage() == null ? 0 : g7Var.getMessage().getId();
                g7Var.c(E, true);
                int id3 = g7Var.getMessage().getId();
                z00Var.a = g7Var.getMessage().getDialogId();
                z00Var.b = id3;
                g7Var.b(tm0Var.E.b(z00Var), id2 == E.getId());
                z10 = id2 == E.getId();
                if (g7Var.K == z12) {
                    return;
                }
                g7Var.K = z12;
                if (!z10) {
                    g7Var.L = z12 ? 1.0f : 0.0f;
                }
                g7Var.invalidate();
                return;
            }
            if (i11 == 2) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                int id4 = f7Var.getMessage() == null ? 0 : f7Var.getMessage().getId();
                f7Var.f(E, true);
                int id5 = f7Var.getMessage().getId();
                z00Var.a = f7Var.getMessage().getDialogId();
                z00Var.b = id5;
                f7Var.e(tm0Var.E.b(z00Var), id4 == E.getId());
                z10 = id4 == E.getId();
                if (f7Var.W == z12) {
                    return;
                }
                f7Var.W = z12;
                if (!z10) {
                    f7Var.a0 = z12 ? 1.0f : 0.0f;
                }
                f7Var.invalidate();
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.s3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            pm0 pm0Var = new pm0(context);
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(context, 2, null);
            pm0Var.a = g7Var;
            g7Var.r.setVisibility(8);
            pm0Var.addView(g7Var);
            frameLayout = pm0Var;
        } else {
            frameLayout = new qm0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new vk0(frameLayout);
    }
}
