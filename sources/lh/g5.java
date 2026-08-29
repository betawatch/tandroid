package lh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.zc0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g5 implements m2.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ g5(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // m2.e
    public final void a(int i10) {
        switch (this.a) {
            case 1:
                zc0 zc0Var = (zc0) this.b;
                m2.e eVar = zc0Var.c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                int i11 = 0;
                while (i11 < zc0Var.d.getChildCount()) {
                    zc0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // m2.e
    public final void b(float f9, int i10, int i11) {
        float f10;
        switch (this.a) {
            case 0:
                l5 l5Var = (l5) this.b;
                if (l5Var.w) {
                    e5 e5Var = l5Var.h;
                    e5Var.d.abortAnimation();
                    if (Math.abs(f9) <= 1.0f) {
                        ValueAnimator valueAnimator = e5Var.I;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            e5Var.I = null;
                        }
                        float f11 = (e5Var.s / 2.0f) + ((-e5Var.getMeasuredWidth()) / 2.0f) + ((r2 + e5Var.n) * i10);
                        if (f9 > 0.0f) {
                            f10 = (e5Var.s / 2.0f) + ((-e5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + e5Var.n));
                        } else {
                            f10 = (e5Var.s / 2.0f) + ((-e5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + e5Var.n));
                            f9 = -f9;
                        }
                        if (f9 == 0.0f) {
                            e5Var.e = f11;
                        } else {
                            e5Var.e = AndroidUtilities.lerp(f11, f10, f9);
                        }
                        e5Var.H = false;
                        e5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                zc0 zc0Var = (zc0) this.b;
                zc0Var.h = i10;
                zc0Var.n = f9;
                if (zc0Var.d.getChildAt(i10) != null) {
                    zc0.a(zc0Var, i10, (int) (zc0Var.d.getChildAt(i10).getWidth() * f9));
                    zc0Var.invalidate();
                    m2.e eVar = zc0Var.c;
                    if (eVar != null) {
                        eVar.b(f9, i10, i11);
                        break;
                    }
                }
                break;
            default:
                bh0 bh0Var = (bh0) this.b;
                if (!bh0Var.a && Math.abs(i10 - bh0Var.w) == 1) {
                    int i12 = bh0Var.w;
                    if (i10 > i12) {
                        bh0.a(bh0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        bh0.a(bh0Var, 1, 0, 0);
                        bh0.a(bh0Var, 2, 0, -1);
                    }
                }
                int i13 = bh0Var.w;
                int i14 = bh0Var.x;
                bh0Var.w = i10;
                bh0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    bh0Var.D = true;
                    bh0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // m2.e
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                l5 l5Var = (l5) this.b;
                if (i10 == 1) {
                    l5Var.w = true;
                    break;
                }
                break;
            case 1:
                zc0 zc0Var = (zc0) this.b;
                if (i10 == 0) {
                    zc0.a(zc0Var, zc0Var.e.getCurrentItem(), 0);
                }
                m2.e eVar = zc0Var.c;
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
