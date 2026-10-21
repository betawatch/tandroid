package mg;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import ci.j1;
import java.util.ArrayList;
import ki.u;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.voip.h1;
import w7.r;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                ah0 ah0Var = (ah0) this.b;
                WindowManager.LayoutParams layoutParams = ah0Var.c;
                int t10 = (int) (ah0Var.t() * ah0Var.J);
                layoutParams.width = t10;
                ah0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = ah0Var.c;
                int r10 = (int) (ah0Var.r() * ah0Var.J);
                layoutParams2.height = r10;
                ah0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(ah0Var.b, ah0Var.d, ah0Var.c);
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
                        n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (g0.x((imageView.getHeight() - pVar.y) - (!pVar.r ? AndroidUtilities.statusBarHeight : 0), pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                        pVar.r(false);
                        break;
                    }
                }
                break;
            case 1:
                ah0 ah0Var = (ah0) this.b;
                ah0Var.J = r.a(scaleGestureDetector.getScaleFactor() * ah0Var.J, 0.75f, ah0Var.a);
                ah0Var.H = (int) (ah0Var.t() * ah0Var.J);
                ah0Var.I = (int) (ah0Var.r() * ah0Var.J);
                AndroidUtilities.runOnUIThread(new rc0(this, 12));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - ah0Var.H) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar = ah0Var.M;
                if (kVar.f) {
                    kVar.u.i = dp;
                } else {
                    kVar.b = ah0Var.K;
                    kVar.c = true;
                    kVar.u.i = dp;
                }
                kVar.h();
                float a2 = r.a(scaleGestureDetector.getFocusY() - (ah0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ah0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = ah0Var.N;
                if (kVar2.f) {
                    kVar2.u.i = a2;
                } else {
                    kVar2.b = ah0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = a2;
                }
                kVar2.h();
                break;
            default:
                h1 h1Var = (h1) this.b;
                h1Var.P = r.a(scaleGestureDetector.getScaleFactor() * h1Var.P, 0.6f, h1Var.a);
                h1Var.M = (int) (h1Var.m() * h1Var.P);
                h1Var.N = (int) (h1Var.l() * h1Var.P);
                AndroidUtilities.runOnUIThread(new u(this, 15));
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
                kVar5.u.i = r.a(scaleGestureDetector.getFocusY() - (h1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
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
                ah0 ah0Var = (ah0) this.b;
                if (ah0Var.w) {
                    ah0Var.w = false;
                    ah0Var.f0 = false;
                    ah0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ah0Var.h0);
                }
                ah0Var.x = true;
                ah0Var.c.width = (int) (ah0Var.t() * ah0Var.a);
                ah0Var.c.height = (int) (ah0Var.r() * ah0Var.a);
                AndroidUtilities.updateViewLayout(ah0Var.b, ah0Var.d, ah0Var.c);
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
                ah0 ah0Var = (ah0) this.b;
                if (!ah0Var.M.f && !ah0Var.N.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    j1 j1Var = new j1(this, arrayList, 1);
                    o1.k kVar = ah0Var.M;
                    if (kVar.f) {
                        kVar.a(j1Var);
                    } else {
                        arrayList.add(kVar);
                    }
                    o1.k kVar2 = ah0Var.N;
                    if (!kVar2.f) {
                        arrayList.add(kVar2);
                        break;
                    } else {
                        kVar2.a(j1Var);
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
                    j1 j1Var2 = new j1(this, arrayList2, 2);
                    o1.k kVar3 = h1Var.S;
                    if (kVar3.f) {
                        kVar3.a(j1Var2);
                    } else {
                        arrayList2.add(kVar3);
                    }
                    o1.k kVar4 = h1Var.T;
                    if (!kVar4.f) {
                        arrayList2.add(kVar4);
                        break;
                    } else {
                        kVar4.a(j1Var2);
                        break;
                    }
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
