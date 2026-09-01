package oh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.oh0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class i5 implements m2.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ i5(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // m2.f
    public final void a(int i10) {
        switch (this.a) {
            case 1:
                hd0 hd0Var = (hd0) this.b;
                m2.f fVar = hd0Var.c;
                if (fVar != null) {
                    fVar.a(i10);
                }
                int i11 = 0;
                while (i11 < hd0Var.d.getChildCount()) {
                    hd0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        float f11;
        switch (this.a) {
            case 0:
                n5 n5Var = (n5) this.b;
                if (n5Var.w) {
                    g5 g5Var = n5Var.h;
                    g5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = g5Var.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            g5Var.J = null;
                        }
                        float f12 = (g5Var.s / 2.0f) + ((-g5Var.getMeasuredWidth()) / 2.0f) + ((r2 + g5Var.n) * i10);
                        if (f10 > 0.0f) {
                            f11 = (g5Var.s / 2.0f) + ((-g5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + g5Var.n));
                        } else {
                            f11 = (g5Var.s / 2.0f) + ((-g5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + g5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            g5Var.e = f12;
                        } else {
                            g5Var.e = AndroidUtilities.lerp(f12, f11, f10);
                        }
                        g5Var.I = false;
                        g5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                hd0 hd0Var = (hd0) this.b;
                hd0Var.h = i10;
                hd0Var.n = f10;
                if (hd0Var.d.getChildAt(i10) != null) {
                    hd0.a(hd0Var, i10, (int) (hd0Var.d.getChildAt(i10).getWidth() * f10));
                    hd0Var.invalidate();
                    m2.f fVar = hd0Var.c;
                    if (fVar != null) {
                        fVar.b(f10, i10, i11);
                        break;
                    }
                }
                break;
            default:
                oh0 oh0Var = (oh0) this.b;
                if (!oh0Var.a && Math.abs(i10 - oh0Var.w) == 1) {
                    int i12 = oh0Var.w;
                    if (i10 > i12) {
                        oh0.a(oh0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        oh0.a(oh0Var, 1, 0, 0);
                        oh0.a(oh0Var, 2, 0, -1);
                    }
                }
                int i13 = oh0Var.w;
                int i14 = oh0Var.x;
                oh0Var.w = i10;
                oh0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    oh0Var.E = true;
                    oh0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // m2.f
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                n5 n5Var = (n5) this.b;
                if (i10 == 1) {
                    n5Var.w = true;
                    break;
                }
                break;
            case 1:
                hd0 hd0Var = (hd0) this.b;
                if (i10 == 0) {
                    hd0.a(hd0Var, hd0Var.e.getCurrentItem(), 0);
                }
                m2.f fVar = hd0Var.c;
                if (fVar != null) {
                    fVar.c(i10);
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
