package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ee0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ee0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public void b() {
        switch (this.a) {
            case 0:
                ie0 ie0Var = (ie0) this.b;
                WindowManager.LayoutParams layoutParams = ie0Var.c;
                int t10 = (int) (ie0Var.t() * ie0Var.K);
                layoutParams.width = t10;
                ie0Var.I = t10;
                WindowManager.LayoutParams layoutParams2 = ie0Var.c;
                int p10 = (int) (ie0Var.p() * ie0Var.K);
                layoutParams2.height = p10;
                ie0Var.J = p10;
                try {
                    org.telegram.messenger.g0.T3(ie0Var.b, ie0Var.d, ie0Var.c);
                    break;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.b;
                WindowManager.LayoutParams layoutParams3 = s0Var.c;
                int f10 = (int) (s0Var.f() * s0Var.Q);
                layoutParams3.width = f10;
                s0Var.N = f10;
                WindowManager.LayoutParams layoutParams4 = s0Var.c;
                int e10 = (int) (s0Var.e() * s0Var.Q);
                layoutParams4.height = e10;
                s0Var.O = e10;
                org.telegram.messenger.g0.T3(s0Var.b, s0Var.d, s0Var.c);
                break;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                ie0 ie0Var = (ie0) this.b;
                ie0Var.K = b8.be.a(scaleGestureDetector.getScaleFactor() * ie0Var.K, 0.75f, ie0Var.a);
                ie0Var.I = (int) (ie0Var.t() * ie0Var.K);
                ie0Var.J = (int) (ie0Var.p() * ie0Var.K);
                org.telegram.messenger.g0.h3(new jb0(this, 9));
                float L = scaleGestureDetector.getFocusX() >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? (r3 - ie0Var.I) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
                q1.g gVar = ie0Var.N;
                if (gVar.f) {
                    gVar.m.i = L;
                } else {
                    gVar.b = ie0Var.L;
                    gVar.c = true;
                    gVar.m.i = L;
                }
                gVar.h();
                float a10 = b8.be.a(scaleGestureDetector.getFocusY() - (ie0Var.J / 2.0f), org.telegram.messenger.g0.L(16.0f), (r2.y - ie0Var.J) - org.telegram.messenger.g0.L(16.0f));
                q1.g gVar2 = ie0Var.O;
                if (gVar2.f) {
                    gVar2.m.i = a10;
                } else {
                    gVar2.b = ie0Var.M;
                    gVar2.c = true;
                    gVar2.m.i = a10;
                }
                gVar2.h();
                break;
            case 1:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.b;
                s0Var.Q = b8.be.a(scaleGestureDetector.getScaleFactor() * s0Var.Q, 0.6f, s0Var.a);
                s0Var.N = (int) (s0Var.f() * s0Var.Q);
                s0Var.O = (int) (s0Var.e() * s0Var.Q);
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.d4(this, 9));
                q1.g gVar3 = s0Var.T;
                gVar3.b = s0Var.R;
                gVar3.c = true;
                gVar3.m.i = scaleGestureDetector.getFocusX() >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? (r5 - s0Var.N) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
                q1.g gVar4 = s0Var.T;
                if (!gVar4.f) {
                    gVar4.h();
                }
                q1.g gVar5 = s0Var.U;
                gVar5.b = s0Var.S;
                gVar5.c = true;
                gVar5.m.i = b8.be.a(scaleGestureDetector.getFocusY() - (s0Var.O / 2.0f), org.telegram.messenger.g0.L(16.0f), (r4.y - s0Var.O) - org.telegram.messenger.g0.L(16.0f));
                q1.g gVar6 = s0Var.U;
                if (!gVar6.f) {
                    gVar6.h();
                    break;
                }
                break;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                    pg.m mVar = ((pg.b) this.b).b;
                    float focusX = scaleGestureDetector.getFocusX();
                    float focusY = scaleGestureDetector.getFocusY();
                    CropAreaView cropAreaView = mVar.a;
                    ImageView imageView = mVar.b;
                    if (!mVar.G) {
                        float f10 = mVar.M.e;
                        if (f10 * scaleFactor > 30.0f) {
                            scaleFactor = 30.0f / f10;
                        }
                        pg.k.g(mVar.M, scaleFactor, pg.k.a(mVar.M) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), pg.k.b(mVar.M) * (org.telegram.messenger.k5.y((imageView.getHeight() - mVar.E) - (!mVar.r ? org.telegram.messenger.g0.m : 0), mVar.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                        mVar.r(false);
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
                ie0 ie0Var = (ie0) this.b;
                if (ie0Var.x) {
                    ie0Var.x = false;
                    ie0Var.g0 = false;
                    ie0Var.a();
                    org.telegram.messenger.g0.r(ie0Var.i0);
                }
                ie0Var.y = true;
                ie0Var.c.width = (int) (ie0Var.t() * ie0Var.a);
                ie0Var.c.height = (int) (ie0Var.p() * ie0Var.a);
                org.telegram.messenger.g0.T3(ie0Var.b, ie0Var.d, ie0Var.c);
                break;
            case 1:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.b;
                if (s0Var.I) {
                    s0Var.I = false;
                }
                s0Var.J = true;
                s0Var.c.width = (int) (s0Var.f() * s0Var.a);
                s0Var.c.height = (int) (s0Var.e() * s0Var.a);
                org.telegram.messenger.g0.T3(s0Var.b, s0Var.d, s0Var.c);
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                ie0 ie0Var = (ie0) this.b;
                if (!ie0Var.N.f && !ie0Var.O.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ei.h1 h1Var = new ei.h1(this, arrayList, 1);
                    q1.g gVar = ie0Var.N;
                    if (gVar.f) {
                        gVar.a(h1Var);
                    } else {
                        arrayList.add(gVar);
                    }
                    q1.g gVar2 = ie0Var.O;
                    if (!gVar2.f) {
                        arrayList.add(gVar2);
                        break;
                    } else {
                        gVar2.a(h1Var);
                        break;
                    }
                }
            case 1:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.b;
                if (!s0Var.T.f && !s0Var.U.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ei.h1 h1Var2 = new ei.h1(this, arrayList2, 2);
                    q1.g gVar3 = s0Var.T;
                    if (gVar3.f) {
                        gVar3.a(h1Var2);
                    } else {
                        arrayList2.add(gVar3);
                    }
                    q1.g gVar4 = s0Var.U;
                    if (!gVar4.f) {
                        arrayList2.add(gVar4);
                        break;
                    } else {
                        gVar4.a(h1Var2);
                        break;
                    }
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
