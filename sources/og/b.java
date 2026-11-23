package og;

import android.content.SharedPreferences;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import c8.l9;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.jn;
import v4.p;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public void b() {
        wi.h hVar = (wi.h) this.b;
        WindowManager.LayoutParams layoutParams = hVar.e;
        int h = (int) (hVar.h() * hVar.z);
        layoutParams.width = h;
        hVar.x = h;
        wi.l lVar = hVar.b;
        int J = lVar.J();
        int a02 = lVar.a0();
        float f10 = (J <= 0 || a02 <= 0) ? 0.5625f : a02 / J;
        int i7 = (int) (((int) (wi.h.i(f10) * f10)) * hVar.z);
        layoutParams.height = i7;
        hVar.y = i7;
        hVar.r();
        hVar.a.b.f();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                o oVar = ((c) this.b).b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = oVar.a;
                ImageView imageView = oVar.b;
                if (!oVar.G) {
                    float f10 = oVar.M.e;
                    if (f10 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f10;
                    }
                    m.g(oVar.M, scaleFactor, m.a(oVar.M) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), m.b(oVar.M) * (f3.y((imageView.getHeight() - oVar.E) - (!oVar.r ? g0.m : 0), oVar.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    oVar.r(false);
                }
                return true;
            default:
                wi.h hVar = (wi.h) this.b;
                hVar.z = l9.a(scaleGestureDetector.getScaleFactor() * hVar.z, 0.75f, hVar.A);
                hVar.x = (int) (hVar.h() * hVar.z);
                wi.l lVar = hVar.b;
                int J = lVar.J();
                int a02 = lVar.a0();
                float f11 = (J <= 0 || a02 <= 0) ? 0.5625f : a02 / J;
                hVar.y = (int) (((int) (wi.h.i(f11) * f11)) * hVar.z);
                g0.g3(new p(this, 10));
                float m10 = scaleGestureDetector.getFocusX() >= ((float) g0.q.x) / 2.0f ? (r2 - hVar.x) - wi.h.m() : wi.h.m();
                r1.g gVar = hVar.D;
                if (gVar.f) {
                    gVar.m.i = m10;
                } else {
                    gVar.b = hVar.B;
                    gVar.c = true;
                    gVar.m.i = m10;
                }
                gVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f12 = hVar.y;
                float e10 = wi.h.e(focusY2 - (f12 / 2.0f), f12);
                r1.g gVar2 = hVar.E;
                if (gVar2.f) {
                    gVar2.m.i = e10;
                } else {
                    gVar2.b = hVar.C;
                    gVar2.c = true;
                    gVar2.m.i = e10;
                }
                gVar2.h();
                return true;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                break;
            default:
                wi.h hVar = (wi.h) this.b;
                WindowManager.LayoutParams layoutParams = hVar.e;
                wi.l lVar = hVar.b;
                if (hVar.r) {
                    hVar.r = false;
                    hVar.L = false;
                    lVar.H();
                    g0.r(hVar.N);
                }
                hVar.s = true;
                layoutParams.width = (int) (hVar.h() * hVar.A);
                int J = lVar.J();
                int a02 = lVar.a0();
                float f10 = (J <= 0 || a02 <= 0) ? 0.5625f : a02 / J;
                layoutParams.height = (int) (((int) (wi.h.i(f10) * f10)) * hVar.A);
                hVar.r();
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                break;
            default:
                jn m10 = jn.m();
                wi.h hVar = (wi.h) this.b;
                ((SharedPreferences) m10.b).edit().putFloat("scale_factor", hVar.z).apply();
                if (!hVar.D.f && !hVar.E.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    wi.f fVar = new wi.f(this, arrayList);
                    r1.g gVar = hVar.D;
                    if (gVar.f) {
                        gVar.a(fVar);
                    } else {
                        arrayList.add(gVar);
                    }
                    r1.g gVar2 = hVar.E;
                    if (!gVar2.f) {
                        arrayList.add(gVar2);
                        break;
                    } else {
                        gVar2.a(fVar);
                        break;
                    }
                }
                break;
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
