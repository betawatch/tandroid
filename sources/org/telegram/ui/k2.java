package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k2 implements c5.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // c5.g
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                o2 o2Var = (o2) this.b;
                o2Var.x = i7;
                o2Var.d.invalidate();
                break;
            case 1:
                ((u50) this.b).H = i7;
                break;
            default:
                ((u71) this.b).b0.invalidate();
                break;
        }
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        switch (this.a) {
            case 0:
                o2 o2Var = (o2) this.b;
                float measuredWidth = o2Var.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    o2Var.w = com.google.android.recaptcha.internal.a.w(o2Var.x, measuredWidth, (i7 * measuredWidth) + i10, measuredWidth);
                    o2Var.d.invalidate();
                    break;
                }
                break;
            case 1:
                u50 u50Var = (u50) this.b;
                org.telegram.ui.Components.ea eaVar = u50Var.e;
                eaVar.b = f10;
                eaVar.c = i7;
                eaVar.invalidate();
                float measuredWidth2 = u50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i7 * measuredWidth2) + i10) - (u50Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // c5.g
    public final void c(int i7) {
        switch (this.a) {
            case 1:
                u50 u50Var = (u50) this.b;
                if (i7 != 1) {
                    if (i7 == 0 || i7 == 2) {
                        if (u50Var.K) {
                            u50Var.K = false;
                        }
                        if (u50Var.x != u50Var.d.getCurrentItem()) {
                            u50Var.x = u50Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    u50Var.K = true;
                    u50Var.d.getCurrentItem();
                    u50Var.d.getMeasuredWidth();
                    break;
                }
                break;
        }
    }

    private final void d(int i7) {
    }

    private final void e(int i7) {
    }

    private final void f(float f10, int i7, int i10) {
    }
}
