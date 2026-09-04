package mg;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import bi.v1;
import ig.t0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.w1;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.voip.h1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                eg0 eg0Var = (eg0) this.b;
                WindowManager.LayoutParams layoutParams = eg0Var.c;
                int t10 = (int) (eg0Var.t() * eg0Var.J);
                layoutParams.width = t10;
                eg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = eg0Var.c;
                int r10 = (int) (eg0Var.r() * eg0Var.J);
                layoutParams2.height = r10;
                eg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var.b, eg0Var.d, eg0Var.c);
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
                    q qVar = ((c) this.b).b;
                    float focusX = scaleGestureDetector.getFocusX();
                    float focusY = scaleGestureDetector.getFocusY();
                    CropAreaView cropAreaView = qVar.a;
                    ImageView imageView = qVar.b;
                    if (!qVar.F) {
                        float f7 = qVar.L.e;
                        if (f7 * scaleFactor > 30.0f) {
                            scaleFactor = 30.0f / f7;
                        }
                        o.g(qVar.L, scaleFactor, o.a(qVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), o.b(qVar.L) * (w1.y((imageView.getHeight() - qVar.y) - (!qVar.r ? AndroidUtilities.statusBarHeight : 0), qVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                        qVar.r(false);
                        break;
                    }
                }
                break;
            case 1:
                eg0 eg0Var = (eg0) this.b;
                eg0Var.J = w7.p.a(scaleGestureDetector.getScaleFactor() * eg0Var.J, 0.75f, eg0Var.a);
                eg0Var.H = (int) (eg0Var.t() * eg0Var.J);
                eg0Var.I = (int) (eg0Var.r() * eg0Var.J);
                AndroidUtilities.runOnUIThread(new cc0(this, 12));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - eg0Var.H) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar = eg0Var.M;
                if (kVar.f) {
                    kVar.u.i = dp;
                } else {
                    kVar.b = eg0Var.K;
                    kVar.c = true;
                    kVar.u.i = dp;
                }
                kVar.f();
                float a2 = w7.p.a(scaleGestureDetector.getFocusY() - (eg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - eg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = eg0Var.N;
                if (kVar2.f) {
                    kVar2.u.i = a2;
                } else {
                    kVar2.b = eg0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = a2;
                }
                kVar2.f();
                break;
            default:
                h1 h1Var = (h1) this.b;
                h1Var.P = w7.p.a(scaleGestureDetector.getScaleFactor() * h1Var.P, 0.6f, h1Var.a);
                h1Var.M = (int) (h1Var.m() * h1Var.P);
                h1Var.N = (int) (h1Var.l() * h1Var.P);
                AndroidUtilities.runOnUIThread(new t0(this, 23));
                o1.k kVar3 = h1Var.S;
                kVar3.b = h1Var.Q;
                kVar3.c = true;
                kVar3.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - h1Var.M) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar4 = h1Var.S;
                if (!kVar4.f) {
                    kVar4.f();
                }
                o1.k kVar5 = h1Var.T;
                kVar5.b = h1Var.R;
                kVar5.c = true;
                kVar5.u.i = w7.p.a(scaleGestureDetector.getFocusY() - (h1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = h1Var.T;
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
                eg0 eg0Var = (eg0) this.b;
                if (eg0Var.w) {
                    eg0Var.w = false;
                    eg0Var.f0 = false;
                    eg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(eg0Var.h0);
                }
                eg0Var.x = true;
                eg0Var.c.width = (int) (eg0Var.t() * eg0Var.a);
                eg0Var.c.height = (int) (eg0Var.r() * eg0Var.a);
                AndroidUtilities.updateViewLayout(eg0Var.b, eg0Var.d, eg0Var.c);
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
                eg0 eg0Var = (eg0) this.b;
                if (!eg0Var.M.f && !eg0Var.N.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    v1 v1Var = new v1(this, arrayList, 1);
                    o1.k kVar = eg0Var.M;
                    if (kVar.f) {
                        kVar.a(v1Var);
                    } else {
                        arrayList.add(kVar);
                    }
                    o1.k kVar2 = eg0Var.N;
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
