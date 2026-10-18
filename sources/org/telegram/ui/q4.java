package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class q4 extends org.telegram.ui.Components.hm0 {
    public final Context c;

    public q4(Context context) {
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 != 1) {
            ti.a aVar = ti.e.b;
            aVar.a();
            if (!aVar.d || b10 != 2) {
                return false;
            }
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return 4;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        return i10 == 2 ? 2 : 3;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        ti.a aVar = ti.e.b;
        aVar.a();
        boolean z10 = aVar.d;
        int i11 = b1Var.f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.l4) b1Var.a).setText(LocaleController.getString(R.string.AudioRecorderGeneral));
            return;
        }
        if (i11 == 1) {
            ((org.telegram.ui.Cells.v8) b1Var.a).f(LocaleController.getString(R.string.AudioRecorderUseNewRecorder), z10, false);
        } else {
            if (i11 != 2) {
                ((org.telegram.ui.Cells.d9) b1Var.a).setText(LocaleController.getString(R.string.AudioRecorderGeneralInfo));
                return;
            }
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) b1Var.a;
            baVar.setEnabled(z10);
            baVar.c(LocaleController.getString(R.string.AudioRecorderNoiseSuppression), LocaleController.getString(((ri.i) ti.e.c.a()) == ri.i.b ? R.string.AudioRecorderNoiseSuppressionRNNoise : R.string.AudioRecorderNoiseSuppressionOff), false, false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.l4(context);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.v8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            baVar.setCanDisable(true);
            frameLayout = baVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.d9(context);
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.sl0(frameLayout);
    }
}
