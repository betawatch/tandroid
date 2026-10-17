package ai;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class v5 {
    public final w5 a;
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

    public v5(w5 w5Var) {
        this.a = w5Var;
    }

    public final void a(int i10) {
        this.b.add(new u5(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        y0 y0Var;
        boolean z10 = this.e;
        w5 w5Var = this.a;
        if (!z10) {
            int i10 = this.c;
            ArrayList arrayList = this.b;
            if (i10 < arrayList.size()) {
                u5 u5Var = (u5) arrayList.get(this.c);
                this.c++;
                int i11 = u5Var.a;
                int i12 = u5Var.e;
                float f7 = u5Var.b;
                int i13 = u5Var.d;
                int c10 = m1.j.c(i11);
                if (c10 == 0) {
                    Runnable runnable = u5Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (c10 == 1) {
                    w5Var.d = (u5Var.c * 0.01f) + w5Var.d;
                    w5Var.e = (f7 * 0.01f) + w5Var.e;
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
                    System.arraycopy(w5Var.c, 0, this.h, 0, 16);
                    float f10 = u5Var.f;
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
                    this.j = w5Var.d;
                    this.k = w5Var.e;
                    return;
                }
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    w5Var.f = f7 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = u5Var.g;
                ValueAnimator valueAnimator = w5Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    w5Var.G = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - w5Var.getX();
                rectF.top = view.getY() - w5Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                AndroidUtilities.removeFromParent(view);
                int childCount = w5Var.getChildCount();
                w5Var.addView(view, w7.z5.e(64, 64, 17));
                w5Var.v.add(Integer.valueOf(i12));
                w5Var.w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                w5Var.x.put(Integer.valueOf(childCount), rectF);
                w5Var.F = childCount;
                w5Var.E = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                w5Var.G = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(w5Var, i14));
                w5Var.G.addListener(new ah.b(w5Var, i14));
                w5Var.G.setDuration(i13 * 16);
                w5Var.G.setInterpolator(bs.h);
                w5Var.G.start();
                return;
            }
        }
        w5Var.H = null;
        if (this.e || (y0Var = this.d) == null) {
            return;
        }
        y0Var.run();
    }

    public final void c(float f7, float f10) {
        this.b.add(new u5(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new u5(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(b6 b6Var, int i10, float f7) {
        this.b.add(new u5(5, 0.0f, 0.0f, 32, i10, f7, b6Var, null));
    }
}
