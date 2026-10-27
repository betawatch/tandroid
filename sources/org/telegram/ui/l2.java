package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l2 implements a5.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // a5.i
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                p2 p2Var = (p2) this.b;
                p2Var.w = i10;
                p2Var.d.invalidate();
                break;
            case 1:
                ((r70) this.b).H = i10;
                break;
            default:
                ((vc1) this.b).b0.invalidate();
                break;
        }
    }

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
        switch (this.a) {
            case 0:
                p2 p2Var = (p2) this.b;
                float measuredWidth = p2Var.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    p2Var.v = c3.h0.f(p2Var.w, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    p2Var.d.invalidate();
                    break;
                }
                break;
            case 1:
                r70 r70Var = (r70) this.b;
                org.telegram.ui.Components.sa saVar = r70Var.e;
                saVar.b = f7;
                saVar.c = i10;
                saVar.invalidate();
                float measuredWidth2 = r70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (r70Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // a5.i
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                r70 r70Var = (r70) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (r70Var.K) {
                            r70Var.K = false;
                        }
                        if (r70Var.w != r70Var.d.getCurrentItem()) {
                            r70Var.w = r70Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    r70Var.K = true;
                    r70Var.d.getCurrentItem();
                    r70Var.d.getMeasuredWidth();
                    break;
                }
                break;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(float f7, int i10, int i11) {
    }
}
