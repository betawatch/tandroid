package di;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class u4 {
    public final v4 a;
    public ai.s d;
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

    public u4(v4 v4Var) {
        this.a = v4Var;
    }

    public final void a(int i7) {
        this.b.add(new t4(3, 0.0f, 0.0f, i7, -1, 0.0f, null, null));
    }

    public final void b() {
        ai.s sVar;
        boolean z10 = this.e;
        v4 v4Var = this.a;
        if (!z10) {
            int i7 = this.c;
            ArrayList arrayList = this.b;
            if (i7 < arrayList.size()) {
                t4 t4Var = (t4) arrayList.get(this.c);
                this.c++;
                int i10 = t4Var.a;
                int i11 = t4Var.e;
                float f10 = t4Var.b;
                int i12 = t4Var.d;
                int c10 = p1.g.c(i10);
                if (c10 == 0) {
                    Runnable runnable = t4Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (c10 == 1) {
                    v4Var.d = (t4Var.c * 0.01f) + v4Var.d;
                    v4Var.e = (f10 * 0.01f) + v4Var.e;
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
                    System.arraycopy(v4Var.c, 0, this.h, 0, 16);
                    float f11 = t4Var.f;
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
                    this.j = v4Var.d;
                    this.k = v4Var.e;
                    return;
                }
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    v4Var.f = f10 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = t4Var.g;
                ValueAnimator valueAnimator = v4Var.H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    v4Var.H = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - v4Var.getX();
                rectF.top = view.getY() - v4Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                org.telegram.messenger.g0.E2(view);
                int childCount = v4Var.getChildCount();
                v4Var.addView(view, c8.ma.e(64, 64, 17));
                v4Var.w.add(Integer.valueOf(i11));
                v4Var.x.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                v4Var.y.put(Integer.valueOf(childCount), rectF);
                v4Var.G = childCount;
                v4Var.F = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                v4Var.H = ofFloat;
                ofFloat.addUpdateListener(new ah.g(v4Var, 7));
                v4Var.H.addListener(new ai.j0(v4Var, 6));
                v4Var.H.setDuration(i12 * 16);
                v4Var.H.setInterpolator(lr.h);
                v4Var.H.start();
                return;
            }
        }
        v4Var.I = null;
        if (this.e || (sVar = this.d) == null) {
            return;
        }
        sVar.run();
    }

    public final void c(float f10, float f11) {
        this.b.add(new t4(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new t4(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(z4 z4Var, int i7, float f10) {
        this.b.add(new t4(5, 0.0f, 0.0f, 32, i7, f10, z4Var, null));
    }
}
