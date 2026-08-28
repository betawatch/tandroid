package kh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i81;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class ub extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ vb a;

    public ub(vb vbVar) {
        this.a = vbVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        za zaVar;
        vb vbVar = this.a;
        wb wbVar = vbVar.A0;
        if (!vbVar.w0 || (zaVar = wbVar.x0) == null || wbVar.b0 != 0 || zaVar.s || wbVar.w0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = wbVar.P1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        wbVar.P1 = scaleFactor;
        wbVar.P1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        wbVar.x0.setZoom(wbVar.P1);
        i81 i81Var = wbVar.R0;
        if (i81Var != null) {
            i81Var.b(wbVar.P1, false);
        }
        wbVar.j0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        vb vbVar = this.a;
        wb wbVar = vbVar.A0;
        if (wbVar.x0 == null || wbVar.b0 != 0 || wbVar.G0) {
            return false;
        }
        vbVar.w0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        vb vbVar = this.a;
        vbVar.w0 = false;
        vbVar.A0.f(false);
        wb.c(vbVar.A0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
