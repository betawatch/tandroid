package ai;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h2 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        n2 n2Var = n2.Z;
        WindowManager.LayoutParams layoutParams = n2Var.c;
        int n10 = (int) (n2Var.n() * n2Var.M);
        layoutParams.width = n10;
        n2Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = n2Var.c;
        int m10 = (int) (n2Var.m() * n2Var.M);
        layoutParams2.height = m10;
        n2Var.K = m10;
        AndroidUtilities.updateViewLayout(n2Var.b, n2Var.d, n2Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        n2 n2Var = n2.Z;
        n2Var.M = w7.o.a(scaleGestureDetector.getScaleFactor() * n2Var.M, 0.6f, n2Var.a);
        n2Var.J = (int) (n2Var.n() * n2Var.M);
        n2Var.K = (int) (n2Var.m() * n2Var.M);
        AndroidUtilities.runOnUIThread(new f(this, 3));
        o1.k kVar = n2Var.P;
        kVar.b = n2Var.N;
        kVar.c = true;
        kVar.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - n2Var.J) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.k kVar2 = n2Var.P;
        if (!kVar2.f) {
            kVar2.h();
        }
        o1.k kVar3 = n2Var.Q;
        kVar3.b = n2Var.O;
        kVar3.c = true;
        kVar3.u.i = w7.o.a(scaleGestureDetector.getFocusY() - (n2Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - n2Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = n2Var.Q;
        if (!kVar4.f) {
            kVar4.h();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        n2 n2Var = n2.Z;
        if (n2Var.E) {
            n2Var.E = false;
        }
        n2Var.F = true;
        n2Var.c.width = (int) (n2Var.n() * n2Var.a);
        n2Var.c.height = (int) (n2Var.m() * n2Var.a);
        AndroidUtilities.updateViewLayout(n2Var.b, n2Var.d, n2Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        n2 n2Var = n2.Z;
        if (!n2Var.P.f && !n2Var.Q.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        g2 g2Var = new g2(this, arrayList, 0);
        o1.k kVar = n2Var.P;
        if (kVar.f) {
            kVar.a(g2Var);
        } else {
            arrayList.add(kVar);
        }
        o1.k kVar2 = n2Var.Q;
        if (kVar2.f) {
            kVar2.a(g2Var);
        } else {
            arrayList.add(kVar2);
        }
    }
}
