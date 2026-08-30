package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o2 implements m2.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // m2.f
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                s2 s2Var = (s2) this.b;
                s2Var.v = i10;
                s2Var.c.invalidate();
                break;
            case 1:
                ((u70) this.b).E = i10;
                break;
            default:
                ((cd1) this.b).X.invalidate();
                break;
        }
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                s2 s2Var = (s2) this.b;
                float measuredWidth = s2Var.a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    s2Var.s = e2.c.d(s2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    s2Var.c.invalidate();
                    break;
                }
                break;
            case 1:
                u70 u70Var = (u70) this.b;
                org.telegram.ui.Components.ka kaVar = u70Var.e;
                kaVar.b = f10;
                kaVar.c = i10;
                kaVar.invalidate();
                float measuredWidth2 = u70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (u70Var.E * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // m2.f
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                u70 u70Var = (u70) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (u70Var.H) {
                            u70Var.H = false;
                        }
                        if (u70Var.w != u70Var.d.getCurrentItem()) {
                            u70Var.w = u70Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    u70Var.H = true;
                    u70Var.d.getCurrentItem();
                    u70Var.d.getMeasuredWidth();
                    break;
                }
                break;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(float f10, int i10, int i11) {
    }
}
