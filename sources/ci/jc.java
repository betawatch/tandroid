package ci;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d91;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class jc extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ kc a;

    public jc(kc kcVar) {
        this.a = kcVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ob obVar;
        kc kcVar = this.a;
        lc lcVar = kcVar.E0;
        if (!kcVar.A0 || (obVar = lcVar.B0) == null || lcVar.f0 != 0 || obVar.s || lcVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = lcVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        lcVar.T1 = scaleFactor;
        lcVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        lcVar.B0.setZoom(lcVar.T1);
        d91 d91Var = lcVar.V0;
        if (d91Var != null) {
            d91Var.b(lcVar.T1, false);
        }
        lcVar.j0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        kc kcVar = this.a;
        lc lcVar = kcVar.E0;
        if (lcVar.B0 == null || lcVar.f0 != 0 || lcVar.K0) {
            return false;
        }
        kcVar.A0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        kc kcVar = this.a;
        kcVar.A0 = false;
        kcVar.E0.f(false);
        lc.c(kcVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
