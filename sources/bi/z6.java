package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.gi0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class z6 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        float f10;
        switch (this.a) {
            case 0:
                e7 e7Var = (e7) this.b;
                if (e7Var.w) {
                    x6 x6Var = e7Var.h;
                    x6Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = x6Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            x6Var.M = null;
                        }
                        float f11 = (x6Var.s / 2.0f) + ((-x6Var.getMeasuredWidth()) / 2.0f) + ((r2 + x6Var.n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (x6Var.s / 2.0f) + ((-x6Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + x6Var.n));
                        } else {
                            f10 = (x6Var.s / 2.0f) + ((-x6Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + x6Var.n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            x6Var.e = f11;
                        } else {
                            x6Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        x6Var.L = false;
                        x6Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                ((ni.e) this.b).f++;
                break;
            case 2:
                de0 de0Var = (de0) this.b;
                de0Var.h = i10;
                de0Var.n = f7;
                if (de0Var.d.getChildAt(i10) != null) {
                    de0.a(de0Var, i10, (int) (de0Var.d.getChildAt(i10).getWidth() * f7));
                    de0Var.invalidate();
                    z4.e eVar = de0Var.c;
                    if (eVar != null) {
                        eVar.a(f7, i10, i11);
                        break;
                    }
                }
                break;
            default:
                gi0 gi0Var = (gi0) this.b;
                if (!gi0Var.a && Math.abs(i10 - gi0Var.w) == 1) {
                    int i12 = gi0Var.w;
                    if (i10 > i12) {
                        gi0.a(gi0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        gi0.a(gi0Var, 1, 0, 0);
                        gi0.a(gi0Var, 2, 0, -1);
                    }
                }
                int i13 = gi0Var.w;
                int i14 = gi0Var.x;
                gi0Var.w = i10;
                gi0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    gi0Var.H = true;
                    gi0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        switch (this.a) {
            case 2:
                de0 de0Var = (de0) this.b;
                z4.e eVar = de0Var.c;
                if (eVar != null) {
                    eVar.b(i10);
                }
                int i11 = 0;
                while (i11 < de0Var.d.getChildCount()) {
                    de0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                e7 e7Var = (e7) this.b;
                if (i10 == 1) {
                    e7Var.w = true;
                    break;
                }
                break;
            case 2:
                de0 de0Var = (de0) this.b;
                if (i10 == 0) {
                    de0.a(de0Var, de0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = de0Var.c;
                if (eVar != null) {
                    eVar.c(i10);
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

    private final void g(int i10) {
    }

    private final void h(int i10) {
    }
}
