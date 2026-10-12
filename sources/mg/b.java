package mg;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import bi.v1;
import ig.t0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.q;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.yc0;
import w7.s;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                fh0 fh0Var = (fh0) this.b;
                WindowManager.LayoutParams layoutParams = fh0Var.c;
                int t10 = (int) (fh0Var.t() * fh0Var.J);
                layoutParams.width = t10;
                fh0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = fh0Var.c;
                int r10 = (int) (fh0Var.r() * fh0Var.J);
                layoutParams2.height = r10;
                fh0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(fh0Var.b, fh0Var.d, fh0Var.c);
                    break;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                h1 h1Var = (h1) this.b;
                WindowManager.LayoutParams layoutParams3 = h1Var.c;
                int m10 = (int) (h1Var.m() * h1Var.P);
                layoutParams3.width = m10;
                h1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = h1Var.c;
                int l4 = (int) (h1Var.l() * h1Var.P);
                layoutParams4.height = l4;
                h1Var.N = l4;
                AndroidUtilities.updateViewLayout(h1Var.b, h1Var.d, h1Var.c);
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
                        n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (q.y((imageView.getHeight() - pVar.y) - (!pVar.r ? AndroidUtilities.statusBarHeight : 0), pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                        pVar.r(false);
                        break;
                    }
                }
                break;
            case 1:
                fh0 fh0Var = (fh0) this.b;
                fh0Var.J = s.a(scaleGestureDetector.getScaleFactor() * fh0Var.J, 0.75f, fh0Var.a);
                fh0Var.H = (int) (fh0Var.t() * fh0Var.J);
                fh0Var.I = (int) (fh0Var.r() * fh0Var.J);
                AndroidUtilities.runOnUIThread(new yc0(this, 13));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - fh0Var.H) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar = fh0Var.M;
                if (kVar.f) {
                    kVar.u.i = dp;
                } else {
                    kVar.b = fh0Var.K;
                    kVar.c = true;
                    kVar.u.i = dp;
                }
                kVar.h();
                float a2 = s.a(scaleGestureDetector.getFocusY() - (fh0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fh0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = fh0Var.N;
                if (kVar2.f) {
                    kVar2.u.i = a2;
                } else {
                    kVar2.b = fh0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = a2;
                }
                kVar2.h();
                break;
            default:
                h1 h1Var = (h1) this.b;
                h1Var.P = s.a(scaleGestureDetector.getScaleFactor() * h1Var.P, 0.6f, h1Var.a);
                h1Var.M = (int) (h1Var.m() * h1Var.P);
                h1Var.N = (int) (h1Var.l() * h1Var.P);
                AndroidUtilities.runOnUIThread(new t0(this, 26));
                o1.k kVar3 = h1Var.S;
                kVar3.b = h1Var.Q;
                kVar3.c = true;
                kVar3.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - h1Var.M) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar4 = h1Var.S;
                if (!kVar4.f) {
                    kVar4.h();
                }
                o1.k kVar5 = h1Var.T;
                kVar5.b = h1Var.R;
                kVar5.c = true;
                kVar5.u.i = s.a(scaleGestureDetector.getFocusY() - (h1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = h1Var.T;
                if (!kVar6.f) {
                    kVar6.h();
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
                fh0 fh0Var = (fh0) this.b;
                if (fh0Var.w) {
                    fh0Var.w = false;
                    fh0Var.f0 = false;
                    fh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(fh0Var.h0);
                }
                fh0Var.x = true;
                fh0Var.c.width = (int) (fh0Var.t() * fh0Var.a);
                fh0Var.c.height = (int) (fh0Var.r() * fh0Var.a);
                AndroidUtilities.updateViewLayout(fh0Var.b, fh0Var.d, fh0Var.c);
                break;
            default:
                h1 h1Var = (h1) this.b;
                if (h1Var.H) {
                    h1Var.H = false;
                }
                h1Var.I = true;
                h1Var.c.width = (int) (h1Var.m() * h1Var.a);
                h1Var.c.height = (int) (h1Var.l() * h1Var.a);
                AndroidUtilities.updateViewLayout(h1Var.b, h1Var.d, h1Var.c);
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
                fh0 fh0Var = (fh0) this.b;
                if (!fh0Var.M.f && !fh0Var.N.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    v1 v1Var = new v1(this, arrayList, 1);
                    o1.k kVar = fh0Var.M;
                    if (kVar.f) {
                        kVar.a(v1Var);
                    } else {
                        arrayList.add(kVar);
                    }
                    o1.k kVar2 = fh0Var.N;
                    if (!kVar2.f) {
                        arrayList.add(kVar2);
                        break;
                    } else {
                        kVar2.a(v1Var);
                        break;
                    }
                }
            default:
                h1 h1Var = (h1) this.b;
                if (!h1Var.S.f && !h1Var.T.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    v1 v1Var2 = new v1(this, arrayList2, 2);
                    o1.k kVar3 = h1Var.S;
                    if (kVar3.f) {
                        kVar3.a(v1Var2);
                    } else {
                        arrayList2.add(kVar3);
                    }
                    o1.k kVar4 = h1Var.T;
                    if (!kVar4.f) {
                        arrayList2.add(kVar4);
                        break;
                    } else {
                        kVar4.a(v1Var2);
                        break;
                    }
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
