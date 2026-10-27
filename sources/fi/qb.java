package fi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class qb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ rb a;

    public qb(rb rbVar) {
        this.a = rbVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        va vaVar;
        rb rbVar = this.a;
        sb sbVar = rbVar.t0;
        if (!rbVar.p0 || (vaVar = sbVar.B0) == null || sbVar.f0 != 0 || vaVar.s || sbVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = sbVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        sbVar.T1 = scaleFactor;
        sbVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        sbVar.B0.setZoom(sbVar.T1);
        kc1 kc1Var = sbVar.V0;
        if (kc1Var != null) {
            kc1Var.b(sbVar.T1, false);
        }
        sbVar.i0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar = this.a;
        sb sbVar = rbVar.t0;
        if (sbVar.B0 == null || sbVar.f0 != 0 || sbVar.K0) {
            return false;
        }
        rbVar.p0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar = this.a;
        rbVar.p0 = false;
        rbVar.t0.e(false);
        sb.b(rbVar.t0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
