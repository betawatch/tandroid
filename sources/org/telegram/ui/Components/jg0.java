package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jg0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jg0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public void b() {
        switch (this.a) {
            case 0:
                ng0 ng0Var = (ng0) this.b;
                WindowManager.LayoutParams layoutParams = ng0Var.c;
                int t6 = (int) (ng0Var.t() * ng0Var.G);
                layoutParams.width = t6;
                ng0Var.E = t6;
                WindowManager.LayoutParams layoutParams2 = ng0Var.c;
                int r10 = (int) (ng0Var.r() * ng0Var.G);
                layoutParams2.height = r10;
                ng0Var.F = r10;
                try {
                    AndroidUtilities.updateViewLayout(ng0Var.b, ng0Var.d, ng0Var.c);
                    break;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                WindowManager.LayoutParams layoutParams3 = h1Var.c;
                int m9 = (int) (h1Var.m() * h1Var.M);
                layoutParams3.width = m9;
                h1Var.J = m9;
                WindowManager.LayoutParams layoutParams4 = h1Var.c;
                int l10 = (int) (h1Var.l() * h1Var.M);
                layoutParams4.height = l10;
                h1Var.K = l10;
                AndroidUtilities.updateViewLayout(h1Var.b, h1Var.d, h1Var.c);
                break;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                ng0 ng0Var = (ng0) this.b;
                ng0Var.G = k7.o.a(scaleGestureDetector.getScaleFactor() * ng0Var.G, 0.75f, ng0Var.a);
                ng0Var.E = (int) (ng0Var.t() * ng0Var.G);
                ng0Var.F = (int) (ng0Var.r() * ng0Var.G);
                AndroidUtilities.runOnUIThread(new ec0(this, 12));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - ng0Var.E) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar = ng0Var.J;
                if (jVar.f) {
                    jVar.u.i = dp;
                } else {
                    jVar.b = ng0Var.H;
                    jVar.c = true;
                    jVar.u.i = dp;
                }
                jVar.f();
                float a2 = k7.o.a(scaleGestureDetector.getFocusY() - (ng0Var.F / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ng0Var.F) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = ng0Var.K;
                if (jVar2.f) {
                    jVar2.u.i = a2;
                } else {
                    jVar2.b = ng0Var.I;
                    jVar2.c = true;
                    jVar2.u.i = a2;
                }
                jVar2.f();
                break;
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                h1Var.M = k7.o.a(scaleGestureDetector.getScaleFactor() * h1Var.M, 0.6f, h1Var.a);
                h1Var.J = (int) (h1Var.m() * h1Var.M);
                h1Var.K = (int) (h1Var.l() * h1Var.M);
                AndroidUtilities.runOnUIThread(new oh.t3(this, 20));
                o1.j jVar3 = h1Var.P;
                jVar3.b = h1Var.N;
                jVar3.c = true;
                jVar3.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - h1Var.J) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar4 = h1Var.P;
                if (!jVar4.f) {
                    jVar4.f();
                }
                o1.j jVar5 = h1Var.Q;
                jVar5.b = h1Var.O;
                jVar5.c = true;
                jVar5.u.i = k7.o.a(scaleGestureDetector.getFocusY() - (h1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.K) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = h1Var.Q;
                if (!jVar6.f) {
                    jVar6.f();
                    break;
                }
                break;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                    zf.n nVar = ((zf.b) this.b).b;
                    float focusX = scaleGestureDetector.getFocusX();
                    float focusY = scaleGestureDetector.getFocusY();
                    CropAreaView cropAreaView = nVar.a;
                    ImageView imageView = nVar.b;
                    if (!nVar.C) {
                        float f10 = nVar.I.e;
                        if (f10 * scaleFactor > 30.0f) {
                            scaleFactor = 30.0f / f10;
                        }
                        zf.l.g(nVar.I, scaleFactor, zf.l.a(nVar.I) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), zf.l.b(nVar.I) * (org.telegram.messenger.y3.a((imageView.getHeight() - nVar.y) - (!nVar.r ? AndroidUtilities.statusBarHeight : 0), nVar.B, 2.0f, focusY) / cropAreaView.getCropHeight()));
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
                ng0 ng0Var = (ng0) this.b;
                if (ng0Var.w) {
                    ng0Var.w = false;
                    ng0Var.c0 = false;
                    ng0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ng0Var.e0);
                }
                ng0Var.x = true;
                ng0Var.c.width = (int) (ng0Var.t() * ng0Var.a);
                ng0Var.c.height = (int) (ng0Var.r() * ng0Var.a);
                AndroidUtilities.updateViewLayout(ng0Var.b, ng0Var.d, ng0Var.c);
                break;
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                if (h1Var.E) {
                    h1Var.E = false;
                }
                h1Var.F = true;
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
                ng0 ng0Var = (ng0) this.b;
                if (!ng0Var.J.f && !ng0Var.K.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    oh.f1 f1Var = new oh.f1(this, arrayList, 1);
                    o1.j jVar = ng0Var.J;
                    if (jVar.f) {
                        jVar.a(f1Var);
                    } else {
                        arrayList.add(jVar);
                    }
                    o1.j jVar2 = ng0Var.K;
                    if (!jVar2.f) {
                        arrayList.add(jVar2);
                        break;
                    } else {
                        jVar2.a(f1Var);
                        break;
                    }
                }
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                if (!h1Var.P.f && !h1Var.Q.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    oh.f1 f1Var2 = new oh.f1(this, arrayList2, 2);
                    o1.j jVar3 = h1Var.P;
                    if (jVar3.f) {
                        jVar3.a(f1Var2);
                    } else {
                        arrayList2.add(jVar3);
                    }
                    o1.j jVar4 = h1Var.Q;
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
