package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.xd0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class x5 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        float f10;
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.b;
                if (c6Var.w) {
                    v5 v5Var = c6Var.h;
                    v5Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = v5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            v5Var.M = null;
                        }
                        float f11 = (v5Var.s / 2.0f) + ((-v5Var.getMeasuredWidth()) / 2.0f) + ((r2 + v5Var.n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (v5Var.s / 2.0f) + ((-v5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + v5Var.n));
                        } else {
                            f10 = (v5Var.s / 2.0f) + ((-v5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + v5Var.n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            v5Var.e = f11;
                        } else {
                            v5Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        v5Var.L = false;
                        v5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                ((ni.e) this.b).f++;
                break;
            case 2:
                xd0 xd0Var = (xd0) this.b;
                xd0Var.h = i10;
                xd0Var.n = f7;
                if (xd0Var.d.getChildAt(i10) != null) {
                    xd0.a(xd0Var, i10, (int) (xd0Var.d.getChildAt(i10).getWidth() * f7));
                    xd0Var.invalidate();
                    z4.e eVar = xd0Var.c;
                    if (eVar != null) {
                        eVar.a(f7, i10, i11);
                        break;
                    }
                }
                break;
            default:
                bi0 bi0Var = (bi0) this.b;
                if (!bi0Var.a && Math.abs(i10 - bi0Var.w) == 1) {
                    int i12 = bi0Var.w;
                    if (i10 > i12) {
                        bi0.a(bi0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        bi0.a(bi0Var, 1, 0, 0);
                        bi0.a(bi0Var, 2, 0, -1);
                    }
                }
                int i13 = bi0Var.w;
                int i14 = bi0Var.x;
                bi0Var.w = i10;
                bi0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    bi0Var.H = true;
                    bi0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        switch (this.a) {
            case 2:
                xd0 xd0Var = (xd0) this.b;
                z4.e eVar = xd0Var.c;
                if (eVar != null) {
                    eVar.b(i10);
                }
                int i11 = 0;
                while (i11 < xd0Var.d.getChildCount()) {
                    xd0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.b;
                if (i10 == 1) {
                    c6Var.w = true;
                    break;
                }
                break;
            case 2:
                xd0 xd0Var = (xd0) this.b;
                if (i10 == 0) {
                    xd0.a(xd0Var, xd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = xd0Var.c;
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
