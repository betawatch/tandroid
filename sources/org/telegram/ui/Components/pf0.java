package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pf0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pf0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public void b() {
        switch (this.a) {
            case 0:
                sf0 sf0Var = (sf0) this.b;
                WindowManager.LayoutParams layoutParams = sf0Var.c;
                int t10 = (int) (sf0Var.t() * sf0Var.F);
                layoutParams.width = t10;
                sf0Var.D = t10;
                WindowManager.LayoutParams layoutParams2 = sf0Var.c;
                int r10 = (int) (sf0Var.r() * sf0Var.F);
                layoutParams2.height = r10;
                sf0Var.E = r10;
                try {
                    AndroidUtilities.updateViewLayout(sf0Var.b, sf0Var.d, sf0Var.c);
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
                sf0 sf0Var = (sf0) this.b;
                sf0Var.F = h7.n.a(scaleGestureDetector.getScaleFactor() * sf0Var.F, 0.75f, sf0Var.a);
                sf0Var.D = (int) (sf0Var.t() * sf0Var.F);
                sf0Var.E = (int) (sf0Var.r() * sf0Var.F);
                AndroidUtilities.runOnUIThread(new mb0(this, 12));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - sf0Var.D) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar = sf0Var.I;
                if (jVar.f) {
                    jVar.u.i = dp;
                } else {
                    jVar.b = sf0Var.G;
                    jVar.c = true;
                    jVar.u.i = dp;
                }
                jVar.f();
                float a2 = h7.n.a(scaleGestureDetector.getFocusY() - (sf0Var.E / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - sf0Var.E) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = sf0Var.J;
                if (jVar2.f) {
                    jVar2.u.i = a2;
                } else {
                    jVar2.b = sf0Var.H;
                    jVar2.c = true;
                    jVar2.u.i = a2;
                }
                jVar2.f();
                break;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                g1Var.L = h7.n.a(scaleGestureDetector.getScaleFactor() * g1Var.L, 0.6f, g1Var.a);
                g1Var.I = (int) (g1Var.m() * g1Var.L);
                g1Var.J = (int) (g1Var.l() * g1Var.L);
                AndroidUtilities.runOnUIThread(new nh.f0(this, 13));
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
                jVar5.u.i = h7.n.a(scaleGestureDetector.getFocusY() - (g1Var.J / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = g1Var.P;
                if (!jVar6.f) {
                    jVar6.f();
                    break;
                }
                break;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                    uf.n nVar = ((uf.b) this.b).b;
                    float focusX = scaleGestureDetector.getFocusX();
                    float focusY = scaleGestureDetector.getFocusY();
                    CropAreaView cropAreaView = nVar.a;
                    ImageView imageView = nVar.b;
                    if (!nVar.B) {
                        float f10 = nVar.H.e;
                        if (f10 * scaleFactor > 30.0f) {
                            scaleFactor = 30.0f / f10;
                        }
                        uf.l.g(nVar.H, scaleFactor, uf.l.a(nVar.H) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), uf.l.b(nVar.H) * (org.telegram.messenger.y1.a((imageView.getHeight() - nVar.y) - (!nVar.r ? AndroidUtilities.statusBarHeight : 0), nVar.A, 2.0f, focusY) / cropAreaView.getCropHeight()));
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
                sf0 sf0Var = (sf0) this.b;
                if (sf0Var.w) {
                    sf0Var.w = false;
                    sf0Var.b0 = false;
                    sf0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(sf0Var.d0);
                }
                sf0Var.x = true;
                sf0Var.c.width = (int) (sf0Var.t() * sf0Var.a);
                sf0Var.c.height = (int) (sf0Var.r() * sf0Var.a);
                AndroidUtilities.updateViewLayout(sf0Var.b, sf0Var.d, sf0Var.c);
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
                sf0 sf0Var = (sf0) this.b;
                if (!sf0Var.I.f && !sf0Var.J.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    jh.e1 e1Var = new jh.e1(this, arrayList, 1);
                    o1.j jVar = sf0Var.I;
                    if (jVar.f) {
                        jVar.a(e1Var);
                    } else {
                        arrayList.add(jVar);
                    }
                    o1.j jVar2 = sf0Var.J;
                    if (!jVar2.f) {
                        arrayList.add(jVar2);
                        break;
                    } else {
                        jVar2.a(e1Var);
                        break;
                    }
                }
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                if (!g1Var.O.f && !g1Var.P.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    jh.e1 e1Var2 = new jh.e1(this, arrayList2, 2);
                    o1.j jVar3 = g1Var.O;
                    if (jVar3.f) {
                        jVar3.a(e1Var2);
                    } else {
                        arrayList2.add(jVar3);
                    }
                    o1.j jVar4 = g1Var.P;
                    if (!jVar4.f) {
                        arrayList2.add(jVar4);
                        break;
                    } else {
                        jVar4.a(e1Var2);
                        break;
                    }
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
