package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class n41 extends org.telegram.ui.Components.ul0 {
    public final Context c;

    public n41(Context context) {
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 != 1) {
            if (!MessagesController.getGlobalMainSettings().getBoolean("round_video_camera2_enabled", true)) {
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
        boolean z10 = MessagesController.getGlobalMainSettings().getBoolean("round_video_camera2_enabled", true);
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
                x8Var.f(LocaleController.getString(R.string.RoundVideoCompositionEnabled), w7.a6.a(), false);
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
            faVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a4.a.n(((ki.m0) w7.a6.c("round_video_output_resolution", ki.m0.b, ki.m0.class)).a, "p", new StringBuilder()), false, true);
            return;
        }
        if (i10 == 3) {
            String string = LocaleController.getString(R.string.RoundVideoCameraResolution);
            ki.i0 i0Var = ki.i0.a;
            ki.i0 i0Var2 = (ki.i0) w7.a6.c("round_video_camera_resolution", i0Var, ki.i0.class);
            faVar.c(string, i0Var2 == i0Var ? LocaleController.getString(R.string.RoundVideoCameraResolutionHigh) : i0Var2 == ki.i0.b ? LocaleController.getString(R.string.RoundVideoCameraResolutionMedium) : LocaleController.getString(R.string.RoundVideoCameraResolutionLow), false, true);
            return;
        }
        if (i10 == 4) {
            faVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a4.a.n(((ki.j0) w7.a6.c("round_video_frame_rate", ki.j0.b, ki.j0.class)).a, " FPS", new StringBuilder()), false, true);
        } else {
            faVar.c(LocaleController.getString(R.string.RoundVideoBitrate), o41.U(Math.max(1, MessagesController.getGlobalMainSettings().getInt("round_video_video_bitrate", MediaController.VIDEO_BITRATE_480))), false, false);
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
        return new org.telegram.ui.Components.fl0(frameLayout);
    }
}
