package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                ((x50) this.b).H = i7;
                break;
            default:
                ((x71) this.b).b0.invalidate();
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
                x50 x50Var = (x50) this.b;
                org.telegram.ui.Components.da daVar = x50Var.e;
                daVar.b = f10;
                daVar.c = i7;
                daVar.invalidate();
                float measuredWidth2 = x50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i7 * measuredWidth2) + i10) - (x50Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // c5.g
    public final void c(int i7) {
        switch (this.a) {
            case 1:
                x50 x50Var = (x50) this.b;
                if (i7 != 1) {
                    if (i7 == 0 || i7 == 2) {
                        if (x50Var.K) {
                            x50Var.K = false;
                        }
                        if (x50Var.x != x50Var.d.getCurrentItem()) {
                            x50Var.x = x50Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    x50Var.K = true;
                    x50Var.d.getCurrentItem();
                    x50Var.d.getMeasuredWidth();
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
