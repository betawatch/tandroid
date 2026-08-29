package nh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class eb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ fb a;

    public eb(fb fbVar) {
        this.a = fbVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ka kaVar;
        fb fbVar = this.a;
        gb gbVar = fbVar.A0;
        if (!fbVar.w0 || (kaVar = gbVar.x0) == null || gbVar.b0 != 0 || kaVar.s || gbVar.w0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = gbVar.P1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        gbVar.P1 = scaleFactor;
        gbVar.P1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        gbVar.x0.setZoom(gbVar.P1);
        u81 u81Var = gbVar.R0;
        if (u81Var != null) {
            u81Var.b(gbVar.P1, false);
        }
        gbVar.j0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        fb fbVar = this.a;
        gb gbVar = fbVar.A0;
        if (gbVar.x0 == null || gbVar.b0 != 0 || gbVar.G0) {
            return false;
        }
        fbVar.w0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        fb fbVar = this.a;
        fbVar.w0 = false;
        fbVar.A0.f(false);
        gb.c(fbVar.A0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
