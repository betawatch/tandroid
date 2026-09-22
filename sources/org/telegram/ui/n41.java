package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedSettings;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n41 extends org.telegram.ui.Components.xl0 {
    public final Context c;

    public n41(Context context) {
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 != 1) {
            if (!SharedSettings.roundVideoCamera2Enabled.get()) {
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
        return 10;
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
        boolean z10 = SharedSettings.roundVideoCamera2Enabled.get();
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.n4) view).setText(i10 == 0 ? LocaleController.getString(R.string.RoundVideoGeneral) : LocaleController.getString(R.string.RoundVideoComposition));
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setEnabled(i10 == 1 || z10);
            if (i10 == 1) {
                x8Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), z10, false);
                return;
            } else {
                x8Var.f(LocaleController.getString(R.string.RoundVideoCompositionEnabled), SharedSettings.roundVideoComposition.get(), false);
                return;
            }
        }
        if (i11 != 2) {
            ((org.telegram.ui.Cells.f9) view).setText(i10 == 6 ? LocaleController.getString(R.string.RoundVideoGeneralInfo) : LocaleController.getString(R.string.RoundVideoCompositionInfo));
            return;
        }
        org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
        faVar.setEnabled(z10);
        if (i10 == 2) {
            faVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a4.a.n(SharedSettings.roundVideoOutputResolution.get().a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i10 == 3) {
            String string = LocaleController.getString(R.string.RoundVideoCameraResolution);
            ki.j0 j0Var = SharedSettings.roundVideoCameraResolution.get();
            faVar.c(string, j0Var == ki.j0.a ? LocaleController.getString(R.string.RoundVideoCameraResolutionHigh) : j0Var == ki.j0.b ? LocaleController.getString(R.string.RoundVideoCameraResolutionMedium) : LocaleController.getString(R.string.RoundVideoCameraResolutionLow), false, true);
        } else if (i10 == 4) {
            faVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a4.a.n(SharedSettings.roundVideoFrameRate.get().a, " FPS", new StringBuilder()), false, true);
        } else {
            faVar.c(LocaleController.getString(R.string.RoundVideoBitrate), o41.U(SharedSettings.roundVideoVideoBitrate.get()), false, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.n4(context);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.x8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context);
            faVar.setCanDisable(true);
            frameLayout = faVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.f9(context);
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.il0(frameLayout);
    }
}
