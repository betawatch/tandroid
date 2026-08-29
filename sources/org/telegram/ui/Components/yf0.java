package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yf0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yf0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public void b() {
        switch (this.a) {
            case 0:
                bg0 bg0Var = (bg0) this.b;
                WindowManager.LayoutParams layoutParams = bg0Var.c;
                int t10 = (int) (bg0Var.t() * bg0Var.F);
                layoutParams.width = t10;
                bg0Var.D = t10;
                WindowManager.LayoutParams layoutParams2 = bg0Var.c;
                int r6 = (int) (bg0Var.r() * bg0Var.F);
                layoutParams2.height = r6;
                bg0Var.E = r6;
                try {
                    AndroidUtilities.updateViewLayout(bg0Var.b, bg0Var.d, bg0Var.c);
                    break;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                WindowManager.LayoutParams layoutParams3 = h1Var.c;
                int m10 = (int) (h1Var.m() * h1Var.L);
                layoutParams3.width = m10;
                h1Var.I = m10;
                WindowManager.LayoutParams layoutParams4 = h1Var.c;
                int l10 = (int) (h1Var.l() * h1Var.L);
                layoutParams4.height = l10;
                h1Var.J = l10;
                AndroidUtilities.updateViewLayout(h1Var.b, h1Var.d, h1Var.c);
                break;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                bg0 bg0Var = (bg0) this.b;
                bg0Var.F = i7.w.a(scaleGestureDetector.getScaleFactor() * bg0Var.F, 0.75f, bg0Var.a);
                bg0Var.D = (int) (bg0Var.t() * bg0Var.F);
                bg0Var.E = (int) (bg0Var.r() * bg0Var.F);
                AndroidUtilities.runOnUIThread(new xb0(this, 12));
                float dp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - bg0Var.D) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar = bg0Var.I;
                if (kVar.f) {
                    kVar.u.i = dp;
                } else {
                    kVar.b = bg0Var.G;
                    kVar.c = true;
                    kVar.u.i = dp;
                }
                kVar.f();
                float a2 = i7.w.a(scaleGestureDetector.getFocusY() - (bg0Var.E / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - bg0Var.E) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = bg0Var.J;
                if (kVar2.f) {
                    kVar2.u.i = a2;
                } else {
                    kVar2.b = bg0Var.H;
                    kVar2.c = true;
                    kVar2.u.i = a2;
                }
                kVar2.f();
                break;
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                h1Var.L = i7.w.a(scaleGestureDetector.getScaleFactor() * h1Var.L, 0.6f, h1Var.a);
                h1Var.I = (int) (h1Var.m() * h1Var.L);
                h1Var.J = (int) (h1Var.l() * h1Var.L);
                AndroidUtilities.runOnUIThread(new nh.m6(this, 16));
                o1.k kVar3 = h1Var.O;
                kVar3.b = h1Var.M;
                kVar3.c = true;
                kVar3.u.i = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r4 - h1Var.I) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.k kVar4 = h1Var.O;
                if (!kVar4.f) {
                    kVar4.f();
                }
                o1.k kVar5 = h1Var.P;
                kVar5.b = h1Var.N;
                kVar5.c = true;
                kVar5.u.i = i7.w.a(scaleGestureDetector.getFocusY() - (h1Var.J / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.J) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = h1Var.P;
                if (!kVar6.f) {
                    kVar6.f();
                    break;
                }
                break;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                    wf.n nVar = ((wf.b) this.b).b;
                    float focusX = scaleGestureDetector.getFocusX();
                    float focusY = scaleGestureDetector.getFocusY();
                    CropAreaView cropAreaView = nVar.a;
                    ImageView imageView = nVar.b;
                    if (!nVar.B) {
                        float f9 = nVar.H.e;
                        if (f9 * scaleFactor > 30.0f) {
                            scaleFactor = 30.0f / f9;
                        }
                        wf.l.g(nVar.H, scaleFactor, wf.l.a(nVar.H) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), wf.l.b(nVar.H) * (org.telegram.messenger.x3.a((imageView.getHeight() - nVar.y) - (!nVar.r ? AndroidUtilities.statusBarHeight : 0), nVar.A, 2.0f, focusY) / cropAreaView.getCropHeight()));
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
                bg0 bg0Var = (bg0) this.b;
                if (bg0Var.w) {
                    bg0Var.w = false;
                    bg0Var.b0 = false;
                    bg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(bg0Var.d0);
                }
                bg0Var.x = true;
                bg0Var.c.width = (int) (bg0Var.t() * bg0Var.a);
                bg0Var.c.height = (int) (bg0Var.r() * bg0Var.a);
                AndroidUtilities.updateViewLayout(bg0Var.b, bg0Var.d, bg0Var.c);
                break;
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                if (h1Var.D) {
                    h1Var.D = false;
                }
                h1Var.E = true;
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
                bg0 bg0Var = (bg0) this.b;
                if (!bg0Var.I.f && !bg0Var.J.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    lh.e1 e1Var = new lh.e1(this, arrayList, 1);
                    o1.k kVar = bg0Var.I;
                    if (kVar.f) {
                        kVar.a(e1Var);
                    } else {
                        arrayList.add(kVar);
                    }
                    o1.k kVar2 = bg0Var.J;
                    if (!kVar2.f) {
                        arrayList.add(kVar2);
                        break;
                    } else {
                        kVar2.a(e1Var);
                        break;
                    }
                }
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                if (!h1Var.O.f && !h1Var.P.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    lh.e1 e1Var2 = new lh.e1(this, arrayList2, 2);
                    o1.k kVar3 = h1Var.O;
                    if (kVar3.f) {
                        kVar3.a(e1Var2);
                    } else {
                        arrayList2.add(kVar3);
                    }
                    o1.k kVar4 = h1Var.P;
                    if (!kVar4.f) {
                        arrayList2.add(kVar4);
                        break;
                    } else {
                        kVar4.a(e1Var2);
                        break;
                    }
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
