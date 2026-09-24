package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class e41 extends org.telegram.ui.Components.vl0 {
    public final Context c;

    public e41(Context context) {
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 != 1) {
            if (!pi.e.b.a()) {
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean a2 = pi.e.b.a();
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(i10 == 0 ? LocaleController.getString(R.string.RoundVideoGeneral) : LocaleController.getString(R.string.RoundVideoComposition));
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setEnabled(i10 == 1 || a2);
            if (i10 == 1) {
                w8Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), a2, false);
                return;
            } else {
                w8Var.f(LocaleController.getString(R.string.RoundVideoCompositionEnabled), pi.e.g.a(), false);
                return;
            }
        }
        if (i11 != 2) {
            ((org.telegram.ui.Cells.e9) view).setText(i10 == 6 ? LocaleController.getString(R.string.RoundVideoGeneralInfo) : LocaleController.getString(R.string.RoundVideoCompositionInfo));
            return;
        }
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
        eaVar.setEnabled(a2);
        if (i10 == 2) {
            eaVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a4.a.o(((ki.p0) pi.e.c.a()).a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i10 == 3) {
            String string = LocaleController.getString(R.string.RoundVideoCameraResolution);
            ki.l0 l0Var = (ki.l0) pi.e.d.a();
            eaVar.c(string, l0Var == ki.l0.a ? LocaleController.getString(R.string.RoundVideoCameraResolutionHigh) : l0Var == ki.l0.b ? LocaleController.getString(R.string.RoundVideoCameraResolutionMedium) : LocaleController.getString(R.string.RoundVideoCameraResolutionLow), false, true);
        } else if (i10 == 4) {
            eaVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a4.a.o(((ki.m0) pi.e.e.a()).a, " FPS", new StringBuilder()), false, true);
        } else {
            eaVar.c(LocaleController.getString(R.string.RoundVideoBitrate), f41.U(pi.e.f.a()), false, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.m4(context);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.w8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
            eaVar.setCanDisable(true);
            frameLayout = eaVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.e9(context);
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.gl0(frameLayout);
    }
}
