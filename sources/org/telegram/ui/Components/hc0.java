package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hc0 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ hc0(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // z4.e
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                jc0 jc0Var = (jc0) this.b;
                z4.e eVar = jc0Var.c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                int i11 = 0;
                while (i11 < jc0Var.d.getChildCount()) {
                    jc0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        float f10;
        switch (this.a) {
            case 0:
                jc0 jc0Var = (jc0) this.b;
                jc0Var.h = i10;
                jc0Var.n = f7;
                if (jc0Var.d.getChildAt(i10) != null) {
                    jc0.a(jc0Var, i10, (int) (jc0Var.d.getChildAt(i10).getWidth() * f7));
                    jc0Var.invalidate();
                    z4.e eVar = jc0Var.c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        break;
                    }
                }
                break;
            case 1:
                mg0 mg0Var = (mg0) this.b;
                if (!mg0Var.a && Math.abs(i10 - mg0Var.x) == 1) {
                    int i12 = mg0Var.x;
                    if (i10 > i12) {
                        mg0.a(mg0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        mg0.a(mg0Var, 1, 0, 0);
                        mg0.a(mg0Var, 2, 0, -1);
                    }
                }
                int i13 = mg0Var.x;
                int i14 = mg0Var.y;
                mg0Var.x = i10;
                mg0Var.y = i11;
                if (i13 != i10 || i14 != i11) {
                    mg0Var.H = true;
                    mg0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
            default:
                th.f4 f4Var = (th.f4) this.b;
                if (f4Var.x) {
                    th.z3 z3Var = f4Var.h;
                    z3Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = z3Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            z3Var.M = null;
                        }
                        float f11 = (z3Var.s / 2.0f) + ((-z3Var.getMeasuredWidth()) / 2.0f) + ((r2 + z3Var.n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (z3Var.s / 2.0f) + ((-z3Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + z3Var.n));
                        } else {
                            f10 = (z3Var.s / 2.0f) + ((-z3Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + z3Var.n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            z3Var.e = f11;
                        } else {
                            z3Var.e = org.telegram.messenger.i0.T1(f11, f10, f7);
                        }
                        z3Var.L = false;
                        z3Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                jc0 jc0Var = (jc0) this.b;
                if (i10 == 0) {
                    jc0.a(jc0Var, jc0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = jc0Var.c;
                if (eVar != null) {
                    eVar.c(i10);
                    break;
                }
                break;
            case 1:
                break;
            default:
                th.f4 f4Var = (th.f4) this.b;
                if (i10 == 1) {
                    f4Var.x = true;
                    break;
                }
                break;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }
}
