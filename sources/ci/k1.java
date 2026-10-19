package ci;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class k1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        p1 p1Var = p1.Z;
        WindowManager.LayoutParams layoutParams = p1Var.c;
        int n10 = (int) (p1Var.n() * p1Var.M);
        layoutParams.width = n10;
        p1Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = p1Var.c;
        int m10 = (int) (p1Var.m() * p1Var.M);
        layoutParams2.height = m10;
        p1Var.K = m10;
        AndroidUtilities.updateViewLayout(p1Var.b, p1Var.d, p1Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        p1 p1Var = p1.Z;
        p1Var.M = w7.r.a(scaleGestureDetector.getScaleFactor() * p1Var.M, 0.6f, p1Var.a);
        p1Var.J = (int) (p1Var.n() * p1Var.M);
        p1Var.K = (int) (p1Var.m() * p1Var.M);
        AndroidUtilities.runOnUIThread(new ah.j(this, 8));
        o1.k kVar = p1Var.P;
        kVar.b = p1Var.N;
        kVar.c = true;
        kVar.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - p1Var.J) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.k kVar2 = p1Var.P;
        if (!kVar2.f) {
            kVar2.h();
        }
        o1.k kVar3 = p1Var.Q;
        kVar3.b = p1Var.O;
        kVar3.c = true;
        kVar3.u.i = w7.r.a(scaleGestureDetector.getFocusY() - (p1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - p1Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = p1Var.Q;
        if (!kVar4.f) {
            kVar4.h();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        p1 p1Var = p1.Z;
        if (p1Var.E) {
            p1Var.E = false;
        }
        p1Var.F = true;
        p1Var.c.width = (int) (p1Var.n() * p1Var.a);
        p1Var.c.height = (int) (p1Var.m() * p1Var.a);
        AndroidUtilities.updateViewLayout(p1Var.b, p1Var.d, p1Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        p1 p1Var = p1.Z;
        if (!p1Var.P.f && !p1Var.Q.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        j1 j1Var = new j1(this, arrayList, 0);
        o1.k kVar = p1Var.P;
        if (kVar.f) {
            kVar.a(j1Var);
        } else {
            arrayList.add(kVar);
        }
        o1.k kVar2 = p1Var.Q;
        if (kVar2.f) {
            kVar2.a(j1Var);
        } else {
            arrayList.add(kVar2);
        }
    }
}
