package ai;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class w5 {
    public final x5 a;
    public y0 d;
    public int f;
    public int g;
    public float j;
    public float k;
    public final ArrayList b = new ArrayList();
    public int c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] i = new float[16];
    public boolean l = false;

    public w5(x5 x5Var) {
        this.a = x5Var;
    }

    public final void a(int i10) {
        this.b.add(new v5(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        y0 y0Var;
        boolean z10 = this.e;
        x5 x5Var = this.a;
        if (!z10) {
            int i10 = this.c;
            ArrayList arrayList = this.b;
            if (i10 < arrayList.size()) {
                v5 v5Var = (v5) arrayList.get(this.c);
                this.c++;
                int i11 = v5Var.a;
                int i12 = v5Var.e;
                float f7 = v5Var.b;
                int i13 = v5Var.d;
                int c10 = m1.j.c(i11);
                if (c10 == 0) {
                    Runnable runnable = v5Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (c10 == 1) {
                    x5Var.d = (v5Var.c * 0.01f) + x5Var.d;
                    x5Var.e = (f7 * 0.01f) + x5Var.e;
                    this.f = 1;
                    this.g = 1;
                    return;
                }
                if (c10 == 2) {
                    this.f = i13;
                    this.g = i13;
                    return;
                }
                int i14 = 3;
                if (c10 == 3) {
                    System.arraycopy(x5Var.c, 0, this.h, 0, 16);
                    float f10 = v5Var.f;
                    float[] fArr = new float[16];
                    Matrix.setIdentityM(fArr, 0);
                    if (f10 != 0.0f) {
                        Matrix.rotateM(fArr, 0, -f10, 0.0f, 0.0f, 1.0f);
                    }
                    if (i12 == 0) {
                        Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (i12 == 1) {
                        Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (i12 == 2) {
                        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                    } else if (i12 == 3) {
                        Matrix.rotateM(fArr, 0, -90.0f, 1.0f, 0.0f, 0.0f);
                    } else if (i12 == 4) {
                        Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                    }
                    this.i = fArr;
                    this.g = i13;
                    this.f = i13;
                    this.j = x5Var.d;
                    this.k = x5Var.e;
                    return;
                }
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    x5Var.f = f7 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = v5Var.g;
                ValueAnimator valueAnimator = x5Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    x5Var.G = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - x5Var.getX();
                rectF.top = view.getY() - x5Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                AndroidUtilities.removeFromParent(view);
                int childCount = x5Var.getChildCount();
                x5Var.addView(view, w7.z5.e(64, 64, 17));
                x5Var.v.add(Integer.valueOf(i12));
                x5Var.w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                x5Var.x.put(Integer.valueOf(childCount), rectF);
                x5Var.F = childCount;
                x5Var.E = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                x5Var.G = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(x5Var, i14));
                x5Var.G.addListener(new ah.b(x5Var, i14));
                x5Var.G.setDuration(i13 * 16);
                x5Var.G.setInterpolator(bs.h);
                x5Var.G.start();
                return;
            }
        }
        x5Var.H = null;
        if (this.e || (y0Var = this.d) == null) {
            return;
        }
        y0Var.run();
    }

    public final void c(float f7, float f10) {
        this.b.add(new v5(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new v5(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(c6 c6Var, int i10, float f7) {
        this.b.add(new v5(5, 0.0f, 0.0f, 32, i10, f7, c6Var, null));
    }
}
