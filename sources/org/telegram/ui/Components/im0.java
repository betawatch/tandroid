package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class im0 extends yk0 {
    public final /* synthetic */ jm0 c;

    public im0(jm0 jm0Var) {
        this.c = jm0Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 1 || i10 == 2;
    }

    public final MessageObject E(int i10) {
        jm0 jm0Var = this.c;
        int i11 = jm0Var.v;
        if (i10 >= i11 && i10 < jm0Var.w) {
            return (MessageObject) jm0Var.e.get(i10 - i11);
        }
        int i12 = jm0Var.y;
        if (i10 < i12 || i10 >= jm0Var.A) {
            return null;
        }
        return (MessageObject) jm0Var.f.get(i10 - i12);
    }

    @Override // f2.q0
    public final int h() {
        return this.c.r;
    }

    @Override // f2.q0
    public final int j(int i10) {
        jm0 jm0Var = this.c;
        if (i10 == jm0Var.s || i10 == jm0Var.x) {
            return 0;
        }
        MessageObject E = E(i10);
        return (E != null && E.isMusic()) ? 2 : 1;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        jm0 jm0Var = this.c;
        org.telegram.ui.a10 a10Var = jm0Var.F;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 != jm0Var.s) {
                if (i10 == jm0Var.x) {
                    s3Var.c(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new l70(this, 11));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(R.string.Downloading);
            if (!s3Var.getText().equals(string)) {
                s3Var.c(string, LocaleController.getString(jm0Var.D ? R.string.PauseAll : R.string.ResumeAll), new hm0(this));
                return;
            }
            String string2 = LocaleController.getString(jm0Var.D ? R.string.PauseAll : R.string.ResumeAll);
            boolean z11 = jm0Var.D;
            org.telegram.ui.Cells.r3 r3Var = s3Var.b;
            r3Var.c(string2, true, z11);
            r3Var.setVisibility(0);
            return;
        }
        MessageObject E = E(i10);
        if (E != null) {
            boolean z12 = jm0Var.E.f() && i10 >= jm0Var.v && i10 < jm0Var.w;
            if (i11 == 1) {
                fm0 fm0Var = (fm0) view;
                fm0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                org.telegram.ui.Cells.f7 f7Var = fm0Var.a;
                int id2 = f7Var.getMessage() == null ? 0 : f7Var.getMessage().getId();
                f7Var.c(E, true);
                int id3 = f7Var.getMessage().getId();
                a10Var.a = f7Var.getMessage().getDialogId();
                a10Var.b = id3;
                f7Var.b(jm0Var.E.b(a10Var), id2 == E.getId());
                z10 = id2 == E.getId();
                if (f7Var.K == z12) {
                    return;
                }
                f7Var.K = z12;
                if (!z10) {
                    f7Var.L = z12 ? 1.0f : 0.0f;
                }
                f7Var.invalidate();
                return;
            }
            if (i11 == 2) {
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
                int id4 = e7Var.getMessage() == null ? 0 : e7Var.getMessage().getId();
                e7Var.f(E, true);
                int id5 = e7Var.getMessage().getId();
                a10Var.a = e7Var.getMessage().getDialogId();
                a10Var.b = id5;
                e7Var.e(jm0Var.E.b(a10Var), id4 == E.getId());
                z10 = id4 == E.getId();
                if (e7Var.W == z12) {
                    return;
                }
                e7Var.W = z12;
                if (!z10) {
                    e7Var.a0 = z12 ? 1.0f : 0.0f;
                }
                e7Var.invalidate();
            }
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.s3(viewGroup.getContext(), null);
        } else if (i10 == 1) {
            Context context = viewGroup.getContext();
            fm0 fm0Var = new fm0(context);
            org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, 2, null);
            fm0Var.a = f7Var;
            f7Var.r.setVisibility(8);
            fm0Var.addView(f7Var);
            frameLayout = fm0Var;
        } else {
            frameLayout = new gm0(viewGroup.getContext());
        }
        frameLayout.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(frameLayout);
    }
}
