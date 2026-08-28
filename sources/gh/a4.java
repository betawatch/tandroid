package gh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a4 {
    public final b4 a;
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

    public a4(b4 b4Var) {
        this.a = b4Var;
    }

    public final void a(int i9) {
        this.b.add(new z3(3, 0.0f, 0.0f, i9, -1, 0.0f, null, null));
    }

    public final void b() {
        androidx.car.app.utils.c cVar;
        boolean z10 = this.e;
        b4 b4Var = this.a;
        if (!z10) {
            int i9 = this.c;
            ArrayList arrayList = this.b;
            if (i9 < arrayList.size()) {
                z3 z3Var = (z3) arrayList.get(this.c);
                this.c++;
                int i10 = z3Var.a;
                int i11 = z3Var.e;
                float f10 = z3Var.b;
                int i12 = z3Var.d;
                int b10 = m1.j.b(i10);
                if (b10 == 0) {
                    Runnable runnable = z3Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (b10 == 1) {
                    b4Var.d = (z3Var.c * 0.01f) + b4Var.d;
                    b4Var.e = (f10 * 0.01f) + b4Var.e;
                    this.f = 1;
                    this.g = 1;
                    return;
                }
                if (b10 == 2) {
                    this.f = i12;
                    this.g = i12;
                    return;
                }
                int i13 = 4;
                if (b10 == 3) {
                    System.arraycopy(b4Var.c, 0, this.h, 0, 16);
                    float f11 = z3Var.f;
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
                    this.j = b4Var.d;
                    this.k = b4Var.e;
                    return;
                }
                if (b10 != 4) {
                    if (b10 != 5) {
                        return;
                    }
                    b4Var.f = f10 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = z3Var.g;
                ValueAnimator valueAnimator = b4Var.C;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    b4Var.C = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - b4Var.getX();
                rectF.top = view.getY() - b4Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                AndroidUtilities.removeFromParent(view);
                int childCount = b4Var.getChildCount();
                b4Var.addView(view, g7.e6.e(64, 64, 17));
                b4Var.v.add(Integer.valueOf(i11));
                b4Var.w.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                b4Var.x.put(Integer.valueOf(childCount), rectF);
                b4Var.B = childCount;
                b4Var.A = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                b4Var.C = ofFloat;
                ofFloat.addUpdateListener(new bg.b(b4Var, i13));
                b4Var.C.addListener(new ag.e(b4Var, 4));
                b4Var.C.setDuration(i12 * 16);
                b4Var.C.setInterpolator(gr.h);
                b4Var.C.start();
                return;
            }
        }
        b4Var.D = null;
        if (this.e || (cVar = this.d) == null) {
            return;
        }
        cVar.run();
    }

    public final void c(float f10, float f11) {
        this.b.add(new z3(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new z3(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(g4 g4Var, int i9, float f10) {
        this.b.add(new z3(5, 0.0f, 0.0f, 32, i9, f10, g4Var, null));
    }
}
