package ei;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import b8.be;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        n1 n1Var = n1.a0;
        WindowManager.LayoutParams layoutParams = n1Var.c;
        int h = (int) (n1Var.h() * n1Var.N);
        layoutParams.width = h;
        n1Var.K = h;
        WindowManager.LayoutParams layoutParams2 = n1Var.c;
        int f10 = (int) (n1Var.f() * n1Var.N);
        layoutParams2.height = f10;
        n1Var.L = f10;
        org.telegram.messenger.g0.T3(n1Var.b, n1Var.d, n1Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        n1 n1Var = n1.a0;
        n1Var.N = be.a(scaleGestureDetector.getScaleFactor() * n1Var.N, 0.6f, n1Var.a);
        n1Var.K = (int) (n1Var.h() * n1Var.N);
        n1Var.L = (int) (n1Var.f() * n1Var.N);
        org.telegram.messenger.g0.h3(new ai.y1(this, 11));
        q1.g gVar = n1Var.Q;
        gVar.b = n1Var.O;
        gVar.c = true;
        gVar.m.i = scaleGestureDetector.getFocusX() >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? (r5 - n1Var.K) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
        q1.g gVar2 = n1Var.Q;
        if (!gVar2.f) {
            gVar2.h();
        }
        q1.g gVar3 = n1Var.R;
        gVar3.b = n1Var.P;
        gVar3.c = true;
        gVar3.m.i = be.a(scaleGestureDetector.getFocusY() - (n1Var.L / 2.0f), org.telegram.messenger.g0.L(16.0f), (r4.y - n1Var.L) - org.telegram.messenger.g0.L(16.0f));
        q1.g gVar4 = n1Var.R;
        if (!gVar4.f) {
            gVar4.h();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        n1 n1Var = n1.a0;
        if (n1Var.F) {
            n1Var.F = false;
        }
        n1Var.G = true;
        n1Var.c.width = (int) (n1Var.h() * n1Var.a);
        n1Var.c.height = (int) (n1Var.f() * n1Var.a);
        org.telegram.messenger.g0.T3(n1Var.b, n1Var.d, n1Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        n1 n1Var = n1.a0;
        if (!n1Var.Q.f && !n1Var.R.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        h1 h1Var = new h1(this, arrayList, 0);
        q1.g gVar = n1Var.Q;
        if (gVar.f) {
            gVar.a(h1Var);
        } else {
            arrayList.add(gVar);
        }
        q1.g gVar2 = n1Var.R;
        if (gVar2.f) {
            gVar2.a(h1Var);
        } else {
            arrayList.add(gVar2);
        }
    }
}
