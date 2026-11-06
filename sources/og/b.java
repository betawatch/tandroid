package og;

import ab.d0;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import c8.j9;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.Crop.CropAreaView;
import sg.t0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public void b() {
        ti.i iVar = (ti.i) this.b;
        WindowManager.LayoutParams layoutParams = iVar.e;
        int h = (int) (iVar.h() * iVar.z);
        layoutParams.width = h;
        iVar.x = h;
        ti.m mVar = iVar.b;
        int I = mVar.I();
        int U = mVar.U();
        float f10 = (I <= 0 || U <= 0) ? 0.5625f : U / I;
        int i7 = (int) (((int) (ti.i.i(f10) * f10)) * iVar.z);
        layoutParams.height = i7;
        iVar.y = i7;
        iVar.r();
        iVar.a.b.f();
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
                if (!oVar.F) {
                    float f10 = oVar.L.e;
                    if (f10 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f10;
                    }
                    m.g(oVar.L, scaleFactor, m.a(oVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), m.b(oVar.L) * (k5.y((imageView.getHeight() - oVar.D) - (!oVar.r ? g0.m : 0), oVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    oVar.r(false);
                }
                return true;
            default:
                ti.i iVar = (ti.i) this.b;
                iVar.z = j9.a(scaleGestureDetector.getScaleFactor() * iVar.z, 0.75f, iVar.A);
                iVar.x = (int) (iVar.h() * iVar.z);
                ti.m mVar = iVar.b;
                int I = mVar.I();
                int U = mVar.U();
                float f11 = (I <= 0 || U <= 0) ? 0.5625f : U / I;
                iVar.y = (int) (((int) (ti.i.i(f11) * f11)) * iVar.z);
                g0.h3(new t0(this, 10));
                float m10 = scaleGestureDetector.getFocusX() >= ((float) g0.q.x) / 2.0f ? (r2 - iVar.x) - ti.i.m() : ti.i.m();
                r1.g gVar = iVar.D;
                if (gVar.f) {
                    gVar.m.i = m10;
                } else {
                    gVar.b = iVar.B;
                    gVar.c = true;
                    gVar.m.i = m10;
                }
                gVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f12 = iVar.y;
                float e10 = ti.i.e(focusY2 - (f12 / 2.0f), f12);
                r1.g gVar2 = iVar.E;
                if (gVar2.f) {
                    gVar2.m.i = e10;
                } else {
                    gVar2.b = iVar.C;
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
                ti.i iVar = (ti.i) this.b;
                WindowManager.LayoutParams layoutParams = iVar.e;
                ti.m mVar = iVar.b;
                if (iVar.r) {
                    iVar.r = false;
                    iVar.L = false;
                    mVar.F();
                    g0.r(iVar.N);
                }
                iVar.s = true;
                layoutParams.width = (int) (iVar.h() * iVar.A);
                int I = mVar.I();
                int U = mVar.U();
                float f10 = (I <= 0 || U <= 0) ? 0.5625f : U / I;
                layoutParams.height = (int) (((int) (ti.i.i(f10) * f10)) * iVar.A);
                iVar.r();
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
                d0 b10 = d0.b();
                ti.i iVar = (ti.i) this.b;
                b10.a.edit().putFloat("scale_factor", iVar.z).apply();
                if (!iVar.D.f && !iVar.E.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ti.g gVar = new ti.g(this, arrayList);
                    r1.g gVar2 = iVar.D;
                    if (gVar2.f) {
                        gVar2.a(gVar);
                    } else {
                        arrayList.add(gVar2);
                    }
                    r1.g gVar3 = iVar.E;
                    if (!gVar3.f) {
                        arrayList.add(gVar3);
                        break;
                    } else {
                        gVar3.a(gVar);
                        break;
                    }
                }
                break;
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
