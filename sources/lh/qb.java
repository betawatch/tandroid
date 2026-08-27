package lh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k81;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class qb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ rb a;

    public qb(rb rbVar) {
        this.a = rbVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        wa waVar;
        rb rbVar = this.a;
        sb sbVar = rbVar.A0;
        if (!rbVar.w0 || (waVar = sbVar.x0) == null || sbVar.b0 != 0 || waVar.s || sbVar.w0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = sbVar.P1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        sbVar.P1 = scaleFactor;
        sbVar.P1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        sbVar.x0.setZoom(sbVar.P1);
        k81 k81Var = sbVar.R0;
        if (k81Var != null) {
            k81Var.b(sbVar.P1, false);
        }
        sbVar.j0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar = this.a;
        sb sbVar = rbVar.A0;
        if (sbVar.x0 == null || sbVar.b0 != 0 || sbVar.G0) {
            return false;
        }
        rbVar.w0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar = this.a;
        rbVar.w0 = false;
        rbVar.A0.f(false);
        sb.c(rbVar.A0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
