package di;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r4 {
    public final s4 a;
    public ai.r d;
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

    public r4(s4 s4Var) {
        this.a = s4Var;
    }

    public final void a(int i7) {
        this.b.add(new q4(3, 0.0f, 0.0f, i7, -1, 0.0f, null, null));
    }

    public final void b() {
        ai.r rVar;
        boolean z10 = this.e;
        s4 s4Var = this.a;
        if (!z10) {
            int i7 = this.c;
            ArrayList arrayList = this.b;
            if (i7 < arrayList.size()) {
                q4 q4Var = (q4) arrayList.get(this.c);
                this.c++;
                int i10 = q4Var.a;
                int i11 = q4Var.e;
                float f10 = q4Var.b;
                int i12 = q4Var.d;
                int c10 = p1.g.c(i10);
                if (c10 == 0) {
                    Runnable runnable = q4Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (c10 == 1) {
                    s4Var.d = (q4Var.c * 0.01f) + s4Var.d;
                    s4Var.e = (f10 * 0.01f) + s4Var.e;
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
                    System.arraycopy(s4Var.c, 0, this.h, 0, 16);
                    float f11 = q4Var.f;
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
                    this.j = s4Var.d;
                    this.k = s4Var.e;
                    return;
                }
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    s4Var.f = f10 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = q4Var.g;
                ValueAnimator valueAnimator = s4Var.H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    s4Var.H = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - s4Var.getX();
                rectF.top = view.getY() - s4Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                org.telegram.messenger.g0.E2(view);
                int childCount = s4Var.getChildCount();
                s4Var.addView(view, c8.ja.e(64, 64, 17));
                s4Var.w.add(Integer.valueOf(i11));
                s4Var.x.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                s4Var.y.put(Integer.valueOf(childCount), rectF);
                s4Var.G = childCount;
                s4Var.F = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                s4Var.H = ofFloat;
                ofFloat.addUpdateListener(new ah.h(s4Var, 7));
                s4Var.H.addListener(new ai.j0(s4Var, 6));
                s4Var.H.setDuration(i12 * 16);
                s4Var.H.setInterpolator(er.h);
                s4Var.H.start();
                return;
            }
        }
        s4Var.I = null;
        if (this.e || (rVar = this.d) == null) {
            return;
        }
        rVar.run();
    }

    public final void c(float f10, float f11) {
        this.b.add(new q4(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new q4(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(w4 w4Var, int i7, float f10) {
        this.b.add(new q4(5, 0.0f, 0.0f, 32, i7, f10, w4Var, null));
    }
}
