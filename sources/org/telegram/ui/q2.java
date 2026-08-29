package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q2 implements m2.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // m2.e
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.b;
                u2Var.v = i10;
                u2Var.c.invalidate();
                break;
            case 1:
                ((k70) this.b).D = i10;
                break;
            default:
                ((qc1) this.b).W.invalidate();
                break;
        }
    }

    @Override // m2.e
    public final void b(float f9, int i10, int i11) {
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.b;
                float measuredWidth = u2Var.a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    u2Var.s = com.google.android.recaptcha.internal.a.w(u2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    u2Var.c.invalidate();
                    break;
                }
                break;
            case 1:
                k70 k70Var = (k70) this.b;
                org.telegram.ui.Components.pa paVar = k70Var.e;
                paVar.b = f9;
                paVar.c = i10;
                paVar.invalidate();
                float measuredWidth2 = k70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (k70Var.D * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // m2.e
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                k70 k70Var = (k70) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (k70Var.G) {
                            k70Var.G = false;
                        }
                        if (k70Var.w != k70Var.d.getCurrentItem()) {
                            k70Var.w = k70Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    k70Var.G = true;
                    k70Var.d.getCurrentItem();
                    k70Var.d.getMeasuredWidth();
                    break;
                }
                break;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(float f9, int i10, int i11) {
    }
}
