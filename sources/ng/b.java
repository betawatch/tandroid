package ng;

import a8.ee;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.t;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.xa0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public void b() {
        switch (this.a) {
            case 1:
                dh0 dh0Var = (dh0) this.b;
                WindowManager.LayoutParams layoutParams = dh0Var.c;
                int t10 = (int) (dh0Var.t() * dh0Var.J);
                layoutParams.width = t10;
                dh0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = dh0Var.c;
                int r6 = (int) (dh0Var.r() * dh0Var.J);
                layoutParams2.height = r6;
                dh0Var.I = r6;
                try {
                    AndroidUtilities.updateViewLayout(dh0Var.b, dh0Var.d, dh0Var.c);
                    break;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                i1 i1Var = (i1) this.b;
                WindowManager.LayoutParams layoutParams3 = i1Var.c;
                int m10 = (int) (i1Var.m() * i1Var.P);
                layoutParams3.width = m10;
                i1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = i1Var.c;
                int l4 = (int) (i1Var.l() * i1Var.P);
                layoutParams4.height = l4;
                i1Var.N = l4;
                AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, i1Var.c);
                break;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                    p pVar = ((c) this.b).b;
                    float focusX = scaleGestureDetector.getFocusX();
                    float focusY = scaleGestureDetector.getFocusY();
                    CropAreaView cropAreaView = pVar.a;
                    ImageView imageView = pVar.b;
                    if (!pVar.F) {
                        float f7 = pVar.L.e;
                        if (f7 * scaleFactor > 30.0f) {
                            scaleFactor = 30.0f / f7;
                        }
                        n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (t.y((imageView.getHeight() - pVar.y) - (!pVar.r ? AndroidUtilities.statusBarHeight : 0), pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                        pVar.r(false);
                        break;
                    }
                }
                break;
            case 1:
                dh0 dh0Var = (dh0) this.b;
                dh0Var.J = ee.a(scaleGestureDetector.getScaleFactor() * dh0Var.J, 0.75f, dh0Var.a);
                dh0Var.H = (int) (dh0Var.t() * dh0Var.J);
                dh0Var.I = (int) (dh0Var.r() * dh0Var.J);
                AndroidUtilities.runOnUIThread(new xa0(this, 14));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - dh0Var.H) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar = dh0Var.M;
                if (jVar.f) {
                    jVar.u.i = dp;
                } else {
                    jVar.b = dh0Var.K;
                    jVar.c = true;
                    jVar.u.i = dp;
                }
                jVar.h();
                float a2 = ee.a(scaleGestureDetector.getFocusY() - (dh0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - dh0Var.I) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = dh0Var.N;
                if (jVar2.f) {
                    jVar2.u.i = a2;
                } else {
                    jVar2.b = dh0Var.L;
                    jVar2.c = true;
                    jVar2.u.i = a2;
                }
                jVar2.h();
                break;
            default:
                i1 i1Var = (i1) this.b;
                i1Var.P = ee.a(scaleGestureDetector.getScaleFactor() * i1Var.P, 0.6f, i1Var.a);
                i1Var.M = (int) (i1Var.m() * i1Var.P);
                i1Var.N = (int) (i1Var.l() * i1Var.P);
                AndroidUtilities.runOnUIThread(new k2.c(this, 18));
                o1.j jVar3 = i1Var.S;
                jVar3.b = i1Var.Q;
                jVar3.c = true;
                jVar3.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - i1Var.M) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar4 = i1Var.S;
                if (!jVar4.f) {
                    jVar4.h();
                }
                o1.j jVar5 = i1Var.T;
                jVar5.b = i1Var.R;
                jVar5.c = true;
                jVar5.u.i = ee.a(scaleGestureDetector.getFocusY() - (i1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = i1Var.T;
                if (!jVar6.f) {
                    jVar6.h();
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                dh0 dh0Var = (dh0) this.b;
                if (dh0Var.w) {
                    dh0Var.w = false;
                    dh0Var.f0 = false;
                    dh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(dh0Var.h0);
                }
                dh0Var.x = true;
                dh0Var.c.width = (int) (dh0Var.t() * dh0Var.a);
                dh0Var.c.height = (int) (dh0Var.r() * dh0Var.a);
                AndroidUtilities.updateViewLayout(dh0Var.b, dh0Var.d, dh0Var.c);
                break;
            default:
                i1 i1Var = (i1) this.b;
                if (i1Var.H) {
                    i1Var.H = false;
                }
                i1Var.I = true;
                i1Var.c.width = (int) (i1Var.m() * i1Var.a);
                i1Var.c.height = (int) (i1Var.l() * i1Var.a);
                AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, i1Var.c);
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                dh0 dh0Var = (dh0) this.b;
                if (!dh0Var.M.f && !dh0Var.N.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    di.i1 i1Var = new di.i1(this, arrayList, 1);
                    o1.j jVar = dh0Var.M;
                    if (jVar.f) {
                        jVar.a(i1Var);
                    } else {
                        arrayList.add(jVar);
                    }
                    o1.j jVar2 = dh0Var.N;
                    if (!jVar2.f) {
                        arrayList.add(jVar2);
                        break;
                    } else {
                        jVar2.a(i1Var);
                        break;
                    }
                }
            default:
                i1 i1Var2 = (i1) this.b;
                if (!i1Var2.S.f && !i1Var2.T.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    di.i1 i1Var3 = new di.i1(this, arrayList2, 2);
                    o1.j jVar3 = i1Var2.S;
                    if (jVar3.f) {
                        jVar3.a(i1Var3);
                    } else {
                        arrayList2.add(jVar3);
                    }
                    o1.j jVar4 = i1Var2.T;
                    if (!jVar4.f) {
                        arrayList2.add(jVar4);
                        break;
                    } else {
                        jVar4.a(i1Var3);
                        break;
                    }
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
