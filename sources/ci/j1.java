package ci;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class j1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        o1 o1Var = o1.Z;
        WindowManager.LayoutParams layoutParams = o1Var.c;
        int n10 = (int) (o1Var.n() * o1Var.M);
        layoutParams.width = n10;
        o1Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = o1Var.c;
        int m10 = (int) (o1Var.m() * o1Var.M);
        layoutParams2.height = m10;
        o1Var.K = m10;
        AndroidUtilities.updateViewLayout(o1Var.b, o1Var.d, o1Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        o1 o1Var = o1.Z;
        o1Var.M = w7.r.a(scaleGestureDetector.getScaleFactor() * o1Var.M, 0.6f, o1Var.a);
        o1Var.J = (int) (o1Var.n() * o1Var.M);
        o1Var.K = (int) (o1Var.m() * o1Var.M);
        AndroidUtilities.runOnUIThread(new ah.j(this, 8));
        o1.k kVar = o1Var.P;
        kVar.b = o1Var.N;
        kVar.c = true;
        kVar.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - o1Var.J) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.k kVar2 = o1Var.P;
        if (!kVar2.f) {
            kVar2.h();
        }
        o1.k kVar3 = o1Var.Q;
        kVar3.b = o1Var.O;
        kVar3.c = true;
        kVar3.u.i = w7.r.a(scaleGestureDetector.getFocusY() - (o1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = o1Var.Q;
        if (!kVar4.f) {
            kVar4.h();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        o1 o1Var = o1.Z;
        if (o1Var.E) {
            o1Var.E = false;
        }
        o1Var.F = true;
        o1Var.c.width = (int) (o1Var.n() * o1Var.a);
        o1Var.c.height = (int) (o1Var.m() * o1Var.a);
        AndroidUtilities.updateViewLayout(o1Var.b, o1Var.d, o1Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        o1 o1Var = o1.Z;
        if (!o1Var.P.f && !o1Var.Q.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1(this, arrayList, 0);
        o1.k kVar = o1Var.P;
        if (kVar.f) {
            kVar.a(i1Var);
        } else {
            arrayList.add(kVar);
        }
        o1.k kVar2 = o1Var.Q;
        if (kVar2.f) {
            kVar2.a(i1Var);
        } else {
            arrayList.add(kVar2);
        }
    }
}
