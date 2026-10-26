package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ((p70) this.b).H = i10;
                break;
            default:
                ((tc1) this.b).b0.invalidate();
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
                p70 p70Var = (p70) this.b;
                org.telegram.ui.Components.sa saVar = p70Var.e;
                saVar.b = f7;
                saVar.c = i10;
                saVar.invalidate();
                float measuredWidth2 = p70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (p70Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // a5.i
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                p70 p70Var = (p70) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (p70Var.K) {
                            p70Var.K = false;
                        }
                        if (p70Var.w != p70Var.d.getCurrentItem()) {
                            p70Var.w = p70Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    p70Var.K = true;
                    p70Var.d.getCurrentItem();
                    p70Var.d.getMeasuredWidth();
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
