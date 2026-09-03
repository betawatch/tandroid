package nh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.nh0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class h5 implements m2.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ h5(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // m2.f
    public final void a(int i10) {
        switch (this.a) {
            case 1:
                gd0 gd0Var = (gd0) this.b;
                m2.f fVar = gd0Var.c;
                if (fVar != null) {
                    fVar.a(i10);
                }
                int i11 = 0;
                while (i11 < gd0Var.d.getChildCount()) {
                    gd0Var.d.getChildAt(i11).setSelected(i11 == i10);
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
                m5 m5Var = (m5) this.b;
                if (m5Var.w) {
                    f5 f5Var = m5Var.h;
                    f5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = f5Var.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            f5Var.J = null;
                        }
                        float f12 = (f5Var.s / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((r2 + f5Var.n) * i10);
                        if (f10 > 0.0f) {
                            f11 = (f5Var.s / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + f5Var.n));
                        } else {
                            f11 = (f5Var.s / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + f5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            f5Var.e = f12;
                        } else {
                            f5Var.e = AndroidUtilities.lerp(f12, f11, f10);
                        }
                        f5Var.I = false;
                        f5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                gd0 gd0Var = (gd0) this.b;
                gd0Var.h = i10;
                gd0Var.n = f10;
                if (gd0Var.d.getChildAt(i10) != null) {
                    gd0.a(gd0Var, i10, (int) (gd0Var.d.getChildAt(i10).getWidth() * f10));
                    gd0Var.invalidate();
                    m2.f fVar = gd0Var.c;
                    if (fVar != null) {
                        fVar.b(f10, i10, i11);
                        break;
                    }
                }
                break;
            default:
                nh0 nh0Var = (nh0) this.b;
                if (!nh0Var.a && Math.abs(i10 - nh0Var.w) == 1) {
                    int i12 = nh0Var.w;
                    if (i10 > i12) {
                        nh0.a(nh0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        nh0.a(nh0Var, 1, 0, 0);
                        nh0.a(nh0Var, 2, 0, -1);
                    }
                }
                int i13 = nh0Var.w;
                int i14 = nh0Var.x;
                nh0Var.w = i10;
                nh0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    nh0Var.E = true;
                    nh0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // m2.f
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                m5 m5Var = (m5) this.b;
                if (i10 == 1) {
                    m5Var.w = true;
                    break;
                }
                break;
            case 1:
                gd0 gd0Var = (gd0) this.b;
                if (i10 == 0) {
                    gd0.a(gd0Var, gd0Var.e.getCurrentItem(), 0);
                }
                m2.f fVar = gd0Var.c;
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
