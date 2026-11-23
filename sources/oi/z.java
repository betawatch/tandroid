package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.rk0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class z implements u9 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public z(Layout layout, Rect rect) {
        this.b = layout;
        this.c = rect;
    }

    @Override // org.telegram.ui.Cells.u9
    public final Layout a() {
        switch (this.a) {
            case 0:
                return (Layout) this.b;
            default:
                org.telegram.utils.twidget.t1 t1Var = (org.telegram.utils.twidget.t1) this.b;
                if (t1Var.h == null) {
                    t1Var.h = new org.telegram.utils.twidget.u1(t1Var);
                }
                return t1Var.h;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final Rect c() {
        switch (this.a) {
            case 0:
                return (Rect) this.c;
            default:
                return null;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final /* synthetic */ CharSequence getPrefix() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((rk0) this.c).V;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final CharSequence getText() {
        switch (this.a) {
            case 0:
                Layout a10 = a();
                if (a10 == null) {
                    return null;
                }
                return a10.getText();
            default:
                Layout a11 = a();
                if (a11 == null) {
                    return null;
                }
                return a11.getText();
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getX() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                rk0 rk0Var = (rk0) this.c;
                return (rk0Var.T - rk0Var.k0) + ((org.telegram.utils.twidget.t1) this.b).b;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((rk0) this.c).U + ((org.telegram.utils.twidget.t1) this.b).c;
        }
    }

    public z(rk0 rk0Var, org.telegram.utils.twidget.t1 t1Var) {
        this.c = rk0Var;
        this.b = t1Var;
    }
}
