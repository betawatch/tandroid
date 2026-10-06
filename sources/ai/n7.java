package ai;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.sh0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class n7 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ n7(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // z4.e
    public final void a(int i10) {
        switch (this.a) {
            case 1:
                qd0 qd0Var = (qd0) this.b;
                z4.e eVar = qd0Var.c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                int i11 = 0;
                while (i11 < qd0Var.d.getChildCount()) {
                    qd0Var.d.getChildAt(i11).setSelected(i11 == i10);
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
                s7 s7Var = (s7) this.b;
                if (s7Var.w) {
                    l7 l7Var = s7Var.h;
                    l7Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = l7Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            l7Var.M = null;
                        }
                        float f11 = (l7Var.s / 2.0f) + ((-l7Var.getMeasuredWidth()) / 2.0f) + ((r2 + l7Var.n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (l7Var.s / 2.0f) + ((-l7Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + l7Var.n));
                        } else {
                            f10 = (l7Var.s / 2.0f) + ((-l7Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + l7Var.n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            l7Var.e = f11;
                        } else {
                            l7Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        l7Var.L = false;
                        l7Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                qd0 qd0Var = (qd0) this.b;
                qd0Var.h = i10;
                qd0Var.n = f7;
                if (qd0Var.d.getChildAt(i10) != null) {
                    qd0.a(qd0Var, i10, (int) (qd0Var.d.getChildAt(i10).getWidth() * f7));
                    qd0Var.invalidate();
                    z4.e eVar = qd0Var.c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        break;
                    }
                }
                break;
            default:
                sh0 sh0Var = (sh0) this.b;
                if (!sh0Var.a && Math.abs(i10 - sh0Var.w) == 1) {
                    int i12 = sh0Var.w;
                    if (i10 > i12) {
                        sh0.a(sh0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        sh0.a(sh0Var, 1, 0, 0);
                        sh0.a(sh0Var, 2, 0, -1);
                    }
                }
                int i13 = sh0Var.w;
                int i14 = sh0Var.x;
                sh0Var.w = i10;
                sh0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    sh0Var.H = true;
                    sh0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) this.b;
                if (i10 == 1) {
                    s7Var.w = true;
                    break;
                }
                break;
            case 1:
                qd0 qd0Var = (qd0) this.b;
                if (i10 == 0) {
                    qd0.a(qd0Var, qd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = qd0Var.c;
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
