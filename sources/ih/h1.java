package ih;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        k1 k1Var = k1.V;
        WindowManager.LayoutParams layoutParams = k1Var.c;
        int n10 = (int) (k1Var.n() * k1Var.I);
        layoutParams.width = n10;
        k1Var.F = n10;
        WindowManager.LayoutParams layoutParams2 = k1Var.c;
        int m10 = (int) (k1Var.m() * k1Var.I);
        layoutParams2.height = m10;
        k1Var.G = m10;
        AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, k1Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        k1 k1Var = k1.V;
        k1Var.I = g7.n.a(scaleGestureDetector.getScaleFactor() * k1Var.I, 0.6f, k1Var.a);
        k1Var.F = (int) (k1Var.n() * k1Var.I);
        k1Var.G = (int) (k1Var.m() * k1Var.I);
        AndroidUtilities.runOnUIThread(new bg.d2(this, 11));
        o1.j jVar = k1Var.L;
        jVar.b = k1Var.J;
        jVar.c = true;
        jVar.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - k1Var.F) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.j jVar2 = k1Var.L;
        if (!jVar2.f) {
            jVar2.f();
        }
        o1.j jVar3 = k1Var.M;
        jVar3.b = k1Var.K;
        jVar3.c = true;
        jVar3.u.i = g7.n.a(scaleGestureDetector.getFocusY() - (k1Var.G / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.G) - AndroidUtilities.dp(16.0f));
        o1.j jVar4 = k1Var.M;
        if (!jVar4.f) {
            jVar4.f();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        k1 k1Var = k1.V;
        if (k1Var.A) {
            k1Var.A = false;
        }
        k1Var.B = true;
        k1Var.c.width = (int) (k1Var.n() * k1Var.a);
        k1Var.c.height = (int) (k1Var.m() * k1Var.a);
        AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, k1Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        k1 k1Var = k1.V;
        if (!k1Var.L.f && !k1Var.M.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        g1 g1Var = new g1(this, arrayList, 0);
        o1.j jVar = k1Var.L;
        if (jVar.f) {
            jVar.a(g1Var);
        } else {
            arrayList.add(jVar);
        }
        o1.j jVar2 = k1Var.M;
        if (jVar2.f) {
            jVar2.a(g1Var);
        } else {
            arrayList.add(jVar2);
        }
    }
}
