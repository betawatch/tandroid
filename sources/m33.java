// default package

import android.content.SharedPreferences;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class m33 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m33(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void b() {
        xl4 xl4Var = (xl4) this.b;
        WindowManager.LayoutParams layoutParams = xl4Var.f;
        int i = (int) (xl4Var.i() * xl4Var.C);
        layoutParams.width = i;
        xl4Var.A = i;
        je8 je8Var = xl4Var.b;
        int U = je8Var.U();
        int q0 = je8Var.q0();
        float f = (U <= 0 || q0 <= 0) ? 0.5625f : q0 / U;
        int j = (int) (((int) (xl4.j(f) * f)) * xl4Var.C);
        layoutParams.height = j;
        xl4Var.B = j;
        xl4Var.v();
        xl4Var.a.b.d();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        byte b = this.a;
        byte b2 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                b43 b43Var = ((n33) obj).b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = b43Var.a;
                ImageView imageView = b43Var.b;
                if (b43Var.G) {
                    return true;
                }
                float f = b43Var.M.e;
                if (f * scaleFactor > 30.0f) {
                    scaleFactor = 30.0f / f;
                }
                b43Var.M.f(scaleFactor, b43Var.M.b() * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), b43Var.M.a() * (qd4.x((imageView.getHeight() - b43Var.E) - (!b43Var.r ? hl.m : 0), b43Var.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                b43Var.r(false);
                return true;
            default:
                xl4 xl4Var = (xl4) obj;
                xl4Var.C = ete.a(scaleGestureDetector.getScaleFactor() * xl4Var.C, 0.75f, xl4Var.D);
                xl4Var.A = (int) (xl4Var.i() * xl4Var.C);
                je8 je8Var = xl4Var.b;
                int U = je8Var.U();
                int q0 = je8Var.q0();
                float f2 = (U <= 0 || q0 <= 0) ? 0.5625f : q0 / U;
                xl4Var.B = (int) (((int) (xl4.j(f2) * f2)) * xl4Var.C);
                hl.c3(new rj4(this, b2));
                float n = scaleGestureDetector.getFocusX() >= ((float) hl.q.x) / 2.0f ? (r0 - xl4Var.A) - xl4.n() : xl4.n();
                vpa vpaVar = xl4Var.G;
                if (vpaVar.f) {
                    vpaVar.m.i = n;
                } else {
                    vpaVar.b = xl4Var.E;
                    vpaVar.c = true;
                    vpaVar.m.i = n;
                }
                vpaVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f3 = xl4Var.B;
                float e = xl4.e(focusY2 - (f3 / 2.0f), f3);
                vpa vpaVar2 = xl4Var.H;
                if (vpaVar2.f) {
                    vpaVar2.m.i = e;
                } else {
                    vpaVar2.b = xl4Var.F;
                    vpaVar2.c = true;
                    vpaVar2.m.i = e;
                }
                vpaVar2.h();
                return true;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            default:
                xl4 xl4Var = (xl4) this.b;
                WindowManager.LayoutParams layoutParams = xl4Var.f;
                je8 je8Var = xl4Var.b;
                if (xl4Var.u) {
                    xl4Var.u = false;
                    xl4Var.R = false;
                    je8Var.T();
                    hl.r(xl4Var.T);
                }
                xl4Var.v = true;
                layoutParams.width = (int) (xl4Var.i() * xl4Var.D);
                int U = je8Var.U();
                int q0 = je8Var.q0();
                float f = (U <= 0 || q0 <= 0) ? 0.5625f : q0 / U;
                layoutParams.height = (int) (((int) (xl4.j(f) * f)) * xl4Var.D);
                xl4Var.v();
            case 0:
                return true;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                break;
            default:
                xl4 xl4Var = (xl4) this.b;
                kj4 Q = kj4.Q(xl4Var.d);
                ((SharedPreferences) Q.b).edit().putFloat("scale_factor", xl4Var.C).apply();
                if (!xl4Var.G.f && !xl4Var.H.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    sl4 sl4Var = new sl4(this, arrayList);
                    vpa vpaVar = xl4Var.G;
                    if (vpaVar.f) {
                        vpaVar.a(sl4Var);
                    } else {
                        arrayList.add(vpaVar);
                    }
                    vpa vpaVar2 = xl4Var.H;
                    if (!vpaVar2.f) {
                        arrayList.add(vpaVar2);
                        break;
                    } else {
                        vpaVar2.a(sl4Var);
                        break;
                    }
                }
                break;
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
