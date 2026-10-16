package bi;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class w1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        b2 b2Var = b2.Z;
        WindowManager.LayoutParams layoutParams = b2Var.c;
        int n10 = (int) (b2Var.n() * b2Var.M);
        layoutParams.width = n10;
        b2Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = b2Var.c;
        int m10 = (int) (b2Var.m() * b2Var.M);
        layoutParams2.height = m10;
        b2Var.K = m10;
        AndroidUtilities.updateViewLayout(b2Var.b, b2Var.d, b2Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        b2 b2Var = b2.Z;
        b2Var.M = w7.r.a(scaleGestureDetector.getScaleFactor() * b2Var.M, 0.6f, b2Var.a);
        b2Var.J = (int) (b2Var.n() * b2Var.M);
        b2Var.K = (int) (b2Var.m() * b2Var.M);
        AndroidUtilities.runOnUIThread(new ah.j(this, 4));
        o1.k kVar = b2Var.P;
        kVar.b = b2Var.N;
        kVar.c = true;
        kVar.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - b2Var.J) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.k kVar2 = b2Var.P;
        if (!kVar2.f) {
            kVar2.h();
        }
        o1.k kVar3 = b2Var.Q;
        kVar3.b = b2Var.O;
        kVar3.c = true;
        kVar3.u.i = w7.r.a(scaleGestureDetector.getFocusY() - (b2Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - b2Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = b2Var.Q;
        if (!kVar4.f) {
            kVar4.h();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        b2 b2Var = b2.Z;
        if (b2Var.E) {
            b2Var.E = false;
        }
        b2Var.F = true;
        b2Var.c.width = (int) (b2Var.n() * b2Var.a);
        b2Var.c.height = (int) (b2Var.m() * b2Var.a);
        AndroidUtilities.updateViewLayout(b2Var.b, b2Var.d, b2Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        b2 b2Var = b2.Z;
        if (!b2Var.P.f && !b2Var.Q.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        v1 v1Var = new v1(this, arrayList, 0);
        o1.k kVar = b2Var.P;
        if (kVar.f) {
            kVar.a(v1Var);
        } else {
            arrayList.add(kVar);
        }
        o1.k kVar2 = b2Var.Q;
        if (kVar2.f) {
            kVar2.a(v1Var);
        } else {
            arrayList.add(kVar2);
        }
    }
}
