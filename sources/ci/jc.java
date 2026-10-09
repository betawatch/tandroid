package ci;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ja1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        ja1 ja1Var = lcVar.V0;
        if (ja1Var != null) {
            ja1Var.b(lcVar.T1, false);
        }
        lcVar.i0(true);
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
        kcVar.E0.e(false);
        lc.b(kcVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
