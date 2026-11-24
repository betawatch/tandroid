// default package

import android.content.SharedPreferences;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class f43 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f43(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void b() {
        tl4 tl4Var = (tl4) this.b;
        WindowManager.LayoutParams layoutParams = tl4Var.e;
        int h = (int) (tl4Var.h() * tl4Var.z);
        layoutParams.width = h;
        tl4Var.x = h;
        vc8 vc8Var = tl4Var.b;
        int S = vc8Var.S();
        int o0 = vc8Var.o0();
        float f = (S <= 0 || o0 <= 0) ? 0.5625f : o0 / S;
        int i = (int) (((int) (tl4.i(f) * f)) * tl4Var.z);
        layoutParams.height = i;
        tl4Var.y = i;
        tl4Var.r();
        tl4Var.a.b.d();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                u43 u43Var = ((g43) obj).b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = u43Var.a;
                ImageView imageView = u43Var.b;
                if (u43Var.G) {
                    return true;
                }
                float f = u43Var.M.e;
                if (f * scaleFactor > 30.0f) {
                    scaleFactor = 30.0f / f;
                }
                u43Var.M.f(scaleFactor, u43Var.M.b() * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), u43Var.M.a() * (td4.y((imageView.getHeight() - u43Var.E) - (!u43Var.r ? gm.m : 0), u43Var.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                u43Var.r(false);
                return true;
            default:
                tl4 tl4Var = (tl4) obj;
                tl4Var.z = pqe.a(scaleGestureDetector.getScaleFactor() * tl4Var.z, 0.75f, tl4Var.A);
                tl4Var.x = (int) (tl4Var.h() * tl4Var.z);
                vc8 vc8Var = tl4Var.b;
                int S = vc8Var.S();
                int o0 = vc8Var.o0();
                float f2 = (S <= 0 || o0 <= 0) ? 0.5625f : o0 / S;
                tl4Var.y = (int) (((int) (tl4.i(f2) * f2)) * tl4Var.z);
                gm.c3(new a14((Object) this, (byte) 26));
                float m = scaleGestureDetector.getFocusX() >= ((float) gm.q.x) / 2.0f ? (r0 - tl4Var.x) - tl4.m() : tl4.m();
                zna znaVar = tl4Var.D;
                if (znaVar.f) {
                    znaVar.m.i = m;
                } else {
                    znaVar.b = tl4Var.B;
                    znaVar.c = true;
                    znaVar.m.i = m;
                }
                znaVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f3 = tl4Var.y;
                float e = tl4.e(focusY2 - (f3 / 2.0f), f3);
                zna znaVar2 = tl4Var.E;
                if (znaVar2.f) {
                    znaVar2.m.i = e;
                } else {
                    znaVar2.b = tl4Var.C;
                    znaVar2.c = true;
                    znaVar2.m.i = e;
                }
                znaVar2.h();
                return true;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            default:
                tl4 tl4Var = (tl4) this.b;
                WindowManager.LayoutParams layoutParams = tl4Var.e;
                vc8 vc8Var = tl4Var.b;
                if (tl4Var.r) {
                    tl4Var.r = false;
                    tl4Var.L = false;
                    vc8Var.R();
                    gm.r(tl4Var.N);
                }
                tl4Var.s = true;
                layoutParams.width = (int) (tl4Var.h() * tl4Var.A);
                int S = vc8Var.S();
                int o0 = vc8Var.o0();
                float f = (S <= 0 || o0 <= 0) ? 0.5625f : o0 / S;
                layoutParams.height = (int) (((int) (tl4.i(f) * f)) * tl4Var.A);
                tl4Var.r();
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
                lj4 t = lj4.t();
                tl4 tl4Var = (tl4) this.b;
                ((SharedPreferences) t.a).edit().putFloat("scale_factor", tl4Var.z).apply();
                if (!tl4Var.D.f && !tl4Var.E.f) {
                    b();
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    rl4 rl4Var = new rl4(this, arrayList);
                    zna znaVar = tl4Var.D;
                    if (znaVar.f) {
                        znaVar.a(rl4Var);
                    } else {
                        arrayList.add(znaVar);
                    }
                    zna znaVar2 = tl4Var.E;
                    if (!znaVar2.f) {
                        arrayList.add(znaVar2);
                        break;
                    } else {
                        znaVar2.a(rl4Var);
                        break;
                    }
                }
                break;
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
