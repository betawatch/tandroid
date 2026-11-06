package bi;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class v5 {
    public final w5 a;
    public ai.d0 d;
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

    public final void a(int i7) {
        this.b.add(new u5(3, 0.0f, 0.0f, i7, -1, 0.0f, null, null));
    }

    public final void b() {
        ai.d0 d0Var;
        boolean z9 = this.e;
        w5 w5Var = this.a;
        if (!z9) {
            int i7 = this.c;
            ArrayList arrayList = this.b;
            if (i7 < arrayList.size()) {
                u5 u5Var = (u5) arrayList.get(this.c);
                this.c++;
                int i10 = u5Var.a;
                int i11 = u5Var.e;
                float f10 = u5Var.b;
                int i12 = u5Var.d;
                int c10 = p1.g.c(i10);
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
                    w5Var.e = (f10 * 0.01f) + w5Var.e;
                    this.f = 1;
                    this.g = 1;
                    return;
                }
                if (c10 == 2) {
                    this.f = i12;
                    this.g = i12;
                    return;
                }
                int i13 = 0;
                if (c10 == 3) {
                    System.arraycopy(w5Var.c, 0, this.h, 0, 16);
                    float f11 = u5Var.f;
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
                    this.j = w5Var.d;
                    this.k = w5Var.e;
                    return;
                }
                int i14 = 5;
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    w5Var.f = f10 > 0.0f;
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
                org.telegram.messenger.g0.E2(view);
                int childCount = w5Var.getChildCount();
                w5Var.addView(view, c8.ha.e(64, 64, 17));
                w5Var.w.add(Integer.valueOf(i11));
                w5Var.x.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                w5Var.y.put(Integer.valueOf(childCount), rectF);
                w5Var.F = childCount;
                w5Var.E = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                w5Var.G = ofFloat;
                ofFloat.addUpdateListener(new ah.h(w5Var, i14));
                w5Var.G.addListener(new t5(w5Var, i13));
                w5Var.G.setDuration(i12 * 16);
                w5Var.G.setInterpolator(xq.h);
                w5Var.G.start();
                return;
            }
        }
        w5Var.H = null;
        if (this.e || (d0Var = this.d) == null) {
            return;
        }
        d0Var.run();
    }

    public final void c(float f10, float f11) {
        this.b.add(new u5(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z9) {
        this.b.add(new u5(6, z9 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(b6 b6Var, int i7, float f10) {
        this.b.add(new u5(5, 0.0f, 0.0f, 32, i7, f10, b6Var, null));
    }
}
