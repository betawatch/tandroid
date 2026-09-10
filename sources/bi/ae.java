package bi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.q91;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class ae extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ be a;

    public ae(be beVar) {
        this.a = beVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        bd bdVar;
        be beVar = this.a;
        ce ceVar = beVar.E0;
        if (!beVar.A0 || (bdVar = ceVar.B0) == null || ceVar.f0 != 0 || bdVar.s || ceVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = ceVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        ceVar.T1 = scaleFactor;
        ceVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        ceVar.B0.setZoom(ceVar.T1);
        q91 q91Var = ceVar.V0;
        if (q91Var != null) {
            q91Var.b(ceVar.T1, false);
        }
        ceVar.j0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        be beVar = this.a;
        ce ceVar = beVar.E0;
        if (ceVar.B0 == null || ceVar.f0 != 0 || ceVar.K0) {
            return false;
        }
        beVar.A0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        be beVar = this.a;
        beVar.A0 = false;
        beVar.E0.f(false);
        ce.c(beVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
