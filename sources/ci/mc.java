package ci;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r91;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class mc extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ nc a;

    public mc(nc ncVar) {
        this.a = ncVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar;
        nc ncVar = this.a;
        oc ocVar = ncVar.E0;
        if (!ncVar.A0 || (rbVar = ocVar.B0) == null || ocVar.f0 != 0 || rbVar.s || ocVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = ocVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        ocVar.T1 = scaleFactor;
        ocVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        ocVar.B0.setZoom(ocVar.T1);
        r91 r91Var = ocVar.V0;
        if (r91Var != null) {
            r91Var.b(ocVar.T1, false);
        }
        ocVar.j0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        nc ncVar = this.a;
        oc ocVar = ncVar.E0;
        if (ocVar.B0 == null || ocVar.f0 != 0 || ocVar.K0) {
            return false;
        }
        ncVar.A0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        nc ncVar = this.a;
        ncVar.A0 = false;
        ncVar.E0.f(false);
        oc.c(ncVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
