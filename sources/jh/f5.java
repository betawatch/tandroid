package jh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.tg0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class f5 implements m2.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ f5(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // m2.e
    public final void b(int i10) {
        switch (this.a) {
            case 1:
                oc0 oc0Var = (oc0) this.b;
                m2.e eVar = oc0Var.c;
                if (eVar != null) {
                    eVar.b(i10);
                }
                int i11 = 0;
                while (i11 < oc0Var.d.getChildCount()) {
                    oc0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // m2.e
    public final void c(float f10, int i10, int i11) {
        float f11;
        switch (this.a) {
            case 0:
                k5 k5Var = (k5) this.b;
                if (k5Var.w) {
                    d5 d5Var = k5Var.h;
                    d5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = d5Var.I;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            d5Var.I = null;
                        }
                        float f12 = (d5Var.s / 2.0f) + ((-d5Var.getMeasuredWidth()) / 2.0f) + ((r2 + d5Var.n) * i10);
                        if (f10 > 0.0f) {
                            f11 = (d5Var.s / 2.0f) + ((-d5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + d5Var.n));
                        } else {
                            f11 = (d5Var.s / 2.0f) + ((-d5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + d5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            d5Var.e = f12;
                        } else {
                            d5Var.e = AndroidUtilities.lerp(f12, f11, f10);
                        }
                        d5Var.H = false;
                        d5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                oc0 oc0Var = (oc0) this.b;
                oc0Var.h = i10;
                oc0Var.n = f10;
                if (oc0Var.d.getChildAt(i10) != null) {
                    oc0.a(oc0Var, i10, (int) (oc0Var.d.getChildAt(i10).getWidth() * f10));
                    oc0Var.invalidate();
                    m2.e eVar = oc0Var.c;
                    if (eVar != null) {
                        eVar.c(f10, i10, i11);
                        break;
                    }
                }
                break;
            default:
                tg0 tg0Var = (tg0) this.b;
                if (!tg0Var.a && Math.abs(i10 - tg0Var.w) == 1) {
                    int i12 = tg0Var.w;
                    if (i10 > i12) {
                        tg0.a(tg0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        tg0.a(tg0Var, 1, 0, 0);
                        tg0.a(tg0Var, 2, 0, -1);
                    }
                }
                int i13 = tg0Var.w;
                int i14 = tg0Var.x;
                tg0Var.w = i10;
                tg0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    tg0Var.D = true;
                    tg0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // m2.e
    public final void d(int i10) {
        switch (this.a) {
            case 0:
                k5 k5Var = (k5) this.b;
                if (i10 == 1) {
                    k5Var.w = true;
                    break;
                }
                break;
            case 1:
                oc0 oc0Var = (oc0) this.b;
                if (i10 == 0) {
                    oc0.a(oc0Var, oc0Var.e.getCurrentItem(), 0);
                }
                m2.e eVar = oc0Var.c;
                if (eVar != null) {
                    eVar.d(i10);
                    break;
                }
                break;
        }
    }

    private final void a(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }
}
