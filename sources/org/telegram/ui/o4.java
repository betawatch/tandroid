package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o4 extends org.telegram.ui.Components.lm0 {
    public final Context c;

    public o4(Context context) {
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        if (b10 != 1) {
            wi.a aVar = wi.e.b;
            aVar.a();
            if (!aVar.d || b10 != 2) {
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
        wi.a aVar = wi.e.b;
        aVar.a();
        boolean z10 = aVar.d;
        int i11 = e1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.q4) e1Var.a).setText(LocaleController.getString(R.string.AudioRecorderGeneral));
            return;
        }
        if (i11 == 1) {
            ((org.telegram.ui.Cells.a9) e1Var.a).f(LocaleController.getString(R.string.AudioRecorderUseNewRecorder), z10, false);
        } else {
            if (i11 != 2) {
                ((org.telegram.ui.Cells.i9) e1Var.a).setText(LocaleController.getString(R.string.AudioRecorderGeneralInfo));
                return;
            }
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.a;
            gaVar.setEnabled(z10);
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
        return new org.telegram.ui.Components.vl0(frameLayout);
    }
}
