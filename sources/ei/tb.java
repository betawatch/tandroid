package ei;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w91;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        w91 w91Var = vbVar.V0;
        if (w91Var != null) {
            w91Var.b(vbVar.T1, false);
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
