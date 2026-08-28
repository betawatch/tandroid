package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p2 implements m2.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // m2.e
    public final void b(int i9) {
        switch (this.a) {
            case 0:
                t2 t2Var = (t2) this.b;
                t2Var.v = i9;
                t2Var.c.invalidate();
                break;
            case 1:
                ((i70) this.b).D = i9;
                break;
            default:
                ((oc1) this.b).W.invalidate();
                break;
        }
    }

    @Override // m2.e
    public final void c(float f10, int i9, int i10) {
        switch (this.a) {
            case 0:
                t2 t2Var = (t2) this.b;
                float measuredWidth = t2Var.a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    t2Var.s = e2.c.d(t2Var.v, measuredWidth, (i9 * measuredWidth) + i10, measuredWidth);
                    t2Var.c.invalidate();
                    break;
                }
                break;
            case 1:
                i70 i70Var = (i70) this.b;
                org.telegram.ui.Components.ka kaVar = i70Var.e;
                kaVar.b = f10;
                kaVar.c = i9;
                kaVar.invalidate();
                float measuredWidth2 = i70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i9 * measuredWidth2) + i10) - (i70Var.D * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // m2.e
    public final void d(int i9) {
        switch (this.a) {
            case 1:
                i70 i70Var = (i70) this.b;
                if (i9 != 1) {
                    if (i9 == 0 || i9 == 2) {
                        if (i70Var.G) {
                            i70Var.G = false;
                        }
                        if (i70Var.w != i70Var.d.getCurrentItem()) {
                            i70Var.w = i70Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    i70Var.G = true;
                    i70Var.d.getCurrentItem();
                    i70Var.d.getMeasuredWidth();
                    break;
                }
                break;
        }
    }

    private final void a(int i9) {
    }

    private final void e(int i9) {
    }

    private final void f(float f10, int i9, int i10) {
    }
}
