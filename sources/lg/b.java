package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.g0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.w1;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.voip.j1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                fg0 fg0Var = (fg0) this.b;
                WindowManager.LayoutParams layoutParams = fg0Var.c;
                int t10 = (int) (fg0Var.t() * fg0Var.J);
                layoutParams.width = t10;
                fg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = fg0Var.c;
                int r10 = (int) (fg0Var.r() * fg0Var.J);
                layoutParams2.height = r10;
                fg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(fg0Var.b, fg0Var.d, fg0Var.c);
                    break;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                j1 j1Var = (j1) this.b;
                WindowManager.LayoutParams layoutParams3 = j1Var.c;
                int m10 = (int) (j1Var.m() * j1Var.P);
                layoutParams3.width = m10;
                j1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = j1Var.c;
                int l4 = (int) (j1Var.l() * j1Var.P);
                layoutParams4.height = l4;
                j1Var.N = l4;
                AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, j1Var.c);
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
                        n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (w1.y((imageView.getHeight() - pVar.y) - (!pVar.r ? AndroidUtilities.statusBarHeight : 0), pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                        pVar.r(false);
                        break;
                    }
                }
                break;
            case 1:
                fg0 fg0Var = (fg0) this.b;
                fg0Var.J = w7.p.a(scaleGestureDetector.getScaleFactor() * fg0Var.J, 0.75f, fg0Var.a);
                fg0Var.H = (int) (fg0Var.t() * fg0Var.J);
                fg0Var.I = (int) (fg0Var.r() * fg0Var.J);
                AndroidUtilities.runOnUIThread(new bc0(this, 12));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - fg0Var.H) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar = fg0Var.M;
                if (kVar.f) {
                    kVar.u.i = dp;
                } else {
                    kVar.b = fg0Var.K;
                    kVar.c = true;
                    kVar.u.i = dp;
                }
                kVar.f();
                float a2 = w7.p.a(scaleGestureDetector.getFocusY() - (fg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = fg0Var.N;
                if (kVar2.f) {
                    kVar2.u.i = a2;
                } else {
                    kVar2.b = fg0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = a2;
                }
                kVar2.f();
                break;
            default:
                j1 j1Var = (j1) this.b;
                j1Var.P = w7.p.a(scaleGestureDetector.getScaleFactor() * j1Var.P, 0.6f, j1Var.a);
                j1Var.M = (int) (j1Var.m() * j1Var.P);
                j1Var.N = (int) (j1Var.l() * j1Var.P);
                AndroidUtilities.runOnUIThread(new g0(this, 20));
                o1.k kVar3 = j1Var.S;
                kVar3.b = j1Var.Q;
                kVar3.c = true;
                kVar3.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - j1Var.M) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar4 = j1Var.S;
                if (!kVar4.f) {
                    kVar4.f();
                }
                o1.k kVar5 = j1Var.T;
                kVar5.b = j1Var.R;
                kVar5.c = true;
                kVar5.u.i = w7.p.a(scaleGestureDetector.getFocusY() - (j1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = j1Var.T;
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
                fg0 fg0Var = (fg0) this.b;
                if (fg0Var.w) {
                    fg0Var.w = false;
                    fg0Var.f0 = false;
                    fg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(fg0Var.h0);
                }
                fg0Var.x = true;
                fg0Var.c.width = (int) (fg0Var.t() * fg0Var.a);
                fg0Var.c.height = (int) (fg0Var.r() * fg0Var.a);
                AndroidUtilities.updateViewLayout(fg0Var.b, fg0Var.d, fg0Var.c);
                break;
            default:
                j1 j1Var = (j1) this.b;
                if (j1Var.H) {
                    j1Var.H = false;
                }
                j1Var.I = true;
                j1Var.c.width = (int) (j1Var.m() * j1Var.a);
                j1Var.c.height = (int) (j1Var.l() * j1Var.a);
                AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, j1Var.c);
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
                fg0 fg0Var = (fg0) this.b;
                if (!fg0Var.M.f && !fg0Var.N.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    g2 g2Var = new g2(this, arrayList, 1);
                    o1.k kVar = fg0Var.M;
                    if (kVar.f) {
                        kVar.a(g2Var);
                    } else {
                        arrayList.add(kVar);
                    }
                    o1.k kVar2 = fg0Var.N;
                    if (!kVar2.f) {
                        arrayList.add(kVar2);
                        break;
                    } else {
                        kVar2.a(g2Var);
                        break;
                    }
                }
            default:
                j1 j1Var = (j1) this.b;
                if (!j1Var.S.f && !j1Var.T.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    g2 g2Var2 = new g2(this, arrayList2, 2);
                    o1.k kVar3 = j1Var.S;
                    if (kVar3.f) {
                        kVar3.a(g2Var2);
                    } else {
                        arrayList2.add(kVar3);
                    }
                    o1.k kVar4 = j1Var.T;
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
