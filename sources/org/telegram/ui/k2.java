package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k2 implements c5.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // c5.h
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                o2 o2Var = (o2) this.b;
                o2Var.x = i7;
                o2Var.d.invalidate();
                break;
            case 1:
                ((t50) this.b).I = i7;
                break;
            default:
                ((t71) this.b).c0.invalidate();
                break;
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        switch (this.a) {
            case 0:
                o2 o2Var = (o2) this.b;
                float measuredWidth = o2Var.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    o2Var.w = com.google.android.gms.internal.vision.e2.w(o2Var.x, measuredWidth, (i7 * measuredWidth) + i10, measuredWidth);
                    o2Var.d.invalidate();
                    break;
                }
                break;
            case 1:
                t50 t50Var = (t50) this.b;
                org.telegram.ui.Components.aa aaVar = t50Var.e;
                aaVar.b = f10;
                aaVar.c = i7;
                aaVar.invalidate();
                float measuredWidth2 = t50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i7 * measuredWidth2) + i10) - (t50Var.I * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // c5.h
    public final void c(int i7) {
        switch (this.a) {
            case 1:
                t50 t50Var = (t50) this.b;
                if (i7 != 1) {
                    if (i7 == 0 || i7 == 2) {
                        if (t50Var.L) {
                            t50Var.L = false;
                        }
                        if (t50Var.x != t50Var.d.getCurrentItem()) {
                            t50Var.x = t50Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    t50Var.L = true;
                    t50Var.d.getCurrentItem();
                    t50Var.d.getMeasuredWidth();
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
