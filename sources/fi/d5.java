package fi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.xf0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class d5 implements c5.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ d5(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // c5.h
    public final void a(int i7) {
        switch (this.a) {
            case 1:
                bc0 bc0Var = (bc0) this.b;
                c5.h hVar = bc0Var.c;
                if (hVar != null) {
                    hVar.a(i7);
                }
                int i10 = 0;
                while (i10 < bc0Var.d.getChildCount()) {
                    bc0Var.d.getChildAt(i10).setSelected(i10 == i7);
                    i10++;
                }
                break;
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        float f11;
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.b;
                if (i5Var.x) {
                    b5 b5Var = i5Var.h;
                    b5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = b5Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            b5Var.N = null;
                        }
                        float f12 = (b5Var.s / 2.0f) + ((-b5Var.getMeasuredWidth()) / 2.0f) + ((r2 + b5Var.n) * i7);
                        if (f10 > 0.0f) {
                            f11 = (b5Var.s / 2.0f) + ((-b5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (r4 + b5Var.n));
                        } else {
                            f11 = (b5Var.s / 2.0f) + ((-b5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (r4 + b5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            b5Var.e = f12;
                        } else {
                            b5Var.e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        b5Var.M = false;
                        b5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                bc0 bc0Var = (bc0) this.b;
                bc0Var.h = i7;
                bc0Var.n = f10;
                if (bc0Var.d.getChildAt(i7) != null) {
                    bc0.a(bc0Var, i7, (int) (bc0Var.d.getChildAt(i7).getWidth() * f10));
                    bc0Var.invalidate();
                    c5.h hVar = bc0Var.c;
                    if (hVar != null) {
                        hVar.b(f10, i7, i10);
                        break;
                    }
                }
                break;
            default:
                xf0 xf0Var = (xf0) this.b;
                if (!xf0Var.a && Math.abs(i7 - xf0Var.x) == 1) {
                    int i11 = xf0Var.x;
                    if (i7 > i11) {
                        xf0.a(xf0Var, 0, 1, 1);
                    } else if (i7 < i11) {
                        xf0.a(xf0Var, 1, 0, 0);
                        xf0.a(xf0Var, 2, 0, -1);
                    }
                }
                int i12 = xf0Var.x;
                int i13 = xf0Var.y;
                xf0Var.x = i7;
                xf0Var.y = i10;
                if (i12 != i7 || i13 != i10) {
                    xf0Var.I = true;
                    xf0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // c5.h
    public final void c(int i7) {
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.b;
                if (i7 == 1) {
                    i5Var.x = true;
                    break;
                }
                break;
            case 1:
                bc0 bc0Var = (bc0) this.b;
                if (i7 == 0) {
                    bc0.a(bc0Var, bc0Var.e.getCurrentItem(), 0);
                }
                c5.h hVar = bc0Var.c;
                if (hVar != null) {
                    hVar.c(i7);
                    break;
                }
                break;
        }
    }

    private final void d(int i7) {
    }

    private final void e(int i7) {
    }

    private final void f(int i7) {
    }
}
