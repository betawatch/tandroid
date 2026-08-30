package lh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class x3 {
    public final y3 a;
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

    public x3(y3 y3Var) {
        this.a = y3Var;
    }

    public final void a(int i10) {
        this.b.add(new w3(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        androidx.car.app.utils.c cVar;
        boolean z4 = this.e;
        y3 y3Var = this.a;
        if (!z4) {
            int i10 = this.c;
            ArrayList arrayList = this.b;
            if (i10 < arrayList.size()) {
                w3 w3Var = (w3) arrayList.get(this.c);
                this.c++;
                int i11 = w3Var.a;
                int i12 = w3Var.e;
                float f10 = w3Var.b;
                int i13 = w3Var.d;
                int b10 = m1.j.b(i11);
                if (b10 == 0) {
                    Runnable runnable = w3Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (b10 == 1) {
                    y3Var.d = (w3Var.c * 0.01f) + y3Var.d;
                    y3Var.e = (f10 * 0.01f) + y3Var.e;
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
                    System.arraycopy(y3Var.c, 0, this.h, 0, 16);
                    float f11 = w3Var.f;
                    float[] fArr = new float[16];
                    Matrix.setIdentityM(fArr, 0);
                    if (f11 != 0.0f) {
                        Matrix.rotateM(fArr, 0, -f11, 0.0f, 0.0f, 1.0f);
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
                    this.j = y3Var.d;
                    this.k = y3Var.e;
                    return;
                }
                if (b10 != 4) {
                    if (b10 != 5) {
                        return;
                    }
                    y3Var.f = f10 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = w3Var.g;
                ValueAnimator valueAnimator = y3Var.D;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    y3Var.D = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - y3Var.getX();
                rectF.top = view.getY() - y3Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                AndroidUtilities.removeFromParent(view);
                int childCount = y3Var.getChildCount();
                y3Var.addView(view, k7.b6.e(64, 64, 17));
                y3Var.v.add(Integer.valueOf(i12));
                y3Var.w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                y3Var.x.put(Integer.valueOf(childCount), rectF);
                y3Var.C = childCount;
                y3Var.B = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                y3Var.D = ofFloat;
                ofFloat.addUpdateListener(new dg.o1(y3Var, 13));
                y3Var.D.addListener(new cg.l0(y3Var, 9));
                y3Var.D.setDuration(i13 * 16);
                y3Var.D.setInterpolator(nr.h);
                y3Var.D.start();
                return;
            }
        }
        y3Var.E = null;
        if (this.e || (cVar = this.d) == null) {
            return;
        }
        cVar.run();
    }

    public final void c(float f10, float f11) {
        this.b.add(new w3(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z4) {
        this.b.add(new w3(6, z4 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(d4 d4Var, int i10, float f10) {
        this.b.add(new w3(5, 0.0f, 0.0f, 32, i10, f10, d4Var, null));
    }
}
