package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ig0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ig0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public void b() {
        switch (this.a) {
            case 0:
                mg0 mg0Var = (mg0) this.b;
                WindowManager.LayoutParams layoutParams = mg0Var.c;
                int t6 = (int) (mg0Var.t() * mg0Var.G);
                layoutParams.width = t6;
                mg0Var.E = t6;
                WindowManager.LayoutParams layoutParams2 = mg0Var.c;
                int r10 = (int) (mg0Var.r() * mg0Var.G);
                layoutParams2.height = r10;
                mg0Var.F = r10;
                try {
                    AndroidUtilities.updateViewLayout(mg0Var.b, mg0Var.d, mg0Var.c);
                    break;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                WindowManager.LayoutParams layoutParams3 = g1Var.c;
                int m9 = (int) (g1Var.m() * g1Var.M);
                layoutParams3.width = m9;
                g1Var.J = m9;
                WindowManager.LayoutParams layoutParams4 = g1Var.c;
                int l10 = (int) (g1Var.l() * g1Var.M);
                layoutParams4.height = l10;
                g1Var.K = l10;
                AndroidUtilities.updateViewLayout(g1Var.b, g1Var.d, g1Var.c);
                break;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                mg0 mg0Var = (mg0) this.b;
                mg0Var.G = k7.n.a(scaleGestureDetector.getScaleFactor() * mg0Var.G, 0.75f, mg0Var.a);
                mg0Var.E = (int) (mg0Var.t() * mg0Var.G);
                mg0Var.F = (int) (mg0Var.r() * mg0Var.G);
                AndroidUtilities.runOnUIThread(new dc0(this, 12));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - mg0Var.E) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar = mg0Var.J;
                if (jVar.f) {
                    jVar.u.i = dp;
                } else {
                    jVar.b = mg0Var.H;
                    jVar.c = true;
                    jVar.u.i = dp;
                }
                jVar.f();
                float a2 = k7.n.a(scaleGestureDetector.getFocusY() - (mg0Var.F / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - mg0Var.F) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = mg0Var.K;
                if (jVar2.f) {
                    jVar2.u.i = a2;
                } else {
                    jVar2.b = mg0Var.I;
                    jVar2.c = true;
                    jVar2.u.i = a2;
                }
                jVar2.f();
                break;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                g1Var.M = k7.n.a(scaleGestureDetector.getScaleFactor() * g1Var.M, 0.6f, g1Var.a);
                g1Var.J = (int) (g1Var.m() * g1Var.M);
                g1Var.K = (int) (g1Var.l() * g1Var.M);
                AndroidUtilities.runOnUIThread(new nh.n5(this, 21));
                o1.j jVar3 = g1Var.P;
                jVar3.b = g1Var.N;
                jVar3.c = true;
                jVar3.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - g1Var.J) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar4 = g1Var.P;
                if (!jVar4.f) {
                    jVar4.f();
                }
                o1.j jVar5 = g1Var.Q;
                jVar5.b = g1Var.O;
                jVar5.c = true;
                jVar5.u.i = k7.n.a(scaleGestureDetector.getFocusY() - (g1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.K) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = g1Var.Q;
                if (!jVar6.f) {
                    jVar6.f();
                    break;
                }
                break;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                    yf.n nVar = ((yf.b) this.b).b;
                    float focusX = scaleGestureDetector.getFocusX();
                    float focusY = scaleGestureDetector.getFocusY();
                    CropAreaView cropAreaView = nVar.a;
                    ImageView imageView = nVar.b;
                    if (!nVar.C) {
                        float f10 = nVar.I.e;
                        if (f10 * scaleFactor > 30.0f) {
                            scaleFactor = 30.0f / f10;
                        }
                        yf.l.g(nVar.I, scaleFactor, yf.l.a(nVar.I) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), yf.l.b(nVar.I) * (org.telegram.messenger.y3.a((imageView.getHeight() - nVar.y) - (!nVar.r ? AndroidUtilities.statusBarHeight : 0), nVar.B, 2.0f, focusY) / cropAreaView.getCropHeight()));
                        nVar.r(false);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                mg0 mg0Var = (mg0) this.b;
                if (mg0Var.w) {
                    mg0Var.w = false;
                    mg0Var.c0 = false;
                    mg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(mg0Var.e0);
                }
                mg0Var.x = true;
                mg0Var.c.width = (int) (mg0Var.t() * mg0Var.a);
                mg0Var.c.height = (int) (mg0Var.r() * mg0Var.a);
                AndroidUtilities.updateViewLayout(mg0Var.b, mg0Var.d, mg0Var.c);
                break;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                if (g1Var.E) {
                    g1Var.E = false;
                }
                g1Var.F = true;
                g1Var.c.width = (int) (g1Var.m() * g1Var.a);
                g1Var.c.height = (int) (g1Var.l() * g1Var.a);
                AndroidUtilities.updateViewLayout(g1Var.b, g1Var.d, g1Var.c);
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                mg0 mg0Var = (mg0) this.b;
                if (!mg0Var.J.f && !mg0Var.K.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    nh.f1 f1Var = new nh.f1(this, arrayList, 1);
                    o1.j jVar = mg0Var.J;
                    if (jVar.f) {
                        jVar.a(f1Var);
                    } else {
                        arrayList.add(jVar);
                    }
                    o1.j jVar2 = mg0Var.K;
                    if (!jVar2.f) {
                        arrayList.add(jVar2);
                        break;
                    } else {
                        jVar2.a(f1Var);
                        break;
                    }
                }
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                if (!g1Var.P.f && !g1Var.Q.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    nh.f1 f1Var2 = new nh.f1(this, arrayList2, 2);
                    o1.j jVar3 = g1Var.P;
                    if (jVar3.f) {
                        jVar3.a(f1Var2);
                    } else {
                        arrayList2.add(jVar3);
                    }
                    o1.j jVar4 = g1Var.Q;
                    if (!jVar4.f) {
                        arrayList2.add(jVar4);
                        break;
                    } else {
                        jVar4.a(f1Var2);
                        break;
                    }
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
