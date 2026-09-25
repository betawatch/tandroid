package ai;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class h2 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        m2 m2Var = m2.Z;
        WindowManager.LayoutParams layoutParams = m2Var.c;
        int n10 = (int) (m2Var.n() * m2Var.M);
        layoutParams.width = n10;
        m2Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = m2Var.c;
        int m10 = (int) (m2Var.m() * m2Var.M);
        layoutParams2.height = m10;
        m2Var.K = m10;
        AndroidUtilities.updateViewLayout(m2Var.b, m2Var.d, m2Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        m2 m2Var = m2.Z;
        m2Var.M = w7.q.a(scaleGestureDetector.getScaleFactor() * m2Var.M, 0.6f, m2Var.a);
        m2Var.J = (int) (m2Var.n() * m2Var.M);
        m2Var.K = (int) (m2Var.m() * m2Var.M);
        AndroidUtilities.runOnUIThread(new f(this, 3));
        o1.k kVar = m2Var.P;
        kVar.b = m2Var.N;
        kVar.c = true;
        kVar.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - m2Var.J) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.k kVar2 = m2Var.P;
        if (!kVar2.f) {
            kVar2.f();
        }
        o1.k kVar3 = m2Var.Q;
        kVar3.b = m2Var.O;
        kVar3.c = true;
        kVar3.u.i = w7.q.a(scaleGestureDetector.getFocusY() - (m2Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = m2Var.Q;
        if (!kVar4.f) {
            kVar4.f();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        m2 m2Var = m2.Z;
        if (m2Var.E) {
            m2Var.E = false;
        }
        m2Var.F = true;
        m2Var.c.width = (int) (m2Var.n() * m2Var.a);
        m2Var.c.height = (int) (m2Var.m() * m2Var.a);
        AndroidUtilities.updateViewLayout(m2Var.b, m2Var.d, m2Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        m2 m2Var = m2.Z;
        if (!m2Var.P.f && !m2Var.Q.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        g2 g2Var = new g2(this, arrayList, 0);
        o1.k kVar = m2Var.P;
        if (kVar.f) {
            kVar.a(g2Var);
        } else {
            arrayList.add(kVar);
        }
        o1.k kVar2 = m2Var.Q;
        if (kVar2.f) {
            kVar2.a(g2Var);
        } else {
            arrayList.add(kVar2);
        }
    }
}
