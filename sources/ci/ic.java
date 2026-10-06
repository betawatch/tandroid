package ci;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ca1;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class ic extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ jc a;

    public ic(jc jcVar) {
        this.a = jcVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        nb nbVar;
        jc jcVar = this.a;
        kc kcVar = jcVar.E0;
        if (!jcVar.A0 || (nbVar = kcVar.B0) == null || kcVar.f0 != 0 || nbVar.s || kcVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = kcVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        kcVar.T1 = scaleFactor;
        kcVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        kcVar.B0.setZoom(kcVar.T1);
        ca1 ca1Var = kcVar.V0;
        if (ca1Var != null) {
            ca1Var.b(kcVar.T1, false);
        }
        kcVar.j0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        jc jcVar = this.a;
        kc kcVar = jcVar.E0;
        if (kcVar.B0 == null || kcVar.f0 != 0 || kcVar.K0) {
            return false;
        }
        jcVar.A0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        jc jcVar = this.a;
        jcVar.A0 = false;
        jcVar.E0.f(false);
        kc.c(jcVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
