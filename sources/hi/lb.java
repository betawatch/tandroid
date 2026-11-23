package hi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g81;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class lb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ mb a;

    public lb(mb mbVar) {
        this.a = mbVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        qa qaVar;
        mb mbVar = this.a;
        nb nbVar = mbVar.o0;
        if (!mbVar.k0 || (qaVar = nbVar.C0) == null || nbVar.g0 != 0 || qaVar.s || nbVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = nbVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        nbVar.U1 = scaleFactor;
        nbVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        nbVar.C0.setZoom(nbVar.U1);
        g81 g81Var = nbVar.W0;
        if (g81Var != null) {
            g81Var.b(false, nbVar.U1);
        }
        nbVar.i0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        mb mbVar = this.a;
        nb nbVar = mbVar.o0;
        if (nbVar.C0 == null || nbVar.g0 != 0 || nbVar.L0) {
            return false;
        }
        mbVar.k0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        mb mbVar = this.a;
        mbVar.k0 = false;
        mbVar.o0.e(false);
        nb.b(mbVar.o0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
