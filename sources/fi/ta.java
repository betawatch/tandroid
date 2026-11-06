package fi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l71;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ta extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ ua a;

    public ta(ua uaVar) {
        this.a = uaVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        y9 y9Var;
        ua uaVar = this.a;
        va vaVar = uaVar.n0;
        if (!uaVar.j0 || (y9Var = vaVar.B0) == null || vaVar.f0 != 0 || y9Var.s || vaVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = vaVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        vaVar.T1 = scaleFactor;
        vaVar.T1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        vaVar.B0.setZoom(vaVar.T1);
        l71 l71Var = vaVar.V0;
        if (l71Var != null) {
            l71Var.b(false, vaVar.T1);
        }
        vaVar.i0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ua uaVar = this.a;
        va vaVar = uaVar.n0;
        if (vaVar.B0 == null || vaVar.f0 != 0 || vaVar.K0) {
            return false;
        }
        uaVar.j0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ua uaVar = this.a;
        uaVar.j0 = false;
        uaVar.n0.e(false);
        va.b(uaVar.n0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
