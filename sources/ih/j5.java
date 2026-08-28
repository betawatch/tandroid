package ih;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.rg0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j5 implements m2.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ j5(int i9, View view) {
        this.a = i9;
        this.b = view;
    }

    @Override // m2.e
    public final void b(int i9) {
        switch (this.a) {
            case 1:
                kc0 kc0Var = (kc0) this.b;
                m2.e eVar = kc0Var.c;
                if (eVar != null) {
                    eVar.b(i9);
                }
                int i10 = 0;
                while (i10 < kc0Var.d.getChildCount()) {
                    kc0Var.d.getChildAt(i10).setSelected(i10 == i9);
                    i10++;
                }
                break;
        }
    }

    @Override // m2.e
    public final void c(float f10, int i9, int i10) {
        float f11;
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.b;
                if (o5Var.w) {
                    h5 h5Var = o5Var.h;
                    h5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = h5Var.I;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h5Var.I = null;
                        }
                        float f12 = (h5Var.s / 2.0f) + ((-h5Var.getMeasuredWidth()) / 2.0f) + ((r2 + h5Var.n) * i9);
                        if (f10 > 0.0f) {
                            f11 = (h5Var.s / 2.0f) + ((-h5Var.getMeasuredWidth()) / 2.0f) + ((i9 + 1) * (r4 + h5Var.n));
                        } else {
                            f11 = (h5Var.s / 2.0f) + ((-h5Var.getMeasuredWidth()) / 2.0f) + ((i9 - 1) * (r4 + h5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            h5Var.e = f12;
                        } else {
                            h5Var.e = AndroidUtilities.lerp(f12, f11, f10);
                        }
                        h5Var.H = false;
                        h5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                kc0 kc0Var = (kc0) this.b;
                kc0Var.h = i9;
                kc0Var.n = f10;
                if (kc0Var.d.getChildAt(i9) != null) {
                    kc0.a(kc0Var, i9, (int) (kc0Var.d.getChildAt(i9).getWidth() * f10));
                    kc0Var.invalidate();
                    m2.e eVar = kc0Var.c;
                    if (eVar != null) {
                        eVar.c(f10, i9, i10);
                        break;
                    }
                }
                break;
            default:
                rg0 rg0Var = (rg0) this.b;
                if (!rg0Var.a && Math.abs(i9 - rg0Var.w) == 1) {
                    int i11 = rg0Var.w;
                    if (i9 > i11) {
                        rg0.a(rg0Var, 0, 1, 1);
                    } else if (i9 < i11) {
                        rg0.a(rg0Var, 1, 0, 0);
                        rg0.a(rg0Var, 2, 0, -1);
                    }
                }
                int i12 = rg0Var.w;
                int i13 = rg0Var.x;
                rg0Var.w = i9;
                rg0Var.x = i10;
                if (i12 != i9 || i13 != i10) {
                    rg0Var.D = true;
                    rg0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // m2.e
    public final void d(int i9) {
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.b;
                if (i9 == 1) {
                    o5Var.w = true;
                    break;
                }
                break;
            case 1:
                kc0 kc0Var = (kc0) this.b;
                if (i9 == 0) {
                    kc0.a(kc0Var, kc0Var.e.getCurrentItem(), 0);
                }
                m2.e eVar = kc0Var.c;
                if (eVar != null) {
                    eVar.d(i9);
                    break;
                }
                break;
        }
    }

    private final void a(int i9) {
    }

    private final void e(int i9) {
    }

    private final void f(int i9) {
    }
}
