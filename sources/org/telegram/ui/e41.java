package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class e41 extends org.telegram.ui.Components.yl0 {
    public final Context c;

    public e41(Context context) {
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 != 1) {
            ri.a aVar = ri.e.b;
            aVar.a();
            if (!aVar.d) {
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
        ri.a aVar = ri.e.b;
        aVar.a();
        boolean z10 = aVar.d;
        int i11 = c1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.m4) c1Var.a).setText(i10 == 0 ? LocaleController.getString(R.string.RoundVideoGeneral) : LocaleController.getString(R.string.RoundVideoComposition));
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) c1Var.a;
            w8Var.setEnabled(i10 == 1 || z10);
            if (i10 == 1) {
                w8Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), z10, false);
                return;
            }
            String string = LocaleController.getString(R.string.RoundVideoCompositionEnabled);
            ri.a aVar2 = ri.e.g;
            aVar2.a();
            w8Var.f(string, aVar2.d, false);
            return;
        }
        if (i11 != 2) {
            ((org.telegram.ui.Cells.e9) c1Var.a).setText(i10 == 6 ? LocaleController.getString(R.string.RoundVideoGeneralInfo) : LocaleController.getString(R.string.RoundVideoCompositionInfo));
            return;
        }
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.a;
        eaVar.setEnabled(z10);
        if (i10 == 2) {
            eaVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a4.a.o(((ki.q0) ri.e.c.a()).a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i10 == 3) {
            String string2 = LocaleController.getString(R.string.RoundVideoCameraResolution);
            ki.m0 m0Var = (ki.m0) ri.e.d.a();
            eaVar.c(string2, m0Var == ki.m0.a ? LocaleController.getString(R.string.RoundVideoCameraResolutionHigh) : m0Var == ki.m0.b ? LocaleController.getString(R.string.RoundVideoCameraResolutionMedium) : LocaleController.getString(R.string.RoundVideoCameraResolutionLow), false, true);
        } else if (i10 == 4) {
            eaVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a4.a.o(((ki.n0) ri.e.e.a()).a, " FPS", new StringBuilder()), false, true);
        } else {
            eaVar.c(LocaleController.getString(R.string.RoundVideoBitrate), f41.S(ri.e.f.a()), false, false);
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
        return new org.telegram.ui.Components.il0(frameLayout);
    }
}
