package ei;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fa1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class tb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ ub a;

    public tb(ub ubVar) {
        this.a = ubVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ya yaVar;
        ub ubVar = this.a;
        vb vbVar = ubVar.E0;
        if (!ubVar.A0 || (yaVar = vbVar.B0) == null || vbVar.f0 != 0 || yaVar.s || vbVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = vbVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        vbVar.T1 = scaleFactor;
        vbVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        vbVar.B0.setZoom(vbVar.T1);
        fa1 fa1Var = vbVar.V0;
        if (fa1Var != null) {
            fa1Var.b(vbVar.T1, false);
        }
        vbVar.i0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ub ubVar = this.a;
        vb vbVar = ubVar.E0;
        if (vbVar.B0 == null || vbVar.f0 != 0 || vbVar.K0) {
            return false;
        }
        ubVar.A0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ub ubVar = this.a;
        ubVar.A0 = false;
        ubVar.E0.e(false);
        vb.b(ubVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
