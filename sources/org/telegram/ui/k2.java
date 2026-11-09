package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ((w50) this.b).H = i7;
                break;
            default:
                ((w71) this.b).b0.invalidate();
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
                w50 w50Var = (w50) this.b;
                org.telegram.ui.Components.ea eaVar = w50Var.e;
                eaVar.b = f10;
                eaVar.c = i7;
                eaVar.invalidate();
                float measuredWidth2 = w50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i7 * measuredWidth2) + i10) - (w50Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // c5.g
    public final void c(int i7) {
        switch (this.a) {
            case 1:
                w50 w50Var = (w50) this.b;
                if (i7 != 1) {
                    if (i7 == 0 || i7 == 2) {
                        if (w50Var.K) {
                            w50Var.K = false;
                        }
                        if (w50Var.x != w50Var.d.getCurrentItem()) {
                            w50Var.x = w50Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    w50Var.K = true;
                    w50Var.d.getCurrentItem();
                    w50Var.d.getMeasuredWidth();
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
