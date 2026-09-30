package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.f0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.voip.k1;
import w7.q;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                qg0 qg0Var = (qg0) this.b;
                WindowManager.LayoutParams layoutParams = qg0Var.c;
                int t10 = (int) (qg0Var.t() * qg0Var.J);
                layoutParams.width = t10;
                qg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = qg0Var.c;
                int r10 = (int) (qg0Var.r() * qg0Var.J);
                layoutParams2.height = r10;
                qg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(qg0Var.b, qg0Var.d, qg0Var.c);
                    break;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                k1 k1Var = (k1) this.b;
                WindowManager.LayoutParams layoutParams3 = k1Var.c;
                int m10 = (int) (k1Var.m() * k1Var.P);
                layoutParams3.width = m10;
                k1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = k1Var.c;
                int l4 = (int) (k1Var.l() * k1Var.P);
                layoutParams4.height = l4;
                k1Var.N = l4;
                AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, k1Var.c);
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
                        n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (f0.x((imageView.getHeight() - pVar.y) - (!pVar.r ? AndroidUtilities.statusBarHeight : 0), pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                        pVar.r(false);
                        break;
                    }
                }
                break;
            case 1:
                qg0 qg0Var = (qg0) this.b;
                qg0Var.J = q.a(scaleGestureDetector.getScaleFactor() * qg0Var.J, 0.75f, qg0Var.a);
                qg0Var.H = (int) (qg0Var.t() * qg0Var.J);
                qg0Var.I = (int) (qg0Var.r() * qg0Var.J);
                AndroidUtilities.runOnUIThread(new kc0(this, 13));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - qg0Var.H) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar = qg0Var.M;
                if (kVar.f) {
                    kVar.u.i = dp;
                } else {
                    kVar.b = qg0Var.K;
                    kVar.c = true;
                    kVar.u.i = dp;
                }
                kVar.f();
                float a2 = q.a(scaleGestureDetector.getFocusY() - (qg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - qg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = qg0Var.N;
                if (kVar2.f) {
                    kVar2.u.i = a2;
                } else {
                    kVar2.b = qg0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = a2;
                }
                kVar2.f();
                break;
            default:
                k1 k1Var = (k1) this.b;
                k1Var.P = q.a(scaleGestureDetector.getScaleFactor() * k1Var.P, 0.6f, k1Var.a);
                k1Var.M = (int) (k1Var.m() * k1Var.P);
                k1Var.N = (int) (k1Var.l() * k1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 21));
                o1.k kVar3 = k1Var.S;
                kVar3.b = k1Var.Q;
                kVar3.c = true;
                kVar3.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - k1Var.M) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar4 = k1Var.S;
                if (!kVar4.f) {
                    kVar4.f();
                }
                o1.k kVar5 = k1Var.T;
                kVar5.b = k1Var.R;
                kVar5.c = true;
                kVar5.u.i = q.a(scaleGestureDetector.getFocusY() - (k1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = k1Var.T;
                if (!kVar6.f) {
                    kVar6.f();
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
                qg0 qg0Var = (qg0) this.b;
                if (qg0Var.w) {
                    qg0Var.w = false;
                    qg0Var.f0 = false;
                    qg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(qg0Var.h0);
                }
                qg0Var.x = true;
                qg0Var.c.width = (int) (qg0Var.t() * qg0Var.a);
                qg0Var.c.height = (int) (qg0Var.r() * qg0Var.a);
                AndroidUtilities.updateViewLayout(qg0Var.b, qg0Var.d, qg0Var.c);
                break;
            default:
                k1 k1Var = (k1) this.b;
                if (k1Var.H) {
                    k1Var.H = false;
                }
                k1Var.I = true;
                k1Var.c.width = (int) (k1Var.m() * k1Var.a);
                k1Var.c.height = (int) (k1Var.l() * k1Var.a);
                AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, k1Var.c);
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
                qg0 qg0Var = (qg0) this.b;
                if (!qg0Var.M.f && !qg0Var.N.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    g2 g2Var = new g2(this, arrayList, 1);
                    o1.k kVar = qg0Var.M;
                    if (kVar.f) {
                        kVar.a(g2Var);
                    } else {
                        arrayList.add(kVar);
                    }
                    o1.k kVar2 = qg0Var.N;
                    if (!kVar2.f) {
                        arrayList.add(kVar2);
                        break;
                    } else {
                        kVar2.a(g2Var);
                        break;
                    }
                }
            default:
                k1 k1Var = (k1) this.b;
                if (!k1Var.S.f && !k1Var.T.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    g2 g2Var2 = new g2(this, arrayList2, 2);
                    o1.k kVar3 = k1Var.S;
                    if (kVar3.f) {
                        kVar3.a(g2Var2);
                    } else {
                        arrayList2.add(kVar3);
                    }
                    o1.k kVar4 = k1Var.T;
                    if (!kVar4.f) {
                        arrayList2.add(kVar4);
                        break;
                    } else {
                        kVar4.a(g2Var2);
                        break;
                    }
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
