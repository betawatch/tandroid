package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ld0 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ld0(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // z4.e
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                nd0 nd0Var = (nd0) this.b;
                z4.e eVar = nd0Var.c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                int i11 = 0;
                while (i11 < nd0Var.d.getChildCount()) {
                    nd0Var.d.getChildAt(i11).setSelected(i11 == i10);
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
                nd0 nd0Var = (nd0) this.b;
                nd0Var.h = i10;
                nd0Var.n = f7;
                if (nd0Var.d.getChildAt(i10) != null) {
                    nd0.a(nd0Var, i10, (int) (nd0Var.d.getChildAt(i10).getWidth() * f7));
                    nd0Var.invalidate();
                    z4.e eVar = nd0Var.c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        break;
                    }
                }
                break;
            case 1:
                ph0 ph0Var = (ph0) this.b;
                if (!ph0Var.a && Math.abs(i10 - ph0Var.w) == 1) {
                    int i12 = ph0Var.w;
                    if (i10 > i12) {
                        ph0.a(ph0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        ph0.a(ph0Var, 1, 0, 0);
                        ph0.a(ph0Var, 2, 0, -1);
                    }
                }
                int i13 = ph0Var.w;
                int i14 = ph0Var.x;
                ph0Var.w = i10;
                ph0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    ph0Var.H = true;
                    ph0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
            default:
                zh.g4 g4Var = (zh.g4) this.b;
                if (g4Var.w) {
                    zh.a4 a4Var = g4Var.h;
                    a4Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = a4Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            a4Var.M = null;
                        }
                        float f11 = (a4Var.s / 2.0f) + ((-a4Var.getMeasuredWidth()) / 2.0f) + ((r2 + a4Var.n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (a4Var.s / 2.0f) + ((-a4Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + a4Var.n));
                        } else {
                            f10 = (a4Var.s / 2.0f) + ((-a4Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + a4Var.n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            a4Var.e = f11;
                        } else {
                            a4Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        a4Var.L = false;
                        a4Var.invalidate();
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
                nd0 nd0Var = (nd0) this.b;
                if (i10 == 0) {
                    nd0.a(nd0Var, nd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = nd0Var.c;
                if (eVar != null) {
                    eVar.c(i10);
                    break;
                }
                break;
            case 1:
                break;
            default:
                zh.g4 g4Var = (zh.g4) this.b;
                if (i10 == 1) {
                    g4Var.w = true;
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
