package bi;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class w1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        a2 a2Var = a2.Z;
        WindowManager.LayoutParams layoutParams = a2Var.c;
        int n10 = (int) (a2Var.n() * a2Var.M);
        layoutParams.width = n10;
        a2Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = a2Var.c;
        int m10 = (int) (a2Var.m() * a2Var.M);
        layoutParams2.height = m10;
        a2Var.K = m10;
        AndroidUtilities.updateViewLayout(a2Var.b, a2Var.d, a2Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        a2 a2Var = a2.Z;
        a2Var.M = w7.p.a(scaleGestureDetector.getScaleFactor() * a2Var.M, 0.6f, a2Var.a);
        a2Var.J = (int) (a2Var.n() * a2Var.M);
        a2Var.K = (int) (a2Var.m() * a2Var.M);
        AndroidUtilities.runOnUIThread(new ah.j(this, 4));
        o1.k kVar = a2Var.P;
        kVar.b = a2Var.N;
        kVar.c = true;
        kVar.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - a2Var.J) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.k kVar2 = a2Var.P;
        if (!kVar2.f) {
            kVar2.f();
        }
        o1.k kVar3 = a2Var.Q;
        kVar3.b = a2Var.O;
        kVar3.c = true;
        kVar3.u.i = w7.p.a(scaleGestureDetector.getFocusY() - (a2Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - a2Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = a2Var.Q;
        if (!kVar4.f) {
            kVar4.f();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        a2 a2Var = a2.Z;
        if (a2Var.E) {
            a2Var.E = false;
        }
        a2Var.F = true;
        a2Var.c.width = (int) (a2Var.n() * a2Var.a);
        a2Var.c.height = (int) (a2Var.m() * a2Var.a);
        AndroidUtilities.updateViewLayout(a2Var.b, a2Var.d, a2Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        a2 a2Var = a2.Z;
        if (!a2Var.P.f && !a2Var.Q.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        v1 v1Var = new v1(this, arrayList, 0);
        o1.k kVar = a2Var.P;
        if (kVar.f) {
            kVar.a(v1Var);
        } else {
            arrayList.add(kVar);
        }
        o1.k kVar2 = a2Var.Q;
        if (kVar2.f) {
            kVar2.a(v1Var);
        } else {
            arrayList.add(kVar2);
        }
    }
}
