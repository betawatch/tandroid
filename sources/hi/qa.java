package hi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f81;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class qa extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ ra a;

    public qa(ra raVar) {
        this.a = raVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        v9 v9Var;
        ra raVar = this.a;
        sa saVar = raVar.o0;
        if (!raVar.k0 || (v9Var = saVar.C0) == null || saVar.g0 != 0 || v9Var.s || saVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = saVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        saVar.U1 = scaleFactor;
        saVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        saVar.C0.setZoom(saVar.U1);
        f81 f81Var = saVar.W0;
        if (f81Var != null) {
            f81Var.b(false, saVar.U1);
        }
        saVar.i0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ra raVar = this.a;
        sa saVar = raVar.o0;
        if (saVar.C0 == null || saVar.g0 != 0 || saVar.L0) {
            return false;
        }
        raVar.k0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ra raVar = this.a;
        raVar.k0 = false;
        raVar.o0.e(false);
        sa.b(raVar.o0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
