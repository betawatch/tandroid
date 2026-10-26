package di;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.wd0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                wd0 wd0Var = (wd0) this.b;
                a5.i iVar = wd0Var.c;
                if (iVar != null) {
                    iVar.a(i10);
                }
                int i11 = 0;
                while (i11 < wd0Var.d.getChildCount()) {
                    wd0Var.d.getChildAt(i11).setSelected(i11 == i10);
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
                wd0 wd0Var = (wd0) this.b;
                wd0Var.h = i10;
                wd0Var.n = f7;
                if (wd0Var.d.getChildAt(i10) != null) {
                    wd0.a(wd0Var, i10, (int) (wd0Var.d.getChildAt(i10).getWidth() * f7));
                    wd0Var.invalidate();
                    a5.i iVar = wd0Var.c;
                    if (iVar != null) {
                        iVar.b(f7, i10, i11);
                        break;
                    }
                }
                break;
            default:
                ei0 ei0Var = (ei0) this.b;
                if (!ei0Var.a && Math.abs(i10 - ei0Var.w) == 1) {
                    int i12 = ei0Var.w;
                    if (i10 > i12) {
                        ei0.a(ei0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        ei0.a(ei0Var, 1, 0, 0);
                        ei0.a(ei0Var, 2, 0, -1);
                    }
                }
                int i13 = ei0Var.w;
                int i14 = ei0Var.x;
                ei0Var.w = i10;
                ei0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    ei0Var.H = true;
                    ei0Var.postInvalidateOnAnimation();
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
                wd0 wd0Var = (wd0) this.b;
                if (i10 == 0) {
                    wd0.a(wd0Var, wd0Var.e.getCurrentItem(), 0);
                }
                a5.i iVar = wd0Var.c;
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
