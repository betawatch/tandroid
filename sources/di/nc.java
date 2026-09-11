package di;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d91;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class nc extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ oc a;

    public nc(oc ocVar) {
        this.a = ocVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        sb sbVar;
        oc ocVar = this.a;
        pc pcVar = ocVar.E0;
        if (!ocVar.A0 || (sbVar = pcVar.B0) == null || pcVar.f0 != 0 || sbVar.s || pcVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = pcVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        pcVar.T1 = scaleFactor;
        pcVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        pcVar.B0.setZoom(pcVar.T1);
        d91 d91Var = pcVar.V0;
        if (d91Var != null) {
            d91Var.b(pcVar.T1, false);
        }
        pcVar.j0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        oc ocVar = this.a;
        pc pcVar = ocVar.E0;
        if (pcVar.B0 == null || pcVar.f0 != 0 || pcVar.K0) {
            return false;
        }
        ocVar.A0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        oc ocVar = this.a;
        ocVar.A0 = false;
        ocVar.E0.f(false);
        pc.c(ocVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
