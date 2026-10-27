package di;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.xd0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w5 implements a5.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ w5(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // a5.i
    public final void a(int i10) {
        switch (this.a) {
            case 1:
                xd0 xd0Var = (xd0) this.b;
                a5.i iVar = xd0Var.c;
                if (iVar != null) {
                    iVar.a(i10);
                }
                int i11 = 0;
                while (i11 < xd0Var.d.getChildCount()) {
                    xd0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // a5.i
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
                xd0 xd0Var = (xd0) this.b;
                xd0Var.h = i10;
                xd0Var.n = f7;
                if (xd0Var.d.getChildAt(i10) != null) {
                    xd0.a(xd0Var, i10, (int) (xd0Var.d.getChildAt(i10).getWidth() * f7));
                    xd0Var.invalidate();
                    a5.i iVar = xd0Var.c;
                    if (iVar != null) {
                        iVar.b(f7, i10, i11);
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

    @Override // a5.i
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                b6 b6Var = (b6) this.b;
                if (i10 == 1) {
                    b6Var.w = true;
                    break;
                }
                break;
            case 1:
                xd0 xd0Var = (xd0) this.b;
                if (i10 == 0) {
                    xd0.a(xd0Var, xd0Var.e.getCurrentItem(), 0);
                }
                a5.i iVar = xd0Var.c;
                if (iVar != null) {
                    iVar.c(i10);
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
