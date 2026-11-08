package di;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.qb0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class n5 implements c5.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ n5(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // c5.g
    public final void a(int i7) {
        switch (this.a) {
            case 1:
                qb0 qb0Var = (qb0) this.b;
                c5.g gVar = qb0Var.c;
                if (gVar != null) {
                    gVar.a(i7);
                }
                int i10 = 0;
                while (i10 < qb0Var.d.getChildCount()) {
                    qb0Var.d.getChildAt(i10).setSelected(i10 == i7);
                    i10++;
                }
                break;
        }
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        float f11;
        switch (this.a) {
            case 0:
                s5 s5Var = (s5) this.b;
                if (s5Var.x) {
                    l5 l5Var = s5Var.h;
                    l5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = l5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            l5Var.M = null;
                        }
                        float f12 = (l5Var.s / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((r2 + l5Var.n) * i7);
                        if (f10 > 0.0f) {
                            f11 = (l5Var.s / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (r4 + l5Var.n));
                        } else {
                            f11 = (l5Var.s / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (r4 + l5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            l5Var.e = f12;
                        } else {
                            l5Var.e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        l5Var.L = false;
                        l5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                qb0 qb0Var = (qb0) this.b;
                qb0Var.h = i7;
                qb0Var.n = f10;
                if (qb0Var.d.getChildAt(i7) != null) {
                    qb0.a(qb0Var, i7, (int) (qb0Var.d.getChildAt(i7).getWidth() * f10));
                    qb0Var.invalidate();
                    c5.g gVar = qb0Var.c;
                    if (gVar != null) {
                        gVar.b(f10, i7, i10);
                        break;
                    }
                }
                break;
            default:
                kf0 kf0Var = (kf0) this.b;
                if (!kf0Var.a && Math.abs(i7 - kf0Var.x) == 1) {
                    int i11 = kf0Var.x;
                    if (i7 > i11) {
                        kf0.a(kf0Var, 0, 1, 1);
                    } else if (i7 < i11) {
                        kf0.a(kf0Var, 1, 0, 0);
                        kf0.a(kf0Var, 2, 0, -1);
                    }
                }
                int i12 = kf0Var.x;
                int i13 = kf0Var.y;
                kf0Var.x = i7;
                kf0Var.y = i10;
                if (i12 != i7 || i13 != i10) {
                    kf0Var.H = true;
                    kf0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // c5.g
    public final void c(int i7) {
        switch (this.a) {
            case 0:
                s5 s5Var = (s5) this.b;
                if (i7 == 1) {
                    s5Var.x = true;
                    break;
                }
                break;
            case 1:
                qb0 qb0Var = (qb0) this.b;
                if (i7 == 0) {
                    qb0.a(qb0Var, qb0Var.e.getCurrentItem(), 0);
                }
                c5.g gVar = qb0Var.c;
                if (gVar != null) {
                    gVar.c(i7);
                    break;
                }
                break;
        }
    }

    private final void d(int i7) {
    }

    private final void e(int i7) {
    }

    private final void f(int i7) {
    }
}
