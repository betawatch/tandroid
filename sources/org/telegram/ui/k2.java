package org.telegram.ui;

import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                ((v50) this.b).I = i7;
                break;
            default:
                ((v71) this.b).c0.invalidate();
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
                v50 v50Var = (v50) this.b;
                org.telegram.ui.Components.ha haVar = v50Var.e;
                haVar.b = f10;
                haVar.c = i7;
                haVar.invalidate();
                float measuredWidth2 = v50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i7 * measuredWidth2) + i10) - (v50Var.I * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override // c5.h
    public final void c(int i7) {
        switch (this.a) {
            case 1:
                v50 v50Var = (v50) this.b;
                if (i7 != 1) {
                    if (i7 == 0 || i7 == 2) {
                        if (v50Var.L) {
                            v50Var.L = false;
                        }
                        if (v50Var.x != v50Var.d.getCurrentItem()) {
                            v50Var.x = v50Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    v50Var.L = true;
                    v50Var.d.getCurrentItem();
                    v50Var.d.getMeasuredWidth();
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
