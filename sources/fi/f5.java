package fi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.qb0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f5 implements c5.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ f5(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // c5.h
    public final void a(int i7) {
        switch (this.a) {
            case 1:
                qb0 qb0Var = (qb0) this.b;
                c5.h hVar = qb0Var.c;
                if (hVar != null) {
                    hVar.a(i7);
                }
                int i10 = 0;
                while (i10 < qb0Var.d.getChildCount()) {
                    qb0Var.d.getChildAt(i10).setSelected(i10 == i7);
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
                k5 k5Var = (k5) this.b;
                if (k5Var.x) {
                    d5 d5Var = k5Var.h;
                    d5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = d5Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            d5Var.N = null;
                        }
                        float f12 = (d5Var.s / 2.0f) + ((-d5Var.getMeasuredWidth()) / 2.0f) + ((r2 + d5Var.n) * i7);
                        if (f10 > 0.0f) {
                            f11 = (d5Var.s / 2.0f) + ((-d5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (r4 + d5Var.n));
                        } else {
                            f11 = (d5Var.s / 2.0f) + ((-d5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (r4 + d5Var.n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            d5Var.e = f12;
                        } else {
                            d5Var.e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        d5Var.M = false;
                        d5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                qb0 qb0Var = (qb0) this.b;
                qb0Var.h = i7;
                qb0Var.n = f10;
                if (qb0Var.d.getChildAt(i7) != null) {
                    qb0.a(qb0Var, i7, (int) (qb0Var.d.getChildAt(i7).getWidth() * f10));
                    qb0Var.invalidate();
                    c5.h hVar = qb0Var.c;
                    if (hVar != null) {
                        hVar.b(f10, i7, i10);
                        break;
                    }
                }
                break;
            default:
                nf0 nf0Var = (nf0) this.b;
                if (!nf0Var.a && Math.abs(i7 - nf0Var.x) == 1) {
                    int i11 = nf0Var.x;
                    if (i7 > i11) {
                        nf0.a(nf0Var, 0, 1, 1);
                    } else if (i7 < i11) {
                        nf0.a(nf0Var, 1, 0, 0);
                        nf0.a(nf0Var, 2, 0, -1);
                    }
                }
                int i12 = nf0Var.x;
                int i13 = nf0Var.y;
                nf0Var.x = i7;
                nf0Var.y = i10;
                if (i12 != i7 || i13 != i10) {
                    nf0Var.I = true;
                    nf0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // c5.h
    public final void c(int i7) {
        switch (this.a) {
            case 0:
                k5 k5Var = (k5) this.b;
                if (i7 == 1) {
                    k5Var.x = true;
                    break;
                }
                break;
            case 1:
                qb0 qb0Var = (qb0) this.b;
                if (i7 == 0) {
                    qb0.a(qb0Var, qb0Var.e.getCurrentItem(), 0);
                }
                c5.h hVar = qb0Var.c;
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
