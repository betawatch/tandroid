package jh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y3 {
    public final z3 a;
    public androidx.car.app.utils.c d;
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

    public y3(z3 z3Var) {
        this.a = z3Var;
    }

    public final void a(int i10) {
        this.b.add(new x3(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        androidx.car.app.utils.c cVar;
        boolean z10 = this.e;
        z3 z3Var = this.a;
        if (!z10) {
            int i10 = this.c;
            ArrayList arrayList = this.b;
            if (i10 < arrayList.size()) {
                x3 x3Var = (x3) arrayList.get(this.c);
                this.c++;
                int i11 = x3Var.a;
                int i12 = x3Var.e;
                float f9 = x3Var.b;
                int i13 = x3Var.d;
                int b10 = m1.j.b(i11);
                if (b10 == 0) {
                    Runnable runnable = x3Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (b10 == 1) {
                    z3Var.d = (x3Var.c * 0.01f) + z3Var.d;
                    z3Var.e = (f9 * 0.01f) + z3Var.e;
                    this.f = 1;
                    this.g = 1;
                    return;
                }
                if (b10 == 2) {
                    this.f = i13;
                    this.g = i13;
                    return;
                }
                if (b10 == 3) {
                    System.arraycopy(z3Var.c, 0, this.h, 0, 16);
                    float f10 = x3Var.f;
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
                    this.j = z3Var.d;
                    this.k = z3Var.e;
                    return;
                }
                if (b10 != 4) {
                    if (b10 != 5) {
                        return;
                    }
                    z3Var.f = f9 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = x3Var.g;
                ValueAnimator valueAnimator = z3Var.C;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    z3Var.C = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - z3Var.getX();
                rectF.top = view.getY() - z3Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                AndroidUtilities.removeFromParent(view);
                int childCount = z3Var.getChildCount();
                z3Var.addView(view, i7.f6.e(64, 64, 17));
                z3Var.v.add(Integer.valueOf(i12));
                z3Var.w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                z3Var.x.put(Integer.valueOf(childCount), rectF);
                z3Var.B = childCount;
                z3Var.A = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z3Var.C = ofFloat;
                ofFloat.addUpdateListener(new bg.q1(z3Var, 13));
                z3Var.C.addListener(new ag.m0(z3Var, 9));
                z3Var.C.setDuration(i13 * 16);
                z3Var.C.setInterpolator(jr.h);
                z3Var.C.start();
                return;
            }
        }
        z3Var.D = null;
        if (this.e || (cVar = this.d) == null) {
            return;
        }
        cVar.run();
    }

    public final void c(float f9, float f10) {
        this.b.add(new x3(2, f9, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new x3(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(e4 e4Var, int i10, float f9) {
        this.b.add(new x3(5, 0.0f, 0.0f, 32, i10, f9, e4Var, null));
    }
}
