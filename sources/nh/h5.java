package nh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.mh0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h5 implements m2.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ h5(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // m2.f
    public final void a(int i10) {
        switch (this.a) {
            case 1:
                fd0 fd0Var = (fd0) this.b;
                m2.f fVar = fd0Var.c;
                if (fVar != null) {
                    fVar.a(i10);
                }
                int i11 = 0;
                while (i11 < fd0Var.d.getChildCount()) {
                    fd0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        float f11;
        switch (this.a) {
            case 0:
                m5 m5Var = (m5) this.b;
                if (m5Var.w) {
                    f5 f5Var = m5Var.h;
                    f5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = f5Var.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            f5Var.J = null;
                        }
                        float f12 = (f5Var.s / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((r2 + f5Var.n) * i10);
                        if (f10 > 0.0f) {
                            f11 = (f5Var.s / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + f5Var.n));
                        } else {
                            f11 = (f5Var.s / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + f5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            f5Var.e = f12;
                        } else {
                            f5Var.e = AndroidUtilities.lerp(f12, f11, f10);
                        }
                        f5Var.I = false;
                        f5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                fd0 fd0Var = (fd0) this.b;
                fd0Var.h = i10;
                fd0Var.n = f10;
                if (fd0Var.d.getChildAt(i10) != null) {
                    fd0.a(fd0Var, i10, (int) (fd0Var.d.getChildAt(i10).getWidth() * f10));
                    fd0Var.invalidate();
                    m2.f fVar = fd0Var.c;
                    if (fVar != null) {
                        fVar.b(f10, i10, i11);
                        break;
                    }
                }
                break;
            default:
                mh0 mh0Var = (mh0) this.b;
                if (!mh0Var.a && Math.abs(i10 - mh0Var.w) == 1) {
                    int i12 = mh0Var.w;
                    if (i10 > i12) {
                        mh0.a(mh0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        mh0.a(mh0Var, 1, 0, 0);
                        mh0.a(mh0Var, 2, 0, -1);
                    }
                }
                int i13 = mh0Var.w;
                int i14 = mh0Var.x;
                mh0Var.w = i10;
                mh0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    mh0Var.E = true;
                    mh0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // m2.f
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                m5 m5Var = (m5) this.b;
                if (i10 == 1) {
                    m5Var.w = true;
                    break;
                }
                break;
            case 1:
                fd0 fd0Var = (fd0) this.b;
                if (i10 == 0) {
                    fd0.a(fd0Var, fd0Var.e.getCurrentItem(), 0);
                }
                m2.f fVar = fd0Var.c;
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
}
