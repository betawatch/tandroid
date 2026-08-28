package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mf0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mf0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    public void b() {
        switch (this.a) {
            case 0:
                pf0 pf0Var = (pf0) this.b;
                WindowManager.LayoutParams layoutParams = pf0Var.c;
                int t10 = (int) (pf0Var.t() * pf0Var.F);
                layoutParams.width = t10;
                pf0Var.D = t10;
                WindowManager.LayoutParams layoutParams2 = pf0Var.c;
                int r10 = (int) (pf0Var.r() * pf0Var.F);
                layoutParams2.height = r10;
                pf0Var.E = r10;
                try {
                    AndroidUtilities.updateViewLayout(pf0Var.b, pf0Var.d, pf0Var.c);
                    break;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                WindowManager.LayoutParams layoutParams3 = g1Var.c;
                int m10 = (int) (g1Var.m() * g1Var.L);
                layoutParams3.width = m10;
                g1Var.I = m10;
                WindowManager.LayoutParams layoutParams4 = g1Var.c;
                int l10 = (int) (g1Var.l() * g1Var.L);
                layoutParams4.height = l10;
                g1Var.J = l10;
                AndroidUtilities.updateViewLayout(g1Var.b, g1Var.d, g1Var.c);
                break;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                pf0 pf0Var = (pf0) this.b;
                pf0Var.F = g7.n.a(scaleGestureDetector.getScaleFactor() * pf0Var.F, 0.75f, pf0Var.a);
                pf0Var.D = (int) (pf0Var.t() * pf0Var.F);
                pf0Var.E = (int) (pf0Var.r() * pf0Var.F);
                AndroidUtilities.runOnUIThread(new ib0(this, 12));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - pf0Var.D) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar = pf0Var.I;
                if (jVar.f) {
                    jVar.u.i = dp;
                } else {
                    jVar.b = pf0Var.G;
                    jVar.c = true;
                    jVar.u.i = dp;
                }
                jVar.f();
                float a2 = g7.n.a(scaleGestureDetector.getFocusY() - (pf0Var.E / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pf0Var.E) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = pf0Var.J;
                if (jVar2.f) {
                    jVar2.u.i = a2;
                } else {
                    jVar2.b = pf0Var.H;
                    jVar2.c = true;
                    jVar2.u.i = a2;
                }
                jVar2.f();
                break;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                g1Var.L = g7.n.a(scaleGestureDetector.getScaleFactor() * g1Var.L, 0.6f, g1Var.a);
                g1Var.I = (int) (g1Var.m() * g1Var.L);
                g1Var.J = (int) (g1Var.l() * g1Var.L);
                AndroidUtilities.runOnUIThread(new mh.m2(this, 7));
                o1.j jVar3 = g1Var.O;
                jVar3.b = g1Var.M;
                jVar3.c = true;
                jVar3.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - g1Var.I) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar4 = g1Var.O;
                if (!jVar4.f) {
                    jVar4.f();
                }
                o1.j jVar5 = g1Var.P;
                jVar5.b = g1Var.N;
                jVar5.c = true;
                jVar5.u.i = g7.n.a(scaleGestureDetector.getFocusY() - (g1Var.J / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = g1Var.P;
                if (!jVar6.f) {
                    jVar6.f();
                    break;
                }
                break;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                    tf.n nVar = ((tf.b) this.b).b;
                    float focusX = scaleGestureDetector.getFocusX();
                    float focusY = scaleGestureDetector.getFocusY();
                    CropAreaView cropAreaView = nVar.a;
                    ImageView imageView = nVar.b;
                    if (!nVar.B) {
                        float f10 = nVar.H.e;
                        if (f10 * scaleFactor > 30.0f) {
                            scaleFactor = 30.0f / f10;
                        }
                        tf.l.g(nVar.H, scaleFactor, tf.l.a(nVar.H) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), tf.l.b(nVar.H) * (org.telegram.messenger.l0.a((imageView.getHeight() - nVar.y) - (!nVar.r ? AndroidUtilities.statusBarHeight : 0), nVar.A, 2.0f, focusY) / cropAreaView.getCropHeight()));
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
                pf0 pf0Var = (pf0) this.b;
                if (pf0Var.w) {
                    pf0Var.w = false;
                    pf0Var.b0 = false;
                    pf0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(pf0Var.d0);
                }
                pf0Var.x = true;
                pf0Var.c.width = (int) (pf0Var.t() * pf0Var.a);
                pf0Var.c.height = (int) (pf0Var.r() * pf0Var.a);
                AndroidUtilities.updateViewLayout(pf0Var.b, pf0Var.d, pf0Var.c);
                break;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                if (g1Var.D) {
                    g1Var.D = false;
                }
                g1Var.E = true;
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
                pf0 pf0Var = (pf0) this.b;
                if (!pf0Var.I.f && !pf0Var.J.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ih.g1 g1Var = new ih.g1(this, arrayList, 1);
                    o1.j jVar = pf0Var.I;
                    if (jVar.f) {
                        jVar.a(g1Var);
                    } else {
                        arrayList.add(jVar);
                    }
                    o1.j jVar2 = pf0Var.J;
                    if (!jVar2.f) {
                        arrayList.add(jVar2);
                        break;
                    } else {
                        jVar2.a(g1Var);
                        break;
                    }
                }
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) this.b;
                if (!g1Var2.O.f && !g1Var2.P.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ih.g1 g1Var3 = new ih.g1(this, arrayList2, 2);
                    o1.j jVar3 = g1Var2.O;
                    if (jVar3.f) {
                        jVar3.a(g1Var3);
                    } else {
                        arrayList2.add(jVar3);
                    }
                    o1.j jVar4 = g1Var2.P;
                    if (!jVar4.f) {
                        arrayList2.add(jVar4);
                        break;
                    } else {
                        jVar4.a(g1Var3);
                        break;
                    }
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
