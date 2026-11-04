package gi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        va vaVar = uaVar.o0;
        if (!uaVar.k0 || (y9Var = vaVar.C0) == null || vaVar.g0 != 0 || y9Var.s || vaVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = vaVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        vaVar.U1 = scaleFactor;
        vaVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        vaVar.C0.setZoom(vaVar.U1);
        j71 j71Var = vaVar.W0;
        if (j71Var != null) {
            j71Var.b(false, vaVar.U1);
        }
        vaVar.i0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ua uaVar = this.a;
        va vaVar = uaVar.o0;
        if (vaVar.C0 == null || vaVar.g0 != 0 || vaVar.L0) {
            return false;
        }
        uaVar.k0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ua uaVar = this.a;
        uaVar.k0 = false;
        uaVar.o0.e(false);
        va.b(uaVar.o0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
