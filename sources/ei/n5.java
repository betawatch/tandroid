package ei;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.nf0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n5 implements b5.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ n5(int i3, View view) {
        this.a = i3;
        this.b = view;
    }

    @Override // b5.h
    public final void a(int i3) {
        switch (this.a) {
            case 1:
                lb0 lb0Var = (lb0) this.b;
                b5.h hVar = lb0Var.c;
                if (hVar != null) {
                    hVar.a(i3);
                }
                int i10 = 0;
                while (i10 < lb0Var.d.getChildCount()) {
                    lb0Var.d.getChildAt(i10).setSelected(i10 == i3);
                    i10++;
                }
                break;
        }
    }

    @Override // b5.h
    public final void b(float f10, int i3, int i10) {
        float f11;
        switch (this.a) {
            case 0:
                s5 s5Var = (s5) this.b;
                if (s5Var.x) {
                    l5 l5Var = s5Var.h;
                    l5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = l5Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            l5Var.N = null;
                        }
                        float f12 = (l5Var.s / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((r2 + l5Var.n) * i3);
                        if (f10 > 0.0f) {
                            f11 = (l5Var.s / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((i3 + 1) * (r4 + l5Var.n));
                        } else {
                            f11 = (l5Var.s / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((i3 - 1) * (r4 + l5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            l5Var.e = f12;
                        } else {
                            l5Var.e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        l5Var.M = false;
                        l5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                lb0 lb0Var = (lb0) this.b;
                lb0Var.h = i3;
                lb0Var.n = f10;
                if (lb0Var.d.getChildAt(i3) != null) {
                    lb0.a(lb0Var, i3, (int) (lb0Var.d.getChildAt(i3).getWidth() * f10));
                    lb0Var.invalidate();
                    b5.h hVar = lb0Var.c;
                    if (hVar != null) {
                        hVar.b(f10, i3, i10);
                        break;
                    }
                }
                break;
            default:
                nf0 nf0Var = (nf0) this.b;
                if (!nf0Var.a && Math.abs(i3 - nf0Var.x) == 1) {
                    int i11 = nf0Var.x;
                    if (i3 > i11) {
                        nf0.a(nf0Var, 0, 1, 1);
                    } else if (i3 < i11) {
                        nf0.a(nf0Var, 1, 0, 0);
                        nf0.a(nf0Var, 2, 0, -1);
                    }
                }
                int i12 = nf0Var.x;
                int i13 = nf0Var.y;
                nf0Var.x = i3;
                nf0Var.y = i10;
                if (i12 != i3 || i13 != i10) {
                    nf0Var.I = true;
                    nf0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // b5.h
    public final void c(int i3) {
        switch (this.a) {
            case 0:
                s5 s5Var = (s5) this.b;
                if (i3 == 1) {
                    s5Var.x = true;
                    break;
                }
                break;
            case 1:
                lb0 lb0Var = (lb0) this.b;
                if (i3 == 0) {
                    lb0.a(lb0Var, lb0Var.e.getCurrentItem(), 0);
                }
                b5.h hVar = lb0Var.c;
                if (hVar != null) {
                    hVar.c(i3);
                    break;
                }
                break;
        }
    }

    private final void d(int i3) {
    }

    private final void e(int i3) {
    }

    private final void f(int i3) {
    }
}
