package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ((v70) this.b).E = i10;
                break;
            default:
                ((jd1) this.b).X.invalidate();
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
                v70 v70Var = (v70) this.b;
                org.telegram.ui.Components.ka kaVar = v70Var.e;
                kaVar.b = f10;
                kaVar.c = i10;
                kaVar.invalidate();
                float measuredWidth2 = v70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (v70Var.E * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // m2.f
    public final void c(int i10) {
        switch (this.a) {
            case 1:
                v70 v70Var = (v70) this.b;
                if (i10 != 1) {
                    if (i10 == 0 || i10 == 2) {
                        if (v70Var.H) {
                            v70Var.H = false;
                        }
                        if (v70Var.w != v70Var.d.getCurrentItem()) {
                            v70Var.w = v70Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    v70Var.H = true;
                    v70Var.d.getCurrentItem();
                    v70Var.d.getMeasuredWidth();
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
