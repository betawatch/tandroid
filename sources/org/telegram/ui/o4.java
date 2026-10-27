package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o4 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ p4 d;

    public o4(p4 p4Var, Context context) {
        this.d = p4Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int b10 = e1Var.b();
        if (b10 != 1) {
            i10 = ((org.telegram.ui.ActionBar.r2) this.d).currentAccount;
            if (!MediaController.shouldUseAudioRecorderV2(i10) || b10 != 2) {
                return false;
            }
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return 4;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        return i10 == 2 ? 2 : 3;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        i11 = ((org.telegram.ui.ActionBar.r2) this.d).currentAccount;
        boolean shouldUseAudioRecorderV2 = MediaController.shouldUseAudioRecorderV2(i11);
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.AudioRecorderGeneral));
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.a9) view).f(LocaleController.getString(R.string.AudioRecorderUseNewRecorder), shouldUseAudioRecorderV2, false);
        } else {
            if (i12 != 2) {
                ((org.telegram.ui.Cells.i9) view).setText(LocaleController.getString(R.string.AudioRecorderGeneralInfo));
                return;
            }
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            gaVar.setEnabled(shouldUseAudioRecorderV2);
            gaVar.c(LocaleController.getString(R.string.AudioRecorderNoiseSuppression), LocaleController.getString(((ui.h) wi.e.c.a()) == ui.h.b ? R.string.AudioRecorderNoiseSuppressionRNNoise : R.string.AudioRecorderNoiseSuppressionOff), false, false);
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
