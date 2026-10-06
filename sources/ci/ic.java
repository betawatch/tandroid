package ci;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ca1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
