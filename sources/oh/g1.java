package oh;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class g1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        j1 j1Var = j1.W;
        WindowManager.LayoutParams layoutParams = j1Var.c;
        int n10 = (int) (j1Var.n() * j1Var.J);
        layoutParams.width = n10;
        j1Var.G = n10;
        WindowManager.LayoutParams layoutParams2 = j1Var.c;
        int m9 = (int) (j1Var.m() * j1Var.J);
        layoutParams2.height = m9;
        j1Var.H = m9;
        AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, j1Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        j1 j1Var = j1.W;
        j1Var.J = k7.o.a(scaleGestureDetector.getScaleFactor() * j1Var.J, 0.6f, j1Var.a);
        j1Var.G = (int) (j1Var.n() * j1Var.J);
        j1Var.H = (int) (j1Var.m() * j1Var.J);
        AndroidUtilities.runOnUIThread(new ag.f(this, 18));
        o1.j jVar = j1Var.M;
        jVar.b = j1Var.K;
        jVar.c = true;
        jVar.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - j1Var.G) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.j jVar2 = j1Var.M;
        if (!jVar2.f) {
            jVar2.f();
        }
        o1.j jVar3 = j1Var.N;
        jVar3.b = j1Var.L;
        jVar3.c = true;
        jVar3.u.i = k7.o.a(scaleGestureDetector.getFocusY() - (j1Var.H / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f));
        o1.j jVar4 = j1Var.N;
        if (!jVar4.f) {
            jVar4.f();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        j1 j1Var = j1.W;
        if (j1Var.B) {
            j1Var.B = false;
        }
        j1Var.C = true;
        j1Var.c.width = (int) (j1Var.n() * j1Var.a);
        j1Var.c.height = (int) (j1Var.m() * j1Var.a);
        AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, j1Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        j1 j1Var = j1.W;
        if (!j1Var.M.f && !j1Var.N.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        f1 f1Var = new f1(this, arrayList, 0);
        o1.j jVar = j1Var.M;
        if (jVar.f) {
            jVar.a(f1Var);
        } else {
            arrayList.add(jVar);
        }
        o1.j jVar2 = j1Var.N;
        if (jVar2.f) {
            jVar2.a(f1Var);
        } else {
            arrayList.add(jVar2);
        }
    }
}
