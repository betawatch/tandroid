package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h31 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ i31 d;

    public h31(i31 i31Var, Context context) {
        this.d = i31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int b10 = e1Var.b();
        if (b10 != 1) {
            i10 = ((org.telegram.ui.ActionBar.r2) this.d).currentAccount;
            if (!org.telegram.ui.Components.u60.d(i10)) {
                return false;
            }
            if (b10 != 2 && b10 != 3 && b10 != 4 && b10 != 5 && b10 != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return 7;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0 || i10 == 7) {
            return 0;
        }
        if (i10 == 1 || i10 == 8) {
            return 1;
        }
        return (i10 == 6 || i10 == 9) ? 3 : 2;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        i11 = ((org.telegram.ui.ActionBar.r2) this.d).currentAccount;
        boolean d = org.telegram.ui.Components.u60.d(i11);
        int i12 = e1Var.f;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.q4) e1Var.a).setText(i10 == 0 ? LocaleController.getString(R.string.RoundVideoGeneral) : LocaleController.getString(R.string.RoundVideoComposition));
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) e1Var.a;
            a9Var.setEnabled(i10 == 1 || d);
            if (i10 == 1) {
                a9Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), d, false);
                return;
            }
            String string = LocaleController.getString(R.string.RoundVideoCompositionEnabled);
            wi.a aVar = wi.e.i;
            aVar.a();
            a9Var.f(string, aVar.d, false);
            return;
        }
        if (i12 != 2) {
            ((org.telegram.ui.Cells.i9) e1Var.a).setText(i10 == 6 ? LocaleController.getString(R.string.RoundVideoGeneralInfo) : LocaleController.getString(R.string.RoundVideoCompositionInfo));
            return;
        }
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.a;
        gaVar.setEnabled(d);
        if (i10 == 2) {
            gaVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a1.g.n(((vi.s0) wi.e.e.a()).a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i10 == 3) {
            String string2 = LocaleController.getString(R.string.RoundVideoCameraResolution);
            vi.o0 o0Var = (vi.o0) wi.e.f.a();
            gaVar.c(string2, o0Var == vi.o0.a ? LocaleController.getString(R.string.RoundVideoCameraResolutionHigh) : o0Var == vi.o0.b ? LocaleController.getString(R.string.RoundVideoCameraResolutionMedium) : LocaleController.getString(R.string.RoundVideoCameraResolutionLow), false, true);
        } else if (i10 == 4) {
            gaVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a1.g.n(((vi.p0) wi.e.g.a()).a, " FPS", new StringBuilder()), false, true);
        } else {
            gaVar.c(LocaleController.getString(R.string.RoundVideoBitrate), i31.Y(wi.e.h.a()), false, false);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.q4(context);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.a9(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
            gaVar.setCanDisable(true);
            frameLayout = gaVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.i9(context);
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
