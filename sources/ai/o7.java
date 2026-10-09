package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.ki0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class o7 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(int i10) {
        switch (this.a) {
            case 2:
                ee0 ee0Var = (ee0) this.b;
                z4.e eVar = ee0Var.c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                int i11 = 0;
                while (i11 < ee0Var.d.getChildCount()) {
                    ee0Var.d.getChildAt(i11).setSelected(i11 == i10);
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
                t7 t7Var = (t7) this.b;
                if (t7Var.w) {
                    m7 m7Var = t7Var.h;
                    m7Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = m7Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            m7Var.M = null;
                        }
                        float f11 = (m7Var.s / 2.0f) + ((-m7Var.getMeasuredWidth()) / 2.0f) + ((r2 + m7Var.n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (m7Var.s / 2.0f) + ((-m7Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + m7Var.n));
                        } else {
                            f10 = (m7Var.s / 2.0f) + ((-m7Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + m7Var.n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            m7Var.e = f11;
                        } else {
                            m7Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        m7Var.L = false;
                        m7Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                ((li.e) this.b).f++;
                break;
            case 2:
                ee0 ee0Var = (ee0) this.b;
                ee0Var.h = i10;
                ee0Var.n = f7;
                if (ee0Var.d.getChildAt(i10) != null) {
                    ee0.a(ee0Var, i10, (int) (ee0Var.d.getChildAt(i10).getWidth() * f7));
                    ee0Var.invalidate();
                    z4.e eVar = ee0Var.c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        break;
                    }
                }
                break;
            default:
                ki0 ki0Var = (ki0) this.b;
                if (!ki0Var.a && Math.abs(i10 - ki0Var.w) == 1) {
                    int i12 = ki0Var.w;
                    if (i10 > i12) {
                        ki0.a(ki0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        ki0.a(ki0Var, 1, 0, 0);
                        ki0.a(ki0Var, 2, 0, -1);
                    }
                }
                int i13 = ki0Var.w;
                int i14 = ki0Var.x;
                ki0Var.w = i10;
                ki0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    ki0Var.H = true;
                    ki0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                t7 t7Var = (t7) this.b;
                if (i10 == 1) {
                    t7Var.w = true;
                    break;
                }
                break;
            case 2:
                ee0 ee0Var = (ee0) this.b;
                if (i10 == 0) {
                    ee0.a(ee0Var, ee0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = ee0Var.c;
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
