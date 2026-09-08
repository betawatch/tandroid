package bi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class v6 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ v6(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        float f10;
        switch (this.a) {
            case 0:
                a7 a7Var = (a7) this.b;
                if (a7Var.w) {
                    t6 t6Var = a7Var.h;
                    t6Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = t6Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            t6Var.M = null;
                        }
                        float f11 = (t6Var.s / 2.0f) + ((-t6Var.getMeasuredWidth()) / 2.0f) + ((r2 + t6Var.n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (t6Var.s / 2.0f) + ((-t6Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + t6Var.n));
                        } else {
                            f10 = (t6Var.s / 2.0f) + ((-t6Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + t6Var.n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            t6Var.e = f11;
                        } else {
                            t6Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        t6Var.L = false;
                        t6Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                ed0 ed0Var = (ed0) this.b;
                ed0Var.h = i10;
                ed0Var.n = f7;
                if (ed0Var.d.getChildAt(i10) != null) {
                    ed0.a(ed0Var, i10, (int) (ed0Var.d.getChildAt(i10).getWidth() * f7));
                    ed0Var.invalidate();
                    z4.e eVar = ed0Var.c;
                    if (eVar != null) {
                        eVar.a(f7, i10, i11);
                        break;
                    }
                }
                break;
            default:
                fh0 fh0Var = (fh0) this.b;
                if (!fh0Var.a && Math.abs(i10 - fh0Var.w) == 1) {
                    int i12 = fh0Var.w;
                    if (i10 > i12) {
                        fh0.a(fh0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        fh0.a(fh0Var, 1, 0, 0);
                        fh0.a(fh0Var, 2, 0, -1);
                    }
                }
                int i13 = fh0Var.w;
                int i14 = fh0Var.x;
                fh0Var.w = i10;
                fh0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    fh0Var.H = true;
                    fh0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        switch (this.a) {
            case 1:
                ed0 ed0Var = (ed0) this.b;
                z4.e eVar = ed0Var.c;
                if (eVar != null) {
                    eVar.b(i10);
                }
                int i11 = 0;
                while (i11 < ed0Var.d.getChildCount()) {
                    ed0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                a7 a7Var = (a7) this.b;
                if (i10 == 1) {
                    a7Var.w = true;
                    break;
                }
                break;
            case 1:
                ed0 ed0Var = (ed0) this.b;
                if (i10 == 0) {
                    ed0.a(ed0Var, ed0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = ed0Var.c;
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
}
