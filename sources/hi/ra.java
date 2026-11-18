package hi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c81;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class ra extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ sa a;

    public ra(sa saVar) {
        this.a = saVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        w9 w9Var;
        sa saVar = this.a;
        ta taVar = saVar.o0;
        if (!saVar.k0 || (w9Var = taVar.C0) == null || taVar.g0 != 0 || w9Var.s || taVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = taVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        taVar.U1 = scaleFactor;
        taVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        taVar.C0.setZoom(taVar.U1);
        c81 c81Var = taVar.W0;
        if (c81Var != null) {
            c81Var.b(false, taVar.U1);
        }
        taVar.i0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        sa saVar = this.a;
        ta taVar = saVar.o0;
        if (taVar.C0 == null || taVar.g0 != 0 || taVar.L0) {
            return false;
        }
        saVar.k0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        sa saVar = this.a;
        saVar.k0 = false;
        saVar.o0.e(false);
        ta.b(saVar.o0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
