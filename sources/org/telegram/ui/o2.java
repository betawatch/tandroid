package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class o2 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        switch (this.a) {
            case 0:
                s2 s2Var = (s2) this.b;
                float measuredWidth = s2Var.a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    s2Var.s = com.google.android.gms.internal.cast.a6.c(s2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    s2Var.c.invalidate();
                    break;
                }
                break;
            case 1:
                l70 l70Var = (l70) this.b;
                org.telegram.ui.Components.sa saVar = l70Var.e;
                saVar.b = f7;
                saVar.c = i10;
                saVar.invalidate();
                float measuredWidth2 = l70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (l70Var.H * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                s2 s2Var = (s2) this.b;
                s2Var.v = i10;
                s2Var.c.invalidate();
                break;
            case 1:
                ((l70) this.b).H = i10;
                break;
            default:
                ((mc1) this.b).a0.invalidate();
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                l70 l70Var = (l70) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (l70Var.K) {
                            l70Var.K = false;
                        }
                        if (l70Var.w != l70Var.d.getCurrentItem()) {
                            l70Var.w = l70Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    l70Var.K = true;
                    l70Var.d.getCurrentItem();
                    l70Var.d.getMeasuredWidth();
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
