package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.fi0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class w5 implements z4.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.f
    public final void a(int i10) {
        switch (this.a) {
            case 2:
                ae0 ae0Var = (ae0) this.b;
                z4.f fVar = ae0Var.c;
                if (fVar != null) {
                    fVar.a(i10);
                }
                int i11 = 0;
                while (i11 < ae0Var.d.getChildCount()) {
                    ae0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // z4.f
    public final void b(float f7, int i10, int i11) {
        float f10;
        switch (this.a) {
            case 0:
                b6 b6Var = (b6) this.b;
                if (b6Var.w) {
                    u5 u5Var = b6Var.h;
                    u5Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = u5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            u5Var.M = null;
                        }
                        float f11 = (u5Var.s / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((r2 + u5Var.n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (u5Var.s / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + u5Var.n));
                        } else {
                            f10 = (u5Var.s / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + u5Var.n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            u5Var.e = f11;
                        } else {
                            u5Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        u5Var.L = false;
                        u5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                ((ni.e) this.b).f++;
                break;
            case 2:
                ae0 ae0Var = (ae0) this.b;
                ae0Var.h = i10;
                ae0Var.n = f7;
                if (ae0Var.d.getChildAt(i10) != null) {
                    ae0.a(ae0Var, i10, (int) (ae0Var.d.getChildAt(i10).getWidth() * f7));
                    ae0Var.invalidate();
                    z4.f fVar = ae0Var.c;
                    if (fVar != null) {
                        fVar.b(f7, i10, i11);
                        break;
                    }
                }
                break;
            default:
                fi0 fi0Var = (fi0) this.b;
                if (!fi0Var.a && Math.abs(i10 - fi0Var.w) == 1) {
                    int i12 = fi0Var.w;
                    if (i10 > i12) {
                        fi0.a(fi0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        fi0.a(fi0Var, 1, 0, 0);
                        fi0.a(fi0Var, 2, 0, -1);
                    }
                }
                int i13 = fi0Var.w;
                int i14 = fi0Var.x;
                fi0Var.w = i10;
                fi0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    fi0Var.H = true;
                    fi0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // z4.f
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                b6 b6Var = (b6) this.b;
                if (i10 == 1) {
                    b6Var.w = true;
                    break;
                }
                break;
            case 2:
                ae0 ae0Var = (ae0) this.b;
                if (i10 == 0) {
                    ae0.a(ae0Var, ae0Var.e.getCurrentItem(), 0);
                }
                z4.f fVar = ae0Var.c;
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

    private final void g(int i10) {
    }

    private final void h(int i10) {
    }
}
