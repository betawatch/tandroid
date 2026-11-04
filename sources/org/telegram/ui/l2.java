package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l2 implements b5.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l2(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // b5.h
    public final void a(int i3) {
        switch (this.a) {
            case 0:
                p2 p2Var = (p2) this.b;
                p2Var.x = i3;
                p2Var.d.invalidate();
                break;
            case 1:
                ((o50) this.b).I = i3;
                break;
            default:
                ((l71) this.b).c0.invalidate();
                break;
        }
    }

    @Override // b5.h
    public final void b(float f10, int i3, int i10) {
        switch (this.a) {
            case 0:
                p2 p2Var = (p2) this.b;
                float measuredWidth = p2Var.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    p2Var.w = com.google.android.recaptcha.internal.a.c(p2Var.x, measuredWidth, (i3 * measuredWidth) + i10, measuredWidth);
                    p2Var.d.invalidate();
                    break;
                }
                break;
            case 1:
                o50 o50Var = (o50) this.b;
                org.telegram.ui.Components.da daVar = o50Var.e;
                daVar.b = f10;
                daVar.c = i3;
                daVar.invalidate();
                float measuredWidth2 = o50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i3 * measuredWidth2) + i10) - (o50Var.I * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // b5.h
    public final void c(int i3) {
        switch (this.a) {
            case 1:
                o50 o50Var = (o50) this.b;
                if (i3 != 1) {
                    if (i3 == 0 || i3 == 2) {
                        if (o50Var.L) {
                            o50Var.L = false;
                        }
                        if (o50Var.x != o50Var.d.getCurrentItem()) {
                            o50Var.x = o50Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    o50Var.L = true;
                    o50Var.d.getCurrentItem();
                    o50Var.d.getMeasuredWidth();
                    break;
                }
                break;
        }
    }

    private final void d(int i3) {
    }

    private final void e(int i3) {
    }

    private final void f(float f10, int i3, int i10) {
    }
}
