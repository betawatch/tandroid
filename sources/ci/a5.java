package ci;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import b8.mf;
import java.util.ArrayList;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a5 {
    public final b5 a;
    public ai.z3 d;
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

    public a5(b5 b5Var) {
        this.a = b5Var;
    }

    public final void a(int i3) {
        this.b.add(new z4(3, 0.0f, 0.0f, i3, -1, 0.0f, null, null));
    }

    public final void b() {
        ai.z3 z3Var;
        boolean z10 = this.e;
        b5 b5Var = this.a;
        if (!z10) {
            int i3 = this.c;
            ArrayList arrayList = this.b;
            if (i3 < arrayList.size()) {
                z4 z4Var = (z4) arrayList.get(this.c);
                char c2 = 1;
                this.c++;
                int i10 = z4Var.a;
                int i11 = z4Var.e;
                float f10 = z4Var.b;
                int i12 = z4Var.d;
                int c10 = o1.g.c(i10);
                if (c10 == 0) {
                    Runnable runnable = z4Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (c10 == 1) {
                    b5Var.d = (z4Var.c * 0.01f) + b5Var.d;
                    b5Var.e = (f10 * 0.01f) + b5Var.e;
                    this.f = 1;
                    this.g = 1;
                    return;
                }
                if (c10 == 2) {
                    this.f = i12;
                    this.g = i12;
                    return;
                }
                if (c10 == 3) {
                    System.arraycopy(b5Var.c, 0, this.h, 0, 16);
                    float f11 = z4Var.f;
                    float[] fArr = new float[16];
                    Matrix.setIdentityM(fArr, 0);
                    if (f11 != 0.0f) {
                        Matrix.rotateM(fArr, 0, -f11, 0.0f, 0.0f, 1.0f);
                    }
                    if (i11 == 0) {
                        Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (i11 == 1) {
                        Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (i11 == 2) {
                        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                    } else if (i11 == 3) {
                        Matrix.rotateM(fArr, 0, -90.0f, 1.0f, 0.0f, 0.0f);
                    } else if (i11 == 4) {
                        Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                    }
                    this.i = fArr;
                    this.g = i12;
                    this.f = i12;
                    this.j = b5Var.d;
                    this.k = b5Var.e;
                    return;
                }
                int i13 = 5;
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    b5Var.f = f10 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = z4Var.g;
                ValueAnimator valueAnimator = b5Var.H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    b5Var.H = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - b5Var.getX();
                rectF.top = view.getY() - b5Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                org.telegram.messenger.g0.E2(view);
                int childCount = b5Var.getChildCount();
                b5Var.addView(view, mf.e(64, 64, 17));
                b5Var.w.add(Integer.valueOf(i11));
                b5Var.x.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                b5Var.y.put(Integer.valueOf(childCount), rectF);
                b5Var.G = childCount;
                b5Var.F = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                b5Var.H = ofFloat;
                ofFloat.addUpdateListener(new bh.f(b5Var, i13));
                b5Var.H.addListener(new ai.e1(b5Var, c2 == true ? 1 : 0));
                b5Var.H.setDuration(i12 * 16);
                b5Var.H.setInterpolator(xq.h);
                b5Var.H.start();
                return;
            }
        }
        b5Var.I = null;
        if (this.e || (z3Var = this.d) == null) {
            return;
        }
        z3Var.run();
    }

    public final void c(float f10, float f11) {
        this.b.add(new z4(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new z4(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(f5 f5Var, int i3, float f10) {
        this.b.add(new z4(5, 0.0f, 0.0f, 32, i3, f10, f5Var, null));
    }
}
