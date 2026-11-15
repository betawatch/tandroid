package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.hk0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class y implements s9 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public y(Layout layout, Rect rect) {
        this.b = layout;
        this.c = rect;
    }

    @Override // org.telegram.ui.Cells.s9
    public final Layout a() {
        switch (this.a) {
            case 0:
                return (Layout) this.b;
            default:
                org.telegram.utils.twidget.o1 o1Var = (org.telegram.utils.twidget.o1) this.b;
                if (o1Var.h == null) {
                    o1Var.h = new org.telegram.utils.twidget.p1(o1Var);
                }
                return o1Var.h;
        }
    }

    @Override // org.telegram.ui.Cells.s9
    public final Rect c() {
        switch (this.a) {
            case 0:
                return (Rect) this.c;
            default:
                return null;
        }
    }

    @Override // org.telegram.ui.Cells.s9
    public final /* synthetic */ CharSequence getPrefix() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((hk0) this.c).V;
        }
    }

    @Override // org.telegram.ui.Cells.s9
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

    @Override // org.telegram.ui.Cells.s9
    public final int getX() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                hk0 hk0Var = (hk0) this.c;
                return (hk0Var.T - hk0Var.k0) + ((org.telegram.utils.twidget.o1) this.b).b;
        }
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((hk0) this.c).U + ((org.telegram.utils.twidget.o1) this.b).c;
        }
    }

    public y(hk0 hk0Var, org.telegram.utils.twidget.o1 o1Var) {
        this.c = hk0Var;
        this.b = o1Var;
    }
}
