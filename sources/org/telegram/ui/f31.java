package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f31 extends org.telegram.ui.Components.lm0 {
    public final Context c;

    public f31(Context context) {
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        if (b10 != 1) {
            wi.a aVar = wi.e.d;
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
    public final void v(s4.e1 e1Var, int i10) {
        wi.a aVar = wi.e.d;
        aVar.a();
        boolean z10 = aVar.d;
        int i11 = e1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.q4) e1Var.a).setText(i10 == 0 ? LocaleController.getString(R.string.RoundVideoGeneral) : LocaleController.getString(R.string.RoundVideoComposition));
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) e1Var.a;
            a9Var.setEnabled(i10 == 1 || z10);
            if (i10 == 1) {
                a9Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), z10, false);
                return;
            }
            String string = LocaleController.getString(R.string.RoundVideoCompositionEnabled);
            wi.a aVar2 = wi.e.i;
            aVar2.a();
            a9Var.f(string, aVar2.d, false);
            return;
        }
        if (i11 != 2) {
            ((org.telegram.ui.Cells.i9) e1Var.a).setText(i10 == 6 ? LocaleController.getString(R.string.RoundVideoGeneralInfo) : LocaleController.getString(R.string.RoundVideoCompositionInfo));
            return;
        }
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.a;
        gaVar.setEnabled(z10);
        if (i10 == 2) {
            gaVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a1.g.n(((vi.q0) wi.e.e.a()).a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i10 == 3) {
            String string2 = LocaleController.getString(R.string.RoundVideoCameraResolution);
            vi.m0 m0Var = (vi.m0) wi.e.f.a();
            gaVar.c(string2, m0Var == vi.m0.a ? LocaleController.getString(R.string.RoundVideoCameraResolutionHigh) : m0Var == vi.m0.b ? LocaleController.getString(R.string.RoundVideoCameraResolutionMedium) : LocaleController.getString(R.string.RoundVideoCameraResolutionLow), false, true);
        } else if (i10 == 4) {
            gaVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a1.g.n(((vi.n0) wi.e.g.a()).a, " FPS", new StringBuilder()), false, true);
        } else {
            gaVar.c(LocaleController.getString(R.string.RoundVideoBitrate), g31.V(wi.e.h.a()), false, false);
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
        return new org.telegram.ui.Components.vl0(frameLayout);
    }
}
