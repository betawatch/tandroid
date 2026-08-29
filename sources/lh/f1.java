package lh;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        i1 i1Var = i1.V;
        WindowManager.LayoutParams layoutParams = i1Var.c;
        int n10 = (int) (i1Var.n() * i1Var.I);
        layoutParams.width = n10;
        i1Var.F = n10;
        WindowManager.LayoutParams layoutParams2 = i1Var.c;
        int m10 = (int) (i1Var.m() * i1Var.I);
        layoutParams2.height = m10;
        i1Var.G = m10;
        AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, i1Var.c);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        i1 i1Var = i1.V;
        i1Var.I = i7.w.a(scaleGestureDetector.getScaleFactor() * i1Var.I, 0.6f, i1Var.a);
        i1Var.F = (int) (i1Var.n() * i1Var.I);
        i1Var.G = (int) (i1Var.m() * i1Var.I);
        AndroidUtilities.runOnUIThread(new ag.o0(this, 16));
        o1.k kVar = i1Var.L;
        kVar.b = i1Var.J;
        kVar.c = true;
        kVar.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - i1Var.F) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.k kVar2 = i1Var.L;
        if (!kVar2.f) {
            kVar2.f();
        }
        o1.k kVar3 = i1Var.M;
        kVar3.b = i1Var.K;
        kVar3.c = true;
        kVar3.u.i = i7.w.a(scaleGestureDetector.getFocusY() - (i1Var.G / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = i1Var.M;
        if (!kVar4.f) {
            kVar4.f();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        i1 i1Var = i1.V;
        if (i1Var.A) {
            i1Var.A = false;
        }
        i1Var.B = true;
        i1Var.c.width = (int) (i1Var.n() * i1Var.a);
        i1Var.c.height = (int) (i1Var.m() * i1Var.a);
        AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, i1Var.c);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        i1 i1Var = i1.V;
        if (!i1Var.L.f && !i1Var.M.f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        e1 e1Var = new e1(this, arrayList, 0);
        o1.k kVar = i1Var.L;
        if (kVar.f) {
            kVar.a(e1Var);
        } else {
            arrayList.add(kVar);
        }
        o1.k kVar2 = i1Var.M;
        if (kVar2.f) {
            kVar2.a(e1Var);
        } else {
            arrayList.add(kVar2);
        }
    }
}
