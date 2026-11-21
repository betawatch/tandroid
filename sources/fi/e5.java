package fi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.zf0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class e5 implements c5.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ e5(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // c5.h
    public final void a(int i7) {
        switch (this.a) {
            case 1:
                cc0 cc0Var = (cc0) this.b;
                c5.h hVar = cc0Var.c;
                if (hVar != null) {
                    hVar.a(i7);
                }
                int i10 = 0;
                while (i10 < cc0Var.d.getChildCount()) {
                    cc0Var.d.getChildAt(i10).setSelected(i10 == i7);
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
                j5 j5Var = (j5) this.b;
                if (j5Var.x) {
                    c5 c5Var = j5Var.h;
                    c5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = c5Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            c5Var.N = null;
                        }
                        float f12 = (c5Var.s / 2.0f) + ((-c5Var.getMeasuredWidth()) / 2.0f) + ((r2 + c5Var.n) * i7);
                        if (f10 > 0.0f) {
                            f11 = (c5Var.s / 2.0f) + ((-c5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (r4 + c5Var.n));
                        } else {
                            f11 = (c5Var.s / 2.0f) + ((-c5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (r4 + c5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            c5Var.e = f12;
                        } else {
                            c5Var.e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        c5Var.M = false;
                        c5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                cc0 cc0Var = (cc0) this.b;
                cc0Var.h = i7;
                cc0Var.n = f10;
                if (cc0Var.d.getChildAt(i7) != null) {
                    cc0.a(cc0Var, i7, (int) (cc0Var.d.getChildAt(i7).getWidth() * f10));
                    cc0Var.invalidate();
                    c5.h hVar = cc0Var.c;
                    if (hVar != null) {
                        hVar.b(f10, i7, i10);
                        break;
                    }
                }
                break;
            default:
                zf0 zf0Var = (zf0) this.b;
                if (!zf0Var.a && Math.abs(i7 - zf0Var.x) == 1) {
                    int i11 = zf0Var.x;
                    if (i7 > i11) {
                        zf0.a(zf0Var, 0, 1, 1);
                    } else if (i7 < i11) {
                        zf0.a(zf0Var, 1, 0, 0);
                        zf0.a(zf0Var, 2, 0, -1);
                    }
                }
                int i12 = zf0Var.x;
                int i13 = zf0Var.y;
                zf0Var.x = i7;
                zf0Var.y = i10;
                if (i12 != i7 || i13 != i10) {
                    zf0Var.I = true;
                    zf0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // c5.h
    public final void c(int i7) {
        switch (this.a) {
            case 0:
                j5 j5Var = (j5) this.b;
                if (i7 == 1) {
                    j5Var.x = true;
                    break;
                }
                break;
            case 1:
                cc0 cc0Var = (cc0) this.b;
                if (i7 == 0) {
                    cc0.a(cc0Var, cc0Var.e.getCurrentItem(), 0);
                }
                c5.h hVar = cc0Var.c;
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
