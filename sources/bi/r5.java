package bi;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class r5 {
    public final s5 a;
    public ai.e0 d;
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

    public r5(s5 s5Var) {
        this.a = s5Var;
    }

    public final void a(int i10) {
        this.b.add(new q5(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        ai.e0 e0Var;
        boolean z10 = this.e;
        s5 s5Var = this.a;
        if (!z10) {
            int i10 = this.c;
            ArrayList arrayList = this.b;
            if (i10 < arrayList.size()) {
                q5 q5Var = (q5) arrayList.get(this.c);
                this.c++;
                int i11 = q5Var.a;
                int i12 = q5Var.e;
                float f7 = q5Var.b;
                int i13 = q5Var.d;
                int c10 = m1.j.c(i11);
                if (c10 == 0) {
                    Runnable runnable = q5Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (c10 == 1) {
                    s5Var.d = (q5Var.c * 0.01f) + s5Var.d;
                    s5Var.e = (f7 * 0.01f) + s5Var.e;
                    this.f = 1;
                    this.g = 1;
                    return;
                }
                if (c10 == 2) {
                    this.f = i13;
                    this.g = i13;
                    return;
                }
                int i14 = 4;
                if (c10 == 3) {
                    System.arraycopy(s5Var.c, 0, this.h, 0, 16);
                    float f10 = q5Var.f;
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
                    this.j = s5Var.d;
                    this.k = s5Var.e;
                    return;
                }
                int i15 = 5;
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    s5Var.f = f7 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = q5Var.g;
                ValueAnimator valueAnimator = s5Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    s5Var.G = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - s5Var.getX();
                rectF.top = view.getY() - s5Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                AndroidUtilities.removeFromParent(view);
                int childCount = s5Var.getChildCount();
                s5Var.addView(view, gb1.i(64, 64, 17));
                s5Var.v.add(Integer.valueOf(i12));
                s5Var.w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                s5Var.x.put(Integer.valueOf(childCount), rectF);
                s5Var.F = childCount;
                s5Var.E = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                s5Var.G = ofFloat;
                ofFloat.addUpdateListener(new ai.g0(s5Var, i15));
                s5Var.G.addListener(new bh.b(s5Var, i14));
                s5Var.G.setDuration(i13 * 16);
                s5Var.G.setInterpolator(ds.h);
                s5Var.G.start();
                return;
            }
        }
        s5Var.H = null;
        if (this.e || (e0Var = this.d) == null) {
            return;
        }
        e0Var.run();
    }

    public final void c(float f7, float f10) {
        this.b.add(new q5(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new q5(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(x5 x5Var, int i10, float f7) {
        this.b.add(new q5(5, 0.0f, 0.0f, 32, i10, f7, x5Var, null));
    }
}
