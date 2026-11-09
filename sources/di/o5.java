package di;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.rb0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o5 implements c5.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ o5(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // c5.g
    public final void a(int i7) {
        switch (this.a) {
            case 1:
                rb0 rb0Var = (rb0) this.b;
                c5.g gVar = rb0Var.c;
                if (gVar != null) {
                    gVar.a(i7);
                }
                int i10 = 0;
                while (i10 < rb0Var.d.getChildCount()) {
                    rb0Var.d.getChildAt(i10).setSelected(i10 == i7);
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
                t5 t5Var = (t5) this.b;
                if (t5Var.x) {
                    m5 m5Var = t5Var.h;
                    m5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = m5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            m5Var.M = null;
                        }
                        float f12 = (m5Var.s / 2.0f) + ((-m5Var.getMeasuredWidth()) / 2.0f) + ((r2 + m5Var.n) * i7);
                        if (f10 > 0.0f) {
                            f11 = (m5Var.s / 2.0f) + ((-m5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (r4 + m5Var.n));
                        } else {
                            f11 = (m5Var.s / 2.0f) + ((-m5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (r4 + m5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            m5Var.e = f12;
                        } else {
                            m5Var.e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        m5Var.L = false;
                        m5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                rb0 rb0Var = (rb0) this.b;
                rb0Var.h = i7;
                rb0Var.n = f10;
                if (rb0Var.d.getChildAt(i7) != null) {
                    rb0.a(rb0Var, i7, (int) (rb0Var.d.getChildAt(i7).getWidth() * f10));
                    rb0Var.invalidate();
                    c5.g gVar = rb0Var.c;
                    if (gVar != null) {
                        gVar.b(f10, i7, i10);
                        break;
                    }
                }
                break;
            default:
                lf0 lf0Var = (lf0) this.b;
                if (!lf0Var.a && Math.abs(i7 - lf0Var.x) == 1) {
                    int i11 = lf0Var.x;
                    if (i7 > i11) {
                        lf0.a(lf0Var, 0, 1, 1);
                    } else if (i7 < i11) {
                        lf0.a(lf0Var, 1, 0, 0);
                        lf0.a(lf0Var, 2, 0, -1);
                    }
                }
                int i12 = lf0Var.x;
                int i13 = lf0Var.y;
                lf0Var.x = i7;
                lf0Var.y = i10;
                if (i12 != i7 || i13 != i10) {
                    lf0Var.H = true;
                    lf0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // c5.g
    public final void c(int i7) {
        switch (this.a) {
            case 0:
                t5 t5Var = (t5) this.b;
                if (i7 == 1) {
                    t5Var.x = true;
                    break;
                }
                break;
            case 1:
                rb0 rb0Var = (rb0) this.b;
                if (i7 == 0) {
                    rb0.a(rb0Var, rb0Var.e.getCurrentItem(), 0);
                }
                c5.g gVar = rb0Var.c;
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
